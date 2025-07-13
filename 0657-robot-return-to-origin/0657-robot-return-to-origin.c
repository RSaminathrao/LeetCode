bool judgeCircle(char* moves) {
   int u=0,l=0,i=0;
   while(moves[i]!='\0')
   {
        if(moves[i]=='U')
        {
            u++;
        }
        if(moves[i]=='L')
        {
            l++;
        }
        if(moves[i]=='D')
        {
            u--;
        }
        if(moves[i]=='R')
        {
            l--;
        }
        i++;
   }
   if(l==0&&u==0)
        return true;
    return false; 
}