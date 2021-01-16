package Baseball;

public class Referee {
	
	// Ball에서 만든 목표 배열과 User에서 입력 받은 배열을 비교!	
	// input 배열을 하나 만든 후
	// 0번지 : strike 개수
	// 1번지 : ball 개수
	// 2번지 : out 개수

	public int[] isStrike(int[] goal, int[] inputArr) {
		int[] output = new int[3];    // strike, ball을 하나하나 세지 않기 위해 임의의 리턴값을 설정
		
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < goal.length; i++) {
			for(int j = 0; j < inputArr.length; j++) {
				// strike or ball이란 얘기
				if(goal[i] == inputArr[j]) {
					if(i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}		

		if(strike + ball == 0) {
			output[2] = 3;    // 0이 아닌 임의의 값 
		}else {
			output[0] = strike;
			output[1] = ball;
		}
		return output;
	}
}
