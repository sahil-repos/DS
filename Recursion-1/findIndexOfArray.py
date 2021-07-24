def findIndex(arr,num,index=0):
    if len(arr)>index:
        if arr[index]==num:
            return index
        else:
            return findIndex(arr,num,index+1)
    elif len(arr)==index:
        pass
    else:
        print(-1)

print(findIndex([1,2,3,4,5,6,7,8],4))