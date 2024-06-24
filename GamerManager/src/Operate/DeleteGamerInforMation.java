package Operate;

import GamerInformation.*;

import java.util.ArrayList;

public class DeleteGamerInforMation extends Father {

    public DeleteGamerInforMation(String manipulate) {
        super(manipulate);
    }

    public void deleteGamerInforMation(ArrayList<Gamer> gamers) {
        GetIndex getIndex = new GetIndex();

        do {
            int id = getUserIDToDo();
            int index = getIndex.getIndex(gamers, id);

            if (index != -1) {
                System.out.println("删除中...");
                gamers.remove(index);
                System.out.println("删除成功");
            } else {
                System.out.println("查无此ID，请重新输入");
            }

        } while (shouldContinueDoing());

    }

}
