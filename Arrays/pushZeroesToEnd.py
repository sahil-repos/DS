#given an array place all zeroes in  it to right side

def moveZeroes(arr):
  l=len(arr)
  zeroCount=0
  i=0
  while i<l:
    if arr[i]==0:
      
      arr.pop(i)
      zeroCount+=1
      l-=1
    
    i+=1
  if zeroCount:
    for x in range(zeroCount):
      arr.append(0)
      
ar=[1,0,9,0,2,4,0,4,3]
moveZeroes(ar)
print(ar)
