def Rec1N(N):
    '''PRint all numbers N to 1 using recursin'''

    if N==1:
        print(N)
        
        return
    else:
        Rec1N(N-1)
    print(N)

Rec1N(5)

