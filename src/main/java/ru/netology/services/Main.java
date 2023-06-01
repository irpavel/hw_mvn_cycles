package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        VocationService service = new VocationService();

        int example1 = service.calculate(10_000, 3_000, 20_000);
        int example2 = service.calculate(100_000, 60_000, 150_000);

        System.out.println("В следующем году отдыхать месяцев: " + example1);
        System.out.println("В следующем году отдыхать месяцев: " + example2);
    }
}