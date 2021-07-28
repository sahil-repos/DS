def zer(n):
  '''find count of zeroes In A Number '''
  if n<=9:
    if n==0:
      return 1
    else:
      return 0
  rem=n%10
  n=n//10
  if rem ==0:
    return 1+zer(n)
  else:
    return zer(n)
  
