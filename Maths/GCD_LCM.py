#program to find GCD of two numbers

'''Euclead's GCD algo  Gcd(a,b)=GCD(a-b,a)
provided a>b   
using modulo reduces subtraction step
automatically sorted| a%b=a if a<b
and if a>b  a%b= a-b'''

def GCD(a,b):
    if b==0:
        return a
    else:
        return GCD(b,a%b)

print(GCD(21,35))


def LCM(a,b):
    return (a*b)//GCD(a,b)
    
