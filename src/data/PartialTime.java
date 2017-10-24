package data;

import java.util.Date;

public class PartialTime extends Professor{ 
    
    private String category;
    private int classHour;

    public PartialTime(String category, int classHour, String id, String name, Date hiringDate, String school, String department) {
        super(id, name, hiringDate, school, department);
        this.category = category;
        this.classHour = classHour;
    }

    @Override
    public float paySalary() {
        if("A".equals(this.category)){
            return 60000*this.classHour;
        } else if ("B".equals(this.category)){
            return 80000*this.classHour;
        } else if ("C".equals(this.category)){
            return 100000*this.classHour;
        } else {
            throw new IllegalArgumentException ("Sorry, not sorry. Category not found");
        }
    }    
}
