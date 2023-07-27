public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ7");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накопления равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int y = 10;
        for (y = 10; y > 0; y = y - 1) {
            System.out.print(y + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int death = 8;
        int fertility = 17;
        int growth = 17 - 8;
        for (int i = 2023; i <= 2033; i++) {
            population += population * growth / 1000;
            System.out.println("Год " + i + " численность населения равна " + population);
        }
    }

    public static void task4() {
        System.out.println(" Задача 4");
        int total = 15000;
        float interest = 0.07f; // Процент от вклада
        int i = 0;
        for (; total <= 12_000_000; i++) {
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total);
            total = (int) (total * interest) + total;

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        float interest = 0.07f; // Процент от вклада
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = (int) (total * interest) + total;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        float interest = 0.07f; // Процент от вклада
        int i = 1;
        for (; i<=108; i++) {
            total = (int) (total * interest) + total;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 0;
        for (day = 1; day <= 31; day++) {
            if (day % 7 == 2) {
                System.out.println("Cегодня пятница " + day + " число. Необходимо сдать отсчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int yearAfter = year + 100;
        int yearBefore = year - 200;
        for (year = yearBefore; year <= yearAfter; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }


    }
}


