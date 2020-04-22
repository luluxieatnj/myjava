package com.xll.jdk8.streamapi;

/**
 *  模拟员工
 */
public class Employee {

    private Integer empNo; // 员工编号 唯一

    private String empName; // 员工姓名

    private Double salary;  // 薪水

    private Status status;

    public Employee(Integer empNo, String empName, Double salary, Status status) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.status = status;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
