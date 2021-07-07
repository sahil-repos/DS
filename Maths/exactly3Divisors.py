#print all numberss till x that have xactly 3 divisors
# essentially -> a prime number's square has 3 divisors 1, root, the number itself
# 
def exac3(n):
    isPrime=[1 for x in range(n+1)]
    isPrime[0]=isPrime[1]=0
    ans=[]

    sqrtn=n**0.5
    i=2
    while i<= sqrtn:
        if isPrime[i]:
            #mark all multiples of i  0
            
            for k in range(2*i,n+1,i):
                if k*k>50: #optimization
                    break
                isPrime[k]=0
        i+=1
    
    for x in range(n+1):
        if isPrime[x]==1 and x**2<=50:
            ans.append(x*x)
    return ans

print(exac3(50))

