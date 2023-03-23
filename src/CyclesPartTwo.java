public class CyclesPartTwo {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача №1");
        int cash = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000){
            month++;
            total = total + cash;
        }
        System.out.println("Месяц " + month + " ,сумма накоплений равна " + total + " рублей");
    }
    public static void task2() {
        System.out.println("Задача №2");
        int i = 0;
        while (i < 10){
            i++;
            System.out.printf(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--){
            System.out.printf(j + " ");
        }
    }
    public static void task3(){
        System.out.println("Задача №3");
        int countryY = 12000000;
        double fertility = 0.017;
        double mortality = 0.008;
        for (int i = 1; i <=10; i++){
            countryY = (int) (countryY + countryY * fertility - countryY * mortality);
            System.out.println("Год " + i + " ,численность населения составляет " + countryY);
        }
    }
    public static void task4() {
        System.out.println("Задача №4");
        int deposit = 15000;
        double bonus = 1.07;
        double total = 0;
        int month = 0;
        while (total<=12_000_000){
            month++;
            total = total * bonus + deposit;
            System.out.printf("Месяц " + month + " : сумма накоплений равна = " + "%.2f",total);
            System.out.println();
        }
    }
    public static void task5() {
        System.out.println("Задача №5");
        int deposit = 15000;
        double bonus = 1.07;
        double total = 0;
        int month = 0;
        while (total<=12_000_000){
            month++;
            total = total * bonus + deposit;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + " : сумма накоплений равна = " + "%.2f", total);
                System.out.println();
            }
        }
    }
    public static void task6() {
        System.out.println("Задача %6");
        int deposit = 15000;
        double bonus = 1.07;
        double total = 0;
        int month = 0;
//        int totalMonth = 0;
        while (month <= 108){
            month++;
            total = total * bonus + deposit;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + " : сумма накоплений равна = " + "%.2f", total);
                System.out.println();
            }
        }
    }
    public static void task7() {
        System.out.println("Задача №7");
        int firstFriday;
        for (firstFriday = 5; firstFriday<=31; firstFriday+=7 )
            System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчёт");
        }
    public static void task8() {
        System.out.println("Задача №8");
        int last200Years = 1823;
        int next100Years = 2123;
        for (int i = 0; i <= next100Years; i+=79){
            if (i >= last200Years){
                System.out.println(i);
            }
        }
    }

    }

