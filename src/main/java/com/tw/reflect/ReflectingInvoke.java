package com.tw.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectingInvoke {

    private static final String SETTER_PREFIX = "set";

    private static final String GETTER_PREFIX = "get";

    private static final String CGLIB_CLASS_SEPARATOR = "$$";

    /**
     * 调用getter方法
     * 支持多级，如：对象名.对象名.方法
     *
     * @param obj
     * @param propertyName
     * @return
     */
    public static Object invokeGetter(Object obj, String propertyName) {
        Object object = obj;
        String[] propertyNameArr = propertyName.split(".");
        for (String name : propertyNameArr) {
            String getterMethodName = GETTER_PREFIX + name.substring(0, 1).toUpperCase() + name.substring(1);
            object = invokeMethod(object, getterMethodName, new Class[]{}, new Object[]{});
        }
        return object;
    }

    /**
     * 循环向上转型，获取对象的DeclaredMethod，并强制设置可访问
     * 如向上转型的Object仍无法找到，返回null
     * 匹配函数名+参数类型
     * 用于方法需要被多次调用的时候，先使用本函数先取得Method,然后再调用Method.invoke(Object obj,Object... args)
     * @param obj
     * @param methodName
     * @param parameterTypes
     * @return
     */
    public static Method getAccessibleMethod(final Object obj, final String methodName, final Class<?>... parameterTypes) {
        for (Class<?> searchType = obj.getClass(); searchType != Object.class; searchType = searchType.getSuperclass()) {
            try {
                Method method = searchType.getDeclaredMethod(methodName, parameterTypes);
                method.setAccessible(true);
                return method;
            } catch (NoSuchMethodException e) {
                continue;
            }
        }
        return null;
    }

    /**
     * 直接调用对象方法，无视private/protected修饰符
     * 用于一次性调用的情况，否则应使用getAccessibleMethod()函数获得Method后反复调用
     * 同时匹配方法名+参数类型
     * @param obj
     * @param methodName
     * @param parameterTypes
     * @param args
     * @return
     */
    public static Object invokeMethod(final Object obj,final String methodName,final Class<?>[] parameterTypes,final Object[] args){
        Method method = getAccessibleMethod(obj, methodName, parameterTypes);
        if (method == null){
            throw new IllegalArgumentException("Could not find method [" + methodName + "] on target [" + obj + "]");
        }
        try {
            return method.invoke(obj,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 直接调用对象方法，无视private/protected修饰符
     * 用于一次性调用的情况，否则应使用getAccessibleMethodByName()函数获得Method后反复调用
     * 同时匹配方法名+参数类型
     * @param obj
     * @param methodName
     * @param args
     * @return
     */
    public static Object invokeMethodByName(final Object obj,final String methodName,final Object[] args){
        Method method = getAccessibleMethodByName(obj,methodName);
        if (method == null){
            throw new IllegalArgumentException("Could not find method [" + methodName + "] on target [" + obj + "]");
        }
        try {
            return method.invoke(obj,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Method getAccessibleMethodByName(Object obj, String methodName) {
        return null;
    }

    public static void invokeSetter(Object obj,String propertyName,Object value){
        Object object = obj;
        String[] names = propertyName.split(".");
        for (int i = 0; i < names.length;i++){
            if (i < names.length - 1) {
                String getterMethodName = GETTER_PREFIX + names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
                object = invokeMethod(object, getterMethodName, new Class[]{}, new Object[]{});
            }else {
                String setterMethodName = SETTER_PREFIX + names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
                invokeMethodByName(object,setterMethodName,new Object[]{value});
            }

        }
    }


}
