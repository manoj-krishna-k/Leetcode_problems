class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        
        m=len(grid)
        n=len(grid[0])
        temp=[]
        for i in range(m):
            temp.extend(grid[i])
        k%=(m*n)
        res=temp[:]
        for _ in range(k):
            res[0]=temp[-1]
            res[1:]=temp[:len(temp)-1]
            temp=res[:]
        ans=[[0]*n for _ in range(m)]
        l=0
        for i in range(m):
            for j in range(n):
                ans[i][j]=res[l]
                l+=1
        return ans






        