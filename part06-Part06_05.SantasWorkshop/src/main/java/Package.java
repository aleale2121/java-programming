
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
public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int totalG = 0;
        for (Gift g : gifts) {
            totalG += g.getWeight();
        }
        return totalG;
    }
}
