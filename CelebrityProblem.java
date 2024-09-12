package STACK;

import java.util.Stack;

public class CelebrityProblem {
    public static void celebrity(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean celebrity = true;
            for (int j = 0; j < arr[0].length; j++) {
                if (i != j && (arr[i][j] == '1' || arr[j][i] == '0')) {
                    // If the current person knows someone or is not known by someone else,
                    // they cannot be a celebrity
                    celebrity = false;
                    break;
                }
            }
            if (celebrity) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("not found");
    }

    public static void optimal(char[][] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            s.push(i);
        }
        while (s.size() > 1) {
            int first = s.pop();
            int second = s.pop();
            if (arr[first][second] == '1') {
                s.push(second);
            } else {
                s.push(first);
            }
        }
        int potential = s.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != potential && (arr[potential][i] == '1' || arr[i][potential] == '0')) {
                System.out.println("no");
                return;
            }
        }
        System.out.println(potential);
    }

    // Function to find if there is a celebrity in the party or not.
    public static int celebrity2(int mat[][]) {
        // code here
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i != j && mat[i][j] == 0 && mat[j][i] == 1) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        char[][] arr = {
                { '0', '1', '0', '1', '1' },
                { '0', '0', '0', '1', '1' },
                { '0', '1', '0', '1', '0' },
                { '0', '0', '0', '0', '0' },
                { '1', '0', '1', '1', '0' }
        };
        //celebrity(arr);
        //optimal(arr);
        int[][] mat = {
            {0, 1, 1, 1},
            {0, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0}
        };      
        System.out.println(celebrity2(mat));
    }
}
