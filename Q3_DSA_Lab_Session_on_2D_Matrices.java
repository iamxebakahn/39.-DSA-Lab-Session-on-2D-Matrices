/*Q3. Row Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a 2D matrix A of integers.

Your task is to compute the sum of elements in each row and return a 1D array where each element represents the sum of a corresponding row in the matrix.


Problem Constraints

1 <= A.size() <= 103


1 <= A[i].size() <= 103

1 <= A[i][j] <= 103






Input Format

First argument A is a 2D array of integers.(2D matrix).



Output Format

Return an array containing row-wise sums of original matrix.



Example Input

Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output

Output 1:

[10,26,18] */
public class Q3_DSA_Lab_Session_on_2D_Matrices {
    public int[] solve(int[][] A) {
        int[] row_sum=new int[A.length];
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=0;
            for(int j=0;j<A[i].length;j++)
            {
                sum+=A[i][j];
            }

            row_sum[i]=sum;
        }

        return row_sum;
    }
}
