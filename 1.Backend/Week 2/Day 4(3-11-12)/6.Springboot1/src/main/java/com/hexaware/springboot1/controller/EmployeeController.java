package com.hexaware.springboot1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot1.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping(path = "/openform", method = RequestMethod.GET)
	public String openForm() {

		return "add_employee";
	}

	/*
	 * @RequestMapping(path = "/add", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String addEmployeeData(HttpServletRequest request) {
	 * 
	 * int eid = Integer.parseInt(request.getParameter("eid")); // "101" String
	 * ename = request.getParameter("ename"); double salary =
	 * Double.parseDouble(request.getParameter("salary"));
	 * 
	 * Employee emp = new Employee(eid, ename, salary);
	 * 
	 * return "<h1 style ='color:green'>"+emp.toString()+"<h1>";
	 * 
	 * }
	 */
	
	/*
	 * @RequestMapping(path = "/add", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String addEmployee(@RequestParam int eid, @RequestParam
	 * String ename, @RequestParam double salary) {
	 * 
	 * Employee emp = new Employee(eid, ename, salary);
	 * 
	 * // service layer --> dao layer ---> DB
	 * 
	 * // service.add(emp)
	 * 
	 * 
	 * return emp.toString();
	 * 
	 * 
	 * }
	 */
	
		/*
		 * @RequestMapping(path = "/getall", method = RequestMethod.GET)
		 * 
		 * @ResponseBody public String getAll() {
		 * 
		 * //List list = service.getAll(); ----> dao.getAll(); ----> select * from
		 * table;
		 * 
		 * 
		 * 
		 * //return list.toString(); }
		 */
	
	
	
		@RequestMapping(path = "/add", method = RequestMethod.POST)
	
		public String insertEmployee(@RequestParam int eid, @RequestParam String ename, @RequestParam double salary,HttpSession session) {
			
			 Employee emp = new Employee(eid, ename, salary);
			
			 session.setAttribute("emp", emp);
			 	
			 
			
			return "display";
			
			
		}
	
		
		
		
	
	

}
