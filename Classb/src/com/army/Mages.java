package com.army;

public class Mages {
	public Integer amount;
	public Integer fireball = 6, frostbolt=3, pyroblast = 10;
	public void SetAmount(Integer amount) {
		this.amount = amount;
	}
	
	public void CheckDamage(String spell) {
		if (spell == "Fireball") {
		System.out.println("Damage from fireball using "+this.amount+" of mages: "+amount*fireball);
		} else if (spell == "Frostbolt") {
			System.out.println("Damage from frostbolt using "+this.amount+" of mages: "+amount*frostbolt);	
		} else if (spell == "Pyroblast") {
			System.out.println("Damage from pyroblast using "+this.amount+" of mages: "+amount*pyroblast);
		} else {
			System.out.println("We don't know this spell!");
		}
	}
	

}
