def nextGreaterElement(nums1,nums2):
    d={}
    for x in range(len(nums1)):
        d[nums1[x]]=x
    nextGr=[nums2[-1]]
    n2=len(nums2)
    n1=len(nums1)
    ans=[0]*n1
    S=[0]*len(nums2)
    S[-1]=-1
    for i in range(n2-1,-1,-1):
        
        while ((len(nextGr)>0) and (nextGr[-1]<=nums2[i])):
            nextGr.pop()
        if len(nextGr)==0:
            S[i]=-1
        else:
            S[i]=nextGr[-1]
        if nums2[i] in d:
            ans[d[nums2[i]]]=S[i]
            
        
        nextGr.append(nums2[i])
    return ans            
