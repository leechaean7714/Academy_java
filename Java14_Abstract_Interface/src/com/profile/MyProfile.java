package com.profile;

public class MyProfile extends Profile implements Job, Display {

	
	private String loc;
	
	public MyProfile(String name, String phone) {
		super(name, phone);
		
	}


	@Override
	public void display() {
		prn();
		System.out.println("회사주소 : " + loc);
		System.out.println("회사직종 : " + JOB_ID);    //job_id는 인터페이스라 가져와서 실행할 수 없음.

	}

	@Override
	public void jobLoc(String loc) {   // 굳이 setLoc로 쓸 필요는 없지만 set으로 써주는게 좋음
		this.loc = loc;
		
	}

}
