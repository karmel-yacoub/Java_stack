import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class BasicJava{


    public void print(){
        for(int i = 1; i <=255; i++){
            System.out.println(i);
        }
    }

    public Integer odd(int x){
        return x;
    }
    public static Integer add(int y){
        return y;
    }

    public Integer Iterating(int c){
        return c;
    }

    public Integer maximum(int num){
        return num;
    }

    public  Integer Average(int z){
        return z;
    }

    public void oddarray(){
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for(int i=1;i<=255;i+=2){
        myArray.add(i);
    }
    System.out.println(myArray);
    }
    public void Greater(){
        int a=3;
        int count=0;
        int[] myArray = {1, 3, 5, 7};
        for(int i=0;i< myArray.length;i++){
            if (myArray[i] > a){
            count++;
            }
        }
    System.out.println(count);   
    }

    public void Square(){
        int[] x = {1, 5, 10, -2};
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=0;i<x.length;i++){
            int pow=x[i]*x[i];
            myArray.add(pow);
        }
        System.out.println(myArray);
    }
    public void Eliminate(){
        int[] x={1, 5, 10, -2};
        ArrayList<Integer> Array = new ArrayList<Integer>();
        for(int i=0;i<x.length;i++){
            if (x[i]< 0) {
                x[i]=0;
            }
            Array.add(x[i]);
        }
        System.out.println(Array);
    }


    public void MaxMinAvg(){
        int[] z={1, 5, 10, -2};
        int max =z[0];
        int min=0;
        int sum=0; 
        ArrayList<Integer> x=new ArrayList<Integer>();
        for(int i=0;i<z.length;i++){
            sum+=z[i];
           if(z[i]>max){
               max=z[i];
           }
           if(z[i]<min){
               z[i]=min;
           }
        }
        x.add(min);
        x.add(max);
        int avg=sum/z.length;
        x.add(avg);
        System.out.println(x);
    }
    public void Shifting(){
        int[]x={1, 5, 10, 7, -2};
        // ArrayList<Integer> k=new ArrayList<Integer>();
        for (int i=1;i<x.length;i++){
            x[i-1]=x[i];
            if(i==x.length-1){
                x[i]=0;
            }
        }
        System.out.println(Arrays.toString (x));
    }
}