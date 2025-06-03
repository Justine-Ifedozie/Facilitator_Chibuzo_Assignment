import java.util.Scanner;
public class NokiaMenu { //Opening class braces
	public static void main (String[] args) { //Opening method braces
	          Scanner keyboardInput = new Scanner(System.in); 
	          int functions = 0, phonebook = 0, options = 0, messages = 0, messagessettings = 0, setone = 0, common = 0;
	          String phoneBook = "", oPtions = "", mEssages = "", messagesSEttings = "", setOne = "", coMmon = "";

	          String menu = """
		List of menu functions 
		Press: 
		1-> Phone book
		2-> Messages
		3-> Chat
		4-> Call register
		5-> Tones
		6-> Settings
		7-> Call divert
		8-> Games
		9-> Calculator
		10-> Reminders
		11-> Clock
		12-> Profiles
		13-> SIM services
		""";

	          System.out.println(menu);

	          System.out.print("Press a number to make a selection: ");
	          functions = keyboardInput.nextInt();

	          switch (functions) { //Menu switch opening braces
		case 1: 	{ //Case one opening braces
			phoneBook = """
				Phone book
				1-> Search
				2-> Service Nos.
				3-> Add name
				4-> Erase
				5-> Edit
				6-> Assign tone
				7-> Send b'card
				8-> Option
				9-> Speed dials
				10-> Voice tags
				""";

				System.out.print(phoneBook);
				System.out.print("Press a number to make a selection: ");
				phonebook  = keyboardInput.nextInt();
				
				switch (phonebook) { //Switch phone opening braces
				         case 1: System.out.println("Search"); break;
				         case 2: System.out.println("Service Nos."); break;
				         case 3: System.out.println("Add name"); break;
				         case 4: System.out.println("Erase"); break;
				         case 5: System.out.println("Edit"); break;
				         case 6: System.out.println("Assign tone"); break;
				         case 7: System.out.println("Send b'card"); break;
				         case 8: { //Case eight opening braces
					oPtions = """
					1-> Type of view
					2-> Memory status
						""";
					System.out.println(oPtions);
					System.out.print("Press a number to make a selection: ");
					options = keyboardInput.nextInt();
						switch (options) { //Switch options opening braces
						        case 1: { System.out.println("Type of view"); } break;
						        case 2: { System.out.println("Memory status"); } break;
						        default: break;
						         } //Switch options closing braces
					} //Case eight closing braces

				         case 9: { System.out.println("Speed dials"); } break;
				         case 10: { System.out.println("Voice tags"); } break;
				        default: break;
					} //Switch phone closing braces

			} //Case one closing braces

		case 2: { //Case two opening braces
			mEssages = """
			1-> Write messages
			2-> Inbox
			3-> Outbox
			4-> Picture messages
			5-> Templates
			6-> Smileys
			7-> Message settings
			8-> Info service
			9-> Voice mailbox number
			10-> Service command editor
				""";
			System.out.print(mEssages);
			System.out.print("Press a number to make a selection: ");
			messages = keyboardInput.nextInt();

			switch (messages) { //Switch  opening braces
			        case 1: System.out.println("Write messages"); break;
			        case 2: System.out.println("Inbox"); break;
			        case 3: System.out.println("Outbox"); break;
			        case 4: System.out.println("Picture messages"); break;
			        case 5: System.out.println("Templates"); break;
			        case 6: System.out.println("Smileys"); break;
			        case 7: { //Case messagessettings opening braces
				messagesSEttings = """
				1-> Set 1
				2-> Common 
					""";
				 System.out.print(messagesSEttings);
				 System.out.print("Press a number to make a selection: ");
				  messagessettings = keyboardInput.nextInt();
				
				  switch (messagessettings) { //Switch messagessettings opening braces
					case 1: { //	Case open
						setOne = """
						1-> Message centre number
						2-> Messages sent as
						3-> Message validity
							""";
						System.out.println(setOne); 
						System.out.print("Press a number to make a selection: "); 
				 		setone = keyboardInput.nextInt();

							switch (setone) { //Switch setone opening braces
							case 1: System.out.println("Message centre number"); break;
							case 2: System.out.println("Messages sent as"); break;
							case 3: System.out.println("Message validity"); break;
							default: break;
								} //Switch setone closing braces
						} //Case close

					case 2:  { //	Case open
						coMmon = """
						1-> Delivery reports
						2-> Reply via same centre
						3-> Character support
							""";
						System.out.println(coMmon); break;
						System.out.print("Press a number to make a selection: "); 
				 		common = keyboardInput.nextInt();

							switch (common) { //Switch common opening braces
							case 1: System.out.println("Delivery reports"); break;
							case 2: System.out.println("Reply via same centre"); break;
							case 3: System.out.println("Character support"); break;
							default: break;
								} //Switch setone closing braces 

						} Case close 

						} //Switch messagessettings closing braces

					} //Case messagessettings closing braces

			        case 8: System.out.println("Info service"); break;
			        case 9: System.out.println("Voice mailbox number"); break;
			        case 10: System.out.println("Service command editor"); break;
			        default: break;
		
				} //Switch  closing braces
			} //Case two closing braces


		case 3: 	break;

		case 4: 	 break;

		case 5:  	break;

		case 6:  	break;

		case 7:  	break;

		case 8:  	break;

		case 9:  	break;

		case 10:  	break;

		case 11:  	break;

		case 12:  	break;

		case 13:  	break;

		default:  	break;

		} //Menu switch closing braces

	} //Closing method braces

} //Closing class braces




