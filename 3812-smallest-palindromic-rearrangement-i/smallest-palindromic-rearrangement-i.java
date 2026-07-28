class Solution {
    public String smallestPalindrome(String s) {
        int [] freq = new int [26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder left = new StringBuilder();
        String Middle  = "";
        for(int i = 0; i< 26;i++){
            for(int j =0;j<freq[i]/2;j++ ){
                left.append((char)('a'+ i));
            }
            if(freq[i]%2==1){
                Middle = String.valueOf((char) ('a' + i));
            }
        }
         String right = new StringBuilder(left).reverse().toString();

            return left.toString() + Middle + right;
    }
}