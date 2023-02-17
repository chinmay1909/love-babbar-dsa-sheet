#include <iostream>
#include <string>
using namespace std;
// array method 1, TC O(n), AS O(1)
void reverseTheArray1(int arr[], int n)
{
    for(int i = 0; i < n/2; i++)
    {
        // swap the i-th element with (n-i-1)th element
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        
        // you can also swap in one line like this
        // x = x^y^(y=x);
        // arr[i] = arr[i] ^ arr[n-i-1] ^ (arr[n-i-1] = arr[i]);
    }
}
// array method 2, TC O(n), AS O(1)

void reverseTheArray2(int arr[], int n)
{
    // use low and high pointers / pointer variables
    int low = 0; int high = n-1;
    while(low < high)
    {
        arr[low] = arr[low]^arr[high]^(arr[high]=arr[low]);
        low++; high--;
    }
}
// string method 1, TC O(n), AS O(1)
string reverseTheString1(string str)
{
    int n = str.size();
    for(int i = 0; i < n/2; i++)
    {
        str[i] = str[i]^str[n-i-1]^(str[n-i-1]=str[i]);
    }
    return str;
}
// string method 2, TC O(n), AS O(1)
string reverseTheString2(string str)
{
    int n = str.size();
    int low = 0; int high = n-1;
    while(low < high)
    {
        str[low] = str[low]^str[high]^(str[high]=str[low]);
        low++; high--;
    }
    return str;
}
void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main() {
    // Driver code
    string str;
    cout << "Enter the string: "; getline(cin, str);
    int n = str.size();
    str = reverseTheString1(str);
    cout << "Reversed string: " << str;
    cout << endl; str = reverseTheString2(str);
    cout << "Original string: " << str << endl << endl;
    
    cin >> n; int arr[n];
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << "Original array: "; printArray(arr,n);
    reverseTheArray1(arr,n);
    cout << "Reversed array: "; printArray(arr,n);
    reverseTheArray2(arr,n);
    cout << "Original array: "; printArray(arr,n);
    return 0;
}

