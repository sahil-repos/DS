def merge2SortedList(A,B,res):
  i=j=k=0
  while i<len(A) and j<len(B):
    if A[i]<B[j]:
      res[k]=A[i]
      i+=1
      k+=1
    else:
      res[k]=B[j]
      j+=1
      k+=1
    
      
  while i<len(A):
    res[k]=A[i]
    i+=1
    k+=1
  while j<len(B):
    res[k]=B[j]
    j+=1
    k+=1
  


#MERGESORT
#O(nlogn) 
def mergeSort(C):
  if len(C)<1:
    return 
  mid=len(C)//2
  A=C[:mid]
  B=C[mid:]
  
  mergeSort(A)
  mergeSort(B)
  merge2SortedList(A,B,C)
  
  
  
  
  
  
  
  
