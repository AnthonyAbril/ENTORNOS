
package com.mycompany.junit2;

class SuperHero {

	public String name;
	public int power;
	public String realName;
	public String ability;

	public SuperHero(String name, int power, String realName, String ability) {
		this.name = name;
		this.power = power;
		this.realName = realName;
		this.ability = ability;
	}
	
	public String Fight(SuperHero rival) {
		if(this.power > rival.power) return this.name;
		else if(this.power < rival.power) return rival.name;
		else return "TIED!";
	}
	
	public void addPower(int increase) {
		this.power = this.power + increase;
	}
	
	public static void showProfile(SuperHero hero) {
		System.out.println("**************************");
		System.out.println(" Hero name = " + hero.name);
		System.out.println("  Real name = " + hero.realName);
		System.out.println("  Power = " + hero.power);
		System.out.println("  Ability = " + hero.ability);
		System.out.println("**************************");
	}
}