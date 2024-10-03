package Recursion_On_Arrays;

import java.util.ArrayList;

public class multi_IndexInList {
    static ArrayList index(int[]arr,int target,int index,ArrayList<Integer>list){
       if(index==arr.length){
           return list;
       }
       if(arr[index]==target){
           list.add(index);
       }
       index(arr,target,index+1,list);
        return list;
    }
    public static void main(String[] args) {
        int[]arr={1,4,5,3,2,5};
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(index(arr,5,0,list));
    }
}
