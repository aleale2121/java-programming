
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings) {
        int n = strings.size();
        if (n == 0) {
            return;
        }
        strings.remove(n-1);
    }
}
