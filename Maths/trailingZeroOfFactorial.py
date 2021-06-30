#count trailing zeroes in factorial of a number
'''count the number of (2,5) into prime facrorial seq as 2*5=10
  similarly 25 ,125 
  since 2 will always be more in count as every 2nd number is even
  just count the fivers
 '''
def trail0(n):
    zeroCount=0
    i=5
    while True:
        if i>n:
            break
        zeroCount=zeroCount + n//i
        i=i*5
    return zeroCount
print(trail0(10))