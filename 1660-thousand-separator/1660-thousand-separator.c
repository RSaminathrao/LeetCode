char* thousandSeparator(int n) {
    char* ans=(char*)malloc(2000*sizeof(char));
    int arr[100],i=0,j,k=0;
    if(n==0)
    {
        ans[k++]='0';
        ans[k++]='\0';
        return ans;
    }
    while(n!=0)
    {
        int r=n%10;
        arr[i++]=r;
        n=n/10;
    }
    for(j=i-1;j>=0;j--)
    {
        printf("%d",arr[j]);
        char c='0'+arr[j]; 
        if(j%3==0&&j!=0)
        {
            ans[k++]=c;
            ans[k++]='.';
        }
        else
            ans[k++]=c;
    }
  
    ans[k++]='\0';
    return ans;
}