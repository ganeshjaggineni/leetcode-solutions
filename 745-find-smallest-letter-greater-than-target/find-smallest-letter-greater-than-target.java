class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length - 1;
        char small_char = '@';
        while (low <= high) {
            int mid = (low + high) / 2;
            if (letters[mid] > target) {
                small_char = letters[mid];
                high = mid - 1;
            } else if (letters[mid] == target) {
               low = mid+1;
            } else {
                low = mid + 1;
            }
        }
        return (small_char == '@') ? letters[0] : small_char;

    }
    // BY GANESH JAGGINENI
}