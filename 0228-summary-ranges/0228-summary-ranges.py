class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        
        i=0
        res=[]
        while i<len(nums):
            start=nums[i]
            while i+1<len(nums) and nums[i]+1==nums[i+1]:
                i+=1
            end=nums[i]
            if start==end:
                res.append(str(start))
            else:
                res.append(str(start)+"->"+str(end))
            i+=1
        return res
            