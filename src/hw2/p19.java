package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {
	public static void main(String[] args) throws IOException {
        //p19  || && ! 邏輯運算子
        System.out.println("請問你是男生嗎?");
        System.out.println("請輸入 Y 或 N");

        BufferedReader br7 =
                new BufferedReader(new InputStreamReader(System.in));

        String str7 = br7.readLine();
        char letter7 = str7.charAt(0);

        if (letter7 == 'Y' || letter7 == 'y') 
        {
            System.out.println("你是男生啊!");
        } 
        else if (letter7 == 'N' || letter7== 'n') 
        {
            System.out.println("你是女生啊!");
        } 
        else {
            System.out.println("請輸入 Y 或 N");
        }
	}
}
