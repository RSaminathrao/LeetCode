char* reverseWords(char* s) {
   int i=0,j=0,k;
   while(s[j]!='\0')
   {
      if(s[j]==' ')
      {
        k=j-1;
        while(i<k)
        {
            char c=s[i];
            s[i]=s[k];
            s[k]=c;
            i++;
            k--;
        }
        i=j+1;
      }
      j++;
   }
   k=j-1;
    while(i<k)
    {
     char c=s[i];
     s[i]=s[k];
     s[k]=c;
     i++;
     k--;
    }
    return s;
}