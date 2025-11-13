package hw2;

import java.io.IOException;

public class p42 {
	public static void main(String[] args) throws IOException {
	       //p42 初始化陣列設定
        int[] test1 = {80, 60, 22, 50, 75};

        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "個人的分數是" + test1[i] + "分");
        }
	}
}
