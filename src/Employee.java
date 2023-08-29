import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person{
    private BigDecimal wage;
    private String fuction;
    
    public Employee(String name, LocalDate dateOfBirth, BigDecimal wage, String fuction) {
        super(name, dateOfBirth);
        this.wage = wage;
        this.fuction = fuction;
    }

    public Employee(BigDecimal wage, String fuction) {
        this.wage = wage;
        this.fuction = fuction;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public String getFuction() {
        return fuction;
    }
    
    public void setFuction(String fuction) {
        this.fuction = fuction;
    }

    
}
