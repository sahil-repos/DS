# LIFO

# For push operation: 1) Create newNode 2) newNode.next = head 3) head = newNode

# For Pop Operation: 1) head = head.next

# For Size: Maintain a count variable i) Whenever you push element cnt += 1

# ii) Whenever you pop element cnt -= 1

# For Top: head.data

# For isEmpty() {Two ways}:

# i) Call size()

# ii) If cnt is = then True else False


class Node:
    def __init__(self,data):
        self.data=data
        self.next=None
    
class Stack:
    def __init__(self):
        self.__head=None
        self.__count=0
    
    def push(self,data):
        newNode=Node(data)
        newNode.next=self.__head

        self.__head=newNode
        self.__count+=1
    def pop(self):
        if self.__head is None:
            print('Empty stack.')
            return
        else:
            deletedVal=self.__head.data
            self.__head=self.__head.next
            self.__count-=1
            return deletedVal
    
    def top(self):
        if self.__head is not None:
            return self.__head.data
        return -1

    def size(self):
        return self.__count
    def isEmpty(self):
        return self.__count ==0

#inbuilt library

import queue as Q
q=Q.LifoQueue()

q.put(11)
q.put(21)
q.put(32)

#peeking top element
print(q.queue[-1])



while not q.empty():  #true is q is empty
    print(q.qsize())  #returns the  size of queue

    print(q.get()) #returns the elements and removes it from stack


nQ=Q.LifoQueue(maxsize=2)  #fixes the max size of stack insertion beyond this => error
nQ.put(11)
nQ.put(123)
nQ.put(1234)   #error
print(nQ.qsize())






