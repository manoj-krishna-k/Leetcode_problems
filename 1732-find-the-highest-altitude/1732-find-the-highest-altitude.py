class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        alt=[0]
        summ=0
        for i in range(len(gain)):
            summ+=gain[i]
            alt.append(summ)
        return max(alt)
        