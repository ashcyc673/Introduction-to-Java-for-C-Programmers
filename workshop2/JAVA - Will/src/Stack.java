public class Stack {
    char[] _array = new char[0];


    // Pop function gonna take the first character out of the array and return it to the main
    public char Pop() {
        char result = _array[0];
        char[] _temp = new char[_array.length - 1];
        for (int index = 1; index < _array.length; ++index) {
            _temp[index - 1] = _array[index];
        }
        _array = _temp;
        return result;
    }
    // Original array = a,b,c,d    index = 0 1 2 3
    // New array has the size of 3, new array index = 0 1 2
    // stack =  a b c
    // stack.Pop() => return a;
    // but remove it from the array as well

    public void Push(char character) {
        // Save the old data of _array into _temp
        char[] _temp = _array;

        // Allocate the new array of character and add one space for the new character we need to add
        _array = new char[_array.length + 1];

        // Copy all the old data from old array to the new array
        for (int index = 0; index < _temp.length; ++index) {
            _array[index] = _temp[index];
        }

        // Copy the new value to the end of the array
        _array[_array.length - 1] = character;

        // char[] arr = {1,2,3,4}
        // 0 1 2 3 => The index of each element inside the arr array
        // The length of arr is 4 because there are 4 elements
        // To get the last index we gonna take the length and minus by 1
        // So lastIndex = arr.length - 1 = 4 - 1 = 3
    }
}
