#Spiral Order Matrix I
#INP=2D matrix
#op - spirl order array


def spiralOrder(self, A):

    dir=0
    x=len(A[0])
    y=len(A)
    L=T=0   #left top 
    R=x-1
    B=y-1
    res=[]
    while(T<=B && L<=R):
      #L->R
      if dir ==0 :
      for i in range(L,R+1):
        res.push(A[T][i]
      dir=1
      T+=1

      #T->B
      elif dir==1:
          for i in range(T,B+1):
              res.push(A[i][R])
          dir=2
          R-=1
      #R->L
      elif dir==2:
          for i in range(R,L-1,-1):
              res.push(A[B][i])
          dir=3
          B-=1
      elif dir==3:
          #B->T
          for i in range(B,T-1,-1):
              res.push(A[L][i])
          L+=1
          dir=0
      else:
          pass
    return res







