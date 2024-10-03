package Recursion_On_Arrays;
import java.util.ArrayList;
public class multi_IndexList2 {
        static ArrayList<Integer> index(int[] arr, int target, int index) {
            ArrayList<Integer> list = new ArrayList<>();
            if (index == arr.length) {
                return list;
            }
            if (arr[index] == target) {
                list.add(index);
            }
            ArrayList<Integer> totalans = index(arr, target, index + 1);
            list.addAll(totalans);
            return list;
        }
        public static void main(String[] args) {
            int[] arr = {1, 4, 5, 3, 5, 4, 2, 5};
            System.out.println(index(arr, 4, 0));
        }
    }
