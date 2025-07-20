int countGoodSubstrings(char* s) {
    if(strlen(s)<=2)
        return 0;
   int c=0;
   for(int i=0;i<strlen(s)-2;i++)
        if(s[i]!=s[i+1]&&s[i]!=s[i+2]&&s[i+1]!=s[i+2])
            c++;
    return c;
}