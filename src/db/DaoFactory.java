package db;

public class DaoFactory {

	
	public static SellerDao createSellerDao()
	{
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao DepartmentDao()
	{
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
