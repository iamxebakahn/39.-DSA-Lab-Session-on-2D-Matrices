/*Q4. Row to Column Zero
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints

1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format

First argument is a 2D integer matrix A.



Output Format

Return a 2D matrix after doing required operations.



Example Input

Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output

Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation

Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */
public class Q4_DSA_Lab_Session_on_2D_Matrices {
    public int[][] solve(int[][] A) {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                if(A[i][j]==0)
                {
                    int k=0;
                    while(k<A[i].length)
                    {
                        if (A[i][k] != 0)
                            A[i][k]=-1;

                        k++;
                    }

    
                }
                
            }
        }


        for(int j=0;j<A[0].length;j++)
        {
            for(int i=0;i<A.length;i++)
            {
                if(A[i][j]==0)
                {
                    int k=0;
                    while(k<A.length)
                    {
                        if (A[k][j] != 0)
                            A[k][j]=-1;

                        k++;
                    }

        

                }
            }
        }

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                if(A[i][j]==-1)
                {
                    A[i][j]=0;
                }
            }
        }

        return A;

    }
}
