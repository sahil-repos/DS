def stairCase(N):
  '''A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
  Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.'''
  
  if N<=1:
    return N
  elif N==2:
    return 2    #two ways only-> stairCase(N-1)   , stairCase(N-2) 
  elif N==3:
    return 1 +stairCase(N-1)+stairCase(N-2)  #1+1 for stairCase(N-3)
  else:
    return stairCase(N-1) +stairCase(N-2) + staircase(N-3)
