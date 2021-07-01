#find number of digits in factorial of N¶
#log(N!)= log(1*2*3....N) =log(1)+log(2)+.....log(N)
import math
def digitFac(n):
    if n<=3:
        return 1
    digits=0
    for x in range(1,n+1):
        digits=digits+ math.log10(x)
        
    return math.floor(digits) + 1
print(digitFac(5))

