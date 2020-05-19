package db;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DepartmentDao departmentdao =  DaoFactory.DepartmentDao();
		
		System.out.println("===TESTE 1 - BUSCA POR ID ===");
		
		
		
		
		
		
		Department department = departmentdao.findById(3);
		System.out.println(department);
		
	}

}
