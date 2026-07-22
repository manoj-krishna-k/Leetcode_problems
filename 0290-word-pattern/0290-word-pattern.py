class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        s=s.split()
        if len(s)!=len(pattern):
            return False
        d={}
        for i in range(len(pattern)):
            d.setdefault(pattern[i],[]).append(s[i])
        seen=set()
        for key,val in d.items():
            if len(set(val))!=1:
                return False
            if val[0]in seen:
                return False
            seen.add(val[0])
        return True
