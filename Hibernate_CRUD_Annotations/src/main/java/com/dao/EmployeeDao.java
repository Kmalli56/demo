package com.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;


public class EmployeeDao implements IEmployeeDao {

	@Override
	public Employee createEmployee(Employee e) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
		return e;
	}

	@Override
	public List<Employee> readAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String readAll = "FROM Employee";
		List<Employee> list = session.createQuery(readAll).list();
		transaction.commit();
		return list;
	}

	@Override
	public Employee readEmployeebyId(int e) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.load(Employee.class, e);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.update(e);
		transaction.commit();
		return e;
	}

	@Override
	public int deleteEmployee(int employeeId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.delete(session.get(Employee.class, employeeId));
		transaction.commit();
		return 1;
	}

}
