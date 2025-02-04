class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0,t=num;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum!=t)
            return false;
        return true;
    }
}