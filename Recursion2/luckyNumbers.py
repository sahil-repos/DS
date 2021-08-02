
counter=2
def lucky(n):
    global counter
    
    if counter>n:
        return True
    if n%counter==0:
        return False
    
    n=n- n//counter
    
    counter+=1
    return lucky(n)

lucky(5)
    
