package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p8 {
	public static void main(String[] args) throws IOException {
    //P8 if 後沒有括號
        
        System.out.println("請輸入整數");

        BufferedReader br1 =
             new   BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br1.readLine());

        if (num1 == 1) 
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        

        System.out.println("結束處理");
        
	}
}
