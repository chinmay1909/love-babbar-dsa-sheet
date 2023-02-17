import java.util.*;
class Q1 {
    private static Scanner scan = new Scanner(System.in);
    // array method 1, TC O(n), AS O(1)
    public static void reverseTheArray1(int[] arr, int n)
    {
        for(int i = 0; i < n/2; i++)
        {
            // swap the i-th element with (n-i-1)th element
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            // you can also swap in one line like this
            // x = x ^ y ^ (y=x);
            // here x = arr[i] and y = arr[n-i-1]
        }
    }
    // array method 2, TC O(n), AS O(1)
    public static void reverseTheArray2(int[] arr, int n)
    {
        int low = 0, high = n-1;
        while(low < high)
        {
            arr[low] = arr[low] ^ arr[high] ^ (arr[high]=arr[low]);
            low++; high--;
        }
    }
    // string method 1 - use StringBuilder, TC O(n), AS O(n)
    // Strings are immutable in Java
    public static String reverseTheString1(String str)
    {
        int n = str.length();
        StringBuilder input = new StringBuilder();
        input.append(str);
        input.reverse(); // inbuilt function
        str = input.toString();
        return str;
    }
    // string method 2 - use char array, TC O(n), AS O(n)
    public static String reverseTheString2(String str)
    {
        int n = str.length();
        char[] ch = str.toCharArray();
        int low = 0, high = n-1;
        while(low < high)
        {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++; high--;
        }
        str = new String(ch);
        return str;
    }
    public static void main(String[] args) {
        // Driver code
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("Original string: "+str);
        str = reverseTheString1(str);
        System.out.println("\nReversed string: "+str);
        str = reverseTheString2(str);
        System.out.println("Original string: "+str);
        System.out.println();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        arr[i] = scan.nextInt();
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        reverseTheArray1(arr,n);
        System.out.println("\nReversed Array: " + Arrays.toString(arr));
        reverseTheArray2(arr,n);
        System.out.println("Original Array: " + Arrays.toString(arr));
    }
}
