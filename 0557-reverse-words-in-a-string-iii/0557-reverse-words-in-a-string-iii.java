class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end;
        char[] word = s.toCharArray();
        for(int i = 0; i<word.length;i++){
            if(word[i] ==' '){
                end = i-1;
                reverse(word,start,end);
                start = i+1;
            }
        }
        reverse(word, start,word.length-1);
        return new String(word);
    }
    public static void reverse(char[] word, int start, int end){
        while(start < end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
    }
}