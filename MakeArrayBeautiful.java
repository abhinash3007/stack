package STACK;

import java.util.Stack;

public class MakeArrayBeautiful {
    public static void beautiful(int[]arr){
        Stack<Integer>s =new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(s.isEmpty()){
                s.push(arr[i]);
            }else if(arr[i]>=0){
                if (s.peek()>=0) {
                    s.push(arr[i]);
                }else{
                    s.pop();
                }
            }else if(arr[i]<0){
                if (s.peek()<0) {
                    s.push(arr[i]);
                }else{
                    s.pop();
                }
            }
        }int index = 0;
        int num[]=new int[s.size()];
        while (!s.isEmpty()) {
            num[index++] = s.peek();
            s.pop();
        }
        System.out.println(num.length);
    }public static void main(String[] args) {
        int[]arr={2,3,5,-4,6,-2,-8,9};
        beautiful(arr);
    }
}
