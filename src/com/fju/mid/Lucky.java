package com.fju.mid;

import java.util.Random;

public class Lucky {

	public static void main(String[] args) {
		Random r = new Random();
		int[] sixNumber = new int[10];
		for (int n = 0; n < 6; n++) {
			sixNumber[n] = r.nextInt(10) + 1;
			for (int m = 0; m < n;) {
				if (sixNumber[m] == sixNumber[n]) {
					sixNumber[n] = r.nextInt(10) + 1;
					m = 0;
				} else {
					m++;
				}
			}

		}
		System.out.println();
		for (int n = 0; n < 6; n++) {
			System.out.print(sixNumber[n] + " ");

		}
	}
}
