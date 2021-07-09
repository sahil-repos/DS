# reverse a stack
import queue as Q

def revStack(st):
    lf=Q.LifoQueue()
    while(not st.empty()):
        lf.put(st.get())
    return lf

ip=Q.LifoQueue()
ip.put(1)
ip.put(2)
ip.put(3)

ans=revStack(ip)
print(ans.queue)


