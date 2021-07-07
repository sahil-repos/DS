#Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
# Input: n = 3
# Output: [[1,2,3],[8,9,4],[7,6,5]]

def generateMatrix( n: int):
    
    mat=[[0 for x in range(n)] for i in range(n)]
    
    ct=1
    T=0
    L=0
    R=n-1
    B=n-1
    dir=0
    
    while T<=B and L<=R:
        
        #dir:0 L->R
        if dir==0:
            for i in range(L,R+1,1):
                mat[T][i]=ct
                ct+=1
            dir=1
            T+=1
        #dir 1: T->B
        if dir==1:
            for i in range(T,B+1,1):
                mat[i][R]=ct
                ct+=1
            dir=2
            R-=1
        #dir 2: R->L
        if dir==2:
            for i in range(R,L-1,-1):
                mat[B][i]=ct
                ct+=1
            dir=3
            B-=1
        #dir 3: B->T
        
        if dir==3:
            for i in range(B,T-1,-1):
                mat[i][L]=ct
                ct+=1
            dir=0
            L+=1
    return mat


print(generateMatrix(3))
            
        