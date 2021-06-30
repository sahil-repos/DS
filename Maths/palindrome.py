import math
def palin(n):
    '''return True if  a number is palindrome '''
    
    
    return n == int(str(n)[::-1])

def palinNum(n):
    orig=n
    newNum=0
    while n>0:
        rem=n%10
        n=n//10
        newNum=newNum*10+rem
    if newNum==orig:
        print('Palindrome')
    else:
        print('Not palindrome')

print(palin(110))
