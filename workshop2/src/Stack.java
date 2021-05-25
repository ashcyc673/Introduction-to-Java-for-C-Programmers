public class Stack {

    char[] arr = new char[0];

    public void push(char ch)
    {
        char[] temp = arr;
        arr = new char[arr.length + 1];
        for(int i = 0; i < temp.length; i++){
            arr[i] = temp[i];
        }
        arr[arr.length - 1] = ch;
    }

    public char pop()
    {
        char result = arr[0];
        char[] temp = new char[arr.length - 1];
        for(int i = 1; i < arr.length; i++){
            temp[i - 1] = arr[i];
        }
        arr = temp;
        return result;
    }

}
