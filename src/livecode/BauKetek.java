package livecode;

import java.util.*;
public class BauKetek {

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc= new Scanner(System.in);
      //input baris dan kolom
      int row=sc.nextInt();//rows
      int column=sc.nextInt();//coulomn
      char [][] arr=new char [row][column];
      char [][] arrFix=new char [row][column];
      
      for(int i=0; i<arr.length; i++){
          String inp=sc.next();
          arr[i]=inp.toCharArray();
      }
      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[0].length; j++){
              if(arr[i][j]=='m'){
                  arrFix[i][j]='0';
              }
              if(arr[i][j]=='k'){
                  arrFix[i][j]='0';
              }
              if(arr[i][j]=='p'){
                  arrFix[i][j]='1';
                  
                  if(j-1>=0){//kiri
                      if(arr[i][j-1]=='t'){
                          arrFix[i][j-1]='1';
                      }
                  }
                  if(j+1<column){//kanan
                      if(arr[i][j+1]=='t'){
                          arrFix[i][j+1]='1';
                      }
                  }
                  if(i-1>=0){//atas
                      if(arr[i-1][j]=='t'){
                          arrFix[i-1][j]='1';
                      }
                  }
                  if(i-1>=0 && j-1>=0){//atas kiri
                      if(arr[i-1][j-1]=='t'){
                          arrFix[i-1][j-1]='1';
                      }
                  }
                  if(i-1>=0 && j+1<column){//atas kanan
                      if(arr[i-1][j+1]=='t'){
                          arrFix[i-1][j+1]='1';
                      }
                  }
                  if(i+1<row){//bawah
                      if(arr[i+1][j]=='t'){
                          arrFix[i+1][j]='1';
                      }
                  }
                  if(i+1<row && j-1>=0){//bawah kiri
                      if(arr[i+1][j-1]=='t'){
                          arrFix[i+1][j-1]='1';
                      }
                  }
                  if(i+1<row && j+1<column){//bawah kanan
                      if(arr[i+1][j+1]=='t'){
                          arrFix[i+1][j+1]='1';
                      }
                  }
              }
           }
       }
      
      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[0].length; j++){
              if(arrFix[i][j]=='1'){
                  System.out.print('1');
              }
              else{
                  System.out.print('0');
              }
          }
          System.out.println();
      }
    }
}