package playMap;

import java.util.ArrayList;

import unit.Seok;
import unit.StarUnit;
import unit.ZZan;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기서 게임을 진행한다.
		// 캐릭터 Seok을 선택함 > 객체를 만든다
//		ArrayList<Seok> seokList = new ArrayList<>();
//		ArrayList<ZZan> zzanList = new ArrayList<>();
		ArrayList<StarUnit> slist = new ArrayList<>();
		// 상속받지 않아도 object class를 다 부모클래스로 가지고있음. 자바의 최상위클래스 -> Object
		// Object class는 자바의 모든 클래스가 무조건 상속받는다

		// super클래스의 멤버변수와 메소드를 sub클래스가 상속받아서 사용가능함
		// s1은 StarUnit type의 변수
		// Seok type의 객체의 주소를 저장가능
		// -> 슈퍼클래스의 변수가 서브클래스의 주소를 가질 수 있다(자바의 다형성의 성질때문, 상속의 관계여야만 가능!!!)
		StarUnit s1 = new Seok();
		s1.unitName = "석진";
		// 부모클래스를 통하여 unitName 변수에 접근
		s1.hp = 6000;
		s1.attack = 100;
		slist.add(s1);
		
		Seok s2 = new Seok();
		s2.unitName = "홍길";
		// 자식클래스를 통하여 unitName 변수에 접근
		s2.hp = 5500;
		s2.attack = 80;
		slist.add(s2);
		
		StarUnit z1 = new ZZan();
		z1.unitName = "짜장";
		z1.hp = 7000;
		z1.attack = 120;
		slist.add(z1);
		
		for(StarUnit s : slist) {
//			System.out.println(s.toString());
			s.attack();
		}
	}

}
