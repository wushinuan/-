package Operate;

import java.util.ArrayList;
import java.util.Scanner;

import GamerInformation.*;

public class ModifyGamerInforMation extends Father {

    public ModifyGamerInforMation(String manipulate) {
        super(manipulate);
    }

    public void modifyGamerInforMation(ArrayList<Gamer> gamers) {
        Scanner sc = new Scanner(System.in);
        GetIndex getIndex = new GetIndex();

        do {
            int id = getUserIDToDo();
            int index = getIndex.getIndex(gamers, id);

            if (index != -1) {
                System.out.println("请输入新的昵称：");
                String name = sc.next();
                System.out.println("请输入新的年龄：");
                int age = sc.nextInt();
                System.out.println("请输入新的位置：");
                String location = sc.next();
                System.out.println("请输入新的描述：");
                String description = sc.next();
                System.out.println("修改中...");
                Gamer g = new Gamer(id, name, age, location, description);
                gamers.set(index, g);
                System.out.println("修改成功！");
            } else {
                System.out.println("查无此ID，请重新输入！");
            }

        } while (shouldContinueDoing());
    }

}
