
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QN21b {

    private static void addElement(Integer[] arr, int element, int position) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(position - 1, element);
        arr = list.toArray(arr);
        System.out.println("Initial Array:\n" + Arrays.toString(arr));
        System.out.println(
                "\nArray with " + element + " inserted at position " + position + ":\n" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int element = 50;
        int position = 9;
        addElement(arr, element, position);
    }
}
