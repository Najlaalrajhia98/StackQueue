import java.util.Stack;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class StackPractice {

    /**4) Using STACK, Validate if the the expression containing square brackets, braces and paranthesis 
   is balanced or not.

INPUT: "{ int x= (int)(0+1); int[] arr=new arr[10];;; }"
OUTPUT: true (Meaning valid)

INPUT: "[{()}]"
OUTPUT: true (Meaning valid)

INPUT: "]{()}[
OUTPUT: false (Meaning Invalid)

INPUT: "([]("
OUTPUT: false (Meaning Invalid)

INPUT: "(arr[10})"
OUTPUT: false (Meaning Invalid)

INPUT: "[arr(10)["
OUTPUT: false (Meaning Invalid)

INPUT: "([arr{(10)}])"
OUTPUT: true (Meaning valid)


     * @param  this class works for all the above cases.
     */
    public static void main(String[] args) {
        String mString="([arr{(10)}])";
        Stack<Character> myStack = new Stack<>();
        System.out.println(stack1(mString, myStack));
    }

    public static boolean stack1 (String mString,Stack<Character> myStack) {


        for (int i=0; i<mString.length();i++) {

            if (mString.charAt(i)== '{' || mString.charAt(i)=='['  || mString.charAt(i)=='(') 
                myStack.push(mString.charAt(i));
            else if (mString.charAt(i)=='}'|| mString.charAt(i)==']' || mString.charAt(i)==')') 
            {
                if (!myStack.empty() && mString.charAt(i)=='}'&& myStack.peek()=='{' || 
                        mString.charAt(i)==']'&& myStack.peek()=='[' || 
                        mString.charAt(i)==')'&& myStack.peek()=='(' )
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