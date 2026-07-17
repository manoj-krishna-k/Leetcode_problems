class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        currmax=currmin=ans=nums[0]
        for i in range(1,len(nums)):
            a=nums[i]
            if a<0:
                currmin,currmax=currmax,currmin
            currmax=max(a,currmax*a)
            currmin=min(a,currmin*a)
            ans=max(ans,currmax)
        return ans