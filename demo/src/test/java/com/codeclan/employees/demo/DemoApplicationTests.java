package com.codeclan.employees.demo;

import com.codeclan.employees.demo.models.Assignments;
import com.codeclan.employees.demo.models.Department;
import com.codeclan.employees.demo.models.Employee;
import com.codeclan.employees.demo.models.Project;
import com.codeclan.employees.demo.repositories.AssignmentRepository;
import com.codeclan.employees.demo.repositories.DepartmentRepository;
import com.codeclan.employees.demo.repositories.EmployeeRepository;
import com.codeclan.employees.demo.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee employee_1 = new Employee("Bob", "whatev", 123456, null);
		employeeRepository.save(employee_1);
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee_2 = new Employee("Jack", "ngkfjgnfdk", 12345, department);
		employeeRepository.save(employee_2);
	}

	@Test
	public void createProject(){
		Project project = new Project("MagicWasher2000", 5);
		projectRepository.save(project);
	}

	@Test
	public void createEmployeeAndAssignmet(){
		Department department2 = new Department("Mail Room");
		departmentRepository.save(department2);

		Project project = new Project("MagicWasher2000", 5);
		projectRepository.save(project);

		Employee employee_3 = new Employee("Tom", "Thumb", 126785, department2);
		employeeRepository.save(employee_3);


		Assignments assignments = new Assignments(employee_3, project);

		assignmentRepository.save(assignments);

	}





}
