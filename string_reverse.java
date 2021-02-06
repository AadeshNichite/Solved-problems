class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int length = str.length();
        
        String reverse = "";
        
        for(int i=length-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}