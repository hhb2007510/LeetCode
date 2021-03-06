/**
 * 2014-4-11
 * @author Alvin
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

public class Remove_Element {
    public int removeElement(int[] A, int elem) {
        int count =0;
        for(int i=0 ;i<A.length-count;i++){
            if(A[i] == elem){
                count++;
                exchange(A,i,A.length -count);
                i--;
            }

        }

        return  A.length - count;
    }

    public void exchange(int[] A,int i,int j){
        if(i != j){
            int var = A[i];
            A[i] = A[j];
            A[j] = var;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] A ={3,3};
        System.out.println(new Remove_Element().removeElement(A, 3));
    }

}
