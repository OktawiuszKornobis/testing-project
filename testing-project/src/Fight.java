
public class Fight {

	public  void fight (Gladiator Spartacus, Gladiator Maximus){
		/*
		Mysle, ze lepiej logike utraty zdrowia wskutek obrazen zrobic w klasie Gladiator,
		a nie ustawiac wartosc zdrowia gladiatorow w klasie zupelnie od niej nie zwiazanej.
		Np spartacus.decreaseHealth(maximus.getStrength), ktora bedzie odejmowac zdrowie.		
		*/
		
			while(Maximus.getHealth()>0 && Spartacus.getHealth()>0){
			Spartacus.setHealth(Spartacus.getHealth() - Maximus.getStrength());
			Maximus.setHealth(Maximus.getHealth() - Spartacus.getStrength());
			// jak robisz dlugie konkatenacje Stringow, przyjemniej robi sie na zasadzie String.format("text %s, %s, %s", wartosc1, wartosc2, wartosc3);
			System.out.println("Spartacus: HP left "+ Spartacus.getHealth() +" : Maximus: HP left "+ Maximus.getHealth());
			System.out.println("\n");
		}
	}
	public static void main(String[]args){
		Gladiator Maximus = new Gladiator("Maximus",Gladiator.NORMAL); // jak bedziesz miec enum, to sobie zrefaktoruj, wiecej info w klasie Gladiator. Obiekty wg konwencji z malej litery, nawet jesli Maximus :P
		Gladiator Spartacus = new Gladiator("Spartacus",Gladiator.STRONG); // tak samo tutaj, wiecej info w klasie Gladiator
		
		Maximus.printInfo(); // lepiej tutaj System.out.println(Maximus), gdy przeciazysz toString. Patrz klasa Gladiator
		Spartacus.printInfo();
		
		Fight F1 = new Fight(); // obiekty z malej, klasy z duzej
		F1.fight(Spartacus, Maximus);
		
	}
}

// aha, na koniec: nie komituj skompilowanych klas (caly folder bin do wywalenia) i plikow IDE, w tym wypadku eclipsa (.classpath, .project, folder .settings). Komituj zrodla i do tego najlepiej jakis
// skrypt budujacy, czy to maven, gradle albo cokolwiek innego.