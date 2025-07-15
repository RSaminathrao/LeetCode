bool isValid(char* word) {
    if(strlen(word)<3)
        return false;
    int vowels=0,consonant=0;
   for(int i=0;i<strlen(word);i++)
   {
        if((word[i]>='A'&&word[i]<='Z')||(word[i]>='a'&&word[i]<='z')||(word[i]>='0'&&word[i]<='9'))
        {
            if((word[i]>='A'&&word[i]<='Z')||(word[i]>='a'&&word[i]<='z'))
            {
                char c=tolower(word[i]);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    vowels++;
                else
                    consonant++;
            }  
        }
        else
            return false;
   }
   printf("%d\n%d",vowels,consonant);
   if(vowels>=1&&consonant>=1)
        return true;
    return false;
}