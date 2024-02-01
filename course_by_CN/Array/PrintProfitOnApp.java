//  Day 9(1-02-2024)
//  Maximum profit on the app

import java.util.Arrays;

public class PrintProfitOnApp {
    public static int maximumProfit(int budget[]) {
        // Write your code here
        Arrays.sort(budget);
        int maxPrice = 0;
        for (int i = 0; i < budget.length; i++) {
            int price = budget[i];
            price = price * (budget.length - i);
            if (price > maxPrice)
                maxPrice = price;
        }
        return maxPrice;



    }
}
