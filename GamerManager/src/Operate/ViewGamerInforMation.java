package Operate;

import GamerInformation.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewGamerInforMation extends Father {

    public ViewGamerInforMation(String manipulate) {
        super(manipulate);
    }

    //全部查询
    private static void viewAllGamers(ArrayList<Gamer> gamers) {
        if (!gamers.isEmpty()) {
            System.out.println("查看玩家信息中...");
            for (Gamer g : gamers) {
                System.out.println(g);
            }
        } else {
            System.out.println("查无内容，请输入后重试");
        }
    }

    //单个查询
    private void viewGamerById(ArrayList<Gamer> gamers) {
        GetIndex getIndex = new GetIndex();

        do {
            int id = getUserIDToDo();
            int index = getIndex.getIndex(gamers, id);

            if (index != -1) {
                Gamer g = gamers.get(index);
                System.out.println("查看玩家信息中...");
                System.out.println(g);
            } else {
                System.out.println("未找到对应的玩家信息！");
            }

        } while (shouldContinueDoing());

    }

    public void viewGamerInforMation(ArrayList<Gamer> gamers) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---输入1查询全部，输入2按学号单个查询，输入其他退出---");
            int option;
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("输入有误，请输入一个整数！");
                sc.nextLine();
                continue;
            }

            //全部查询或单个查询
            switch (option) {
                case 1:
                    viewAllGamers(gamers);
                    break;
                case 2:
                    viewGamerById(gamers);
                    break;
                default:
                    return;
            }
        }

    }

}
