// Day 1 (12-01-2023)
// Find a leader in a array (brute force)
// TC: O(n2) 
// SC: O(n)

public class FindLeaderInArray1 {
    public static void leaders(int[] input) {
         if(input.length == 0) { System.out.println(input); return; }
         if(input.length == 1) {System.out.println(input[0]);return; }
         int count = 0;
         int temp[] = new int[input.length];

         for(int i = 0 ; i < input.length ;i++){
            int leader = input[i];
            int flag = 0;
            for(int j = i + 1; j < input.length; j++){
                if(leader < input[j]){
                       flag = 1;
                        break;
                } 
            } 
            if(flag == 0) {
                temp[count] = input[i];
                count++;
            }
        }   
        for(int i =count-1 ;i >= 0 ;i--){
            System.out.print(temp[i] + " ");
        }	
		
	}
}
