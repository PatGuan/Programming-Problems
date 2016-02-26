package src.main.java;

import java.util.ArrayList;

/*
    Given a set of items, each with weight and benefit, determine the items to include in the knapsack so that the total weight is less than or
    equal to a given weight limit and the total benefit is maximized. For example, if we are given following four items with their corresponding weights
    and benefits which items should we include in the knapsack to maximize the benefit. The weight limit for this knapsack is 10?

    Sample Input:
    <"Item 1" : <"Benefit" : 3, "Weight": 2>,
    "Item 2" : <"Benefit" : 7, "Weight": 2>,
    "Item 3" : <"Benefit" : 2, "Weight": 4>,
    "Item 5" : <"Benefit" : 9, "Weight": 5>>

    Sample Output:
    ["Item 1", "Item 3", "Item 5"]

    As you can verify, the items to include in the knapsack(with the weight limit of 10) to get the maximum benefit are item #1, item #2 and item #4.
    Maximum benefit obtained in that case is 19 and the weight of the knapsack becomes 9 which is within the given weight limit.
*/

public class Knapsack {

    public static final ArrayList itemsCurrentlyChosen = new ArrayList<String>();
    public static int currentItemBenefit = 0;
    public static int currentItemWeight = 0;

//    public static ArrayList determineItemsToPack(HashMap<String, HashMap<String, Integer>> itemsToChoose, int limit) {
//
//        Set itemNames = itemsToChoose.keySet();
//        HashMap itemDescriptions = (HashMap) itemsToChoose.values();
//
//        for (String key : (HashMap) itemsToChoose.values().keySet()) {
//            //If the weight is less than the limit
//            if ((Integer) itemDescriptions.get("Weight") < limit) {
//                //No items have been chosen yet.
//                if (currentItemWeight == 0) {
//                    itemsCurrentlyChosen.push()
//                }
//            }
//
//        }
//    }
}
