class PalindromeNumber_leetcode 
{
    public boolean isPalindrome(int x)
    {
        int temp=x;
        int rev=0;
        while(x>0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(temp==rev)
            return true;
        else
            return false;
    }
}