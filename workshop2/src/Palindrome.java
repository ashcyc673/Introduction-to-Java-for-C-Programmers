public class Palindrome {

    public static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        Stack stack = new Stack();
        for(char ch : arr){
            stack.push(ch);
        }
        for(int i = arr.length - 1; i < arr.length; i++){
            if(stack.pop() != arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome " + isPalindrome("racecar"));
        System.out.println("Is palindrome " + isPalindrome("pop"));
        System.out.println("Is palindrome " + isPalindrome("helloworld"));
    }
}

