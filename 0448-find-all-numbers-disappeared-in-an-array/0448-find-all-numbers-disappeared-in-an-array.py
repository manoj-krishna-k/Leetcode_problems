class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        s=set(nums)
        n=len(nums)
        res=[]
        for num in range(1,n+1):
            if num not in s:
                res.append(num)
        return res
        



            

        