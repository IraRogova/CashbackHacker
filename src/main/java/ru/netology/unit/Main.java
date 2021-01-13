package ru.netology.unit;

public class Main {
    public static void main(String[] args) {
        CashbackHackService cashbackHack = new CashbackHackService();
        {
            System.out.println("It should return 0 for 1000");
            int result = cashbackHack.remain(1000);
            System.out.println(0 == result);
        }
        {
            System.out.println("It should return 10 for 2000");
            int result = cashbackHack.remain(2000);
            System.out.println(10 == result);
        }
    }
}
