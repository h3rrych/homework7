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
            int i = 1;
            for (; total < 2_459_000; i++) {
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
            while (y >= 0) {
            System.out.print(y + " ");
            y = y - 1;
            }
            System.out.println();
            }

            public static void task3() {
                System.out.println("Задача 3");
                int population = 12_000_000;
                int death = 8 * (12_000_000 / 1000); // Смертность в год
                int fertility = 17 * (12_000_000 / 1000); // Рождаемость в год
                int populationAfterYear = population + fertility - death;
                int year = 2020;
                System.out.println("Год " + year + " Численность населения составляет " + population);
                for (year = 2021; year <= 2030; year = year + 1) {
                        System.out.println("Год " + year + " Численность населения составляет " + populationAfterYear);
                        populationAfterYear = populationAfterYear + fertility - death;
                    }
            }

            public static void task4() {
                System.out.println("Задача 4");
                int start = 15_000;
                int total = 0;
                int interest = start / 100 * 7; // Процент от вклада
                int i = 0;
                System.out.println("Месяц " + i++ + " Сумма накоплений равна " + start);
                while (total <= 12_000_000) {
                        total = total + start;
                        total = total + interest;
                        System.out.println("Месяц " + i++ + " Cумма накопления равна " + (total + start));
                    }
            }

            public static void task5() {
                System.out.println("Задача 5");
                int start = 15_000;
                int total = 0;
                int interest = start / 100 * 7; // Процент от вклада
                int i = 0;
                System.out.println("Месяц " + i + " Сумма накоплений равна " + start);
                while (total <= 12_000_000) {
                        i = i + 1;
                        total = total + start;
                        total = total + interest;
                        if (i % 6 == 0) {
                                System.out.println("Месяц " + i + " Cумма накопления равна " + (total + start));
                            }
                    }
            }

            public static void task6() {
                System.out.println("Задача 6");
                int start = 15_000;
                int total = 0;
                int interest = start / 100 * 7; // Процент от вклада
                int i = 0;
                System.out.println("Месяц " + i + " Сумма накоплений равна " + start);
                while (total <= 12_000_000) {
                        i = i + 1;
                        total = total + start;
                        total = total + interest;
                        if (i % 6 == 0 && i <= 108) { // 9 лет
                                System.out.println("Месяц " + i + " Cумма накопления равна " + (total + start));
                            }
                    }
           }

            public static void task7() {
                System.out.println("Задача 7");
                int day = 0;
                for(day = 1; day<=31; day++) {
                        if (day % 7 == 2) {
                                System.out.println("Cегодня пятница " + day + " число. Необходимо сдать отсчет");
                            }
                    }
            }
            public static void task8(){
                System.out.println("Задача 8");
                int year = 2023;
                int yearAfter = year + 100;
                int yearBefore = year - 200;
                for (year = yearBefore; year<=yearAfter; year ++) {
                        if (year % 79 == 0) {
                                System.out.println(year);
                        }
                }



    }
}
