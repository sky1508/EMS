package com.emp.constants;

public class QueryConstants {
	
	public static final String CREATE_RL = "insert into compliance(complianceid, rlType,details,createDate,DEPARTMENT_ID) values (compliance_seq.NEXTVAL,?,?,?,? )";
	public static final String CREATE_STATUS = "SELECT complianceid as complianceid FROM statusreport";
	
	public static final String SELECT_RL_USER = "select complianceid,rlType,createdate,com.department_id as department_id,department_nm,details from compliance com,department depart,employees emp where com.department_id = depart.department_id and emp.department_id = depart.department_id and emp.empid = ?";
	public static final String SELECT_DEPARTMENT = "select department_id from compliance where complianceid=?";
	public static final String CREATE_STATUSREPORT = "insert into statusreport(statusrptid, comments,createDate,department_id ,empid,complianceid) values (statusreport_seq.NEXTVAL,?,?,?,?,?)";
	public static final String SELECT_STATUSREPORT = "select distinct statusrptid,comments,sts.createdate,sts.department_id as department_id,department_nm " +
			"from statusreport sts,department depart,employees emp where sts.department_id = depart.department_id  " +
			"and emp.department_id = depart.department_id and sts.empid = ? and sts.complianceid = ? order by statusrptid";
	public static final String CREATE_DEPARTMENT = "insert into department(DEPARTMENT_ID, DEPARTMENT_NM) values (department_seq.NEXTVAL,? )";
	public static final String SELECT_DEPT = "select * from department order by department_id";
	public static final String DELETE_DEPT = "select count(empid) as count from employees where department_id = ?";
	
	public static final String DELETE_EMP = "delete from employees where empid=?";
	public static final String DELETE_EMP_LOGIN = "delete from LOGIN_MASTER where userid=?";
	public static final String UPDATE_EMP = "update employees set firstname=?, lastname=?, dob=?, email=?, department_id=? "
			+ "where empid=?";
	
	public static final String GET_EMPDTL = "select empid,firstname,lastname,dob,email,emp.department_id as depart_id,department_nm from employees emp, department dept"
			+ " where empid=? and emp.department_id = dept.department_id";
	public static final String CHK_STATUS = "SELECT count(*) as count FROM statusreport where empid =?";
}
