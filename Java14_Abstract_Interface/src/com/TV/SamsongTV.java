package com.TV;

public class SamsongTV implements TV {

	private int volume;
	
	public int getVolume() {
		return volume; 
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	

	@Override
	public int volumeup() {
		volume += 2;
		
		return volume;
	}

	@Override
	public int volumdown() {
		volume -= 2;
		
		return volume;
	}

	
}
	



// TV를 상속받는 SamsongTV와 IgTV를 만들자.
// SamsongTV는 volumeUp/Down 시 크기가 +- 2씩
// IgTV는 volumeUp/Down 시 크기가 +- 3씩 증감한다.
// SamsongTV와 IgTV에서 volume이라는 field를 만들고,
// 위의 기능을 하도록 코드를 작성하자.
