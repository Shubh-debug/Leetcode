class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0)
        {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.00;

        while(N > 0)
        {
            if( N % 2 == 1) // to check for odd
            {
                ans = ans * x; // mutliplying extra odd element in the answer
            }
            x = x * x; // jumping to higher powers directly
            N = N / 2; // halfing into two
        }
        return ans;
    }
}