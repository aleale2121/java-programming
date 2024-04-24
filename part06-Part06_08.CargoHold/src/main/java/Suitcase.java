
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
public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";

        }
        int totalWeight = 0;
        int size = items.size();
        for (Item item : items) {
            totalWeight += item.getWeight();
            if (totalWeight > this.maxWeight) {
                totalWeight = totalWeight - item.getWeight();
                size--;
            }
        }
        String pronoun = " items (";
        if (size == 1) {
            pronoun = " item (";
        }
        return size + pronoun + totalWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        int totalW = 0;
        for (Item item : items) {
            totalW += item.getWeight();
        }
        return totalW;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item W = new Item("", 0);
        for (Item e : items) {
            if (W.getWeight() < e.getWeight()) {
                W = e;
            }
        }
        return W;
    }
}
