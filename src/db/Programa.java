package db;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		//SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "bob", "bob@gmail.com", new Date(), 3000.0, obj  );
		
		System.out.println(seller);

		
	}

}
