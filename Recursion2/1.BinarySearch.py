def bs_rec(arr,high,low,key):
    ''' Binary search , arr must be sorted
    O(logn) TC recursively min time O(1) max => O(logn) (ht of tree) iterative mthod'''
    if (low==high):
        if arr[low]==key:
            return low
        else:
            return -1
    else:
        mid=(low+high)//2

        if (key==arr[mid]):
            return mid
        if key>arr[mid]:
            return bs_rec(arr,high,mid+1,key)
        if key<arr[mid]:
            return bs_rec(arr,mid-1,low,key)
    return -1

print(bs_rec([1,2,3,4,5,6,7,8,9,10],9,0,84))



#iterative BS

def iter_bs(arr,high,low,key):
    high=len(arr)-1
    low=0
    while (low<=high):
        mid=(low+high)//2

        if arr[mid]==key:
            return mid
        
        if arr[mid]<key:
            low=mid+1
        if arr[mid]>key:
            high=mid-1
    return -1

print(iter_bs([1,2,3,4,5,6,7,8,9,10],9,0,7))





    