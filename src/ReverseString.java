
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

    /** 

     * this class is created to reverse a string using a stack 
     */
    public static void main(String[] args) {

        // task 1 to reverse a word using STACK

        Stack<Character> myStack = new Stack<>();
        String inputString ="something";

        for (int i=0;i<inputString.length();i++) {
            myStack.push(inputString.charAt(i));
        }
        while(!myStack.empty()) {
            System.out.println(myStack.pop());
        }

    }
}

