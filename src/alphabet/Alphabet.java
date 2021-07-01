
package alphabet;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {
        char[] alpha = new char[26]; //Create a char array called "alpha" and specify that it will contain 26 values.
        
        for(int i = 0; i < 26; i++) //use a for loop to iterate through each of the 26 values in "alpha" 

        {
            alpha[i] = (char)(97 + i); //Letters can be mapped to an integer value using the ascii table where the letter 'a' has the value of 97.  
                                       //Add each letter to the "alpha" array, starting with 'a' (which has the value of 97) and increase 97 by the 
                                       //value of i to continue going through the alphabet.
        }
        
        System.out.println(Arrays.toString (alpha)); //print out the "alpha" array
    }     
}

