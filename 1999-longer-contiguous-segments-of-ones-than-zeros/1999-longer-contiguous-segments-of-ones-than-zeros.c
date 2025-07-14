bool checkZeroOnes(char* s) {
    int oc=0,zc=0,longoc=0,longzc=0,i;
    for(i=0;i<strlen(s);i++)
    {
        if(s[i]=='1')
            oc++;
        else
            oc=0;
        if(oc>longoc)
            longoc=oc;
    }
    for(i=0;i<strlen(s);i++)
    {
        if(s[i]=='0')
            zc++;
        else
            zc=0;
        if(zc>longzc)
            longzc=zc;
    }
    printf("%d\n%d",longoc,longzc);
    if(longoc>longzc)
        return true;
    return false;
}