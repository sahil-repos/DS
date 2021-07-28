def palinRec(s:str,st:int,end:int):
    '''whether a string is palindrome or not'''
    if st>=end:
        return True
    return (s[st]==s[end]) and (palinRec(s,st+1,end-1))
    
print(palinRec("1001",0,3))



def PalinRec2(s:str):
    if len(s)<=1 :
        return True
    else:
        if(s[0]==s[-1]):
            return PalinRec2(s[1:-1])
        else:
            return False
print(PalinRec2("RCO-0OCR"))
    