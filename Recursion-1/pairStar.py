def pairStar(S):
  '''Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

aaaba=>a a aba'''
  if len(S)==0 or len(S)>1:
    return S
  if S[i]==S[i+1]:
    return S[i]+"*"+pairStar(S[1:])
   else:
    smallOP=S[i]+pairStar(S[1:])

  
  
  
