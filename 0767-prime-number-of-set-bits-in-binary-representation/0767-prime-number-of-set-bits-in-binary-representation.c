int isprime(int oc)
{
    int f=0;
    if(oc==2)
        return 1;
    else if(oc==1||oc%2==0)
        return 0;
    else
    {
        for(int i=3;i<=sqrt(oc);i+=2)
        {
            if(oc%i==0)
            {
                f=1;
                break;
            }
        }
    }
    if(f==1)
        return 0;
    return 1;
}
int countPrimeSetBits(int left, int right) {
    int pc=0;
    for(int i=left;i<=right;i++)
    {
        int j=i,s=0,k=0,oc=0;
        while(j!=0)
        {
            j=j&j-1;
            oc++;
        }
        
        if(isprime(oc)) pc++;
    }
    return pc;
}
