package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	@SuppressWarnings("deprecation")
	// 이거 좀 있으면 사라질거임 근데 난 걍 쓸것
	private SqlMapClientTemplate template;
	
	// employees.xml의 insert의 id 복붙
	public void insertEmployee(Employee employee) {
		template.insert("insertEmployee", employee);
	}
	
	public List<Employee> getAllEmployees() {
		return template.queryForList("getAllEmployees");
	}
}
