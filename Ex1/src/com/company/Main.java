package com.company;

public class Main {

    public static void main(String[] args) {

        int Arr[] = {1, 53, 4, 3, 41, 56, 45, 68, 15, 46, 64, 5, 6, 8, 51, 33, 54};
        int tmp;

        for (int i=0; i < Arr.length/2; i++){

            for (int j=0; j < Arr.length-1; j++){

                if (Arr[j] > Arr[j+1]){
                    tmp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = tmp;
                }
            }
        }

        for (int i=0; i<Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
    }
}
