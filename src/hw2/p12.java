package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {
	public static void main(String[] args) throws IOException {
     //p12  if 判斷1 or 2
        
        System.out.println("請輸入整數");

        BufferedReader br3 =
                new BufferedReader(new InputStreamReader(System.in));

        int num3 = Integer.parseInt(br3.readLine());

        if (num3 == 1) 
        {
            System.out.println("輸入的是1");
        }
        else if (num3 == 2) 
        {
            System.out.println("輸入的是2");
        }
        else 
        {
            System.out.println("請輸入1或2");
        }   
	}
}
