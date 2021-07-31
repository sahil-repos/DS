# n persons sitting in cirle , every kth person has to go . find the index /pos of last perso n standing  | counting is inclusive of starting prson

def JP(arr,start=0,k):
  if len(arr)=1:
    return arr[0]
  start=(start+k-1)%len(arr)
  print(arr[start])
  arr.pop(start)
  return JP(arr,start,k)
