package db;

import java.util.List;

public class Programa {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		

		SellerDao sellerdao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE FIND BYID ===");
		Seller seller = sellerdao.findById(3);

		System.out.println(seller);
		
		System.out.println("=== TESTE2 FIND BY DEPARTMENT===");
		
		Department department = new Department(2, null);
		List<Seller> list = SellerDaoJDBC.findByDepartment(department);
		
		for(Seller s : list) {
			System.out.println(s);
		}
		
		
		
		

	}

}
