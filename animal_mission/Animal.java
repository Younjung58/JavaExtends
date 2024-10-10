package animal_mission;
// Super class 정의
public class Animal {
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
}
