def fib(n):
    '''fn to print fibonacci series upto nth term'''

    if n==1:
        return 0

    if n==2:
        return 1
    return fib(n-1) + fib(n-2)

print(fib(6))