/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String output = "";
        int input_length = s.length();
        for(int i=0; i<input_length; i++){
            char curr = s.charAt(i);
            if(output.indexOf(curr) == -1 || (int)curr == 32){
                output += curr;
            }
        }
        return output;
    }
}