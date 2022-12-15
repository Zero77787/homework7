package coursework1;


import java.util.Arrays;

public class Main {
    public static void ListOfEmployees(Employee[] arr) {
        for (Employee totalEmployee : arr) {
            System.out.println(totalEmployee);
        }
    }
    public static int amauntOfSelaries (Employee[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].getSelaryEmployee();
        }
        return total;
    }
    public static void amauntOfSelaries2 (Employee[] arr) {
        System.out.println("Сумма зарплат за месяц: " + amauntOfSelaries(arr)+" рублей.");
    }
    public static StringBuilder minWage(Employee[]arr) {
        StringBuilder employeeMinWage = new StringBuilder();
        int minWage1 = arr[0].getSelaryEmployee();
        for (int i = 0; i<arr.length; i++){
            if (arr [i].getSelaryEmployee()< minWage1) {
                minWage1 = arr[i].getSelaryEmployee();
                employeeMinWage.setLength(0);
                employeeMinWage.append(arr[i].getSurNameNameMidlName()).append(" ").append(minWage1);
            }
        }
        return employeeMinWage;
    }
    public static void minWage2 (Employee[]arr){
        System.out.println("Сотрудник с минимальной зарплатой: " + minWage(arr));
        }
    public static StringBuilder maxWage(Employee[]arr) {
        StringBuilder employeeMinWage = new StringBuilder();
        int maxWage1 = arr[0].getSelaryEmployee();
        for (int i = 0; i<arr.length; i++){
            if (arr [i].getSelaryEmployee()> maxWage1) {
                maxWage1 = arr[i].getSelaryEmployee();
                employeeMinWage.setLength(0);
                employeeMinWage.append(arr[i].getSurNameNameMidlName()).append(" ").append(maxWage1);
            }
        }
        return employeeMinWage;
    }
    public static void maxWage2 (Employee[]arr) {
        System.out.println("Сотрудник с минимальной зарплатой: " + maxWage(arr));
    }
    public static int avarageSalary (Employee[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total +=  arr[i].getSelaryEmployee()/arr.length;
        }
        return total;
    }
    public static void avarageSalary2 (Employee[] arr) {
        System.out.println("Cреднее значение зарплат за месяц : " + avarageSalary(arr) + " рублей.");
    }
    public static void surNameNameMidlName(Employee[]arr) {
        System.out.println("Ф.И.О сотрудников : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getSurNameNameMidlName());
        }
    }
        public static void main (String[]args){
            Employee[] employee = new Employee[10];
            employee[0] = new Employee( "Соколов Роман Андреевич", 1, 33000);
            employee[1] = new Employee( "Нефеткина Екатерина Валерьевна", 2, 28000);
            employee[2] = new Employee( "Рогов Василий Юрьевич", 3, 42000);
            employee[3] = new Employee( "Никонова Вероника Генадьевна", 4, 42000);
            employee[4] = new Employee( "Поскаль Игорь Васильевич", 5, 49000);
            employee[5] = new Employee( "Жмых Ренат Валерьевич", 6, 22000);
            employee[6] = new Employee( "Куренкова Екатерина Андреевна", 7, 42450);
            employee[7] = new Employee( "Минаков Дмитрий Васильевич", 8, 48850);
            employee[8] = new Employee( "Моргунова Наталья Игоревна", 9, 42900);
            employee[9] = new Employee( "Ожогов Вадим Андреевич", 10, 51320);
            ListOfEmployees(employee);
            amauntOfSelaries2(employee);
            minWage2(employee);
            maxWage2(employee);
            avarageSalary2(employee);
            surNameNameMidlName(employee);

        }
    }



