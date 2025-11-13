package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p45 {

	public static void main(String[] args) throws IOException {
	 BufferedReader br11 = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("請輸入5個人的分數");
     int[] test11 = new int[5];

     for (int i = 0; i < test11.length; i++) {
         String str11 = br11.readLine();
         test11[i] = Integer.parseInt(str11);
     }

     for (int s = 0; s < test11.length - 1; s++) {
         for (int t = s + 1; t < test11.length; t++) {
             if (test11[t] > test11[s]) {
                 int tmp = test11[t];
                 test11[t] = test11[s];
                 test11[s] = tmp;
             }
         }
     }

     for ( int i = 0; i < test11.length; i++) {
         System.out.println("第" + (i + 1) + "名的分數是" + test11[i]);
     }
}}
