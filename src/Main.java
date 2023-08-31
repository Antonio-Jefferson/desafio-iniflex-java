import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) throws Exception {
                List<Employee> listEmployees = new ArrayList<>();

                listEmployees
                                .add(new Employee("Maria", LocalDate.of(2000, Month.OCTOBER, 18),
                                                new BigDecimal("2009.44"), "Operador"));
                listEmployees
                                .add(new Employee("João", LocalDate.of(1990, Month.APRIL, 12),
                                                new BigDecimal("2284.38"), "Operador"));
                listEmployees
                                .add(new Employee("Caio", LocalDate.of(1961, Month.APRIL, 2), new BigDecimal("9836.14"),
                                                "Coordenador"));
                listEmployees.add(
                                new Employee("Miguel", LocalDate.of(1988, Month.OCTOBER, 14),
                                                new BigDecimal("19119.88"), "Diretor"));
                listEmployees.add(
                                new Employee("Alice", LocalDate.of(1975, Month.DECEMBER, 5), new BigDecimal("1900.00"),
                                                "Recepcionísta"));
                listEmployees.add(
                                new Employee("Heitor", LocalDate.of(1999, Month.NOVEMBER, 19),
                                                new BigDecimal("1582.72"), "Operador"));
                listEmployees
                                .add(new Employee("Arthur", LocalDate.of(1993, Month.MARCH, 31),
                                                new BigDecimal("4071.84"), "Contador"));
                listEmployees.add(
                                new Employee("Laura", LocalDate.of(1994, Month.AUGUST, 8), new BigDecimal("3017.45"),
                                                "Gerente"));
                listEmployees.add(
                                new Employee("Heloísa", LocalDate.of(2003, Month.APRIL, 24), new BigDecimal("1606.85"),
                                                "Eletricista"));
                listEmployees.add(
                                new Employee("Helena", LocalDate.of(1996, Month.SEPTEMBER, 2),
                                                new BigDecimal("2799.93"), "Gerente"));

                System.out.println("Funcionário João removido da lista");
                listEmployees.removeIf(employee -> employee.getName().equals("João"));
                System.out.println();

                System.out.println("Imprimindo todos os funcionários");
                printTableEmployees(listEmployees);

                salaryIncrease(listEmployees);

                System.out.println("Salario atualizado");
                printTableEmployees(listEmployees);

                Map<String, List<Employee>> group = groupEmployeesByFunction(listEmployees);
                System.out.println(group);
                
        }

        public static void printTableEmployees(List<Employee> employees) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DecimalFormat salaryFormatter = new DecimalFormat("#,##0.00");

                System.out.println("| Nome      | Data de Nascimento | Salário   | Função    ");
                System.out.println("| --------- | ------------------ | --------- | --------- ");

                for (Employee employee : employees) {
                        System.out.printf("|%-10s | %-18s | %-9s | %-9s %n",
                                        employee.getName(),
                                        employee.getDateOfBirth().format(dateFormatter),
                                        salaryFormatter.format(employee.getWage()),
                                        employee.getFunction());
                }

        }

        public static List<Employee> salaryIncrease(List<Employee> employees) {
                BigDecimal increasePercentage = new BigDecimal("0.10");

                for (Employee employee : employees) {
                        BigDecimal currentSalary = employee.getWage();
                        BigDecimal increase = currentSalary.multiply(increasePercentage);
                        BigDecimal newSalary = currentSalary.add(increase);
                        employee.setWage(newSalary);
                }
                return employees;
        }

        public static Map<String, List<Employee>> groupEmployeesByFunction(List<Employee> employees) {
                return employees.stream()
                .collect(Collectors.groupingBy(Employee::getFunction));
        }

}
