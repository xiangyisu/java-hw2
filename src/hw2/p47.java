package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p47 {
	public static void main(String[] args) throws IOException {
	       //p47 排序法
        BufferedReader br12 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");

        Integer[] test12 = new Integer[5];

        for (int  i = 0; i < test12.length; i++) {
            String str12 = br12.readLine();
            test12[i] = Integer.parseInt(str12);
        }

        Arrays.sort(test12, Collections.reverseOrder());

        for (int i = 0; i < test12.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + test12[i]);
        }
        
        
	}
}
