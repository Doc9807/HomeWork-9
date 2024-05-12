public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int[] salaries = {10000, 20000, 30000, 40000, 100000};

        int sumSalaries = 0;
        for (int salary : salaries) {
            sumSalaries += salary;
        }
        System.out.printf("«Сумма трат за месяц составила %s рублей».%n", sumSalaries);

        System.out.println("\nTask 2");
        int[] salariesForMinMax = {10000, 20000, 30000, 40000, 100000};

        int minSalary = salariesForMinMax[0];
        int maxSalary = salariesForMinMax[0];

        for (int i : salariesForMinMax) {
            if (i > maxSalary) {
                maxSalary = i;
            }
            if (i < minSalary) {
                minSalary = i;
            }
        }
        System.out.printf("«Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма " +
                        "трат за неделю составила %s рублей».%n",
                minSalary,
                maxSalary);

        System.out.println("\nTask 3");
        int[] salariesT3 = {257, 3500, 44444, 78190, 151872};

        int sumSalariesT3 = 0;
        for (int salary : salariesT3) {
            sumSalariesT3 += salary;
        }
        double avergeSalary = (double) sumSalariesT3 / salariesT3.length;
        System.out.printf("«Средняя сумма трат за месяц составила %.2f рублей».%n", avergeSalary);

        System.out.println("\nTask 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}