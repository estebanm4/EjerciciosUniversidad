package data;

import java.util.Date;

public class ByContract extends Employee{
    
    private int months;
    private float value;

    public ByContract(int months, float value, String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
        this.months = months;
        this.value = value;
    }

    @Override
    public float paySalary() {
        if (this.months == 0){
            throw new ArithmeticException ("Div by Zero :( ");
        } else {
        return (this.value/this.months);
        }
    }   
}
