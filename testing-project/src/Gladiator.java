
// no i widzisz, pierwszy program gotowy ;) Na poczatek jak ulal, teraz czas na cos wiekszego ;)
public class Gladiator {
	
	// jako ze static final, lepiej zapisac jako jako MAX_HEALTH.
	/*HP Constant*/
	public static final int MaxHealth = 100;
	
	// uzyj enum do tego typu rzeczy, cos typu (moze byc jakis blad bo pisze w komentarzu, nie kompiluje oczami niestety ;)):
	/*
	public enum Strenght{
	STRONG(15), NORMAL(9), WEAK(5)
	
	private final int strength;
	
	Strength(int strength){
		this.strength = strength;
	}
	
	public int getStrength(){
		return strength;
	}
	
	// potem uzywasz np. Strength.STRONG.getStrength()
	
	*/
	/*Strength Constant*/
	public static final int STRONG = 15;
	public static final int NORMAL = 9;
	public static final int WEAK = 5;
	
	/*Gladiator details*/ // tego typu komentarze sa zbedne. Im mniej komentarzy, tym lepiej. Kod powinien byc samodokumentowalny.
	private String name;
	private int strength;
	private int health = MaxHealth;
	
	/*Constructor methods*/ // tak samo tutaj, to widac, ze to ctor ;)
	public Gladiator(String diffName, int diffStrength, int diffHealth){
		name = diffName;
		setStrength(diffStrength);
		health = diffHealth;
	}
	
	public Gladiator (String diffName, int diffStrength){
		this(diffName, diffStrength, MaxHealth);
	}
	
	/*Accessors & Mutators*/ // tez tu widac, ze gettery i settery ;) Jesli rzeczywiscie nie musisz, nie uzywaj komentarzy.
		public void setName(String n) {name = n;}
		public String getName(){return name;}
		public void setHealth(int h) {health = h;}
		public int getHealth(){return health;}
		
		// ten setter jest tricky. co jesli wartosc s bedzie inna niz ponizsze wartosci? Nie poleci gdzies NPE?
		// Poza tym patrzac na sygnature metody nie mamy pojecia, ze ponizej jest taka logika. Przydaloby sie inaczej nazwac taka metode jesli juz.
		public void setStrength(int s){
			if(s == STRONG || s == NORMAL || s == WEAK){
				strength = s;
			}
		}
		public int getStrength(){return strength;}
		
		// do tego moze lepiej nadpisac toString() i uzywac tej metody do drukowania w innym miejscu?
	   	public void printInfo(){
	   	 String result =  
	   	            "*************************************"+ "\n" +  
	   	            "Name: " + name + "\n" +
	   				"Strenght: " + strength + "\n" +
	   				"Health: " + health + "\n" +
	   				"*************************************";
	   	  System.out.println(result);
	   	}
}
