#x ^y 

def pow(x,y):
  if y==0:
    return 1
  return (x * pow(x,y-1)) % ((10**9)+7)



#for handling -ve powers
def pow2(x,y):
  originaly=y
  ans=1
  if y<0:
    y=-1 *y
  while(y):
    if y%2==0:
      x=x*x
      y=y/2
    else:
      #oddpower
      ans=ans*x
      y=y-1
   if originaly<0:
    ans=1/ans
   return ans
      
      
