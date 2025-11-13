package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21 {
	public static void main(String[] args) throws IOException {
        //p21 條件運算子 ?:
        
        System.out.println("請問要選哪條路線?");
        System.out.println("請輸入整數");

        BufferedReader br8 =
                new BufferedReader(new InputStreamReader(System.in));

        String str8 = br8.readLine();
        int res8 = Integer.parseInt(str8);

        char ans8 = (res8 == 1) ? 'A' : 'B';

        System.out.println("選擇了 " + ans8 + " 路線");
        

	
	}
}
