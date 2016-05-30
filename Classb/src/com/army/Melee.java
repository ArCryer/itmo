package com.army;

public class Melee {
	public Integer amount;
	public String weapon;
	public Integer damageSword = 3, damageTruncheon = 1, damage = 0;
	
	public void SetAmount(Integer amount) {
		this.amount = amount;
	}
	
	public void SetWeapon(String weapon) {
		this.weapon = weapon;
    if (weapon == "Sword") {
		damage=amount*damageSword;
	} else if (weapon == "Truncheon") {
	    damage=amount*damageTruncheon;	
	}
	}
	public void CheckDamage() {
		if (this.weapon == "Sword") {
		System.out.println("Damage from sword using "+this.amount+" of melee units: "+amount*damageSword);
		} else if (this.weapon == "Truncheon") {
			System.out.println("Damage from truncheon using "+this.amount+" of melee units: "+amount*damageTruncheon);	
		} else {
			System.out.println("Commander, we need weapon!");
		}
	}
	

}
