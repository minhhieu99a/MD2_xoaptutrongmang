package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a={1,5,6,7,1,2,5};
        a=deleteElement(a,3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static int [] deleteElement(int[]arr,int index){
        int newArr[]=new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[i];
        }
        for (int i = index; i < arr.length-1; i++) {
            newArr[i]=arr[i+1];
        }return newArr;
    }
}
