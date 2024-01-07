/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String output = "";
        int string_len = s.length();

        for(int i=0; i<string_len; i++){
            char curr = s.charAt(i);
            // is a capital letter
            if((int)curr >= 65 && (int)curr <=90){
                output += (char)(curr + 32);
            }
            else{
                output += curr;
            }
        }
        return output;
    }
}