char* greatestLetter(char* s) {
    char* a=(char*)malloc(2*sizeof(char));
    int upper[26]={0},i;
    int lower[26]={0};

    for(i=0;i<strlen(s);i++)
    {
        if(s[i]>='a'&&s[i]<='z')
            lower[s[i]-97]=1;
        else
           upper[s[i]-65]=1; 
    }
    for(i=25;i>=0;i--)
    {
        if(upper[i]!=0&&lower[i]!=0)
        {
            a[0]=i+'A';
            a[1]='\0';
            return a;
        }
    }
    return "";
}