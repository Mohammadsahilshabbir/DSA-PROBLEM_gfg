// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int getbit=(num>>(i-1)) & 1;
        int setbit=(1<<(i-1))|num;
        int clearbit=num & ~(1<<(i-1));
        System.out.print(getbit + " " + setbit + " " + clearbit);
    }
}
