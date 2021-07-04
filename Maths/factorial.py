#factorial of number
def fact(A):
  if A==1 or A==0:
      return 1
  return A* fact(A-1) 
