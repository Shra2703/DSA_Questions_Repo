//  Day 1(05-02-2024)
//  remove consecutives element in th array

import java.util.ArrayList;

public class RemoveConsecutives {

    public static ArrayList<Integer> removeconsecutives(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0;
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(ans.get(k) != arr[i]){
                ans.add(arr[i]);
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 20, 20, 30, 40};
        ArrayList<Integer> arr1 = removeconsecutives(arr);

        for(int i = 0 ; i < arr1.size() ; i++){
            System.out.print(arr1.get(i) + " ");
        }
        

    }
}
