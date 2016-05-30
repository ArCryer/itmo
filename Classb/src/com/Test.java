package com;
import com.army.*;

public class Test {
	public static void main(String[] args) {
	Integer damage;	
		
	Range bow = new Range();
	bow.SetAmount(100);
	bow.SetWeapon("Bow");
	bow.CheckDamage();
	
	Range crossbow = new Range();
	crossbow.SetAmount(200);
	crossbow.SetWeapon("Crossbow");
	crossbow.CheckDamage();
	
	Mages mages = new Mages();
	mages.SetAmount(20);
	mages.CheckDamage("Fireball");
	mages.CheckDamage("Frostbolt");
	mages.CheckDamage("Ping");
	
	Melee truncheon = new Melee();
	truncheon.SetAmount(200);
	truncheon.SetWeapon("Truncheon");
	truncheon.CheckDamage();
	
	Golem golem = new Golem();
	golem.SetHealth(1000, 10);
	damage=bow.damage+crossbow.damage+
			truncheon.damage+
			mages.amount*(mages.fireball+mages.frostbolt+mages.pyroblast);
	System.out.println("Our damage: "+damage);
	golem.Attack(damage);
	golem.CheckDead();
	}
}
