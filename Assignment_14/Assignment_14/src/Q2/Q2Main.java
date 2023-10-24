package Q2;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2Main {

	public static int menu() {
		int choice;
		System.out.println("Menu");
		System.out.println("1.Add New User");
		System.out.println("2.Display all User");
		System.out.println("3.Update User");
		System.out.println("4.Delete User");
		System.out.println("5.Display all User of specific id");
		System.out.println("6.Change vote status");
		System.out.println("0.Exit");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		List<User> list=new ArrayList<User>();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				System.out.println("Adding the User!");
				try (UserDao dao = new UserDao()) {
					User u = new User();

					System.out.println("Enter First Name:");
					u.setFirstName(sc.next());
					System.out.println("Enter Last Name: ");
					u.setLastName(sc.next());
					System.out.println("Enter Email Address:");
					u.setEmail(sc.next());
					System.out.println("Enter Password: ");
					u.setPassword(sc.next());
					System.out.println("Enter Date of Birth in dd-mm-yyyy");
					u.setDate(sc.next());
					int cnt = dao.insertUser(u);
					System.out.println("User Added: " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				System.out.println("displaying all Users!");
				try (UserDao dao = new UserDao()) {
					list=dao.displayAllUsers();
					for (User user : list) {
						System.out.println(user);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

			}
			break;
			case 3:{
				try(UserDao dao=new UserDao()) {
				System.out.println("Updating user:");
				System.out.println("Enter userId to update!");
				int id=sc.nextInt();
				System.out.println("Enter first name");
				String fname=sc.next();
				System.out.println("Enter last name");
				String lname=sc.next();
				System.out.println("Enter email");
				String email=sc.next();
				System.out.println("Enter password");
				String pwd=sc.next();
				System.out.println("Enter dob in dd-mm-yyyy format");
				String dob=sc.next();
				int status=0;
				String role="user";
				User u3=new User(id,fname,lname,email,pwd,dob,status,role);
				int c = dao.updateUser(u3);
				System.out.println("Rows Update: "+c);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			break;
			
			case 4:
			{
				try(UserDao dao=new UserDao()){
					System.out.println("Enter user id to delete the record");
					int id=sc.nextInt();
					int c=dao.deleteUser(id);
					System.out.println("Rows deleted: "+c);
					
				}
				catch(Exception e)
				{
					
				}
			}
			break;

		}
	}
	}

}

