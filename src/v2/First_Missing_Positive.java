/*  First Missing Positive
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space
*/

public class First_Missing_Positive{
    public int firstMissingPositive(int[] A) {
        for (int i=0;i < A.length ;i++ ) {
            int index = A[i];
            if(index >0 && index <= A.length && i != index-1 && A[index-1] != index){
                int val = A[index-1];
                A[index-1] = A[i];
                A[i] = val;
                i--;
            }
        }
        for (int i=0;i < A.length ;i++ ) {
            if(A[i]-1 != i)
                return i+1;
        }
        return A.length+1;
    }
    public static void main(String[] args) {
        int[] A ={2,2};
        System.out.println(new First_Missing_Positive().firstMissingPositive(A));
    }
}