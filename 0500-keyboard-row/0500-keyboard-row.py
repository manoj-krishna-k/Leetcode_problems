class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        key=["qwertyuiop","asdfghjkl","zxcvbnm"]
        key=[set(sorted(x)) for x in key]
       
        ans=[]
        for s in words:
            sp=set(str.lower(s))
            
            
            if (sp.issubset(key[0])) or (sp.issubset(key[1])) or (sp.issubset(key[2])):
                ans.append(s)
                

        return ans
            
            

        