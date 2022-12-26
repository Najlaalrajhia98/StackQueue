
import java.io.PushbackInputStream;
import java.security.PublicKey;
import java.util.Stack;



/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class ReverseString {

    /**) Using STACK, Validate if the braces are balanced or not
INPUT: "{{ int x=0; }}"
OUTPUT: true (Meaning valid)

INPUT: "{{{ }}"
OUTPUT: false (Meaning Invalid)

INPUT: "{"
OUTPUT: false (Meaning Invalid)

INPUT: "}"
OUTPUT: false (Meaning Invalid)



     * @param args
     */
    public static void main(String[] args) {
        // task 1 to reverse a word using STACK
        Stack<Character> myStack = new Stack<>();
        String inputString="something";

        for (int i=0;i<inputString.length();i++) {
            myStack.push(inputString.charAt(i));
        }
        while(!myStack.empty()) {
            System.out.print(myStack.pop());
        }
        // task 2 to validiate balance condition
        System.out.println();

        String inputtString =  " {{int x=0;}}} ";

        System.out.println(stackO(inputtString));

    }
    public static boolean stackO(String inputtString) 
    {
        Stack<Character> myStack = new Stack<Character>();

        for (int i=0;i<inputtString.length();i++) 
        {
            if (inputtString.charAt(i)== '{') 
                myStack.push(inputtString.charAt(i));

            else if (inputtString.charAt(i)=='}')

            { 
                if(!myStack.empty())
                    myStack.pop();
                else
                    return false;
            }
        }

        if (myStack.empty())
            return true;
        else 
            return false;
    }
}
