#1394. Find Lucky Integer in an Array
#Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

#Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.


def findLucky( arr) :
    dic={}
    maxEl=-1

    currentLucky=arr[0]

    for x in arr:
        if x in dic:
            dic[x]+=1
        else:
            dic[x]=1
    for key,value in dic.items():
        if key==value and value>maxEl:
            maxEl=value
    return maxEl
