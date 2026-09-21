class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        avg=sum(nums[:k])
        ma=avg/k
        
        for i in range(len(nums)-k):
            avg=avg-nums[i]+nums[i+k]

            if avg/k>ma:
                ma=avg/k
        return ma

        