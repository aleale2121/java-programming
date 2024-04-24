
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alefew
 */
public class Hold {

    private ArrayList<Suitcase> hold = new ArrayList<>();
    private int maxW;

    public Hold(int maxW) {
        this.maxW = maxW;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.netWeight() + suitcase.totalWeight() <= maxW) {
            this.hold.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int kg = 0;
        for (Suitcase s : hold) {
            kg += s.totalWeight();
        }
        String pronoun = " suitcases";
        if (hold.size() == 1) {
            pronoun = " suitcase";
        }
        return hold.size() + pronoun + " (" + kg + " kg)";
    }

    public int netWeight() {
        int netWeight = 0;
        for (Suitcase s : hold) {
            netWeight += s.totalWeight();
        }
        return netWeight;
    }

    public void printItems() {
        for (Suitcase s : hold) {
            s.printItems();
        }
    }
}
