/*Q2. Column Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.



Problem Constraints

1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format

First argument is a 2D array of integers.(2D matrix).



Output Format

Return an array containing column-wise sums of original matrix.



Example Input

Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output

Output 1:

{15,10,13,16}


Example Explanation

Explanation 1

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16 */
public class Q2_DSA_Lab_Session_on_2D_Matrices {
    public int[] solve(int[][] A) {
          int[] ans=new int[A[0].length];
        int sum=0;

        for(int i=0;i<A[0].length;i++)
        {
            sum=0;
            for(int j=0;j<A.length;j++)
            {
                sum+=A[j][i];
            }
            ans[i]=sum;
        }

        return ans;
    }
}
