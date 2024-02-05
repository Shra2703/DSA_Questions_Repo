//  Day 1(05-02-2024)
//  Basics of ArrayList

import java.util.*;

public class Arraylist {

     public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // adding elements in the arraylist
        arr.add(1);
        arr.add(10);
        arr.add(89);
        arr.add(78);
        arr.add(34);
        arr.add(0, 45);
        // getting size of arraylist
        System.out.println(arr.size());
        // fetching element in the array list
        System.out.println(arr.get(0));
        // replacing the index 1 with 23
        arr.set(1,23);
        // removing the element #1
        arr.remove(2);
        // #2
        Integer i1 = 889;
        System.out.println(arr.remove(i1));

        // printing all the element of arraylist
        for(int i = 0 ; i < arr.size() ; i++){
            System.out.print(arr.get(i) + " ");
        }

        // enhanced for loop
        for(int i : arr) System.out.print(i + " ");
     }
}