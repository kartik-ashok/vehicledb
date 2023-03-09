package com.ty.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class VehicleController
{
	@Autowired
	VehicleRepo repo;
	
	@RequestMapping("/home")
	public String display()
	{
		System.out.println(repo.vehicleAfterTwenty());
		return "home.jsp";
	}
	
	
	@RequestMapping("/addVehicle")
	public String display1(Vehicle v)
	{
		repo.save(v);
		return "home.jsp";
	}
	
	@RequestMapping("/getById")
	public String display2(int vid,HttpSession s)
	{	
		Vehicle v=repo.findById(vid).orElse(null);
		repo.save(v);
		s.setAttribute("value",v);
		return "home.jsp";
	}
	
	@RequestMapping("/getByColor")
	public String display2(String vcolor,HttpSession s)
	{	
		List<Vehicle> v=repo.findByVcolor(vcolor);
		s.setAttribute("value1",v);
		return "home.jsp";
	}
	
	
	@RequestMapping("/getByName")
	public String display3(String vname,HttpSession s)
	{	
		List<Vehicle> v=repo.findByVname(vname);
		s.setAttribute("value2",v);
		return "home.jsp";
	}
}
