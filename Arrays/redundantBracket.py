#if there is any useful info between a pair of brackets then it is not redundant else it is redundant
def redund(s):
    doubleOpen=0
    for i in range(len(s)-1):
        if s[i]=='(':
            if s[i+1]==')':
                return True
            elif s[i+1]=='(':
                doubleOpen=1
        elif s[i]==')':
            if s[i+1]==')' and doubleOpen:
                return True
    return False

print(redund('(SAS)(ASD-)'))



