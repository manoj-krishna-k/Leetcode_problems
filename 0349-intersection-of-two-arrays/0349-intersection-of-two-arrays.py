class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n=max(len(nums1),len(nums2))
        nums=nums1 if n==len(nums1)else nums2
        res=[]
        for i in range(n):
            if nums[i] in nums1 and nums[i] in nums2:
                res.append(nums[i])
        return list(set(res))
            