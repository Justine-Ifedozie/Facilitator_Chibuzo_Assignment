import java.util.Scanner;
public class NokiaPhone { //Opening class braces
	public static void main (String[] args) { //Opening method braces
	          Scanner keyboardInput = new Scanner(System.in); 

		boolean meNU = true;
		while (meNU) {


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
		0. To switch off your phone
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
		0. Back
		""";
//Number 8 under phonebook
	       String oPtions = """
		Options

		Press: 
		1. Type of view
		2. Memory status
		0. Back
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
		0. Back
			""";
//Number 7 under messages
	String messagesSEttings = """
		Messsage settings

		Press: 
		1. Set 1
		2. Common 
		0. Back
			""";
//Set 1 under messages settings
	       String setOne = """
		Set 1

		Press: 
		1. Message centre number
		2. Messages sent as
		3. Message validity
		0. Back
			""";
//Common under messages settings
	       String coMmon = """
		Common

		Press: 
		1. Delivery reports
		2. Reply via same centre
		3. Character support
		0. Back
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
		0. Back
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
		0. Back
			""";

// Show call cost under (Call register)
	       String showCallCost = """
		Show call costs

		Press: 
		1. Last call cost
		2. All calls' cost
		3. Clear counters
		0. Back
			""";
//Call cost settings under (Call register)
	       String callCostSettings = """
		Call cost settings

		Press: 
		1. Call cost limit
		2. Show costs in
		0. Back
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
		0. Back
			""";

//6 Settings
	       String sEttings = """
		Settings

		Press: 
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
		0. Back
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
		0. Back
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
		0. Back
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
		0. Back
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
		0. Back
			""";

//Starting point after variables declaration

	          System.out.println(mEnu);
	          System.out.print("Press a number to make a selection between 1 - 13: ");
	          int menu = keyboardInput.nextInt();

	if (menu < 0 || menu > 13) {
	          System.out.println("You entered an invalid option!! Kindly try again or press 0 for pidgin");
	          System.out.print("Press a number to make a selection between 1 - 13: ");
	          menu = keyboardInput.nextInt();
		}


	          switch (menu) { //Menu switch opening braces
		case 1: { 
			boolean phonebOOk = true;
			while (phonebOOk) {

			//Case one opening braces
			System.out.println(phoneBook);
			System.out.print("Press a number to make a selection: ");
			int phonebook = keyboardInput.nextInt(); 

				switch (phonebook) { //Switch phone opening braces
				         case 1: System.out.println("Search"); break;
				         case 2: System.out.println("Service Nos."); break;
				         case 3: System.out.println("Add name"); break;
				         case 4: System.out.println("Erase"); break;
				         case 5: System.out.println("Edit"); break;
				         case 6: System.out.println("Assign tone"); break;
				         case 7: System.out.println("Send b'card"); break;
				         case 8: { //Case eight opening braces

					boolean opTION = true;
					while (opTION) {

					System.out.println(oPtions);
					System.out.print("Press a number to make a selection: ");
					int options = keyboardInput.nextInt();

						switch (options) { //Switch options opening braces
						        case 1: { System.out.println("Type of view"); } break;
						        case 2: { System.out.println("Memory status"); } break;
						        case 0: opTION = false; break;
						        default: { System.out.println("Invalid input"); } break;
						         } //Switch options closing braces
						} //While case
					} //Case eight closing braces
				break;
				         case 9: { System.out.println("Speed dials"); } break;
				         case 10: { System.out.println("Voice tags"); } break;
				        case 0: phonebOOk = false;
				         default: { System.out.println("Invalid input"); } break;

					} //Switch phone closing braces

				if (phonebook < 0 || phonebook > 10) {
				System.out.println("You entered an invalid option, kindly enter a positive selection");
					} //Phone book if closing brace
				} //Phonebook while loop closing brace

			} //Case one closing braces
		break;

		case 2: { //Case two opening braces
			boolean mESSages = true;
				while (mESSages) {
			
			System.out.print(mEssages);
			System.out.print("Press a number to make a selection: ");
			int messages = keyboardInput.nextInt();

			         switch (messages) { //Switch  opening braces
			        	case 1: System.out.println("Write messages"); break;
			       	case 2: System.out.println("Inbox"); break;
			     	case 3: System.out.println("Outbox"); break;
			  	case 4: System.out.println("Picture messages"); break;
			  	case 5: System.out.println("Templates"); break;
			  	case 6: System.out.println("Smileys"); break;
			   	case 7: {//Case messagessettings opening braces
					boolean mESSagessett = true;
					while (mESSagessett) {

					System.out.print(messagesSEttings);
					System.out.print("Press a number to make a selection: ");
					int messagessettings = keyboardInput.nextInt();

				 		 switch (messagessettings) {//Switch messagessettings opening braces
							case 1: {//SetOne opening Case
								System.out.print(setOne);
								System.out.print("Press a number to make a selection: ");
								 int setone = keyboardInput.nextInt();

									switch (setone) { //Switch setone opening braces
										case 1: System.out.println("Message centre number"); break;
										case 2: System.out.println("Messages sent as"); break;
										case 3: System.out.println("Message validity"); break;
										default: System.out.println("Invalid input"); break;
											} //SetOne switch closing Case
								} //SetOne closing Case
							case 2: {//Common opening Case
								System.out.print(coMmon);
								System.out.print("Press a number to make a selection: ");
								 int common = keyboardInput.nextInt();

									switch (common) { //Switch common opening braces
										case 1: System.out.println("Delivery reports"); break;
										case 2: System.out.println("Reply via same centre"); break;
										case 3: System.out.println("Character support"); break;
										default: System.out.println("Invalid input"); break;
										} //Switch common closing braces 

								} //Common closing case close 
							case 0: mESSagessett = false; break;
								} //Messagessettings closing Switch
						} //while

					}//Case messagessettings closing braces
				break;

			      	case 8: System.out.println("Info service"); break;
			       	case 9: System.out.println("Voice mailbox number"); break;
			       	case 10: System.out.println("Service command editor"); break;
			        	case 0: mESSages = false; break;

				} //Switch  closing braces

				if (messages < 0 || messages > 10) {
				System.out.println("You entered an invalid option, kindly enter a positive selection");
					} //Phone book if closing brace
				} //Messages while loop closing brace

			} //Case two closing braces
		break;

		case 3: { //case three opening brace
			boolean cHat = true;
			while (cHat) {

			System.out.println("Chat ");
			System.out.print(" Press 0 to return to the mainmenu: ");
			int chat = keyboardInput.nextInt();

			         switch (chat) { //Switch  opening braces
			        	case 0: cHat = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			} //While loop

		} //Case three closing brace
	break;

		case 4: { //case four opening brace

			boolean cALLreGister = true;
			while (cALLreGister) {

			System.out.print(callRegister);
			System.out.print("Press a number to make a selection: ");
			int callregister = keyboardInput.nextInt();

			         switch (callregister) { //Switch  opening braces
			        	case 1: System.out.println("Missed calls"); break;
			       	case 2: System.out.println("Received calls"); break;
			     	case 3: System.out.println("Dialled numbers"); break;
			  	case 4: System.out.println("Erase recent calls list"); break;
			  	case 5: {//Show call duration opening Case
					System.out.print(showCallDuration);
					System.out.print("Press a number to make a selection: ");
					 int showcallduration = keyboardInput.nextInt();

						switch (showcallduration) { //Switch Show call duration opening braces
							case 1: System.out.println("Last call cost"); break;
							case 2: System.out.println("All calls' cost"); break;
							case 3: System.out.println("Received calls' duration"); break;
							case 4: System.out.println("Dialled calls' duration"); break;
							case 5: System.out.println("Clear timers"); break;
							default: System.out.println("Invalid input"); break;
							} //Switch Show call duration closing braces 
					}//Show call duration closing braces
					break;
			      	case 6: { //case six opening brace
					System.out.print(showCallCost);
					System.out.print("Press a number to make a selection: ");
					int showcallcost = keyboardInput.nextInt(); 

						switch (showcallcost) { //Switch Show call cost opening braces
							case 1: System.out.println("Last call cost"); break;
							case 2: System.out.println("All calls' cost"); break;
							case 3: System.out.println("Clear counters"); break;
							default: System.out.println("Invalid input"); break;
							} //Switch Show call cost closing braces 
					}//Show call cost closing braces
					break;

			       	case 7:  { //case seven opening brace
					System.out.print(callCostSettings);
					System.out.print("Press a number to make a selection: ");
					int callcostsettings = keyboardInput.nextInt(); 

						switch (callcostsettings) { //Switch call cost settings opening braces
							case 1: System.out.println("Call cost limit"); break;
							case 2: System.out.println("Show costs in"); break;
							default: System.out.println("Invalid input"); break;
							} //Switch call cost settings closing braces 
					}//Call cost settings closing braces

			       	case 8: System.out.println("Prepaid credit"); break;
				case 0: cALLreGister = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
		} // While closing brace
		} //Case four closing brace
		default: System.out.println("Invalid input"); break;

		case 5: { //case five opening brace
			boolean tONEs = true;
			while (tONEs) {

			System.out.print(tOnes);
			System.out.print("Press a number to make a selection: ");
			int tones = keyboardInput.nextInt();

			         switch (tones) { //Switch  opening braces
			        	case 1: System.out.println("Ringing tone"); break;
			       	case 2: System.out.println("Ringing volume"); break;
			     	case 3: System.out.println("Incoming call alert"); break;
			  	case 4: System.out.println("Composer"); break;
			       	case 5: System.out.println("Message alert tone"); break;
			     	case 6: System.out.println("Keypad tones"); break;
			  	case 7: System.out.println("Warning and game tones"); break;
			       	case 8: System.out.println("Vibrating alert"); break;
			       	case 9: System.out.println("Screen saver"); break;
				case 0: tONEs = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			}//While loop
		} //Case five closing brace
		break;	

		case 6: { //case six opening brace
			boolean sETTing = true;
			while (sETTing) {

			System.out.print(sEttings);
			System.out.print("Press a number to make a selection: ");
			int settings = keyboardInput.nextInt();

			         switch (settings) { //Switch  opening braces
			        	case 1: {//Call settings opening Case
				boolean callsETTing = true;
				while (callsETTing) {
					
					System.out.print(callSettings);
					System.out.print("Press a number to make a selection: ");
					 int callsettings = keyboardInput.nextInt();

						switch (callsettings) { //Switch Call settings opening braces
							case 1: System.out.println("Automatic redial"); break;
							case 2: System.out.println("Speed dialling"); break;
							case 3: System.out.println("Call waiting options"); break;
							case 4: System.out.println("Own number sending"); break;
							case 5: System.out.println("Phone line in use"); break;
							case 6: System.out.println("Automatic answer"); break;
							case 0: callsETTing = false; break;
							default: System.out.println("Invalid input"); break;
							} //Switch call settings closing braces 
						} //While loop
					}//Call settings closing Case
					break;

			       	case 2: {//Phone settings opening Case
					System.out.print(phoneSettings);
					System.out.print("Press a number to make a selection: ");
					 int phonesettings = keyboardInput.nextInt();

						switch (phonesettings) { //Switch phone settings opening braces
							case 1: System.out.println("Language"); break;
							case 2: System.out.println("Cell info display"); break;
							case 3: System.out.println("Welcome note"); break;
							case 4: System.out.println("Network selection"); break;
							case 5: System.out.println("Lights"); break;
							case 6: System.out.println("Confirm SIM service actions"); break;
							default: System.out.println("Invalid input"); break;
							} //Switch phone settings closing braces 
					} //Phone settings closing Case
					break;
			     	case 3: {//Security settings opening Case
					System.out.print(securitySettings);
					System.out.print("Press a number to make a selection: ");
					 int securitysettings = keyboardInput.nextInt();

						switch (securitysettings) { //Switch security settings opening braces
							case 1: System.out.println("PIN code request"); break;
							case 2: System.out.println("Call barring service"); break;
							case 3: System.out.println("Fixed dialling"); break;
							case 4: System.out.println("Closed user group"); break;
							case 5: System.out.println("Phone security"); break;
							case 6: System.out.println("Change access codes"); break;
							default: System.out.println("Invalid input"); break;
							} //Switch security settings closing braces 
					} //Security settings closing Case

			  	case 4: System.out.println("Restore factory settings"); break;
				case 0: sETTing = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			}//while loop closing
		} //Case six closing brace
		break;

		case 7: { // Call divert opening case
			boolean dIVErt = true;
			while (dIVErt) {

			System.out.println("Call divert"); 
			System.out.print("Press 0 to return to the mainmenu: ");
			int divert = keyboardInput.nextInt();

			         switch (divert) { //Switch  opening braces
			        	case 0: dIVErt = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			} //While loop

				} //Call divert closing braces
	break;

		case 8: { //case eight opening brace
			boolean gAMes = true;
			while (gAMes) {

			System.out.println("Thanks for playing our Games");
			System.out.print("Press 0 to return to the mainmenu: ");
			int games = keyboardInput.nextInt();

			         switch (games) { //Switch  opening braces
			        	case 0: gAMes = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			} //While loop
		} //Case eight closing brace

	break;

		case 9: { //case nine opening brace
			boolean cALculator = true;
			while (cALculator) {

			System.out.println("Calculator"); 
			System.out.print("Press 0 to return to the mainmenu: ");
			int caLCUlator = keyboardInput.nextInt();

			         switch (caLCUlator) { //Switch  opening braces
			        	case 0: cALculator = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			} //While loop

		} //Case nine closing brace
	break;
		case 10: { //case ten opening brace
			boolean rEMInders = true;
			while (rEMInders) {

			System.out.println("Reminders");
			System.out.print("Press 0 to return to the mainmenu: ");
			int remiNder = keyboardInput.nextInt();

			         switch (remiNder) { //Switch  opening braces
			        	case 0: rEMInders = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			} //While loop
		} //Case ten closing brace
	break;

		case 11: { //case eleven opening brace
			boolean clOCK = true;
			while (clOCK) {

			System.out.print(cLock);
			System.out.print("Press a number to make a selection: ");
			int clock = keyboardInput.nextInt();

			         switch (clock) { //Switch  opening braces
			        	case 1: System.out.println("Alarm clock"); break;
			       	case 2: System.out.println("Clock settings"); break;
			     	case 3: System.out.println("Date setting"); break;
			  	case 4: System.out.println("Stopwatch"); break;
			       	case 5: System.out.println("Countdown timer"); break;
			     	case 6: System.out.println("Auto update of date and time"); break;
				case 0: clOCK = false; break;
				default: System.out.println("Invalid input"); break;
				} //Switch  closing braces
			} //While loop
		} //Case eleven closing brace

		case 12: { //case twelve opening brace
			System.out.println("Profiles"); break;
		} //Case twelve closing brace

		case 13: { //case thirteen opening brace
			System.out.println("SIM services"); break;
		} //Case thirteen closing brace

		case 0: { //case zero opening brace
			meNU = false; return;
		} //Case zero closing brace

			} //Menu switch closing braces


	if (menu < 0 || menu > 13) {
	          System.out.println("You entered an invalid option!! Kindly try again or press 0 for pidgin");
	          //System.out.println(mEnu);
	          //System.out.print("Press a number to make a selection: ");
	          //menu = keyboardInput.nextInt();
		}
	

}//While loop closing brace

		} //Closing method braces

} //Closing class braces




