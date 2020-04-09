package com.jse.argorithm;
import java.util.Scanner;

public class Sum1ToN {
	public static void main(String[] args) {
		sum();
	}

	static void sum() {
		System.out.println("1부터 n까지 합 구하기");
		System.out.println("n을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.println(String.format("1부터 %d까지 합 = %d", n, sum));
		
	}
}
