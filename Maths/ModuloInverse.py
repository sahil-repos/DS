#addition under modulo

def sumMod(a,b):
    return (a+b)%(10**9 +7)

#modular multiplicative inverse
#Given two integers ‘a’ and ‘m’. The task is to find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’.
#(a * B) % m =1

def mulMod(a,m):
    for i in range(m):
        if (a*i)%m==1:
            return i
        return -1
