import pack.*;
import java.util.Scanner ; 

public class Conversions{
	public static void main(String []args){

		Currency c = new Currency();
		DistanceConverter s = new DistanceConverter();
		Timer d = new Timer();

		System.out.println("1.CURRENCY CONVERSION\n2.TIME CONVERSION");
		System.out.println("3.DISTANCE CONVERSION");
		Scanner sai  =  new Scanner(System.in);

		int input = sai.nextInt();
		if(input==2){
			System.out.println("1.Hours to Minutes\n2.Hours to Seconds\n3.Minutes to Hours					\n4.Seconds to hours ");
			int ch = sai.nextInt();
			switch(ch){
				case 1 : d.hoursToMinutes();
				break;
				
				case 2 : d.hoursToSeconds();
				break;

				case 3: d.minutesToHours();
				break;

				case 4 : d.secondsToHours();
				break;
			}
		}

		else if(input==1){
			System.out.println("1.Dollar to INR\n2.EURO to INR\n3.Yen to INR\n4.INR to Dollar				\n5.INR to EURO\n6.INR to Yen");
			int ch = sai.nextInt();
			switch(ch){
				case 1 : c.dollarToRupee();
				break;
				
				case 2 : c.euroToRupee();
				break;

				case 3: c.yenToRupee();
				break;

				case 4 : c.rupeeToDollar();
				break;
				
				case 5 : c.rupeeToEuro();
				break;

				case 6: c.rupeeToYen();
				break;
			}
		}

		else if(input==3){
			System.out.println("1.Meters to km\n2.Miles to km\n3.km to Meters\n4.km to Miles");
			int ch = sai.nextInt();
			switch(ch){
				case 1 : s.metersToKm();
				break;
				
				case 2 : s.milesToKm();
				break;

				case 3: s.kmToMeters();
				break;

				case 4 : s.kmToMiles();
				break;
			}
		}

		else{
			System.out.println("Enter correct Choice ");
		}
						
	}
}