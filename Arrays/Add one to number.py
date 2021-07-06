class C:
    # @param A : list of integers
    # @return a list of integers
    def plusOne(self, A):
      '''
Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.'''
        carry=1
        l=len(A)-1
        while l>=0 and carry==1:
            
            ele=A[l]+carry
            if ele>9:
                A[l]=ele%10
                carry=1
            else:
                A[l]=ele
                carry=0
            l-=1
        if carry:
            A.insert(0,1)
        pos=0
        for x in range(len(A)):
            if A[x]!=0:
                pos=x
                break
        return A[pos:]
