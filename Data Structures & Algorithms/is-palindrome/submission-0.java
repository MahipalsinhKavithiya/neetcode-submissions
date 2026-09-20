class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = s.toCharArray();
        char[] rev = new char[s.length()];
        int right = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            rev[i] = arr[right];
            right++;
        }

        if(Arrays.equals(arr,rev)){
            return true;
        }

        return false;

    }
}
