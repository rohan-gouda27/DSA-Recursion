package Recursion_On_Arrays;

import java.util.ArrayList;

public class Find_Multi_Index {
    static ArrayList<Integer> list=new ArrayList<>();
    static void findIndex(int[]arr,int target,int index){

        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findIndex(arr,target,index+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,4,5,3,6,4};
        findIndex(arr,4,0);
        System.out.println(list);

    }
}
