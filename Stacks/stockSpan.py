# # stock span
# The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days. 
# The span Si of the stock’s price on a given day i is defined as 
# the maximum number of consecutive days just before the given day, 
# for which the price of the stock on the current day is less than or equal to its price on the given day. 

# For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85},
#  then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6} 

def stockSpan(stockprice):
    
    # Create a stack and push index of fist element to it
    st=[0]
    span=[0]*len(stockprice)
     #span of first elem is always 1
    span[0]=1
    for i in range(1,len(stockprice)):

        while(len(st)>0 and stockprice[i]>=stockprice[st[-1]]):
            st.pop()
        if len(st)==0:
            span[i]=i+1
        else:
            span[i]=i- st[-1]
        st.append(i)

    return span

print(stockSpan([100, 80, 60, 70, 60, 75, 85]))


