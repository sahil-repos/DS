def palinRec(s:str,st:int,end:int):
    '''whether a string is palindrome or not'''
    if st>=end:
        return True
    return (
        (s[st]==s[end]) and (palinRec(s,st+1,end-1))
    )
print(palinRec("1001",0,3))