package jd2section1project;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MovieService.generateMovie();
UserService.generateUser();
UserService userService= new UserService();
MovieService movieService= new MovieService();
Scanner sc=new Scanner(System.in);
	int choice=0;
	do {
		System.out.println("################");
		System.out.println("1- Kullanıcı Girişi"  );
		System.out.println("2- Mevcut kullanıcıları  Listele"  );
		System.out.println("3- Mevcut filmleri  Listele"  );
		System.out.println("4- Kullanıcı Ara"  );
		System.out.println("5- Kullanıcı Ekle"  );
		System.out.println("6- Kullanıcı sil"  );
		System.out.println("7-  Film Ara "  );
		System.out.println("8-  Film Ekle "  );
		System.out.println("9-  Film Sil "  );
		System.out.println("################");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			System.out.println("Kullanıcı adı girin");
			var userName=sc.next();
			System.out.println("Şifre girin");
			var password=sc.next();
			
			UserService.checkUserInfo(userName, password);
			//UserService.login();
			
		}
		case 2 ->{
			var listUsers=UserService.listUser();
			System.out.println(listUsers);
		}
		case 3 ->{
			var listMovies=MovieService.listMovie();
			System.out.println(listMovies);
		}
		case 4->{
			System.out.println("Kullanıcı adı girin");
			var userName=sc.next();
			sc.nextLine();
			var user = userService.searchUser(userName);
	          if (user == null) {
	            System.out.println(" kullanıcı bulunamadı.");
	            break;
	          }
	          System.out.println(user);  
		}
		case 5->{
			System.out.println("kullanıcı adı  giriniz: ");
			String name=sc.next();
			System.out.println("şifre  giriniz: ");
			String password=sc.next();
			System.out.println("mail adresi  giriniz: ");
			String mail=sc.next();
			User user=new User(name,password,mail );
			if(user.getUserName().equalsIgnoreCase(name)) {
				System.out.println("Bu kullanıcı adı sistemde kayıtlıdır.");
			
			}else {
				UserService.add(user);
			}
			
			
		}
		case 6->{
				System.out.println("Silmek istediğiniz kullanıcı adını  giriniz: ");
				var userName=sc.next();
				System.out.println("Silmek istediğiniz mail  giriniz: ");
				
				var userMail=sc.next();
				sc.nextLine();
		        	  UserService.remove(userMail);  	      	  
		}
		case 7->{
			System.out.println("Aranılacak Film  adı girin");
			var movieName=sc.next();
			sc.nextLine();
			var movie = movieService.searchMovie(movieName);
	          if (movie == null) {
	            System.out.println(" film  bulunamadı.");
	            break;
	          }
	          System.out.println(movieName);  
		}
		case 8->{
				System.out.println("Eklenilecek  Film  adı girin");
				var movieName=sc.next();
				System.out.println("Yönetmen  girin");
				var director=sc.next();
				sc.nextLine();
				System.out.println("Oyuncu sayısı  girin");
				var count=sc.nextInt();
				String[] actorss =new String[count];
				System.out.println("Oyuncu   girin");
				var actor=sc.next();
				for(int i=0; i< count; i++) {
					actorss[i]=sc.nextLine();
				}
				System.out.println("Tarih  girin");
				var dates=sc.next();
				System.out.println("Açıklama  girin");
				var descs=sc.nextLine();
				System.out.println("Tür Bilgisi Seçiniz :  ");
				System.out.println("Action /  Comedy / Horror");
				var type=sc.nextLine();
				var movieType=MovieType.getMovieType(type);
				Movie addedMovie =new Movie(movieName,director, actorss,dates,descs,movieType);
				MovieService.add(addedMovie);
		}

		case 9-> {
			System.out.println("Silmek istediğiniz film ismini giriniz. ");
			var deletedMovie=sc.next();
			MovieService.remove(deletedMovie);
		}
		case -1 ->{
			System.out.println("Hatalı seçim yapınız , çıkış için -1");
		}
		}
		}while(choice > -1); 
	
	System.out.println("Bizi tercih ettiğiniz için teşekkürler1");
	
}




	}


