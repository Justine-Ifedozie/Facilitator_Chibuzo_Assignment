import java.util.Scanner;
public class NokiaMenuCorrectionPro2 { //Opening class braces
	public static void main (String[] args) { //Opening method braces
	          Scanner keyboardInput = new Scanner(System.in); 


//List of menu functions
	          String mEnu = """
		List of menu functions 

		Press: 
		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		""";

//1 Phone book list
	       String phoneBook = """
		Phone book

		Press: 
		1. Search
		2. Service Nos.
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Option
		9. Speed dials
		10. Voice tags
		""";
//Number 8 under phonebook
	       String oPtions = """
		Options

		Press: 
		1. Type of view
		2. Memory status
		0. List of menu functions
			""";
//2 Messages list
	       String mEssages = """
		Messages

		Press: 
		1. Write messages
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command editor
			""";
//Number 7 under messages
	String messagesSEttings = """
		Messsage settings

		Press: 
		1. Set 1
		2. Common 
			""";
//Set 1 under messages settings
	       String setOne = """
		Set 1

		Press: 
		1. Message centre number
		2. Messages sent as
		3. Message validity
			""";
//Common under messages settings
	       String coMmon = """
		Common

		Press: 
		1. Delivery reports
		2. Reply via same centre
		3. Character support
			""";
//4 Call register list
	       String callRegister = """
		Call Register

		Press: 
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call cost
		7. Call cost settings
		8. Prepaid credit
			""";
// Show call duration under (Call register)
	       String showCallDuration = """
		Show call duration

		Press: 
		1. Last call duration
		2. All calls' duration
		3. Received calls' duration
		4. Dialled calls' duration
		5. Clear timers
			""";

// Show call cost under (Call register)
	       String showCallCost = """
		Show call costs

		Press: 
		1. Last call cost
		2. All calls' cost
		3. Clear counters
			""";
//Call cost settings under (Call register)
	       String callCostSettings = """
		Call cost settings

		Press: 
		1. Call cost limit
		2. Show costs in
			""";
//5 Tones list
	       String tOnes = """
		Tones

		Press: 
		1. Ringing tones
		2. Ringing volume
		3. Incoming call alert
		4. Composer
		5. Message alert tone
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver
			""";

//6 Settings
	       String sEttings = """
		Settings

		Press: 
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
			""";
//Call settings under (Settings)
	       String callSettings = """
		Call settings

		Press: 
		1. Automatic redial
		2. Speed dialling
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer
			""";
//Phone settings under (Settings)
	       String phoneSettings = """
		Phone settings

		Press: 
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Confirm SIM service actions
			""";
//Security settings under (Settings)
	       String securitySettings = """
		Security settings

		Press: 
		1. PIN code request
		2. Call barring service
		3. Fixed dialling
		4. Closed user group
		5. Phone security
		6. Change access codes 
			""";
//11 Clock lists
	       String cLock = """
		Clock

		Press: 
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time
			""";

//Starting point after variables declaration
while (true) {
int menu;
	          System.out.println(mEnu);
	          System.out.print("Press a number to make a selection: ");
	            menu = keyboardInput.nextInt();

	          switch (menu) { //Menu switch opening braces
		case 1-> { //Case one opening braces
			System.out.print(phoneBook);
			System.out.print("Press a number to make a selection: ");
			int phonebook = keyboardInput.nextInt();

				switch (phonebook) { //Switch phone opening braces
				         case 1-> System.out.println("Search");
				         case 2-> System.out.println("Service Nos."); 
				         case 3-> System.out.println("Add name"); 
				         case 4-> System.out.println("Erase"); 
				         case 5-> System.out.println("Edit"); 
				         case 6-> System.out.println("Assign tone");
				         case 7-> System.out.println("Send b'card");
				         case 8-> { //Case eight opening braces
					System.out.println(oPtions);
					System.out.print("Press a number to make a selection: ");
					int options = keyboardInput.nextInt();

						switch (options) { //Switch options opening braces
						        case 1 -> System.out.println("Type of view");
						        case 2 -> System.out.println("Memory status"); 


						        case 0 -> System.out.print("mEnu");

						         } //Switch options closing braces

					} //Case eight closing braces
				         case 9-> { System.out.println("Speed dials"); }
				         case 10-> { System.out.println("Voice tags"); } 
				        default-> 
					} //Switch phone closing braces

			} //Case one closing braces

		case 2: { //Case two opening braces
			System.out.print(mEssages);
			System.out.print("Press a number to make a selection: ");
			int messages = keyboardInput.nextInt();

			         switch (messages) { //Switch  opening braces
			        	case 1-> System.out.println("Write messages"); 
			       	case 2-> System.out.println("Inbox"); 
			     	case 3-> System.out.println("Outbox"); 
			  	case 4-> System.out.println("Picture messages"); 
			  	case 5-> System.out.println("Templates"); 
			  	case 6-> System.out.println("Smileys"); 
			   	case 7-> {//Case messagessettings opening braces
					System.out.print(messagesSEttings);
					System.out.print("Press a number to make a selection: ");
					int messagessettings = keyboardInput.nextInt();

				 		 switch (messagessettings) {//Switch messagessettings opening braces
							case 1-> {//SetOne opening Case
								System.out.print(setOne);
								System.out.print("Press a number to make a selection: ");
								 int setone = keyboardInput.nextInt();

									switch (setone) { //Switch setone opening braces
										case 1-> System.out.println("Message centre number");
										case 2-> System.out.println("Messages sent as"); 
										case 3-> System.out.println("Message validity"); 
										default->
											} //SetOne switch closing Case
								} //SetOne closing Case
							case 2-> {//Common opening Case
								System.out.print(coMmon);
								System.out.print("Press a number to make a selection: ");
								 int common = keyboardInput.nextInt();

									switch (common) { //Switch common opening braces
										case 1-> System.out.println("Delivery reports")
										case 2-> System.out.println("Reply via same centre"); 
										case 3-> System.out.println("Character support"); 
										default->
										} //Switch common closing braces 

								} //Common closing case close 
								} //Messagessettings closing Switch

					}//Case messagessettings closing braces

			      	case 8-> System.out.println("Info service"); 
			       	case 9-> System.out.println("Voice mailbox number"); 
			       	case 10-> System.out.println("Service command editor"); 
			        	default->
				} //Switch  closing braces
			} //Case two closing braces

		case 3-> { //case three opening brace
		System.out.print("Chat"); 
		} //Case three closing brace

		case 4-> { //case four opening brace
			System.out.print(callRegister);
			System.out.print("Press a number to make a selection: ");
			int callregister = keyboardInput.nextInt();

			         switch (callregister) { //Switch  opening braces
			        	case 1-> System.out.println("Missed calls");
			       	case 2-> System.out.println("Received calls"); 
			     	case 3-> System.out.println("Dialled numbers"); 
			  	case 4-> System.out.println("Erase recent calls list"); 
			  	case 5-> {//Show call duration opening Case
					System.out.print(showCallDuration);
					System.out.print("Press a number to make a selection: ");
					 int showcallduration = keyboardInput.nextInt();

						switch (showcallduration) { //Switch Show call duration opening braces
							case 1-> System.out.println("Last call cost"); 
							case 2-> System.out.println("All calls' cost"); 
							case 3-> System.out.println("Received calls' duration"); 
							case 4-> System.out.println("Dialled calls' duration"); 
							case 5-> System.out.println("Clear timers"); 
							default->
							} //Switch Show call duration closing braces 
					}//Show call duration closing braces

			      	case 6-> { //case six opening brace
					System.out.print(showCallCost);
					System.out.print("Press a number to make a selection: ");
					int showcallcost = keyboardInput.nextInt(); 

						switch (showcallcost) { //Switch Show call cost opening braces
							case 1-> System.out.println("Last call cost"); 
							case 2-> System.out.println("All calls' cost"); 
							case 3-> System.out.println("Clear counters"); 
							default->
							} //Switch Show call cost closing braces 
					}//Show call cost closing braces

			       	case 7->  { //case seven opening brace
					System.out.print(callCostSettings);
					System.out.print("Press a number to make a selection: ");
					int callcostsettings = keyboardInput.nextInt(); 

						switch (callcostsettings) { //Switch call cost settings opening braces
							case 1: System.out.println("Call cost limit");
							case 2: System.out.println("Show costs in");
							default->
							} //Switch call cost settings closing braces 
					}//Call cost settings closing braces

			       	case 8: System.out.println("Prepaid credit"); 
				default->
				} //Switch  closing braces
		} //Case four closing brace
		default->

		case 5-> { //case five opening brace
			System.out.print(tOnes);
			System.out.print("Press a number to make a selection: ");
			int tones = keyboardInput.nextInt();

			         switch (tones) { //Switch  opening braces
			        	case 1-> System.out.println("Ringing tone"); 
			       	case 2-> System.out.println("Ringing volume"); 
			     	case 3-> System.out.println("Incoming call alert"); 
			  	case 4-> System.out.println("Composer"); 
			       	case 5-> System.out.println("Message alert tone");
			     	case 6-> System.out.println("Keypad tones"); 
			  	case 7-> System.out.println("Warning and game tones");
			       	case 8-> System.out.println("Vibrating alert"); 
			       	case 9-> System.out.println("Screen saver"); 
				default->
				} //Switch  closing braces
		} //Case five closing brace

		case 6-> { //case six opening brace
			System.out.print(sEttings);
			System.out.print("Press a number to make a selection: ");
			int settings = keyboardInput.nextInt();

			         switch (settings) { //Switch  opening braces
			        	case 1-> {//Call settings opening Case
					System.out.print(callSettings);
					System.out.print("Press a number to make a selection: ");
					 int callsettings = keyboardInput.nextInt();

						switch (callsettings) { //Switch Call settings opening braces
							case 1-> System.out.println("Automatic redial"); 
							case 2-> System.out.println("Speed dialling"); 
							case 3-> System.out.println("Call waiting options"); 
							case 4-> System.out.println("Own number sending"); 
							case 5-> System.out.println("Phone line in use"); 
							case 6-> System.out.println("Automatic answer"); 
							default->
							} //Switch call settings closing braces 
					}//Call settings closing Case

			       	case 2-> {//Phone settings opening Case
					System.out.print(phoneSettings);
					System.out.print("Press a number to make a selection: ");
					 int phonesettings = keyboardInput.nextInt();

						switch (phonesettings) { //Switch phone settings opening braces
							case 1-> System.out.println("Language");
							case 2-> System.out.println("Cell info display"); 
							case 3-> System.out.println("Welcome note"); 
							case 4-> System.out.println("Network selection"); 
							case 5-> System.out.println("Lights"); 
							case 6-> System.out.println("Confirm SIM service actions"); 
							default->
							} //Switch phone settings closing braces 
					} //Phone settings closing Case

			     	case 3-> {//Security settings opening Case
					System.out.print(securitySettings);
					System.out.print("Press a number to make a selection: ");
					 int securitysettings = keyboardInput.nextInt();

						switch (securitysettings) { //Switch security settings opening braces
							case 1-> System.out.println("PIN code request"); 
							case 2-> System.out.println("Call barring service"); 
							case 3-> System.out.println("Fixed dialling"); 
							case 4-> System.out.println("Closed user group"); 
							case 5-> System.out.println("Phone security"); 
							case 6-> System.out.println("Change access codes"); 
							default->
							} //Switch security settings closing braces 
					} //Security settings closing Case

			  	case 4-> System.out.println("Restore factory settings"); 
				default->
				} //Switch  closing braces
		} //Case six closing brace

		case 7-> { // Call divert opening case
			System.out.println("Call divert"); 
				} //Call divert closing braces

		case 8-> { //case eight opening brace
			System.out.println("Games"); 
		} //Case eight closing brace

		case 9-> { //case nine opening brace
			System.out.println("Calculator"); 
		} //Case nine closing brace

		case 10-> { //case ten opening brace
			System.out.println("Reminders"); 
		} //Case ten closing brace

		case 11-> { //case eleven opening brace
			System.out.print(cLock);
			System.out.print("Press a number to make a selection: ");
			int clock = keyboardInput.nextInt();

			         switch (clock) { //Switch  opening braces
			        	case 1-> System.out.println("Alarm clock"); 
			       	case 2-> System.out.println("Clock settings"); 
			     	case 3-> System.out.println("Date setting"); 
			  	case 4-> System.out.println("Stopwatch"); 
			       	case 5-> System.out.println("Countdown timer"); 
			     	case 6-> System.out.println("Auto update of date and time"); 
				default->
				} //Switch  closing braces
		} //Case eleven closing brace

		case 12-> { //case twelve opening brace
			System.out.println("Profiles"); 
		} //Case twelve closing brace

		case 13-> { //case thirteen opening brace
			System.out.println("SIM services"); 
		} //Case thirteen closing brace

			} //Menu switch closing braces

}

		} //Closing method braces

} //Closing class braces



