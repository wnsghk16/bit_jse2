package com.jse.argorithm;

public class Gugudan {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.print(String.format("%d x %d = %d\t", j, i, i*j));					
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<10; i++) {
			for(int j=6; j<10; j++) {
				System.out.print(String.format("%d x %d = %d\t", j, i, i*j));				
			}
			System.out.println();
		}
	}
}
