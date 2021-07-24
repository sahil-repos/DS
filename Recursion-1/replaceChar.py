def replaceChar(st,oldC,newC):

    '''    Replace a charachter with another char Ranger ---->Banger
    '''
    if len(st)==0:
        return st
    smallOP=replaceChar(st[1:],oldC,newC)
    if st[0]==oldC:
        return newC+smallOP
    else:
        return st[0]+smallOP

print(replaceChar("RANGER",'E','Y'))
