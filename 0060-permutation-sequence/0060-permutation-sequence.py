class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        per=[x for x in permutations([i+1 for i in range(n)])]
        return ("".join(map(str,per[k-1])))
        