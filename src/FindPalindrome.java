public class FindPalindrome {

    public static boolean isPalindrome(String string){
        boolean answer = false;
        StringBuilder stringBuilder = new StringBuilder(string);
        int length = string.length()-1;
        for (int i=0;i<length;i++){
            stringBuilder.deleteCharAt(i);
            stringBuilder.append(stringBuilder.charAt(i));
            if (stringBuilder.charAt(i) != stringBuilder.charAt(length-i)){
                 answer = false;
            }
            else {
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("aaaabb"));
    }
}
