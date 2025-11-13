package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10 {
	public static void main(String[] args) throws IOException {
	     //p10 if 判斷 1
        System.out.println("請輸入整數");

        BufferedReader br2 =
                new BufferedReader(new InputStreamReader(System.in));

        int num2 = Integer.parseInt(br2.readLine());

        if (num2 == 1) 
        {
            System.out.println("輸入的是1");
        }
        else 
        {
            System.out.println("選擇的是1以外的數字");
        }    
	}
}
