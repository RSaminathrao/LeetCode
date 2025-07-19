bool areNumbersAscending(char* s) {
    long long prevmax = 0;             
    int i = 0, j;
    int len = strlen(s);

    for (; i < len; i++) {
        if (s[i] >= '0' && s[i] <= '9') {
            long long currentmax = 0;
            j = i;

            
            while (j < len && s[j] >= '0' && s[j] <= '9') {
                currentmax = currentmax * 10 + (s[j] - '0');
                j++;
            }

            // compare and update
            if (currentmax > prevmax) {
                prevmax = currentmax;
            } else {
                return false;
            }

            printf("%lld\n", currentmax);

            i = j - 1;  
        }
    }
    return true;
}
