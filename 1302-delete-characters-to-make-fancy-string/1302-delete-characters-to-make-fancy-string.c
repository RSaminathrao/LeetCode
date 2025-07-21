char* makeFancyString(char* s) {
    char* ans=(char*)malloc(10000000*sizeof(char));
    int j=0,i;
    if(strlen(s)<=2)
    {
        for(i=0;i<strlen(s);i++)
            ans[i]=s[i];
        ans[i]='\0';
        return ans;
    }
    ans[j++]=s[j];
    for(i=1;i<strlen(s)-1;i++)
    {
        if(s[i-1]==s[i]&&s[i]==s[i+1])
            continue;
        else
            ans[j++]=s[i];
    }
    ans[j++]=s[i];
    ans[j]='\0';
    return ans;
}