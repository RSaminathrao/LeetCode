bool isFascinating(int n) {
   int num[3];
   num[0]=n;
   num[1]=n*2;
   num[2]=n*3;
   int unique[9],i;
   for(i=0;i<3;i++)
   {
        while(num[i]!=0)
        {
        int r=num[i]%10;
        if(r==0)
            return false;
        unique[r-1]++;
        num[i]=num[i]/10;
        }
   }
   
   for(i=0;i<9;i++)
        if(unique[i]==1)
            continue;
        else
            return false;
    return true;

}