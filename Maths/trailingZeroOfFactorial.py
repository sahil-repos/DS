#count trailing zeroes in factorial of a number
def trail0(n):
    zeroCount=0
    i=5
    while True:
        if i>n:
            break
        zeroCount=zeroCount + n//i
        i=i*5
    return zeroCount
print(trail0(10))