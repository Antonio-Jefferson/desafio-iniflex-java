import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person{
    private BigDecimal wage;
    private String function;
    
    public Employee(String name, LocalDate dateOfBirth, BigDecimal wage, String fuction) {
        super(name, dateOfBirth);
        this.wage = wage;
        this.function = fuction;
    }

    public Employee(BigDecimal wage, String fuction) {
        this.wage = wage;
        this.function = fuction;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public String getFuction() {
        return function;
    }

    public void setFuction(String fuction) {
        this.function = fuction;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", wage=" + wage +
                ", function='" + function + '\'' +
                '}';
    }
}
