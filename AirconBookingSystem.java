import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AirconBookingSystem 
{
    public static Scanner scan = new Scanner (System.in);
    public static String Name, Address, Contact, ValID, Occup;
    public static String ProdNAME;
	public static String sched; // NEW
    public static int price=0, qty=0, total=0,ftotal=0, dp, ob, fprice = 0, fqty = 0;
    public static ArrayList<String> Receipt = new ArrayList<String>();
    public static ArrayList<String> ProdList = new ArrayList<String>();
    public static int orderNum = 0;
    public static String date = new SimpleDateFormat(" MM/dd/yyyy  hh:mm aa").format(Calendar.getInstance().getTime());
	
	
	
    public static void Menu()
    {
        char option;
		
	String datelog = new SimpleDateFormat("\t\t\t\t\t\t|        MM/dd/yyyy  hh:mm aa          |").format(Calendar.getInstance().getTime());
    System.out.println("\t\t\t\t\t\t========================================");
    System.out.println("\t\t\t\t\t\t|        LUCKY - BERMARCOLUZI          |");
    System.out.println("\t\t\t\t\t\t|    AIRCON SERVICES BOOKING SYSTEM    |");
    System.out.println("\t\t\t\t\t\t========================================");
	System.out.println(datelog);
	System.out.println("\t\t\t\t\t\t========================================");
		
	System.out.println("");

    System.out.println("\t\t\t\t\t\t\t1. View Services and Deals");
    System.out.println("\t\t\t\t\t\t\t2. Book an order");
	System.out.println("\t\t\t\t\t\t\t3. View Transaction");
    System.out.println("\t\t\t\t\t\t\t4. Log-out");
    System.out.println("\t\t\t\t\t\t\t5. Exit");
          
	System.out.println("");
	System.out.println("");
	System.out.println("");
		  
	System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
        option = scan.next().charAt(0);

        switch (option)
		{
        case '1':
            ClearScreen();
            One(); // View services and deals
            break;
        case '2':
            ClearScreen();
            Two(); // Book an Order
            break;
        case '3':
            ClearScreen();
            Tree(); // View Transcation
            break;
		case '4':
            ClearScreen();
            scan.nextLine();
            Login(); // Logout
            break;
        case '5':
            ClearScreen();
            System.exit(0); // Exit
            break;
		default:
            ClearScreen(); 
            Menu();
        }   
    }

      
    public static void One() //View Services and Deals
    {
    char choice;
		
    System.out.printf("\n\n\n");
    System.out.println("\t\t\t========================================================================================================================");
    System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
    System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
    System.out.println("\t\t\t========================================================================================================================");
    System.out.println("");
    System.out.println("\t\t\t========================================================================================================================");
    System.out.println("\t\t\t|             SERVICES                    |                      PACKAGES (FREE 10FEET INSTALLATION)                   |");
    System.out.println("\t\t\t========================================================================================================================");
    System.out.println("\t\t\t|                                         |                                                                            |");
    System.out.println("\t\t\t|Installation: (PER 10FEET INSTALLATION)  |  Inverter/s Split Type:                                                    |");
    System.out.println("\t\t\t| (A): 1HP - 1.5HP INVERTER (PHP 7,500)   |     (1): PANASONIC CS/CU XPU18WKQ 2HP Inverter               (PHP 62,500)  |");
    System.out.println("\t\t\t| (B): 2HP - 2.5HP INVERTER (PHP 8,500)   |     (2): SHARP AH-X15ZF 1.5HP Inverter                       (PHP 37,200)  |");
    System.out.println("\t\t\t|                                         |     (3): LG HS09ISG 1HP Inverter                             (PHP 42,600)  |");
    System.out.println("\t\t\t|Cleaning: (ANY AIRCON TYPE)              |     (4): SAMSUNG AR10BYHAMWKNTC 1HP Inverter                 (PHP 35,500)  |");
    System.out.println("\t\t\t| (C): Cleaning (PHP 1,500)               |     (5): TCL TAC 12CSA/KEI 1.5HP Inverter                    (PHP 36,500)  |");
    System.out.println("\t\t\t|                                         |     (6): KOLIN KSG-IWF-30WFY-8K1M32 2.5HP Inverter           (PHP 75,000)  |");
    System.out.println("\t\t\t|                                         |     (7): CONDURA PRIMA FP-53KSV012313 1.5HP Inverter         (PHP 33,000)  |");
    System.out.println("\t\t\t|                                         |     (8): CARRIER 53GCVBS024-303P CRYSTAL 2 2.5HP Inverter    (PHP 70,000)  |");
    System.out.println("\t\t\t|                                         |     (9): LG HSN24IPX 2.5HP Inverter                          (PHP 65,000)  |");
    System.out.println("\t\t\t|                                         |     (0): TCL TAC18CSAKEI 2.0HP Inverter                      (PHP 33,500)  |");
    System.out.println("\t\t\t|                                         |                                                                            |");
    System.out.println("\t\t\t========================================================================================================================");
    System.out.println("\t\t\t[E] to exit.");
		
		
    System.out.printf("\n\n\n");
    System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
    choice = scan.next().charAt(0);
		
    switch(choice)
    {
        case 'e': case 'E':
            ClearScreen();
            Menu();
            break;
        case 'A': case 'a':
            do{
                ClearScreen();
                System.out.printf("\n\n\n");
                System.out.println("\t\t\t========================================================================================================================");
                System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
                System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
                System.out.println("\t\t\t========================================================================================================================");
                System.out.printf("\n\n");

                System.out.println("\t\t\t\t INSTALLATION PACKAGE (A): For 1HP - 1.5HP Split Type Inverters (PHP 7,500)");
                System.out.printf("\n");
                System.out.println("\t\t\t\t\t       (Installation for 1st 10feet) Inclusions: Communication Wire, Copper Tube(10ft),");
                System.out.println("\t\t\t\t\t Installation, PVC Pipe (for drain), Outdoor Nracket, Flashing the system with Nitrogen");
                System.out.println("\t\t\t\t\t , Vacuuming/Vacuum, Labor, Mason Reworks.");

                System.out.printf("\n\n\n");
                System.out.println("\t\t\t[E] to exit.");

                System.out.printf("\n\n\n");
                System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
                choice = scan.next().charAt(0);
                if (choice == 'e' || choice == 'E')
                {
                    ClearScreen();
                    One();
                }
            }while(choice != 'e' || choice != 'E');
            break;
			
        case 'B': case 'b':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t INSTALLATION PACKAGE (B): For 2HP - 2.5HP Split Type Inverters (PHP 8,500)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t       (Installation for 1st 10feet) Inclusions: Communication Wire, Copper Tube(10ft),");
		System.out.println("\t\t\t\t\t Installation, PVC Pipe (for drain), Outdoor Nracket, Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t , Vacuuming/Vacuum, Labor, Mason Reworks.");
		
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		
		if (choice == 'e' || choice == 'E')
		{
			ClearScreen();
			One();
		}
            }while(choice != 'e' || choice != 'E');
            break;	
			
        case 'C': case 'c':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t CLEANING PACKAGE (C): Aircondition Cleaning (PHP 1,500)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t       Inclusions: Cleaning(Any Aircon Type), Labor, Vacuuming.");
		
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;	
			
		case '1':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (1): PANASONIC CS/CU XPU18WKQ 2HP Inverter (PHP 62,500)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (2HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
        case '2':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (2): SHARP AH-X15ZF 1.5HP Inverter (PHP 37,200)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (1.5HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
			ClearScreen();
			One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
	case '3':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (3): LG HS09ISG 1HP Inverter (PHP 42,600)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (1HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
	case '4':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (4): SAMSUNG AR10BYHAMWKNTC 1HP Inverter (PHP 35,500)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (1HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
	case '5':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (5): TCL TAC 12CSA/KEI 1.5HP Inverter (PHP 36,500)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (1.5HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
        case '6':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (6): KOLIN KSG-IWF-30WFY-8K1M32 2.5HP Inverter (PHP 75,000)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (2.5HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
	case '7':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (7): CONDURA PRIMA FP-53KSV012313 1.5HP Inverter (PHP 33,000)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (1.5HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
			break;
			
        case '8':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (8): CARRIER 53GCVBS024-303P CRYSTAL 2 2.5HP Inverter (PHP 70,000)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (2.5HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
	case '9':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (9): LG HSN24IPX 2.5HP Inverter (PHP 65,000)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (2.5HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
	case '0':
            do{
		ClearScreen();
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
		System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
		System.out.println("\t\t\t========================================================================================================================");
		System.out.printf("\n\n");
		
		
		System.out.println("\t\t\t\t PACKAGE (0): TCL TAC18CSAKEI 2.0HP Inverter (PHP 33,500)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Aircon Type: Split Type (2HP)");
		System.out.printf("\n");
		System.out.println("\t\t\t\t\t Package Inclusions: (FREE INSTALLATION for 1st 10feet)");
		
		System.out.println("\t\t\t\t\t      - Communication Wire");
		System.out.println("\t\t\t\t\t      - Copper Tube(10ft)");
		System.out.println("\t\t\t\t\t      - Installation");
		System.out.println("\t\t\t\t\t      - PVC Pipe(for drain)");
		System.out.println("\t\t\t\t\t      - Outdoor Bracket");
		System.out.println("\t\t\t\t\t      - Flashing the system with Nitrogen");
		System.out.println("\t\t\t\t\t      - Vacuuming/Vacuum");
		System.out.println("\t\t\t\t\t      - Labor");
		System.out.println("\t\t\t\t\t      - Mason Reworks");
		
		System.out.printf("\n\n\n");
		System.out.println("\t\t\t[E] to exit.");
		
		
		System.out.printf("\n\n\n");
		System.out.print("\t\t\t\t\t\tENTER YOUR CHOICE: ");
		choice = scan.next().charAt(0);
		if (choice == 'e' || choice == 'E')
		{
                    ClearScreen();
                    One();
		}
            }while(choice != 'e' || choice != 'E');
            break;
			
        default:
            ClearScreen();
            One();
            break;
    }
	

    }
	
    public static void Two() //Make a transanction or Book an Order
    {
    ProdList.clear(); //array list
	
	char yn;
	
    char choice;
	
	price=0; qty=0; total=0;ftotal=0; fprice = 0; fqty = 0;

	do{
            ClearScreen();
            System.out.println("\t\t\t========================================================================================================================");
            System.out.println("\t\t\t|                                                  LUCKY - BERMARCOLUZI                                                |");
            System.out.println("\t\t\t|                                                 (AIRCONDITION TRADING)                                               |");
            System.out.println("\t\t\t========================================================================================================================");
            System.out.println("");
            System.out.println("\t\t\t========================================================================================================================");
            System.out.println("\t\t\t|             SERVICES                    |                      PACKAGES (FREE 10FEET INSTALLATION)                   |");
            System.out.println("\t\t\t========================================================================================================================");
            System.out.println("\t\t\t|                                         |                                                                            |");
            System.out.println("\t\t\t|Installation: (PER 10FEET INSTALLATION)  |  Inverter/s Split Type:                                                    |");
            System.out.println("\t\t\t| (A): 1HP - 1.5HP INVERTER (PHP 7,500)   |     (1): PANASONIC CS/CU XPU18WKQ 2HP Inverter               (PHP 62,500)  |");
            System.out.println("\t\t\t| (B): 2HP - 2.5HP INVERTER (PHP 8,500)   |     (2): SHARP AH-X15ZF 1.5HP Inverter                       (PHP 37,200)  |");
            System.out.println("\t\t\t|                                         |     (3): LG HS09ISG 1HP Inverter                             (PHP 42,600)  |");
            System.out.println("\t\t\t|Cleaning: (ANY AIRCON TYPE)              |     (4): SAMSUNG AR10BYHAMWKNTC 1HP Inverter                 (PHP 35,500)  |");
            System.out.println("\t\t\t| (C): Cleaning (PHP 1,500)               |     (5): TCL TAC 12CSA/KEI 1.5HP Inverter                    (PHP 36,500)  |");
            System.out.println("\t\t\t|                                         |     (6): KOLIN KSG-IWF-30WFY-8K1M32 2.5HP Inverter           (PHP 75,000)  |");
            System.out.println("\t\t\t|                                         |     (7): CONDURA PRIMA FP-53KSV012313 1.5HP Inverter         (PHP 33,000)  |");
            System.out.println("\t\t\t|                                         |     (8): CARRIER 53GCVBS024-303P CRYSTAL 2 2.5HP Inverter    (PHP 70,000)  |");
            System.out.println("\t\t\t|                                         |     (9): LG HSN24IPX 2.5HP Inverter                          (PHP 65,000)  |");
            System.out.println("\t\t\t|                                         |     (0): TCL TAC18CSAKEI 2.0HP Inverter                      (PHP 33,500)  |");
            System.out.println("\t\t\t|                                         |                                                                            |");
            System.out.println("\t\t\t========================================================================================================================");
            System.out.println("\t\t\tEnter [E] to exit.");
			
			
			
		
            System.out.printf("\n\n\n");
            System.out.print("\t\t\t\t\t\tEnter choice: ");
            choice = scan.next().charAt(0);
    		
            switch (choice)
            {
		//Services
    		case 'A': case 'a': 
                    ProdNAME = "\t\t\t\t\t\t       1HP - 1.5HP INVERTER INSTALLATION (10 FEET)";
                    price = 7500;
    		    break;
    		case 'B': case 'b':
                    ProdNAME = "\t\t\t\t\t\t       2HP - 2.5HP INVERTER INSTALLATION (10 FEET)";
    		    price = 8500;
    		    break;
                case 'C': case 'c':
                    ProdNAME = "\t\t\t\t\t\t       Cleaning (ANY AIRCON TYPE)";
    		    price = 1500;
    		    break;
				
                //Packages
                case '1':
                    ProdNAME = "\t\t\t\t\t\t       PANASONIC CS/CU XPU18WKQ 2HP Inverter";
                    price = 62500;
                    break;
		case '2':
                    ProdNAME = "\t\t\t\t\t\t       SHARP AH-X15ZF 1.5HP Inverter";
                    price = 37200;
                    break;
		case '3': 
                    ProdNAME = "\t\t\t\t\t\t       LG HS09ISG 1HP Inverter";
                    price = 42600;
                    break;
		case '4':
                    ProdNAME = "\t\t\t\t\t\t       SAMSUNG AR10BYHAMWKNTC 1HP Inverter";
                    price = 35500;
                    break;
		case '5':
                    ProdNAME = "\t\t\t\t\t\t       TCL TAC 12CSA/KEI 1.5HP Inverter";
                    price = 36500;
                    break;
		case '6':
                    ProdNAME = "\t\t\t\t\t\t       KOLIN KSG-IWF-30WFY-8K1M32 2.5HP Inverter";
                    price = 75000;
                    break;
		case '7':
                    ProdNAME = "\t\t\t\t\t\t       CONDURA PRIMA FP-53KSV012313 1.5HP Inverter";
                    price = 33000;
                    break;
		case '8':
                    ProdNAME = "\t\t\t\t\t\t       CARRIER 53GCVBS024-303P CRYSTAL 2 2.5HP Inverter";
                    price = 70000;
                    break;
		case '9':
                    ProdNAME = "\t\t\t\t\t\t       LG HSN24IPX 2.5HP Inverter";
                    price = 65000;
                    break;
		case '0': 
                    ProdNAME = "\t\t\t\t\t\t       TCL TAC18CSAKEI 2.0HP Inverter";
                    price = 33500;
                    break;
				
		//Added buttons
    		case 'E': case 'e':
                    ClearScreen();
                    Menu();
                    break;
    		default:
                    ClearScreen();
                    Two();
    		    break;
            }
    		
            System.out.print("\t\t\t\t\t\tEnter qty: ");
            qty = scan.nextInt();
    		
            total = price * qty;
			System.out.println("\t\t\t\t\t\t==================================================================");
			System.out.println("\t\t\t\t\t\tSelected Item/s: \n" + ProdNAME + "       x" + qty + "\n");
            System.out.println("\t\t\t\t\t\tItem Total: " + total);
			ProdList.add(ProdNAME + " - x" + qty + "\n");
			
            ftotal += total;
            System.out.println("\t\t\t\t\t\t=================================================================="); // DITO
			System.out.println("\t\t\t\t\t\tCart: \n" + ProdList ); // DITO
			System.out.println("\t\t\t\t\t\t==================================================================");
			System.out.println("\t\t\t\t\t\t                                               TOTAL: " + ftotal   );
			System.out.println("\n");
            System.out.print("\t\t\t\t\t\tDo you want to order more?[Y/N]: ");
            yn = scan.next().charAt(0);
            
            //ProdList.add(ProdNAME + " - x" + qty + "\n");
  
            fprice += price;
	    fqty += qty;	
	}while(yn=='y'|| yn =='Y');
		
        ClearScreen();
        System.out.printf("\n\n\n");
		System.out.println("\t\t\t\t\t\t==================================================================");
		System.out.println("\t\t\t\t\t\tItem/s: \n" + ProdList ); // DITO
		System.out.println("\t\t\t\t\t\t==================================================================");
        System.out.println("\t\t\t\t\t\t                                          TOTAL: "+ ftotal + " (PHP)");
		System.out.printf("\n\n");
        System.out.print("\t\t\t\t\t\tENTER DOWNPAYMENT: (PHP) ");
        dp = scan.nextInt();
		
        ob = ftotal - dp;
        System.out.println("\t\t\t\t\t\t==================================================================");
        System.out.println("\t\t\t\t\t\tOUTSTANDING BALANCE: "+ ob + " (PHP)");
		System.out.println("\t\t\t\t\t\t==================================================================");
		
		//Service DATE
		System.out.printf("\n\n");
		scan.nextLine();
		
		System.out.print("\t\t\t\t\t\tSCHEDULE(MM/DD/YYYY): ");
        sched = scan.nextLine();
		
        System.out.printf("\n\n");
        System.out.print("\t\t\t\t\t\tDo you want to confirm order?[Y/N]: ");
        yn = scan.next().charAt(0);
        if (yn == 'y' || yn == 'Y')
        {
            orderNum++;
				
            ClearScreen();
            scan.nextLine();
            System.out.printf("\n\n\n");
            System.out.println("\t\t\t\t\t\t===================================================");
            System.out.println("\t\t\t\t\t\t                 FILL-UP CUSTOMER INFO             ");
            System.out.println("\t\t\t\t\t\t===================================================");
            System.out.print("\t\t\t\t\t\tEnter Customer Name: ");
            Name = scan.nextLine();
            System.out.print("\t\t\t\t\t\tEnter Customer Address(City): ");
            Address = scan.nextLine();
            System.out.print("\t\t\t\t\t\tEnter Customer Contact: ");
            Contact = scan.nextLine();
            System.out.print("\t\t\t\t\t\tEnter Customer Presented Valid ID: ");
            ValID = scan.nextLine();
            System.out.print("\t\t\t\t\t\tEnter Customer Occupation: ");
            Occup = scan.nextLine();
				
            ClearScreen();
            System.out.printf("\n\n\n");
            System.out.println("\t\t\t\t\t\t==============================================================");
            System.out.println("\t\t\t\t\t\t                   OFFICIAL BOOKING RECEIPT                   ");
            System.out.println("\t\t\t\t\t\t==============================================================");
            System.out.println("\t\t\t\t\t\t                        BOOKING NO. " + orderNum               );
            System.out.println("\t\t\t\t\t\t==============================================================");
            System.out.println("\t\t\t\t\t\tItems: \n" + ProdList);
            System.out.println("\t\t\t\t\t\tItem/s Total: " + ftotal + " (PHP)");
            System.out.println("\t\t\t\t\t\tDownpayment: "+ dp + " (PHP)");
            System.out.printf("\n");
			System.out.println("\t\t\t\t\t\tSchedule: " + sched);
			System.out.printf("\n");
            System.out.println("\t\t\t\t\t\t==============================================================");
            System.out.println("\t\t\t\t\t\tOutstanding balance: "+ ob + " (PHP)");
            System.out.println("\t\t\t\t\t\t==============================================================");
            String datelog = new SimpleDateFormat("MM/dd/yyyy | hh:mm aa ").format(Calendar.getInstance().getTime());

            System.out.println("\t\t\t\t\t\t                   Customer Information: ");
            System.out.println("");
            System.out.println("\t\t\t\t\t\tName: " +Name);
            System.out.println("\t\t\t\t\t\tCity: "+ Address);
            System.out.println("\t\t\t\t\t\tContact: " +Contact );
            System.out.println("\t\t\t\t\t\tPresented Valid ID: " +ValID);
            System.out.println("\t\t\t\t\t\tOccupation: "+Occup);
            System.out.println("");
            System.out.println("\t\t\t\t\t\tDate and Time: " +datelog );
            System.out.println("\t\t\t\t\t\t==============================================================");
				
            Receipt.add("\n" 
            + "\t\t\t\t\t\t==============================================================\n"          
            + "\t\t\t\t\t\t                        BOOKING NO. " + orderNum + "\n"
            + "\t\t\t\t\t\t==============================================================\n" 
			+ "\t\t\t\t\t\tItems: \n" + ProdList + "\n"
            + "\t\t\t\t\t\tItem/s Total: " + ftotal + " (PHP)" +
            "\n" +  "\t\t\t\t\t\tDownpayment: "+ dp + " (PHP)" + "\n" +
			"\n" +  "\t\t\t\t\t\tSchedule: "+ sched +  "\n" +
            "\n" +  "\t\t\t\t\t\t==============================================================" + 
            "\n" + 	"\t\t\t\t\t\tOutstanding balance: "+ ob + " (PHP)" +
            "\n" +  "\t\t\t\t\t\t==============================================================" +
            "\n" +  "\t\t\t\t\t\t                   Customer Information: " + "\n" +
            "\n" + "\t\t\t\t\t\tName: " + Name + 
            "\n" + "\t\t\t\t\t\tCity: "+ Address + 
            "\n" + "\t\t\t\t\t\tContact: " +Contact + 
            "\n" + "\t\t\t\t\t\tPresented Valid ID: " +ValID + 
            "\n" + "\t\t\t\t\t\tOccupation: "+Occup + "\n" +
            "\n" + "\t\t\t\t\t\tDate and Time: " +datelog  + 
            "\n" + "\t\t\t\t\t\t==============================================================" +
            "\n\n");

            //System.out.println(Receipt);
            System.out.printf("\n\n");
            System.out.print("\t\t\t\t\t\tEnter [E] to exit: ");
            choice = scan.next().charAt(0);
            if (choice =='e' || choice =='E' )
            {
                ClearScreen();
                Menu();
            }
            else
            {
                ClearScreen();
                Menu();
            }
        }
        else
        {
            price=0; 
            qty=0; 
            total=0;
            ftotal=0; 
            fprice = 0; 
            fqty = 0; 
            ClearScreen();
            Menu();
        }	
    }
	
    public static void Tree() // View transactions
    {
        char choice;

        System.out.printf("\n");
        System.out.println("\t\t\t\t\t\t==============================================================");
        System.out.println("\t\t\t\t\t\t                      TRANSACTION HISTORY                     ");
        System.out.println("\t\t\t\t\t\t==============================================================");
        System.out.printf("\n\n");

        //System.out.println(Receipt);
		
		String listArray = Receipt.toString();
		String trimList = listArray.replaceAll("\\[|\\]", ""); // Function para matanggal yung brackets nung array list.
        System.out.println(trimList);
		

        System.out.print("\t\t\t\t\t\tEnter [E] to exit: ");
        choice = scan.next().charAt(0);
        if (choice =='e' || choice == 'E')
        {
            ClearScreen();
            Menu();
        }
    }
	
    public static void ClearScreen()
    {
	
	try
	{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	} 
	catch(Exception E) 
        {
            System.out.println(E);
        }	
    }
	
	
    public static void Login()
    {
        String username, password;
                    
					
			scan.nextLine();
            String datelog = new SimpleDateFormat("\t\t\t\t\t\t|        MM/dd/yyyy  hh:mm aa          |").format(Calendar.getInstance().getTime());
            System.out.println("\t\t\t\t\t\t========================================");
            System.out.println("\t\t\t\t\t\t|        LUCKY - BERMARCOLUZI          |");
            System.out.println("\t\t\t\t\t\t|    AIRCON SERVICES BOOKING SYSTEM    |");
            System.out.println("\t\t\t\t\t\t========================================");
            System.out.println(datelog);
            System.out.println("\t\t\t\t\t\t========================================");
            System.out.println("");
            System.out.print("\t\t\t\t\t\tEnter Username:");
            username = scan.nextLine();
            System.out.println("");
            System.out.print("\t\t\t\t\t\tEnter Password:");
            password = scan.nextLine();
            System.out.println("");
            System.out.println("\t\t\t\t\t\t========================================");
            
            if(username.equals("admin") && password.equals("password")) 
            {
                ClearScreen();
                Menu();
            } 
            else 
            {
                System.out.println("Invalid username and password.");
                ClearScreen();
				Login();
            }
        
        
    }


    public static void main (String[] args)
    {
        ClearScreen();
	char let;
		
	String datelog = new SimpleDateFormat("\t\t\t\t\t\t|        MM/dd/yyyy  hh:mm aa          |").format(Calendar.getInstance().getTime());
	System.out.printf("\n\n\n");
	System.out.println("\t\t\t\t\t\t========================================");
	System.out.println("\t\t\t\t\t\t|        LUCKY - BERMARCOLUZI          |");
	System.out.println("\t\t\t\t\t\t|    AIRCON SERVICES BOOKING SYSTEM    |");
	System.out.println("\t\t\t\t\t\t========================================");
	System.out.println(datelog);
	System.out.println("\t\t\t\t\t\t========================================");
	System.out.printf("\n\n\n");
		
	System.out.print("\t\t\t\t\t\tEnter any letter to continue: " );
	let = scan.next().charAt(0);
		
	ClearScreen();
        Login();
    }
}
