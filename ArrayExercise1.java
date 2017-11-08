
import java.util.Scanner;

/*****************************************************************
*Programmer:        Erika Tvaskis
*Class:             CS30S Section 007
*Assignment:        Array Exercises One Program 1       
*Description:       Numbers loaded into array are printed, repeated, changed, and min and max are determined                      
*Input:             Enter ints                                                                   
*Output:            Prints numbers and prints the max and min                                      
******************************************************************/

public class ArrayExercise1 
{   
    //private static String EnterValueStr; 
    static int MAX = 10;	
     //int[] numbers = new int[MAX];

    public static void main(String[] args) 
    { //begin main
        
//DECLARE VARIABLES 
    
    Scanner Scanner = new Scanner(System.in);   
    //Declaring Scanner
    
    int[] Numbers;
    //Declaring array of ints
    
    int EnterValue;
    //Declaring EnterValue as int
     
//BANNER

    ProgramInfo Banner = new ProgramInfo("Array Exercises One", " Program 1"); 
    //Object that prints banner
    ProgramInfo EndOfProgram = new ProgramInfo();
    System.out.println(Banner.toString());  
    //Prints banner
    
//SCANNER (DETERMINES MAX)

    System.out.println("Please enter how many elements you want: ");
    //Prints this
    try {   
        //Try
        MAX = Integer.parseInt(Scanner.nextLine());
        //Setting MAX to entered number
    }   //Closing bracket for try statement
    catch (NumberFormatException e) {                             
        //Catch number format exception
        System.out.println("Error, please enter a numeric value");                             
        //Prints this
        System.out.println("The Error: " + e); 
        //Prints error
        return; 
        //Stops the program if catch statement catches error
    }   //Closing bracket for catch statement 
     
    Numbers = new int[MAX];
    //Sets array size to MAX
        
//FOR LOOPS
        
    //For loop to enter values for array
    for (int i = 0; i < MAX; i++){
        System.out.println("Please enter desired number for element: " + i);
        //Prints
        try {   
            //Try
            EnterValue = Integer.parseInt(Scanner.nextLine());
            //Setting MAX to entered number
        }   //Closing bracket for try statement
        catch (NumberFormatException e) {                             
            //Catch number format exception
            System.out.println("Error, please enter a numeric value");                             
            //Prints this
            System.out.println("The Error: " + e); 
            //Prints error
            return; 
            //Stops the program if catch statement catches error
        }   //Closing bracket for catch statement 
        
        Numbers[i] = EnterValue;  
        //Element i = the entered value
    }   //Closing bracket for loop

    System.out.println("***************");
    System.out.println("Regular Order:");
    //Prints this
            
    //For loop to print values once entered (reg. order)
    for (int i = 0; i < MAX; i++) {
        //For loop
        System.out.println(i + " : " + Numbers[i]);
        //Prints this
    }   //Closing bracket for loop
   
    System.out.println("***************");
    System.out.println("Reverse Order:");
    //Prints this

    //For loop that reverses order (of values entered)  
    for(int i = Numbers.length - 1; i >= 0;i--){
        //For loop
        System.out.println(i + " : " + Numbers[i]);
        //Prints this
    }   //Closing bracket for loop

    System.out.println("***************");
    System.out.println("Repition:");
    //Prints this
    
    //For loop to repeat elements
    for (int i = 0; i < MAX;) {
        //For loop
        System.out.println("What element do you wish to repeat? Enter -1 to pass: ");
        //Prints this
            try {   
                //Try
                i = Integer.parseInt(Scanner.nextLine());
                //Setting i to entered number
            }   //Closing bracket for try statement
            catch (NumberFormatException e) {                             
                //Catch number format exception
                System.out.println("Error, please enter a numeric value");                             
                //Prints this
                System.out.println("The Error: " + e); 
                //Prints error
                return; 
                //Stops the program if catch statement catches error
            }   //Closing bracket for catch statement 
        
        if ( i == -1) {
            //If statement
            i = MAX;
            //Sets i to MAX
        }   //Closing bracket for if statement
        if (i > MAX) {
            //If statement
            System.out.println("Sorry, this element does not exist");
            //Prints this
            i = MAX;
            //Sets i to  MAX
        }   //Closing bracket for if statement
        if (i < MAX && i != -1) {
            //If statement
            System.out.println(i + " : " + Numbers[i]);
            //Prints this
        }   //Closing bracket for else statement
    }   //Closing bracket for loop
    
    System.out.println("***************");
    System.out.println("Changing:");
    //Print this
    
    //For loop to change elements
    for (int i = 0; i < MAX;) {
        //For loop
        System.out.println("What element would you like to change? Enter -1 to pass: ");
        //Prints this
            try {   
                //Try
                i = Integer.parseInt(Scanner.nextLine());
                //Setting i to entered number
            }   //Closing bracket for try statement
            catch (NumberFormatException e) {                             
                //Catch number format exception
                System.out.println("Error, please enter a numeric value");                             
                //Prints this
                System.out.println("The Error: " + e); 
                //Prints error
                return; 
                //Stops the program if catch statement catches error
            }   //Closing bracket for catch statement 
        
        if ( i == -1) {
            //If statement
            i = MAX;
            //Sets i to MAX
        }   //Closing bracket for if statement
        if (i > MAX) {
            //If statement
            System.out.println("Sorry, this element does not exist");
            //Prints this
            i = MAX;
            //Sets i to  MAX
        }   //Closing bracket for if statement
        if (i < MAX && i != -1) {
            //If statement
            System.out.println("Enter new value:");
            //Prints this
                try {   
                    //Try
                    Numbers[i] = Integer.parseInt(Scanner.nextLine());
                    //Setting Numbers[i] to entered number
                }   //Closing bracket for try statement
                catch (NumberFormatException e) {                             
                    //Catch number format exception
                    System.out.println("Error, please enter a numeric value");                             
                    //Prints this
                    System.out.println("The Error: " + e); 
                    //Prints error
                    return; 
                    //Stops the program if catch statement catches error
                }   //Closing bracket for catch statement 
            
            System.out.println("***************");    
            System.out.println(i + " has a new value of: " + Numbers[i]);
            System.out.println("***************");
            //Prints this
        }   //Closing bracket for if statement   
        
    }   //Closing bracket for loop
  
//GET MAX AND MIN VALUES

    getMaxValue(Numbers);
    getMinValue(Numbers);
    //Gets MaxValue and MinValue 
    System.out.println("***************"); 
    System.out.println("Maximum Value");
    System.out.println(getMaxValue(Numbers));
    System.out.println("***************"); 
    System.out.println("Minimum Value");
    System.out.println(getMinValue(Numbers)); 
    //Prints this

//CLOSING MESSAGE

    System.out.println("***************");
    System.out.println("End of processing.");
    
} //End main
    
/****************************************************************************
  * Purpose:    Gets MaxValue
  * Interface:  Printed in program
  * In:         
  * Out:        maxValue
*****************************************************************************/
public static int getMaxValue(int[] Numbers) {
    int maxValue = Numbers[0];
    //Sets maxValue to element 0 of Numbers
    for (int i = 1; i < Numbers.length; i++) {
        //For loop
        if (Numbers[i] > maxValue) {
            //If statement
            maxValue = Numbers[i];
            //Sets minValue to element i of Numbers
        }   //Closing bracket for if statement
    }       //Closing bracket for loop
    return maxValue;
    //Returns maxValue
}

/****************************************************************************
  * Purpose:    Gets MinValue
  * Interface:  Printed in program
  * In:         
  * Out:        minValue
*****************************************************************************/
public static int getMinValue(int[] Numbers) {
    int minValue = Numbers[0];
    //Sets minValue to element 0 of Numbers
    for (int i = 1; i < Numbers.length; i++) {
        //For loop
        if (Numbers[i] < minValue) {
            //If statement
            minValue = Numbers[i];
            //Sets minValue to element i of Numbers
        }   //Closing bracket for if statement
    }       //Closing bracket for loop
    return minValue;
    //Returns minValue
}
    
} //End public class