package com.pojo;

public class Employee {

		private int eid;
		private String ename;
		
		private Address addr;   // HAS A relationship
		
		
		
		

		public Employee(int eid, String ename, Address addr) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.addr = addr;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public Address getAddr() {
			return addr;
		}

		public void setAddr(Address addr) {
			this.addr = addr;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
		}
		
		
		
		
		
		
		
	
	
}
