#TowerOFHanoi

def ToH(n,src,aux,dest):
  if n==1:
    print(src,'-->',dest)
    return
  ToH(n-1,src,dest,aux)
  print(n,"th disc from ", src,dest)
  ToH(n-1aux,src,dest)
  
   
  
