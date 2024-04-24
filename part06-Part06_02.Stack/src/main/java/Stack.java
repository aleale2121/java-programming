
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
public class Stack {

    private ArrayList<String> items;

    public Stack() {
        items = new ArrayList<String>();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }
    
    public void add(String item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public ArrayList<String> values() {
        return items;
    }

    

    public String take() {
        int l=items.size();
        if (l>0){
            String last=items.get(l-1);
            items.remove(l-1);
            return last;
        }
        return "";
    }
}
