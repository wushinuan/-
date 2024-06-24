package Operate;

import java.util.Scanner;

public class Father {

    //修改词
    String manipulate;

    public Father(String manipulate) {
        this.manipulate = manipulate;
    }

    public String getManipulate() {
        return manipulate;
    }

    public void setManipulate(String manipulate) {
        this.manipulate = manipulate;
    }

    //重复1
    public int getUserIDToDo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要"+manipulate+"的ID：");
            int id;
            try {
                id = sc.nextInt();
                return id;
            } catch (Exception e) {
                System.out.println("输入有误，请输入一个整数！");
                sc.nextLine();
            }
        }
    }

    //重复2
    public boolean shouldContinueDoing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---输入1继续"+manipulate+"，输入其他退出---");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice == 1;
    }

}
