package com.ty.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepo extends CrudRepository<Vehicle,Integer>
{
	 List<Vehicle> findByVcolor(String vcolor);
	 List<Vehicle> findByVname(String vname);
	 @Query(value = "select * from vehicle where vyear<2000",nativeQuery = true)
	 List<Vehicle> vehicleAfterTwenty();
}
