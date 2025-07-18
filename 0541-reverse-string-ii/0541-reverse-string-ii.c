char* reverseStr(char* s, int k) {
    int len = strlen(s);
    for (int i = 0; i < len; i += 2*k) {
        int left = i;
        int right = (i + k - 1 < len) ? (i + k - 1) : (len - 1);
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
    return s;
}
