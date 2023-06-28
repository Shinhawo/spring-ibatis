package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import vo.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis-context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		List<Employee> employees = dao.getAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp.getId() + "\t" + emp.getFirstName());
		}
	}
}
