package com.TV;

public class IgTV implements TV {
	
	private int volume;

	@Override
	public int volumeup() {
		volume += 3;
		
		return volume;
	}

	@Override
	public int volumdown() {
		volume -= 3;
		
		return volume;
	}
	
	public int getVolume() {
		return volume; 
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
