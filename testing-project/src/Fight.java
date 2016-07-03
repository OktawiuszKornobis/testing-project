
public class Fight {

	public  void fight (Gladiator Spartacus, Gladiator Maximus){
			while(Maximus.getHealth()>0 && Spartacus.getHealth()>0){
			Spartacus.setHealth(Spartacus.getHealth() - Maximus.getStrength());
			Maximus.setHealth(Maximus.getHealth() - Spartacus.getStrength());
			System.out.println("Spartacus: HP left "+ Spartacus.getHealth() +" : Maximus: HP left "+ Maximus.getHealth());
			System.out.println("\n");
		}
	}
	public static void main(String[]args){
		Gladiator Maximus = new Gladiator("Maximus",Gladiator.NORMAL);
		Gladiator Spartacus = new Gladiator("Spartacus",Gladiator.STRONG);
		
		Maximus.printInfo();
		Spartacus.printInfo();
		
		Fight F1 = new Fight();
		F1.fight(Spartacus, Maximus);
		
	}
}
