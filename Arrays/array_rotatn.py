#array1
#Rotate an array to left by D places

def gcd(a,b):
    if b==0:
        return a
    else:
        return gcd(b,a%b)
#sol1
def arrayRotation(arr,d):
    n=len(arr)
    
    gcdCount=gcd(d,n)

    for i in range(gcdCount):
        j=i
        temp=arr[j]
        while True:
            #calculate the next element's pos to replace current element
            shift=(j+d)%n

            if shift==i:
                #this means cycle is complete thus break the loop and replace the last elem of cycle with first elem of cycle
                break
            
            #update current pos with next rotation elem
            arr[j]=arr[shift]

            #update current pos
            j=shift

        arr[j]=temp

A=[0,1,2,3,4,5,6,7]
arrayRotation(A,3)
print(A)
#sol2
def rotateArr(A,b):
    res=[]
    n=len(A)
    for x in range(n):
        res.push(A[(i+(b%n))%n])
    return res
    

