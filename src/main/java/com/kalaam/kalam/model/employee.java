package com.kalaam.kalam.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class employee {

    private int id;

    private String name;

    private String department;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Value("Abrar")
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    @Value("salesforce")
    public void setDepartment(String department) {
        this.department = department;
    }

    @Value("123")
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
