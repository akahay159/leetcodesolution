'''
Given an array that contains at least three integers, 
I am asked to write a function that is going to find the three largest numbers in the input array 
without sorting and return them in an array sorted in ascending order.
'''

# Time -> O(N), Space is O(1)
def threeLargest(array):
    threearray = [None, None, None]
    for num in array:
        updateArray(num, threearray)
    return threearray
    
def updateArray(number, helperarray):
    if helperarray[2] is None or number > helperarray[2]:
        shiftAndUpdate(helperarray, number, 2) 
    elif helperarray[1] is None or number > helperarray[1]:
        shiftAndUpdate(helperarray, number, 1)
    elif helperarray[0] is None or number > helperarray[0]:
        shiftAndUpdate(helperarray, number, 0)
    
def shiftAndUpdate(helperarray, num, idx):
    for i in range(idx + 1):
        if i == idx:
            helperarray[i] = num
        else:
            helperarray[i] = helperarray[i + 1]
    
    