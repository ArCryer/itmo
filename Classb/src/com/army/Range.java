package com.army;

public class Range {
	public Integer amount;
	public String weapon;
	public Integer damageBow = 1;
	public Integer damageCrossbow = 2, damage = 0;
	public void SetAmount(Integer amount) {
		this.amount = amount;
	}
	
	public void SetWeapon(String weapon) {
		this.weapon = weapon;
	if (weapon == "Bow") {
		damage=amount*damageBow;
	} else if (weapon == "Crossbow") {
		damage=amount*damageCrossbow;	
	}
	}
	public void CheckDamage() {
		if (this.weapon == "Bow") {
		System.out.println("Damage from bow using "+this.amount+" of range units: "+amount*damageBow);
		} else if (this.weapon == "Crossbow") {
			System.out.println("Damage from crossbow using "+this.amount+" of range units: "+amount*damageCrossbow);	
		} else {
			System.out.println("Commander, we need weapon!");
		}
	}
	

}