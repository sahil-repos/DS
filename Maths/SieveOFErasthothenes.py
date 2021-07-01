#print all prime numbers upto n 
def soe(n):
    if n<1:
        return 
    isPrime=[1 for x in range(n+1)]
    isPrime[1]=isPrime[0]=0
    sqrtn=int(n**0.5)
    i=1
    for i in range(2,sqrtn+1):
        if isPrime[i]:
            #mark all its multiple as 0
            for j in range(i*2,n+1,i):
                isPrime[j]=0
    
    for k in range(n+1):
        if isPrime[k]:
            print(k)
soe(43)
 