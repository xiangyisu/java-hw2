package hw2;

import java.io.IOException;

public class p43 {
    //p43 陣列長度
	public static void main(String[] args) throws IOException {

    int[] test2 = {80, 60, 22, 50, 75};

    for (int i = 0; i < test2.length; i++) {
        System.out.println("第" + (i + 1) + "個人的分數是" + test2[i] + "分");
    }

    System.out.println("考試人數為" + test2.length + "人");
    
}}
