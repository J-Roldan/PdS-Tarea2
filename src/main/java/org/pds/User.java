package org.pds;

public class User {
    private int id;
    private String name;
    private String department;
    private String description;

    public User(int id, String name, String department, String description) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getDescription() {
        return this.description;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateDepartment(String department) {
        this.department = department;
    }

    public void updateDescription(String description) {
        this.description = description;
    }
}
