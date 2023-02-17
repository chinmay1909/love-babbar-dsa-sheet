# array method 1, TC O(n), AS O(1)
def reverseTheArray1(arr, n):
    for i in range(0, int(n/2)):
        # swap the i-th element with (n-i-1)th element
        temp = arr[i]
        arr[i] = arr[n-i-1]
        arr[n-i-1] = temp
# array method 2, TC O(n), AS O(1)
def reverseTheArray2(arr, n):
    low = 0
    high = n-1
    while(low < high):
        temp = arr[low]
        arr[low] = arr[high]
        arr[high] = temp
        low+=1
        high-=1
# array method 3, TC O(n), AS O(1)
# just use listName.reverse()

# for a string, just use the slice option
def reverseTheString(str):
    return str[::-1]
    
x = input("Enter the string: \n")
print("Original string:", x)
x = reverseTheString(x)
print("Reversed string:", x)
print()
n = int(input("Enter size of array: "))
arr = []
for i in range(0,n):
    arr.append(int(input()))
print("Original array: ", arr)
reverseTheArray1(arr,n) # method 1
print("Reversed array: ", arr)
reverseTheArray2(arr,n) # method 2
print("Original array: ", arr)
arr.reverse() # method 3
print("Reversed array: ", arr)
