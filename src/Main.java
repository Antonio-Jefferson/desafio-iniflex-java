import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Employee> listEmployees = new ArrayList<>();

        listEmployees.add(new Employee("João", LocalDate.of(1980, Month.APRIL, 1), new BigDecimal("1500.00"), "Analista"));
        listEmployees.add(new Employee("Maria", LocalDate.of(1990, Month.AUGUST, 15), new BigDecimal("2000.00"), "Gerente"));
        listEmployees.add(new Employee("José", LocalDate.of(1985, Month.MARCH, 22), new BigDecimal("1800.00"), "Analista"));
        listEmployees.add(new Employee("Ana", LocalDate.of(2000, Month.OCTOBER, 10), new BigDecimal("2500.00"), "Supervisor"));
        listEmployees.add(new Employee("Carlos", LocalDate.of(1975, Month.DECEMBER, 5), new BigDecimal("1900.00"), "Analista"));
        listEmployees.add(new Employee("Paula", LocalDate.of(1995, Month.JUNE, 30), new BigDecimal("2100.00"), "Supervisor"));
        listEmployees.add(new Employee("Pedro", LocalDate.of(1992, Month.APRIL, 20), new BigDecimal("2200.00"), "Gerente"));
        listEmployees.add(new Employee("Laura", LocalDate.of(1988, Month.NOVEMBER, 12), new BigDecimal("1900.00"), "Analista"));
        listEmployees.add(new Employee("Sofia", LocalDate.of(2005, Month.FEBRUARY, 8), new BigDecimal("2300.00"), "Supervisor"));

        listEmployees.removeIf(employee -> employee.getName().equals("João"));

        for (Employee employee : listEmployees) {
            System.out.println(employee);
        }
    }
}
