package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p32 {
	public static void main(String[] args) throws IOException {
        //p32 迴圈break
        System.out.println("請問要在第幾次處理結束迴圈？(1~10)");
        BufferedReader br9 =
                new BufferedReader(new InputStreamReader(System.in));

        String str9 = br9.readLine();
        int res9 = Integer.parseInt(str9);

        for ( int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "次的處理。");
            if (i == res9) 
                break; 
        }
        

	}
}
