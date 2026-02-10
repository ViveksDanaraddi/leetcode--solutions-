class Solution {
    public int tribonacci(int n) {
        if(n==0)
        {
            return 0;
        }
        else if(n==1 || n==2)
        {
            return 1;
        }
        int firstterm = 0;
        int secondterm = 1;
        int thridterm = 1;

        for(int i=1;i<=n;i++)
        {
            int fourthterm = firstterm + secondterm + thridterm;

            firstterm = secondterm;
            secondterm = thridterm;
            thridterm = fourthterm;
        }
            return firstterm;
    }
}