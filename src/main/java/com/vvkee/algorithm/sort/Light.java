package com.vvkee.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.bubuko.com/infodetail-1350838.html
 * 
 * @author xuhf
 *
 */
public class Light {

	public static void main(String[] args) {
		boolean[] lights = new boolean[2015];
		for (int i = 0; i < 2015; i++) {
			lights[i] = false;
		}

		List<Integer> indexes = new ArrayList<Integer>();

		for (int i = 1; i <= 2015; i++) {
			int click = 0;
			for (int j = 1; j <= 2015; j++) {
				if (i % j == 0) {
					click++;
				}
			}
			if (click % 2 != 0) {
				indexes.add(click);
			}
		}

		System.out.println(indexes.size());
	}

}
