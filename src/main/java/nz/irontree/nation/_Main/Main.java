package nz.irontree.nation._Main;

import nz.irontree.nation.entity.Citizen;
import nz.irontree.nation.util.CitizenGenerator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//

}
// Через выбор пользователя: 5.1 вывести на консоль столицу, 5.2 количество областей, 5.3 площадь государства,
// 5.4 областные центры, 5.5 средний возраст жителей,
// 5.6 жителей у которых имя состоит из n букв ( чисто n вводится с клавиатуры).
// 5.7 пункты 5.2 - 5.6 должны считаться в момент вызова метода, а не заранее.
// (т.е. пользователь делает выбор → вызывается метод → вычисляются данные)
// Вывести список жителей у которых имя начинается с буквы char m (символ m вводится с клавиатуры).
// Вывод может быть красиво отформатирован (например список жителей для 1 области, для второй и т.д.).

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("Show me: ");
            System.out.println("1 - The capital of Land");
            System.out.println("2 - The number of regions");
            System.out.println("3 - Land's area");
            System.out.println("4 - All districts' centers");
            System.out.println("5 - The average age of the citizens");
            System.out.println("6 - The number of letters in citizens' surnames");
        }
    }
}