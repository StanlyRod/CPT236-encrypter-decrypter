import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
   Ramon Rodriguez
   CPT-236-W01
   Assignment 6 - EncryptTextMethods
   Spring 2023
*/

public class EncryptTextMethods {

    //this method is in charge of encrypting a string
    static String encryptString(String message)
    {
        char[] charArray = message.toCharArray();  //Convert the string into a char Array
        String encryptedMessage = ""; //empty string that holds the encrypted message

        for (char value : charArray)
        {
           int equation = (int)value + 1; //add 1 to each character
           encryptedMessage = encryptedMessage + equation + ":";
        }
          return encryptedMessage.toString(); //returns the encrypted message
    }

    //this method is in charge of decrypting the string
    static String decryptString(String eMessage)
    {
        String[] sp = eMessage.split(":"); //split the string
        List<Integer> numlist = new ArrayList<Integer>();

        String decryptedMessage = ""; //empty string that will hold the decrypted message

        //convert each value in the string array to integer and adds them to an integer list
        for(String value : sp)
        {
            numlist.add(Integer.parseInt(value));
        }

        //subtract 1 from each number in the integer list, convert them to character and concat to the empty string
        for(var number : numlist)
        {
            int equation = (int)number - 1;
            char tochar = (char)equation;

            decryptedMessage += tochar;
        }

        return decryptedMessage.toString();
    }

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce a message: ");
        String message = input.nextLine();

        System.out.println("");
        System.out.println("Message: " + message);
        System.out.println("");
        
        String encryptedMessage = encryptString(message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("");

        String decryptedMessage = decryptString(encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
        
        
    }
}
