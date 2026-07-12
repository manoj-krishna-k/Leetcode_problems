class Solution:
    def jump(self, nums: List[int]) -> int:
        jumps=0
        left=right=0
        while right<len(nums)-1:
            dist=0
            for i in range(left,right+1):
                dist=max(dist,i+nums[i])
            left=right+1
            right=dist
            jumps+=1
        return jumps

        