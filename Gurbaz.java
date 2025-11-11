
package gurbaz;
import java.util.Scanner;
public class Gurbaz {
    public static void main(String[] args) {
                Scanner myScanner = new Scanner(System.in);
        System.out.print("Please inter number of employee: ");
        int numberofemployee =  myScanner.nextInt();
        String [][] employee = new String [numberofemployee] [4];
        for (int x =0; x<numberofemployee; x++){
            System.out.println("Please inter an empllyee information: ");
            for(int y =0; y<employee[x].length; y++){
                if(y == 0){
                System.out.print("Please inter employee ID: ");
                }
                else if(y == 1){
                System.out.print("Please inter employee name: ");
                }
                else if (y == 2){
                System.out.print("Please inter employee position: ");
                }
                else if (y ==3){
                    System.out.print("Please inter employee salary: ");
                }
                employee [x][y] = myScanner.next();
                
            }
        }
       /* System.out.print("inter your name: ");
        String name =  myScanner.next();
        System.out.print("Please inter your age: ");
        int age = myScanner.nextInt();
        System.out.println( name + " You are " +age+  " years old! ");*/
    }
        
    
}
