package com.wahyuhadi.restapi.models.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "firstname")
    private String fname;

    @Column(name = "lastname")
    private String lname;

    private String email;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "hire_date")
    private Date hire;

    @Column(name = "job_id")
    private int job;

    private double salary;

    @Column(name = "manager_id")
    private int manager;

    @Column(name = "department_id")
    private int department;

    public Employee() {
    }

    public Employee(Long id, String fname, String lname, String email, String phone, Date hire, int job,
            double salary, int manager, int department) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hire = hire;
        this.job = job;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getHire() {
        return hire;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

}
