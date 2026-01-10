class Solution {
    int convertfive(int num) {
        // Your code here
        int result=0;
        int place=1;
        if(num==0) num=5;
        while(num>0){
            int digit=num%10;
            if(digit==0) digit=5;
            result=result+digit*place;
            place*=10;
            num /=10;
            
        }
        return result;
    }
}