
public class Gladiator {
	
	/*HP Constant*/
	public static final int MaxHealth = 100;
	
	/*Strength Constant*/
	public static final int STRONG = 15;
	public static final int NORMAL = 9;
	public static final int WEAK = 5;
	
	/*Gladiator details*/
	private String name;
	private int strength;
	private int health = MaxHealth;
	
	/*Constructor methods*/
	public Gladiator(String diffName, int diffStrength, int diffHealth){
		name = diffName;
		setStrength(diffStrength);
		health = diffHealth;
	}
	
	public Gladiator (String diffName, int diffStrength){
		this(diffName, diffStrength, MaxHealth);
	}
	
	/*Accessors & Mutators*/
		public void setName(String n) {name = n;}
		public String getName(){return name;}
		public void setHealth(int h) {health = h;}
		public int getHealth(){return health;}
		public void setStrength(int s){
			if(s == STRONG || s == NORMAL || s == WEAK){
				strength = s;
			}
		}
		public int getStrength(){return strength;}
		
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
