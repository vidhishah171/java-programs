package innerclass;

public class Enumeration {
	enum Enum1{
		WINTER, SUMMER, MONSOON;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			EnumTest test[]=EnumTest.values();
			for(EnumTest i:test){
				System.out.println(i+" "+i.val);
			}
			System.out.println("Value of Wednesday: "+EnumTest.valueOf("WEDNESDAY").getValue());
			for(Enum1 test1:Enum1.values()) {
				System.out.println(test1);
			}
			System.out.println("Index of Tuesday:"+EnumTest.valueOf("TUESDAY").ordinal());
			System.out.println("Values:"+EnumTest.values());
			System.out.println("Value of Friday: "+EnumTest.FRIDAY.getValue());
			String test2=EnumTest.FRIDAY.name();
			Enum1 e1=Enum1.SUMMER;
			switch(e1){
			case WINTER: 
				System.out.println("There's so cold.");
				break;
			case SUMMER: 
				System.out.println("There's so hot.");
				break;
			default: 
				System.out.println("Woah, it's raining.");
			}
			String eTest="VOID";
			switch(EnumStringTest.valueOf(eTest).getValue()){
			case "Void": 
				System.out.println("There's so Mondayy.");
				break;
			case "Pending": 
				System.out.println("There's so Tuedayy.");
				break;
			default: 
				System.out.println("Woah, it's working.");
			}
		}
	}
}
