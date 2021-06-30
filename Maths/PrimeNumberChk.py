#chk whether a number is prime of not

'''a number is prime if its not divisible by any number <=sqrt(n) '''

def prime(n):
#extra if 's for reducing iteration for multiples of 2 and 3 in loop 

    if n<2: 
        return False
    if n==2 or n==3:
        return True
    if n%2==0 or n%3==0:
        return False
    
    i=5
    while i*i <=n:
        if n%i==0 or n%(i+2)==0:
            return False
        i=i+6
    return True

print(prime(48))
    