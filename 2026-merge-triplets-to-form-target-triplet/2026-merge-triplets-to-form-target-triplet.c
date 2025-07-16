bool mergeTriplets(int** triplets, int tripletsSize, int* tripletsColSize, int* target, int targetSize) {
    int f1=0,f2=0,f3=0;
    for(int i=0;i<tripletsSize;i++)
    {
        if(triplets[i][0]>target[0]||triplets[i][1]>target[1]||triplets[i][2]>target[2])
            continue;
        else
        {
            if(triplets[i][0]==target[0])
                f1=1;
            if(triplets[i][1]==target[1])
                f2=1;
            if(triplets[i][2]==target[2])
                f3=1;
        }
        
    }
    if(f1==1&&f2==1&&f3==1)
            return true;
        return false;
}