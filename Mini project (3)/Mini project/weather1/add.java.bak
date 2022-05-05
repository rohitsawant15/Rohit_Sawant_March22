package weather1;
import java.util.*;

class welcome{
	static void msg(){ //static method
		System.out.println("---------------------------------------------# Welcome to the Weather Board #----------------------------------------------");
		System.out.println("        Data available for following cities: Pune, Aurangabad, Mumbai, Delhi, Banglore (6AM to 9PM)");
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class add{
	
	private double temp[]=new double[5];
	private String aqi="";//Encapsulation
	private double hum=0;//Abstraction
	private double wsp=0;
	private String nature="";
	
	void setdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n----------------------------------------->Enter 5 temperature values per 3 hours :<---------------------------------------- ");
		for(int i=0;i<5;i++){
			temp[i]=sc.nextDouble();
		}
		this.temp=temp;
		
		System.out.println("---------------------------------------->Enter today's Air Quality Index : <------------------------------------------------ \nChoose following Options for Index\nOption 1 : Good\nOption 2 : Moderate\nOption 3 : Unhealthy\nOption 4 : Hazardous\n");
		int q=sc.nextInt();
		if(q==1)
			this.aqi="Good";
		else if(q==2)
		    this.aqi="Moderate";
		else if(q==3)
			this.aqi="Unhealthy";
		else if(q==4)
			this.aqi="Hazardous";
		else
			System.out.println("Enter valid option. ");
		
		System.out.println("\n--------------------------------------------------->Enter Humidity % : <---------------------------------------------------- ");
		hum=sc.nextDouble();
		
		System.out.println("\n------------------------------------------------->Enter wind speed : Km/h <------------------------------------------------- ");
		wsp=sc.nextDouble();
		
		System.out.println("\n---------------------------------------------->Enter today's Weather nature : <---------------------------------------------\nChoose following Options for Index\nOption 1 : Cloudy\nOption 2 : Clear\nOption 3 : Mist\nOption 4 : Sunny\nOption 5 : Haze\n");
		int q1=sc.nextInt();
		
		
		if(q1==1)
			this.nature="Cloudy";
		
		else if(q1==2)
		    this.nature="Clear";
		
		else if(q1==3)
			this.nature="Mist";
		
		else if(q1==4)
			this.nature="Sunny";
		
		else if(q1==5)
			this.nature="Haze";
		
		else
			System.out.println("Enter valid option. ");
		
		
		
	}

	void getdata(){
		System.out.println("\nTemperature list on given time : ");
		System.out.println("\n------------------------------------------------------------------------------------------------------------");
			for(int i=0;i<5;i++){
			System.out.print((6+(i*3))+":00 : "+temp[i]+" celsius, ");
			}
		System.out.println("\n------------------------------------------------------------------------------------------------------------");

	}	
	void minmax(){
		double max=0,min=0;
		 for (int i = 0; i < 5; i++) {
        if (temp[i] > max) {
            max = temp[i];
			}
		}
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------");

		System.out.println("\nMaximum temperature is : "+max+" celsius.\n");
		Arrays.sort(temp);
		System.out.println("\nMinimum temperature is : "+(temp[0])+" celsius.");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------");
	}
		
	void aqi(){
		System.out.println("\n-------------------------------------------------------------------------------------------------------------");

		System.out.println("\nAir Quality Index of chosen city is "+this.aqi);
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");

	}	
    
	void hum(){		
	System.out.println(       "\n--------------------------------------------------------------------------------------------------------------");

	System.out.println("\nHumidity of chosen city is "+this.hum+" %");
	
	System.out.println("\n--------------------------------------------------------------------------------------------------------------");

	}
	
	void wind(){
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");

		System.out.println("\nWind speed of chosen city is "+this.wsp+" Km/h");
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");

	}
	
	void nature(){
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");

		System.out.println("\nWeather nature of chosen city is "+this.nature);
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");

	}

}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class admin extends add{ //inheritance
	
	void admin(){
			
			Scanner sc=new Scanner(System.in);
			
			 ArrayList<add> addata = new ArrayList<>(); //ArrayList //Array of Objects
			 add Pune =new add();		      //Creation of objects of add class.
			 add Aurangabad =new add();      //Creation of objects of add class.
			 add Mumbai =new add();
			 add Delhi =new add();
			 add Banglore =new add();
			 
			addata.add(Pune);              //Adding objects in ArrayList addata.
			addata.add(Aurangabad);
			addata.add(Mumbai);
			addata.add(Delhi);
			addata.add(Banglore);
			
				
		
		System.out.println("\n-------------------------------------!!! Please enter Password for enter Admin mode !!!-------------------------------------");
		String pass1=sc.nextLine();
		boolean c=true;
		if(pass1.equals("admin")){
			while(c){	
			System.out.println("\n#==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==AdminMode==#");
			System.out.println("********************************************************(For feeding the data)*********************************************************************");
			try{	//Exception handling
			
			System.out.println("\n--------------------------------------------->Please enter City of choice:<------------------------------------------------ \n*********(Enter 0 for exit Admin mode.)*********");
			System.out.println("Data available for following cities: Pune, Aurangabad, Mumbai, Delhi, Banglore (6AM to 9PM)");

			String n=sc.nextLine();
			switch(n){
				case "Pune":
				case "pune":
			Pune.setdata();
			
			break;
				case "Mumbai":
				case "mumbai":
			Mumbai.setdata();
			
			break;
				case "Aurangabad":
				case "aurangabad":
			Aurangabad.setdata();
			
			break;
				case "Delhi":
				case "delhi":
			Delhi.setdata();
			
			break;
				case "Banglore":
				case "banglore":
			Banglore.setdata();
			
			break; 
			case "0":
				c=false;
				break;
			default:
				System.out.println("\nEntered city is unavailable (Incase enter 0 for exit or please enter available city )");
				System.out.println("Available following cities: Pune, Aurangabad, Mumbai, Delhi, Banglore (6AM to 9PM)");
			}
				
			}catch(InputMismatchException e){
			System.out.println("\nEntered value is invalid  ");
		}
		}
		}
			else {
				System.out.println("Entered password is WRONG!!! Access denied!!!");
		}
	
//-----------User Mode--------------------------	
	System.out.println("\nEnter password for enter user mode: ");
	String pass=sc.nextLine();
	if(pass.equals("cdac2022")){
	while(true){	
		System.out.println("\n#UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode==UserMode#");
		System.out.println("***********************************************************(For observing data)***********************************************************************");
			System.out.println("\n-------------------------------------->Please enter city of choice to see data:<----------------------------------------- \n*********(Enter 0 for exit.)*********");
			System.out.println("Available data for following cities: Pune, Aurangabad, Mumbai, Delhi, Banglore (6AM to 9PM)");

				String n=sc.nextLine();
			switch(n){
				case "Pune":
				case "pune":
			
			Pune.getdata();
			Pune.minmax();
			Pune.aqi();
			Pune.hum();
			Pune.wind();
			Pune.nature();
			break;
			
				case "Mumbai":
				case "mumbai":
		
			Mumbai.getdata();
			Mumbai.minmax();
			Mumbai.aqi();
			Mumbai.hum();
			Mumbai.wind();
			Mumbai.nature();
			break;
			
				case "Aurangabad":
				case "aurangabad":
		
			Aurangabad.getdata();
			Aurangabad.minmax();
			Aurangabad.aqi();
			Aurangabad.hum();
			Aurangabad.wind();
			Aurangabad.nature();
			break;
			
				case "Delhi":
				case "delhi":
			
			Delhi.getdata();
			Delhi.minmax();
			Delhi.aqi();
			Delhi.hum();
			Delhi.wind();
			Delhi.nature();
			break;
			
				case "Banglore":
				case "banglore":
		
			Banglore.getdata();
			Banglore.minmax();
			Banglore.aqi();
			Banglore.hum();
			Banglore.wind();
			Banglore.nature();
			break; 
			
			case "0":
			System.out.println("___________________________________THANK YOU!___________________________________");
			System.exit(0);
			break;
			
			default:
			System.out.println("\n!!!Entered city is unavailable (Enter 0 for exit)!!!");
			System.out.println("Available following cities: Pune, Aurangabad, Mumbai, Delhi, Banglore (6AM to 9PM)");

			}
		}
	}
	else {
				System.out.println("Entered password is WRONG!!! Access denied!!!");
		}
	}
	
}	


//--------------------------------------------END-------------------------------------------
