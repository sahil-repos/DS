# # stock span
# The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days. 
# The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day. 

# For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6} 

def stockSpan(stock):
    n=len(stock)
    ss=[0 for i in range(n)]
    #stock span for first item is always 1
    ss[0]=1

    for i in range(1,n):
        counter=1
        while ((i-counter>=0) and stock[i]>=stock[i-counter] ):
            counter+=ss[i-counter]
        
        ss[i]=counter
    
    print(ss)
stockSpan([100, 80, 60, 70, 60, 75, 85])
