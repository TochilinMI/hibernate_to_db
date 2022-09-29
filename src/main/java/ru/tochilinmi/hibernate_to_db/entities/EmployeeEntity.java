package ru.tochilinmi.hibernate_to_db.entities;

import javax.persistence.*;

@Entity
@Table(name = "employeies")
public class EmployeeEntity {

    private Integer id;
    private String name;
    private String job;
    private String department;
    private Integer age;
    private Double salary;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, String job, String department, Integer age, Double salary) {
        this.name = name;
        this.job = job;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
