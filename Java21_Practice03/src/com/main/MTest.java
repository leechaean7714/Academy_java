package com.main;

import java.util.Arrays;

import com.game.Game;
import com.make.Mine;

public class MTest {
	public static void main(String[] args) {
		// System.out.println(Arrays.deepToString(new Mine().make()));    // 다차원 배열 : deepToString
		/*Mine m = new Mine();
		m.make();
		m.prn();
		m.cntMine();*/
		Game.playing();
	}

}
