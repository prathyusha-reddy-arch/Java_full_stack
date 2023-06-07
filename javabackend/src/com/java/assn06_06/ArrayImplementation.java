package com.java.assn06_06;

public class ArrayImplementation {
    int arr[]=new int[]{1,34,67,23,98,7,67,7,98,97};
    //implementing by sorting an array
    public void largeSmall(){
        System.out.println("Largest and smallest with sorting");
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("SortedArray");
        for(int k=0;k< arr.length;k++)
            System.out.print(arr[k]+" ");
        System.out.println("\n");
        System.out.println("Largest Number: "+ arr[0]);
        System.out.println("Largest Number: "+ arr[arr.length-1]);
    }
    //implementing without sorting
    public void largestSmallest() {
        System.out.println("Largest and smallest without sorting");
        int small = arr[0];
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i])
                small = arr[i];
            if (large < arr[i])
                large = arr[i];
        }
        System.out.println("Smallest Number: "+small);
        System.out.println("Largest Number: "+large);
    }

    //Reverse an array
    public void reverseArray(){
        System.out.println("Reversed Array without rotation");
        int newArr[] =new int[arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            newArr[j]=arr[i];

        }

        for(int i=0;i<newArr.length;i++)
            System.out.print(newArr[i]+" ");
        System.out.println("\n");
    }
    //implementing reverse using
    public void rotateRev(){
        System.out.println("Reversed Array with rotation");

        int rotations=arr.length;
        int i=0,temp=0;
        while(i<rotations){
            for(int j=0;j< arr.length-1;j++){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;


            }
            i++;

        }
        for(int k=0;k< arr.length;k++)
            System.out.print(arr[k]+" ");
 System.out.println("\n");
    }

    //Rotation
    public void rotateArray(int noOfRotations){
        System.out.println("Rotating 2 positions  to left : ");
        System.out.println("Before Rotation");

        int temp=0,i=0;
        int a[];
        a=new int[]{1,2,3,4,5,6,7};
        for(int k=0;k< a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println("");
        while(i<noOfRotations){
           for(int j=0;j< a.length-1;j++){
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;


           }
           i++;
        }
        System.out.println("After Rotation");
        for(int k=0;k< a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println("");
    }
    public static void main(String args[]){
        ArrayImplementation ar=new ArrayImplementation();

        ar.largestSmallest();
        ar.largeSmall();
        ar.reverseArray();
       // ar.rotateRev();
        ar.rotateArray(2);

    }

}
