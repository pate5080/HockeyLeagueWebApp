/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 */
public class Days {

    enum Weekdays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in =new Scanner(System.in);
    System.out.print("Enter the day number (1-7): ");
    int code = in.nextInt();
    
    if (code >= 1 && code <= 7) {
        Weekdays day = Weekdays.values()[code - 1];
        System.out.println(day);
    } else {
        System.out.println("Invalid input!");
    }// TODO code application logic here
    
    } 
}
