#Bruteforce

class Solution:
    def findRightInterval(self, intervals: List[List[int]]) -> List[int]:
        ans=[]
        for i in range(len(intervals)):
            minS=9999999
            ind=-1
            for j in range(len(intervals)):
                if i!=j:
                    if(intervals[i][1]<=intervals[j][0]):
                        if((intervals[j][0]-intervals[i][1])<minS):
                            ind=j
            ans.append(ind)
        return ans

#O(NlogN)

class Solution:
    def findRightInterval(self, intervals: List[List[int]]) -> List[int]:
        hash_map={}
        start=[]
        for i in range(len(intervals)):
            start.append(intervals[i][0])
            hash_map[intervals[i][0]]=i
        start.sort()
        ans=[]
        for j in range(len(intervals)):
            s=0
            e=len(start)-1
            curr_size=len(ans)
            while s<=e:
                mid=int((s+e)/2)
                if(intervals[j][1]==start[mid]):
                    ans.append(hash_map[start[mid]])
                    break
                elif intervals[j][1]<start[mid]:
                    if start[mid-1]<intervals[j][1]:
                        ans.append(hash_map[start[mid]])
                        break
                    else:
                        e=mid-1
                else:
                    s=mid+1
            if len(ans)==curr_size:
                ans.append(-1)
        return ans
