import java.util.Scanner;
/**
 * This program will find the maximum integer between three numbers that the user puts 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    //ask the user for three integers 
    System.out.println("Please enter three integers on seperate lines");
    //declare a varibale to store first integer 
    
     int firstNumber = input.nextInt();
     //declare a variable to store second integer
     int secondNumber = input.nextInt();
     //declare a variable to store thirdNumber
     int thirdNumber = input.nextInt();

     //find the maximum integer
     if(firstNumber > secondNumber){
      //find if its also bigger than third integer
      if(firstNumber > thirdNumber){
         System.out.println("Maximum: " + firstNumber);

      }
     }else
       if(secondNumber > firstNumber){
        //find if its also bigger than third
        if (secondNumber > thirdNumber){
          System.out.println("Maximum: " + secondNumber);
        }
      }
     
      if(thirdNumber > firstNumber){
        //find if its also bigger than second number 
        if (thirdNumber > secondNumber){
        System.out.println("Maximum: " + thirdNumber);
      }
      }
      
     }
      
  
     
}
  
    
  
 

