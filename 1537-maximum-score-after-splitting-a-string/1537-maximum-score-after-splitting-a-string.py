class Solution(object):
    def maxScore(self, s):
        max=0
        for i in range(1,len(s)):
            s1=s[i:]
            s2=s[:i]
            if s1.count("1")+s2.count("0")>max:
                max=s1.count("1")+s2.count("0")
        return max
        