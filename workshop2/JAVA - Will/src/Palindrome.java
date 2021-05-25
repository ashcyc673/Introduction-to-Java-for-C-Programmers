// The original array is  I A O A I
// We need to compare end to end
// I == I > true
// A == A > true
// 0 == 0 > true

// The original array is  I O A
// We need to compare end to end
// I == A > false

public class Palindrome {
    public static boolean IsPalindrome(String originalStr) {
        // Convert the string to char array
        char[] originalStrArr = originalStr.toCharArray();
        Stack stack = new Stack(); //because it's not static so it needs to be initialize a new object
        for (char character: originalStrArr) {
            stack.Push(character);
        }
        for (int index = originalStrArr.length - 1; index >= 0; --index) {
            if (stack.Pop() != originalStrArr[index]) return false;
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Is Palindrome " + Palindrome.IsPalindrome("racecara"));
    }
}
