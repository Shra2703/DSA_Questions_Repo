// Day 5 (16-01-2024)
// triplet sum of the array(optimized version)

import java.util.Arrays;

public class TipletSum {
    public static int tripletSum(int []arr, int num){
        Arrays.sort(arr);
        int numPairs = 0;
        int tripletSum1 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = arr[i];
            numPairs = PairSum(arr, i + 1, arr.length - 1, sum);
            tripletSum1 += numPairs;
        }
        return tripletSum1;
    }

    public static int PairSum(int[] arr, int startIndex, int endIndex , int num) {

        int numPair = 0; // to calculate the total no. of pairs
        

        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] < num) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                endIndex--;
            }
            // when we found the pair
            else {
                int elementAtStart = arr[startIndex]; // storing the value at stratIndex
                int elementAtEnd = arr[endIndex]; // storing the value at endIndex

                // 1st condition
                // if the array is like [ 5 5 5 5] and num = 15 and PAIRSUM to find is 10
                // if the element between the startIndex and endIndex are equal then we will
                // just calculate the no of
                // pair they will form
                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1; // calculating the toatl no of
                                                                                  // elements
                    // present between the stratIndx and endIndex
                    // calculating total n0 of pair they will form
                    numPair += (totalElementFromStartToEnd * (totalElementFromStartToEnd - 1) / 2);
                    return numPair;
                }

                // 2nd condition
                // if the array is [-6 -5 -3 0 2 5 5 5 11 11 14] num = 10
                // suppose we have to find PAIRSUM = 16 then 5+11 = 16 but here there are three
                // 5 and two 11
                // So here also we will calculate the no of 5 and 11 present in the array and
                // then cal the total no of pair
                // they will form
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;

                // traversing and checking no of values equal to elementAtStrat that is 5
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex++;
                }
                // traversing and checking no of values equal to elementAtEnd that is 11
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }

                int totalElementsFromStrat = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndIndex);

                numPair += (totalElementsFromStrat * totalElementsFromEnd);

                startIndex = tempStartIndex;// updating stratIndex
                endIndex = tempEndIndex;// updating End INdex

            }
        }
        return numPair;
    }
}
