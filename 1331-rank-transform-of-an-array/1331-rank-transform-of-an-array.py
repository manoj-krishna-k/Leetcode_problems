class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        temp=sorted(list(set(arr)))
        rank={}
        for i,num in enumerate(temp):
            rank[num]=i+1
        result=[]
        for i in arr:
            result.append(rank[i])
        return result
            

        