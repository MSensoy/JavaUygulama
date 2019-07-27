package com.javacourse.project.hibernateAndJpa.BLL;
import java.util.List;
import com.javacourse.project.hibernateAndJpa.Entities.*;

public interface ICityService {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
