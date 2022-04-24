package com.tw.designPattern.facade;

import java.util.List;

/**
 * 外观模式
 * 定义:
 *  外观（Facade）模式又叫作门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。
 *  该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 * 优点：
 *  外观（Facade）模式是“迪米特法则”的典型应用。降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
 *  对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
 *  降低了大型软件系统中的编译依赖性，简化了系统在不同平台之间的移植过程，因为编译一个子系统不会影响其他的子系统，也不会影响外观对象。
 * 缺点：
 *  不能很好地限制客户使用子系统类，很容易带来未知风险。
 *  增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。
 * 实现:
 *  外观（Facade）模式的结构比较简单，主要是定义了一个高层接口。它包含了对各个子系统的引用，客户端可以通过它访问各个子系统的功能。
 * 结构:
 *  外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 *  子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 *  客户（Client）角色：通过一个外观角色访问各个子系统的功能。
 * 应用场景：
 *  对分层结构系统构建时，使用外观模式定义子系统中每层的入口点可以简化子系统之间的依赖关系。
 *  当一个复杂系统的子系统很多时，外观模式可以为系统设计一个简单的接口供外界访问。
 *  当客户端与多个子系统之间存在很大的联系时，引入外观模式可将它们分离，从而提高子系统的独立性和可移植性。
 */
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
