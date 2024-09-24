package STACK;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpam(int[]arr){
        Stack<Integer>s=new Stack<>();
        int[]stock=new int[arr.length];
         Arrays.fill(stock, 1);
        int count=0;
        for (int i = 0; i < stock.length; i++) {
            while (!s.isEmpty() && arr[s.peek()]<arr[i]) {
                s.pop();
                count++;
                stock[i]=count+1;
            }if (s.isEmpty()) {
                stock[i]=1;
            }
            s.push(i);
        }for (int element : stock) {
            System.out.print(element + " ");
        }
    }public static void main(String[] args) {
        int[]arr={100,80,55,70,60,75,85};
        stockSpam(arr);
    }
}
