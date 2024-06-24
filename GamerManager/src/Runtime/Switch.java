package Runtime;

import GamerInformation.Gamer;
import Operate.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch {
    ArrayList<Gamer> gamers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    AddGamer ag = new AddGamer();
    DeleteGamerInforMation dgim = new DeleteGamerInforMation("删除");
    ModifyGamerInforMation mgim = new ModifyGamerInforMation("修改");
    ViewGamerInforMation vgim = new ViewGamerInforMation("查看");
    Exit ex = new Exit();

    public void hub() {
        while (true) {
            Print.print();

            switch (sc.nextInt()) {
                case 1:
                    ag.addGamer(gamers);
                    System.out.println("\n");
                    break;
                case 2:
                    dgim.deleteGamerInforMation(gamers);
                    System.out.println("\n");
                    break;
                case 3:
                    mgim.modifyGamerInforMation(gamers);
                    System.out.println("\n");
                    break;
                case 4:
                    vgim.viewGamerInforMation(gamers);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("退出中...");
                    ex.exit();
                default:
                    System.out.println("输入有误，请重新输入！");
                    System.out.println("\n");
                    break;
            }
        }
    }

}
