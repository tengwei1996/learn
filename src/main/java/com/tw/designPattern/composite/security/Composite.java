package com.tw.designPattern.composite.security;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点(Composite)
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    int size = 0;


    public void add(Component component) {
        children.add(component);
    }


    public void remove(Component component) {
        children.remove(component);
    }


    public Component getChild(int index) {
        return children.get(index);
    }

    /**
     * 其实下面代码跟组合模式有关系就只有
     *   for (Component component : children) {
     *        component.operation();
     *   }
     */
    @Override
    public void operation() {
        // 这里代码不用管，就是为了能看到树形结构的样子，跟组合模式没有半点关系
        // 这里名字和成员变量名一样，取得是方法里面的，就近原则。
        int size = this.getSize();
        for (Component component : children) {
            // 这段代码不用管，就是为了能看到树形结构的样子，跟组合模式没有半点关系
            if (component instanceof Composite) {
                ((Composite) component).setSize(((Composite) component).getChildrenSize());;
            }
            // 这段代码不用管，就是为了能看到树形结构的样子，跟组合模式没有半点关系
            if (size > 0) {
                for (int i = 0; i < 1; i++) {
                    size--;
                    System.out.print(" ");
                }
            }
            component.operation();
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    private Integer getChildrenSize() {
        return this.children.size();
    }
}
