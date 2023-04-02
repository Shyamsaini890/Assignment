

// Write a function that takes a positive integer n and returns the sum of all integers from 1 to n.

public class day5 {
    public static void main(String[] args){

        int sum=0;

        for(int i=1; i<=10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}