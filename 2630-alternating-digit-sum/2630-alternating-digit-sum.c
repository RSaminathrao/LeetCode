int alternateDigitSum(int n) {
    int count=(int)floor(log10(n))+1;
    int f=0,s=0;
    if(count%2==0)
        f=1;
    while(n!=0)
    {
        int r=n%10;
        if(f==1) 
        {
            r=r*-1;
            s=s+r;
            n=n/10;
            f=0;
            continue;
        }
        else
        {
            s=s+r;
            n=n/10;
            f=1;
            continue;
        }
        
    }
    return s;
}