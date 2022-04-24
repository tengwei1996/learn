package com.tw.designPattern.facade;

import java.util.List;

public class Project {

    /**
     * 姓名
     */
    private String name;

    /**
     * 项目经理
     */
    private ProjectManager projectManager;

    /**
     * 研发经理
     */
    private DevelopManager developManager;

    /**
     * 研发工程师
     */
    private List<DevelopmentEngineer> developmentEngineerList;

    /**
     * 测试工程师
     */
    private List<QualityAssurance> qualityAssuranceList;

    /**
     * 运维工程师
     */
    private List<Operations> operationsList;

    public Project(String name, ProjectManager projectManager, DevelopManager developManager, List<DevelopmentEngineer> developmentEngineerList, List<QualityAssurance> qualityAssuranceList, List<Operations> operationsList) {
        this.name = name;
        this.projectManager = projectManager;
        this.developManager = developManager;
        this.developmentEngineerList = developmentEngineerList;
        this.qualityAssuranceList = qualityAssuranceList;
        this.operationsList = operationsList;
    }

    public void developProject(){
        System.out.println(name + "项目启动...");
        // 项目经理需求分析
        projectManager.analysisRequirement();
        // 项目经理制定项目计划
        projectManager.makeProjectPlan();
        // 研发经理制定研发计划
        developManager.makeDevelopPlan();
        // 研发工程师开始研发
        developmentEngineerList.forEach(DevelopmentEngineer::develop);
        // 测试工程师开始测试
        qualityAssuranceList.forEach(QualityAssurance::test);
        // 运维工程师开始运维
        operationsList.forEach(Operations::operationAndMaintenance);
        System.out.println(name + "项目上线平稳运行...");
    }
}
