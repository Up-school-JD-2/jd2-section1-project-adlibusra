package jd2section1project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
	public static final List<User> USERS= new ArrayList<>();
	
	public static void generateUser() {
		
		USERS.add(new User("adlibusra","1234","adlibusra@gmail.com"));
		USERS.add(new User("sumeyyedyry","1234","sumeyyeduru@gmail.com"));
		USERS.add(new User("ilayda","1234","ilayda@gmail.com"));
	}
	
	public static List<User>  listUser(){
		List<User> userList=new ArrayList();
		for(User user: USERS) {
			userList.add(user);
		}
		return userList;
	}
	
	public User searchUser(String userName) {
		User sarchedUser=null;
		for(User user: USERS) {
			if(user.getUserName().equalsIgnoreCase(userName)) {
				if(user instanceof User ) {
					sarchedUser=user;
					break;
				}
			}
	
		}
		return sarchedUser;
	}

	public  static void add(User user) {
		USERS.add(user);
		System.out.println("Kullanıcı eklendi");
	}
	
	public  static void remove(String  userMail) {
		// TODO Auto-generated method stub
	
		for(var user: USERS) {
		
			if(user.getEmail().equalsIgnoreCase(userMail)) {
				USERS.remove(user);
			break;
			}	
			else if(user.getEmail()!=userMail ) {
				System.out.println("Silinecek kullanıcı bulunamadı");
				break;
			}
			System.out.println("Kullanıcı silindi");
	}
	
}

	public static void checkUserInfo(String userName, String password) {
		
		//List<User> userList=new ArrayList();
		for(User user: USERS) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				 System.out.println( "Hoşgeldiniz " + user.getUserName());
				 break;
			}
			else {
				 System.out.println( "Kullanıcı adı veya şifre yanlış ");
			}
		}
		
	}

	/*
	 * public static boolean login() { Scanner scan = new Scanner(System.in);
	 * System.out.println( "Kullanıcı Adı giriniz"); String searchUserName=
	 * scan.nextLine(); boolean result=false; boolean resultPassword=false;
	 * 
	 * //List<User> userList=new ArrayList(); for(User user: USERS) { String
	 * name=user.getUserName(); String password=user.getPassword();
	 * result=name.contains(searchUserName); resultPassword=name.contains(password);
	 * if(result && resultPassword) { System.out.println("Kullanıcı: " +
	 * user.getUserName()); System.out.println("Kullanıcı başarıyla giriş yaptı  "
	 * ); return true; } } return false; }
	 */

	
}
