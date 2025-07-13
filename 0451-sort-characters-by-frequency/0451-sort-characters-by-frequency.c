char* frequencySort(char* s) {
    int len = strlen(s);
    char* ans = malloc((len + 1) * sizeof(char));  
    int arr[256] = {0}, i, j = 0;

    
    for (i = 0; i < len; i++) {
        arr[(unsigned char)s[i]]++;
    }

    
    while (1) {
        int max = 0;
        char maxchar = 0;

        for (i = 0; i < 256; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxchar = (char)i;
            }
        }

        if (max == 0)
            break;

        for (int k = 0; k < max; k++) {
            ans[j++] = maxchar;
        }

        arr[(unsigned char)maxchar] = 0;
    }

    ans[j] = '\0';  
    return ans;
}