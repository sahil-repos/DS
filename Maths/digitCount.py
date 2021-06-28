# program to count number of digits in a number

def numOfD(n):
    
    count=0
    while n>0:
        rem=n%10
        n=n//10
        count+=1
    return count
print(numOfD(102))


#another way

import math

math.log10(130)//1 +1

