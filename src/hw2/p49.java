package hw2;

import java.io.IOException;

public class p49 {
	public static void main(String[] args) throws IOException {
	       //p49多微陣列
        int[][] test13;
        test13 = new int[2][5];

        test13[0][0] = 80;
        test13[0][1] = 60;
        test13[0][2] = 22;
        test13[0][3] = 50;
        test13[0][4] = 75;

        test13[1][0] = 90;
        test13[1][1] = 55;
        test13[1][2] = 68;
        test13[1][3] = 72;

        for (int i = 0; i < test13[1].length; i++) {
            System.out.println("第" + (i + 1) + "個人的國語分數是" + test13[0][i]);
            System.out.println("第" + (i + 1) + "個人的數學分數是" + test13[1][i]);
        }
        
	
	
	}
}
