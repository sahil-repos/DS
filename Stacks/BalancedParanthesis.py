#check for balanced  paranthesis in a string

def chkParanthesis(inp):
    import queue as Q
    st=Q.LifoQueue()

    for x in inp:
        if x=='(' or x=='[' or x=='{':
            st.put(x)
        elif x==')':
            if st.queue[-1]!='(':
                return False
            st.get()
        elif x==']':
            if st.queue[-1]!='[':
                return False
            st.get()

        elif x=='}':
            if st.queue[-1]!='{':
                return False
            st.get()
    return st.empty()

print(chkParanthesis('{{[[(())]]}}'))

        