package db;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		//SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		
		
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findById(3);
		
		
		
		
		
		System.out.println(seller);

		
	}

}
