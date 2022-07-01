package com.tw.designPattern.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeTest {

    public static void main(String[] args) {
//        String projectName = "外观模式实例项目";
//        ProjectManager projectManager = new ProjectManager("王一一", "项目经理王一一");
//        DevelopManager developManager = new DevelopManager("王一二", "研发经理王一二");
//        List<DevelopmentEngineer> developmentEngineerList = new ArrayList<>();
//        DevelopmentEngineer developmentEngineer1 = new DevelopmentEngineer("王一三", "JAVA开发工程师王一三");
//        DevelopmentEngineer developmentEngineer2 = new DevelopmentEngineer("王一四", "JAVA开发工程师王一四");
//        developmentEngineerList.add(developmentEngineer1);
//        developmentEngineerList.add(developmentEngineer2);
//        List<QualityAssurance> qualityAssuranceList = new ArrayList<>();
//        QualityAssurance qualityAssurance1 = new QualityAssurance("王一五", "测试工程师王一五");
//        QualityAssurance qualityAssurance2 = new QualityAssurance("王一六", "测试工程师王一六");
//        qualityAssuranceList.add(qualityAssurance1);
//        qualityAssuranceList.add(qualityAssurance2);
//        List<Operations> operationsList = new ArrayList<>();
//        Operations operations1 = new Operations("王一七", "运维工程师王一七");
//        Operations operations2 = new Operations("王一八", "运维工程师王一八");
//        operationsList.add(operations1);
//        operationsList.add(operations2);
//        Project project = new Project(projectName, projectManager, developManager, developmentEngineerList, qualityAssuranceList, operationsList);
//        project.developProject();

        Integer a = 100;
        Integer integer = Integer.valueOf(100);
        System.out.println(a == integer);
        Integer b = 129;
        Integer integer1 = Integer.valueOf(129);
        System.out.println(b == integer1);
    }
}
