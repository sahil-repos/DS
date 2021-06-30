#prime factors of a number

def primef(n):
    arr=[]
    #for even prime numbers
    while n%2==0:
        arr.append(2)
        n=n//2
    
    #for odd prime numbers
    oprime=3
    #
    while oprime*oprime <=n:
        while n%oprime==0:
            arr.append(oprime)
            n=n//oprime
        oprime+=2   #next odd number

    if n>2:
        arr.append(n)
    return arr

print(primef(225))


