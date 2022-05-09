package com.tw.designPattern.observer.rate;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标：汇率
 * 利用观察者模式设计一个程序，分析“人民币汇率”的升值或贬值对进口公司进口产品成本或出口公司的出口产品收入以及公司利润率的影响。
 * 当“人民币汇率”升值时，进口公司的进口产品成本降低且利润率提升，出口公司的出口产品收入降低且利润率降低；当“人民币汇率”贬值时，
 * 进口公司的进口产品成本提升且利润率降低，出口公司的出口产品收入提升且利润率提升。
 * 这里的汇率（Rate）类是抽象目标类，它包含了保存观察者（Company）的 List 和增加/删除观察者的方法，以及有关汇率改变的抽象方法 change(int number)；
 * 而人民币汇率（RMBrate）类是具体目标， 它实现了父类的 change(int number) 方法，即当人民币汇率发生改变时通过相关公司；
 * 公司（Company）类是抽象观察者，它定义了一个有关汇率反应的抽象方法 response(int number)；
 * 进口公司（ImportCompany）类和出口公司（ExportCompany）类是具体观察者类，
 * 它们实现了父类的 response(int number) 方法，即当它们接收到汇率发生改变的通知时作为相应的反应
 */
public abstract class Rate {

    protected List<Company> companyList = new ArrayList<>();

    public abstract void change(int number);

    /**
     * 增加观察者
     * @param company
     */
    public void add(Company company){
        companyList.add(company);
    }

    /**
     * 删除观察者
     * @param company
     */
    public void remove(Company company){
        companyList.remove(company);
    }
}
