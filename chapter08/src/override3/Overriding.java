package override3;

public class Overriding {
	
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상력은 " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포 무기의 살상력은 " + weapon.fire());
	}
	

}
