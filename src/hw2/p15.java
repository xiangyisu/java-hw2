package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15 {
	public static void main(String[] args) throws IOException {
       //p15 case no break
        
        System.out.println("請輸入整數");

        BufferedReader br5 =
                new BufferedReader(new InputStreamReader(System.in));

        int num5 = Integer.parseInt(br5.readLine());

        switch (num5) {
            
            case 1: 
            {
                System.out.println("輸入的是1"); 
            }
            case 2: 
            {
                System.out.println("輸入的是2");
            }
            default:
            {
                System.out.println("請輸入1或2");
            }   
        } 
	}
}
