class Solution:
    def findGCD(self, nums: List[int]) -> int:
        maxx=max(nums)
        minn=min(nums)
        ans=1
        for i in range(2,maxx+1):
            if (maxx%i==0) and (minn%i==0):
                ans=max(ans,i)
                
        return ans
            
        