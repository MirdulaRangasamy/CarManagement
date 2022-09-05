package carmanagement.service;

import java.util.List;

import carmanagement.dao.CarDao;
import carmanagement.entity.Car;

public class CarService {
	private CarDao cdao = new CarDao();
	
	public String addCar(Car c)
	{
		return cdao.addCar(c);
	}
	
	public Car viewCar(int id)
	{
		return cdao.viewCar(id);
	}
	
	public List<Car> viewAllCars()
	{
		return cdao.viewAllCars();
	}
}
