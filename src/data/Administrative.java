package data;

import java.util.Date;

public class Administrative extends Employee{
    
    private String category;
    private float salary;

    public Administrative(String category, float salary, String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
        this.category = category;
        this.salary = salary;
    }

    @Override
    public float paySalary() {
        return this.salary;
    }
    
    
          
    
}
