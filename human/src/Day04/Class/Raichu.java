package Day04.Class;

// 상속
// - 키워드 : 자식 클래스 extends 부모클래스 { } 
public class Raichu extends Pikachu {
	
	// 생선자 자동 완성
	// alt + shift = S → C

	public Raichu() {
		super(200, "슈퍼전기", 20);
	
	}

	public Raichu(int energy, String type) {
		super(energy, type, 20);
		
	}
	
	
    public Raichu(int energy, String type, int level) {
		super(energy, type, level);
		
	}

	// 메소드 오바라이딩 : 메소드 재저의
	// 오버라이딩 자동 완성 : alt + shift + s → v
	@Override
	public String aAttack() {
	
		return "백만볼트";
	}

	@Override
	public String bAttack() {
			return "불트체인지";
	}
	
	public String cAttack() {
	 	 if ( level >=40 )
		    return"아인어테일";
		else
			return "(사융볼가)";
	 	 
	}
	
	

}
