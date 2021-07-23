package ru.geekbrains.lesson.three;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void doBegin () {
        int usrAns;
        do {
            doGuessNum();
            System.out.println("Сыграем еще раз? Да - 1, Нет - 0");
            Scanner nxtTry = new Scanner(System.in);
            usrAns = nxtTry.nextInt();
        }
        while (usrAns == 1);
        System.out.println("Ну и ладно. Закончили.");
    }
    static void doGuessNum () {
        System.out.println("Я загадал число от 0 до 9. Попробуй угадать его. У тебя 3 попытки.");
        System.out.println("Введи число от 0 до 9: ");
        String cpuMoreWord [] = {"Твое число больше моего.", "Твое число меньше моего.", "Угадал;)", "Я победил тебя, человек. ХА-ХА-ХА."};
        Random uncNum = new Random();
        int cpu = uncNum.nextInt(10);
        //System.out.println(cpu);// отладка, загаданное число
        int count = 3; //количество попыток угадать
        while (count > 0) {
            Scanner usrNum = new Scanner(System.in);
            int usr = usrNum.nextInt();
            if (usr == cpu) {
                System.out.println(cpuMoreWord[2]);
                break;
            } else {
                if (usr > cpu) {
                    System.out.println(cpuMoreWord[0]);
                    count--;
                }
                if (usr < cpu) {
                    System.out.println(cpuMoreWord[1]);
                    count--;
                }
            }
            if (count == 0) {
                System.out.println(cpuMoreWord[3]);
                break;
            }
        }
    }
    public static void main(String[] args) {

        doBegin();
    }
}

