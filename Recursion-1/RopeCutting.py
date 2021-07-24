def ropeCut(n,a,b,c):
    '''given rope of lenth n, find maximum pieces cut, in such a way that lenght of  pieces comprises of  any of these lengths, a b c 
    ex: ip-> n=5, a=2, b=5, c=1 op-> 5 pieces of length 1
    ex2=>ip-> n=23 , a=12 ,b=11 ,c=9 op-> 2 peices of lenght 12 and 11
    ex3=> ip-> n=5 a=4 , b=2 , c=6   op-> -1 , no such desired length on cutting
     '''

    if n==0:
        return 0
    if n<0:
        return -1
    
    res=max(ropeCut(n-a,a,b,c),
    ropeCut(n-b,a,b,c),
    ropeCut(n-c,a,b,c))
    if res==-1:
        return -1
    return res+1

print(ropeCut(10,3,4,2))



    
    


