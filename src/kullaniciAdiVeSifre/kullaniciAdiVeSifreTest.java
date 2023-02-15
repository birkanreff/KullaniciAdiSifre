package kullaniciAdiVeSifre;

import java.util.Scanner;

public class kullaniciAdiVeSifreTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınızı giriniz:  ");
		String userName = input.nextLine();
		
		
		
		if (userName.equals("admin") ) {
			System.out.println("Kullanıcı adı başarılı girildi!");
			
			System.out.println("Şifrenizi giriniz:  ");
			String password = input.nextLine();
			
			if (password.equals("123456")) {
				System.out.println("Şifre başarılı girildi!");
				System.out.println("Sisteme hoşgeldiniz!");
				
				
			} else {
				System.out.println("Şifrenizi sıfırlamak ister misiniz ?");
				String menu = "Evet için 1'e , Hayır için 2'ye basınız!";
				System.out.println(menu);
				
				int yanit = input.nextInt();
				
				switch(yanit) {
				case 1 :
					
					System.out.println("Oluşturmak istediğiniz yeni şifreyi giriniz: ");
					
					int yeniSifre = input.nextInt();
					
				
					if (yeniSifre == 123456) {
						System.out.println("Eski şifrenizden farklı bir şifre girmelisiniz.");
					} else {
						System.out.println("Şifre başarıyla oluşturuldu!");
						
					}
					break;
					
				case 2 :
					System.out.println("Şifre oluşturulamadı.");
					break;
					
					
				}
			}
			
		} else {
			System.out.print("Kullanıcı adı hatalı girildi!");
		}
		
		
		
		

	}

}
