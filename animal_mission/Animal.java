package animal_mission;
// Super class 정의
public abstract class Animal {		// 추상메서드가 있다면 추상 클래스가 됨 -> 추상클래스는 객체를 만들 수 없다.
	String aniName = null;
	String zooName = "휴먼동물원";
	int aniAge = 0;
	int aniWeight = 0;
	
	@Override
	public String toString() {
		return "Animal [zooName=" + zooName + ", aniName=" + aniName + ", aniAge=" + aniAge + "살, aniWeight=" + aniWeight
				+ "키로]";
	}

	public void feed() {
		System.out.println("동물에게 먹이를 주었습니다.");
	}
	
	public abstract void kkk();		// 구현되지 않은 상태의 추상메소드, 상속받으면 반드시 오버라이드
}
