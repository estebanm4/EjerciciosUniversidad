package data;

import java.util.Date;

public abstract class Professor extends Employee {

    protected String school;
    protected String department;
    
    public Professor(String id, String name, Date hiringDate, String school, String department) {
        super(id, name, hiringDate);
        this.school = school;
        this.department = department;
    }
    
    
}
