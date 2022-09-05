package carmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import carmanagement.entity.Car;

public class CarDao {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public CarDao()
	{
		emf = Persistence.createEntityManagerFactory("car_pu");
		em = emf.createEntityManager();
	}
	
	public String addCar(Car c)
	{
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return "Car Added";
	}
	
	public Car viewCar(int id)
	{
		em.getTransaction().begin();
		Car c = em.find(Car.class, id);
		em.getTransaction().commit();
		return c;
	}
	
	public List<Car> viewAllCars()
	{
		em.getTransaction().begin();
		TypedQuery<Car> q = em.createQuery("select c from Car c", Car.class);
		List<Car> clist = q.getResultList();
		em.getTransaction().commit();
		return clist;
	}
}
