package pimcmd;

import java.util.*;
public class PIMManager {

	public static void main(String[] args) {

		List<PIMEntity> entity = new ArrayList<>();
		
		System.out.println("Welcome to PIM");
		String command,commandd,commanddd;
		int i = 1; 
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		for(; ; ) {
			System.out.println("---Enter a command (suported commands are List Create Save Load");
			command = input.nextLine();

			if(command.equals("List")) {
				System.out.println("There are " + entity.size()  + " " + "items.");
				
				if(entity.size() == 0)  continue;
				else {
					Iterator<PIMEntity> it = entity.iterator();
					while(it.hasNext()) {
						PIMEntity enity = it.next();
						System.out.println("Item " + i++ + ": " + enity.toString());
					}
				}
			}
			
			if(command.equals("Create")) {
				System.out.println("Enter an item type ( todo, note, contact or appointment )");
				commanddd = input.nextLine();
				if(commanddd.equals("todo")) {
					PIMTodo todo = new PIMTodo();
					entity.add(todo);
					
					System.out.println("Enter date for todo item: ");
					commandd = input.nextLine();
					todo.fromString(commandd);
					
					System.out.println("Enter todo text:");
					commandd = input.nextLine();
					todo.fromString(commandd);
					
					System.out.println("Enter todo priority:");
					commandd = input.nextLine();
					todo.setPriority(commandd);
				}
				if(commanddd.equals("note")) {
					PIMNote note = new PIMNote();
					entity.add(note);
										
					System.out.println("Enter note text:");
					commandd = input.nextLine();
					note.fromString(commandd);
					
					System.out.println("Enter note priority:");
					commandd = input.nextLine();
					note.setPriority(commandd);
				}
				if(commanddd.equals("appointment")) {
					PIMAppointment appointment = new PIMAppointment();
					entity.add(appointment);
					
					System.out.println("Enter date for appointment item: ");
					commandd = input.nextLine();
					appointment.fromString(commandd);
					
					System.out.println("Enter appointment description:");
					commandd = input.nextLine();
					appointment.fromString(commandd);
					
					System.out.println("Enter appointment priority:");
					commandd = input.nextLine();
					appointment.setPriority(commandd);
				}
				if(commanddd.equals("contact")) {
					PIMContact contact = new PIMContact();
					entity.add(contact);
					
					System.out.println("Enter contact text:");
					commandd = input.nextLine();
					contact.fromString(commandd);
					
					System.out.println("Enter contact priority:");
					commandd = input.nextLine();
					contact.setPriority(commandd);
				}
			}
			
			if(command.equals("Save")) {
				System.out.println("Items have been saved.");
			}
			
			if(command.equals("Quit")) {
				break;
			}
		}
	}

}
