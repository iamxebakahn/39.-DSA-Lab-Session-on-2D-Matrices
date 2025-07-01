/*Q3. Count Increasing Triplets
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]


Problem Constraints

1 <= N <= 103
1 <= A[i] <= 109


Input Format

First argument A is an array of integers.


Output Format

Return an integer.


Example Input

Input 1:
A = [1, 2, 4, 3]
Input 2:
A = [2, 1, 2, 3]


Example Output

Output 1:
2
Output 2:
1
 */
public class Q3AP_DSA_Lab_Session_on_2D_Matrices {
    public int solve(int[] A) {

        int count = 0;

        for (int j = 0; j < A.length; j++) {
            int leftCount = 0;
            int rightCount = 0;

            // Count elements to the left of j smaller than A[j]
            for (int i = 0; i < j; i++) {
                if (A[i] < A[j]) {
                    leftCount++;
                }
            }

            // Count elements to the right of j greater than A[j]
            for (int k = j + 1; k < A.length; k++) {
                if (A[k] > A[j]) {
                    rightCount++;
                }
            }

            count += leftCount * rightCount;
        }

        return count;
    }
}
