package Recursion_On_Arrays;

public class Find_A_Nummber {
    static int findIndex(int[]arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
           return findIndex(arr, target, index + 1);
        }
    }
    public static void main(String[] args) {
        int[]arr={1,3,4,2,6,8};
        System.out.println(findIndex(arr,6,0));
    }
}
