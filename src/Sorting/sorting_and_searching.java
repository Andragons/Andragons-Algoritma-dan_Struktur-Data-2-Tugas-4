/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class sorting_and_searching {
    

    public static void insertionSort(int[] A){
       for (int i = 0; i < A.length; i++) {
           int key = A[i];
           int j = i - 1;
           while ((j >= 0) && (A[j] > key)){
               
               A[j + 1] = A[j];
               j--;
           }
           A[j + 1] = key;
       }
   }
   
   public static void tampil(int data[]){
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println();
}
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = {25, 7, 9, 13, 3};
        int cari = 13;
        int LastIndex = A.length - 1;
        int FirstIndex = 0;
        int flag = 0;
        int point = 0;
        
        System.out.println("Isi data adalah : ");
        sorting_and_searching.tampil(A);
        
        System.out.println("Data setelah di sorting :");
        sorting_and_searching.insertionSort(A);
        sorting_and_searching.tampil(A);
        
        System.out.println("");
        
        System.out.print("Data yang dicari : ");
        System.out.println(cari);
                
        while((FirstIndex <= LastIndex) && (flag == 0)){
            point = (LastIndex + FirstIndex) / 2;
            System.out.println("Index point : "+ point);
            
            if(A[point] == cari){
                flag += 1;
                System.out.println("Data "+cari+" telah ditemukan pada index ke - "+ point);
            }
            
            else if(cari < A[point]){
                    System.out.println("Cari di Kiri");
                    LastIndex = point - 1;
         
            }
            else {
                    System.out.println("Cari di kanan");
                    FirstIndex = point + 1;
   
                }
               
            }
        
         if(flag == 1){
            System.out.println("Data "+cari+" telah ditemukan pada index ke "+ point + " baris ke "+ (point + 1));
             System.out.println("Kesimpulan : data ditemukan");
        } else {
            System.out.println("Kesimpulan : data tidak ditemukan");
     
        }
         System.out.println("");
        System.out.println("Ramanda Kholisandra");
        
        }
    }       

