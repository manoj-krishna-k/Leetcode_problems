class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels=[]
        pos=[]
        for i in range(len(s)):
            if s[i] in "aeiouAEIOU":
                vowels.append(s[i])
                pos.append(i)
        vowels.reverse()
        l=list(s)
        for i in range(len(pos)):
            l[pos[i]]=vowels[i]
        return "".join(l)
            