package dayThree;

import java.util.Scanner;

/**
 * Created by student on 29-Jun-16.
 */
public class HandlingInteger {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number between 1 and 10: ");

        while(true){
            int yourNum;
            try {
                Scanner value = new Scanner(System.in);
                yourNum = Integer.parseInt(value.nextLine());

                if(yourNum <1 || yourNum >10)
                    throw new Exception("Number not between 1 and 10");

                System.out.println("Your number is valid! It is " + yourNum);
                break;
            } catch(NumberFormatException e) {
                System.out.println("This is not a number");
                System.out.println(e.getMessage());
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
