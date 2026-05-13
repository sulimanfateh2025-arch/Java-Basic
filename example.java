import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        int[] Score = new int[4];
         Score[0] = myScaner.nextInt();
         Score[1] = myScaner.nextInt();
         Score[2] = myScaner.nextInt();
         Score[3] = myScaner.nextInt();
         int total = 0;
         for (int s : Score){
             total =total + s;

        }
         System.out.println("Total Score = " + total);


    }
}
