package com.company;
import java.util.Scanner ;
//import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String[] arr2 = {"+","-","/","*"};

        str = str.replaceAll(" ", "");

        int n = 0, n2 = 0, k = 0 ;

        try{  while (!str.contains(arr2[k])){
            k++; }

            if(k==4){
                throw new Exception();
            }
        }
        catch(Exception ex){

            System.out.println("Некорректный ввод");}

                if (k < 4) {
              int z = str.indexOf(arr2[k]);

              String str1 = str.substring(0, z);
              String str2 = str.substring(++z);

              try {
                  while (!str1.equals(arr[n])) {
                      n++;
                  }

                  while (!str2.equals(arr[n2])) {
                      n2++;
                  }
                  if ((n == 20) || (n2 == 20)) {
                      throw new Exception();
                  }
              } catch (Exception ex) {

                  System.out.println("Только числа от 1 до 10");
              }

              if ((n > 9) && (n2 > 9)&&(n< 20)&&(n2 < 20)) {

                  int a = Integer.parseInt(str1);
                  int b = Integer.parseInt(str2);
                  int c = 0;
                  switch (k) {
                      case 0:
                          c = a + b;
                          break;
                      case 1:
                          c = a - b;
                          break;
                      case 2:
                          c = a / b;
                          break;
                      case 3:
                          c = a * b;
                          break;
                  }
                  System.out.println(c);
              } else if ((n > 9) && (n2 < 10)&&(n!=20)|| (n < 10) && (n2 > 9)&&(n2!=20)){
                  System.out.println("Числа должны быть одного формата");
              } else if  ((n < 10)&&(n2 < 10)){
                  int a = n + 1;
                  int b = n2 + 1;
                  int c = 0;
                  switch (k) {
                      case 0:
                          c = a + b;
                          break;
                      case 1:
                          c = a - b;
                          break;
                      case 2:
                          c = a / b;
                          break;
                      case 3:
                          c = a * b;
                          break; }

                  int rim = c % 10;
                  if (c==0){
                      System.out.println("NULL");
                  } else if (c < 0){
                      int c2 = Math.abs(c);
                      System.out.println("-" +arr[c2-1] );
                  }
                  else
             if (!(rim == 0)) {
                 switch (c / 10) {
                     case 0:
                         System.out.println(arr[rim - 1]);
                         break;
                     case 1:
                         System.out.println("X" + arr[rim - 1]);
                         break;
                     case 2:
                         System.out.println("XX" + arr[rim - 1]);
                         break;
                     case 3:
                         System.out.println("XXX" + arr[rim - 1]);
                         break;
                     case 4:
                         System.out.println("XL" + arr[rim - 1]);
                         break;
                     case 5:
                         System.out.println("L" + arr[rim - 1]);
                         break;
                     case 6:
                         System.out.println("LX" + arr[rim - 1]);
                         break;
                     case 7:
                         System.out.println("LXX" + arr[rim - 1]);
                         break;
                     case 8:
                         System.out.println("LXXX" + arr[rim - 1]);
                         break;
                     case 9:
                         System.out.println("XC" + arr[rim - 1]);
                         break;
                 }
             } else {  switch (c){
                 case 10:
                     System.out.println("X");
                     break;
                 case 20:
                     System.out.println("XX");
                     break;
                 case 30:
                     System.out.println("XXX");
                     break;
                 case 40:
                     System.out.println("XL");
                     break;
                 case 50:
                     System.out.println("L");
                     break;
                 case 60:
                     System.out.println("LX");
                     break;
                 case 70:
                     System.out.println("LXX");
                     break;
                 case 80:
                     System.out.println("LXXX");
                     break;
                 case 90:
                     System.out.println("XC");
                     break;
                 case 100:
                     System.out.println("C");
                     break;
             }}
              }


              }
           else {

          }


    }}





