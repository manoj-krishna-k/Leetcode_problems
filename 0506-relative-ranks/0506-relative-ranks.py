class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        places=score[:]
        score=sorted(score,reverse=True)
        
        for i in range(len(score)):
            j=places.index(score[i])
            
            if i==0:
                places[j]="Gold Medal"
            elif(i==1):
                places[j]="Silver Medal"
            elif(i==2):
                places[j]="Bronze Medal"
            else:
                places[j]=str(i+1)
        return places
                


        