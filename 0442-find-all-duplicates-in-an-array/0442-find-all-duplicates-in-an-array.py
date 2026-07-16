class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        count={}
        for num in nums:
            count[num]=count.get(num,0)+1
        res=[]
        for key,value in count.items():
            if value>1:
                res.append(key)
        return res

        