package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1: Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== Teste 2: Department deleteById ===");
		departmentDao.deleteById(5);
		System.out.println("Delete completed!");
		
		System.out.println("\n=== Teste 3: Department insert ===");
		Department dep = new Department(null,"Music");
		departmentDao.insert(dep);
		System.out.println("Inserted New id: " + dep.getId());
		
		System.out.println("\n=== TEST 4: Department update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 4: Department findAll =======");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
		sc.close();
	}

}
