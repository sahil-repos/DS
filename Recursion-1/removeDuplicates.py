def removeDuplicates(s):
    '''

Remove duplicates recursilvely qwertyyyyyytypooetee=>qwertytypoete
'''
    if len(s)<2:
        return s
    if s[0]==s[1]:
        return removeDuplicates(s[1:])
         
    else:
        return s[0]+removeDuplicates(s[1:])


print(removeDuplicates("qqqwwweeerrtyyy"))

