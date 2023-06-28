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
	private SqlMapClientTemplate template;
	
	public List<Employee> getAllEmployees() {
		return template.queryForList("getAllEmployees");
	}
}
