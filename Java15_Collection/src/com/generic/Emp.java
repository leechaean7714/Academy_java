  package com.generic;

// <T> : Type
// <E> : Element
// <K> : Key
// <V> : Value;
/*generic:클래스,인터페이스, 메소드 정의시 타입을 파라미터로 사용할 수 있도록 한다.
 * 
1. 컴파일할 때 타입을 체크해서 에러를 사전에 잡을 수 있다.
2. casting을 제거해서 개발자가 편하다.
3. 타입만 다르고 코드의 내용이 대부분 일치할 때, 코드의 재사용성이 좋아진다.
 * */
public class Emp<T> {

	private T empno;                // T가 찾아서 값에 따라 타입 바꿈
	private String ename;

	public Emp() {

		super();
		
	}

	public Emp(T empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public T getEmpno() {
		return empno;
	}

	public void setEmpno(T empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}

}
