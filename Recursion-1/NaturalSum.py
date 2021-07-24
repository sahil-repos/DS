def naturalSum(N):
    '''print sum o f all natural numebrs upto m'''
    if N==0:
        return 0
    return N+naturalSum(N-1)
print(naturalSum(10))