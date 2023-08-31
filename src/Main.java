import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
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

                removeEmployeeJoao(listEmployees);
                System.out.println();

                printTableEmployees(listEmployees);
                System.out.println();

                salaryIncrease(listEmployees);
                System.out.println();

                groupEmployeesByFunction(listEmployees);
                System.out.println();

                printEmployeesWithBirthdaysInOctoberAndDecember(listEmployees);
                System.out.println();

                printEmployeeWithOldestAge(listEmployees);
                System.out.println();

                printEmployeesInAlphabeticalOrder(listEmployees);
                System.out.println();

                printTotalSalaries(listEmployees);
                System.out.println();

                printSalariesInMinimumWages(listEmployees);
        }

        public static void removeEmployeeJoao(List<Employee> employees) {
                System.out.println("Funcionário João removido da lista");
                employees.removeIf(employee -> employee.getName().equals("João"));
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

        public static void salaryIncrease(List<Employee> employees) {
                BigDecimal increasePercentage = new BigDecimal("0.10");
                System.out.println("Aumento de 10% nos salários");

                for (Employee employee : employees) {
                        BigDecimal currentSalary = employee.getWage();
                        BigDecimal increase = currentSalary.multiply(increasePercentage);
                        BigDecimal newSalary = currentSalary.add(increase);
                        employee.setWage(newSalary);
                }
        }

        public static void groupEmployeesByFunction(List<Employee> employees) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DecimalFormat salaryFormatter = new DecimalFormat("#,##0.00");

                Map<String, List<Employee>> groupedEmployees = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getFunction));

                System.out.println("Funcionarios agrupados por funções");

                for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
                        String function = entry.getKey();
                        List<Employee> employeesInFunction = entry.getValue();

                        System.out.printf("| %-18s | %-10s | %-18s %n", "-------------------", function,  "-------------------");
                        System.out.println("| Nome      | Data de Nascimento | Salário   | Função    ");
                        System.out.println("| --------- | ------------------ | --------- | --------- ");

                        for (Employee employee : employeesInFunction) {
                                System.out.printf("|%-10s | %-18s | %-9s | %-9s %n",
                                                employee.getName(),
                                                employee.getDateOfBirth().format(dateFormatter),
                                                salaryFormatter.format(employee.getWage()),
                                                employee.getFunction());
                        }
                        System.out.println();
                }
        }

        public static void printEmployeesWithBirthdaysInOctoberAndDecember(List<Employee> employees) {
                List<Employee> octoberAndDecemberEmployees = employees.stream()
                                .filter(employee -> {
                                        Month birthMonth = employee.getDateOfBirth().getMonth();
                                        return birthMonth == Month.OCTOBER || birthMonth == Month.DECEMBER;
                                })
                                .collect(Collectors.toList());

                System.out.println("Funcionários com aniversário em outubro e dezembro:");
                for (Employee employee : octoberAndDecemberEmployees) {
                        System.out.println(employee.getName() + " - " + employee.getDateOfBirth().getMonth());
                }
        }

        public static void printEmployeeWithOldestAge(List<Employee> employees) {
                Employee oldestEmployee = employees.stream()
                                .max((employee1, employee2) -> {
                                        LocalDate birthDate1 = employee1.getDateOfBirth();
                                        LocalDate birthDate2 = employee2.getDateOfBirth();
                                        return calculateAge(birthDate1).compareTo(calculateAge(birthDate2));
                                })
                                .orElse(null);

                if (oldestEmployee != null) {
                        System.out.println("Funcionário mais velho:");
                        System.out.println("Nome: " + oldestEmployee.getName());
                        System.out.println("Idade: " + calculateAge(oldestEmployee.getDateOfBirth()));
                } else {
                        System.out.println("Não há funcionários na lista.");
                }
        }

        public static Integer calculateAge(LocalDate birthDate) {
                LocalDate currentDate = LocalDate.now();
                return Period.between(birthDate, currentDate).getYears();
        }

        public static void printEmployeesInAlphabeticalOrder(List<Employee> employees) {
                List<Employee> sortedEmployees = employees.stream()
                                .sorted(Comparator.comparing(Employee::getName))
                                .collect(Collectors.toList());

                System.out.println("Funcionários em ordem alfabética:");
                for (Employee employee : sortedEmployees) {
                        System.out.println(employee.getName());
                }
        }

        public static void printTotalSalaries(List<Employee> employees) {
                BigDecimal totalSalaries = BigDecimal.ZERO;
                DecimalFormat salaryFormatter = new DecimalFormat("#,##0.00");
                for (Employee employee : employees) {
                        totalSalaries = totalSalaries.add(employee.getWage());
                }

                System.out.println("Total dos salários dos funcionários: " + salaryFormatter.format(totalSalaries));
        }

        public static void printSalariesInMinimumWages(List<Employee> employees) {
                BigDecimal salarioMinimo = new BigDecimal("1212.00");

                System.out.println("Relação de salários em salários mínimos:");
                for (Employee employee : employees) {
                        BigDecimal salarioFuncionario = employee.getWage();
                        BigDecimal relacaoSalario = salarioFuncionario.divide(salarioMinimo, 2, RoundingMode.HALF_UP);

                        System.out.println(employee.getName() + ": " + relacaoSalario + " salários mínimos");
                }
        }

}
