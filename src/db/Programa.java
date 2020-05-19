package db;

import java.util.Date;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE FIND BYID ===");
		Seller seller = sellerdao.findById(3);

		System.out.println(seller);

		System.out.println();

		System.out.println("=== TESTE2 FIND BY DEPARTMENT===");

		Department department = new Department(2, null);
		List<Seller> list = SellerDaoJDBC.findByDepartment(department);

		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println("=== TESTE 3 FIND ALL===");

		list = SellerDaoJDBC.findAll();

		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println("=== TESTE 4 INSERÇÃO SELLER ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		
		sellerdao.insert(newSeller);
		
		System.out.println("Inserido com sucesso: " + newSeller.getId());
		
		System.out.println();
		
		System.out.println("=== TESTE 5 SELLER UPDATE ===");
		
		seller = sellerdao.findById(1); 
		
		seller.setName("Maria");
		
		sellerdao.update(seller);
		
		System.out.println("Atualização efetuada");
		

	}

}
