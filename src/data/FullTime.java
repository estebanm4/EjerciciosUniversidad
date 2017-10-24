package data;

import java.util.Date;

public class FullTime extends Professor{
    
    private float salary;

    public FullTime(float salary, String id, String name, Date hiringDate, String school, String department) {
        super(id, name, hiringDate, school, department);
        this.salary = salary;
    }

    public float paySalary(float salary) {
        return salary;        
    }

    @Override
    public float paySalary() {
        return this.salary;
    }
    
    
    
}
