bool judgeSquareSum(int c) {
//   for(long i=0;i<=c;i++)
//   {
//     for(long j=i;j<=c;j++)
//     {
//         if(i*i+j*j==c)
//             return true;
//     }
//   }
//   return false;  
   
    long long i = 0, j = floor(sqrt(c));
    while (i <= j) {
        long long sum = i*i + j*j;
        if (sum == c) return true;
        else if (sum < c) i++;
        else j--;
    }
    return false;
}
