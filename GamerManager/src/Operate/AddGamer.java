package Operate;

import GamerInformation.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AddGamer {

    private static Gamer getInputFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入ID：");
        int id = readInt(sc);
        System.out.println("请输入昵称：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = readInt(sc);
        sc.nextLine();
        System.out.println("请输入位置信息：");
        String location = sc.nextLine();
        System.out.println("请输入描述：");
        String description = sc.nextLine();
        return new Gamer(id, name, age, location, description);
    }


    //处理输入错误，防止输入错误结束运行
    private static int readInt(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入有误，请输入一个整数！");
                sc.nextLine();
            }
        }
    }

    public void addGamer(ArrayList<Gamer> gamers) {
        Scanner sc = new Scanner(System.in);
        boolean keepAdding = true;

        do {
            Gamer g = getInputFromUser();
            gamers.add(g);
            System.out.println("添加成功！");

            System.out.println("---输入1继续输入添加，输入其他退出---");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice != 1) {
                keepAdding = false;
            }
        } while (keepAdding);

    }

}
