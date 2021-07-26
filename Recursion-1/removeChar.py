def removeChar(st,ch):
    if len(st)==0:
        return st
    smallOP=removeChar(st[1:],ch)

    if st[0]==ch:
        return smallOP
    else:
        return st[0]+smallOP

print(removeChar("WE ARE THE CHAMPIONSS",'E'))
