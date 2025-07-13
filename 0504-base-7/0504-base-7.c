char* convertToBase7(int num) {
    char* ans=(char*)malloc(100*sizeof(char));
    int arr[100],i=0,j=0,k;
    if(num==0)
    {
        ans[i++]='0';
        ans[i++]='\0';
        return ans;
    }
    if(num<0)
    {
        ans[i++]='-';
        num=abs(num);
    }
    while(num!=0)
    {
        arr[j++]=num%7;
        num=num/7;
    }
    for(k=j-1;k>=0;k--)
        ans[i++]='0'+arr[k];
    ans[i++]='\0';
    return ans;
}