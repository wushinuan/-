package Operate;

import GamerInformation.*;

import java.util.ArrayList;

public class GetIndex {

    public int getIndex(ArrayList<Gamer> gamers, int id) {
        int index = 0;
        for (Gamer g : gamers) {
            if (g.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }

}
