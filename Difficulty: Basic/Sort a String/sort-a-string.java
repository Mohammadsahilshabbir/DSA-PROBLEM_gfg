class Solution {
    public String sortString(String s) {
        // code here
        // vector<int>alpha(26,0);
        int[] freq = new int[26];
    for(int i =0;i<s.length();i++){
        int index=s.charAt(i)-'a';
        freq[index]++;
        
    }
    StringBuilder ans = new StringBuilder();
    for(int i =0;i<26;i++)
    {
        while(freq[i]>0){
        // char c = 'a'+i;
        ans.append((char) ('a' + i));
        freq[i]--;
        }
    }
        return ans.toString();
    

    }
}