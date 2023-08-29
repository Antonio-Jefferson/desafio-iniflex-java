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

    public String getFunction() {
        return function;
    }

    public void setFunction(String fuction) {
        this.function = fuction;
    }

    @Override
    public String toString() {
        return 
                "Nome " + getName() +
                ", Data de nacimento: " + getDateOfBirth() +
                ", Salário: " + wage +
                ", Função: " + function;
    }
}
