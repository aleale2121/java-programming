import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }

            System.out.print("Duration:");
            Integer time = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name,time));

        }
        System.out.println();
        System.out.println("Program's maximum duration?");
        Integer max = scanner.nextInt();

        for (TelevisionProgram x : programs){
            if(x.getDuration() <= max){
                System.out.println(x);
            }
        }
    }
    
}
