public class pall {
    public static void main(String[] args) {
        String str="abcba";
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String str){
        str =str.toLowerCase();
        if(str==null||str.length()==0){
            return true;
        }
        for (int i = 0; i <= str.length()/2; i++) {
            char left=str.charAt(i);
            char right=str.charAt(str.length()-1-i);
            if(left!=right){
                return false;
            }
        }
        return true;
    }
}
