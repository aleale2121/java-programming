
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int max1;
        if (number1 > number2){
            max1=number1;
        } else{
            max1=number2;
        }
        if (number3>max1){
            return number3;
        }
        return max1;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
