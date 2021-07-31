def perm (arr,si,ei):
  if si==ei:
    print(''.join(arr))
  else:
    for i in range(si ,ei+1):
      arr[si],arr[i]=arr[i],arr[si]
      
      perm(arr,si+1,ei)
      #backtrack
      arr[si],arr[i]=arr[i],arr[si]
      
  
