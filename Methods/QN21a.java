
/*
Write the definition of different methods as utility function for array as:
a.	a method to add item into array at last
b.	a method to add item into array at position specified by user
c.	a method to remove an item from last of array
d.	a method to remove an item for the position specified by user
e.	a method to remove an item specified by user, return false if the item is not found.
f.	a method to return the size of an array.
g.	a method to display all the items in array.
h.	a method to return the item from index specified by user.
i.	a method to return the index of item specified by user, return -1 if the item is not found.
j.	a method to check if array is empty.
k.	a method to check if array is full.
l.	a method to replace occurrence of old item by new item, both specified by user.

*/
import java.util.Arrays;

public class QN21a {
    public static int[] addX(int n, int arr[], int x) {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args) {

        int n = 10;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Initial Array:\n" + Arrays.toString(arr));
        int x = 50;
        arr = addX(n, arr, x);
        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
    }

    static String addItem(String str1, int length, String[] array) {
        array[length - 1] = str1;
        return array[length - 1];
    }
}
