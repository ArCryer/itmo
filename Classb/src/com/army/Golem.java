package com.army;

public class Golem {

		public Integer health, resist;
		
		public void SetHealth(Integer health, Integer resist) {
			this.health = health;
			this.resist = resist;
		}
		
		public void Attack(Integer damage) {
			this.health = this.health - damage*(100-resist)/100;
		}
		
		public void CheckDead() {
			if (this.health<=0) {
				System.out.println("We won!");	
			} else {
				System.out.println("We are all dead now! Health left: "+health);
			}
		}
}
