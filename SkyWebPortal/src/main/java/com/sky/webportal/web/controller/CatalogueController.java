package com.sky.webportal.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sky.webportal.web.model.Catalogue;
import com.sky.webportal.web.model.Location;
import com.sky.webportal.web.service.CatalogueService;
import com.sky.webportal.web.service.CustomerLocationService;

@Controller
@RequestMapping("/productlocation")
public class CatalogueController {

	/*@Autowired
	CatalogueService catalogueService;

	@RequestMapping(value = "/productlocation", method = RequestMethod.GET)
	public Object getProduct(@PathVariable("locId") String locId) {
		List<Catalogue> catalogue = catalogueService.getProduct(locId);
		// ModelAndView model = new ModelAndView("ProductList");
		// model.addObject("catalogue", catalogue);
		// return model;
		return catalogue;
*/
	
	@Autowired
	CustomerLocationService customerLocationService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Object getLocation() {
		List<Location> locations= customerLocationService.getLocationId() ;
		System.out.println(locations);
		 ModelAndView model = new ModelAndView("ProductList");
		 model.addObject("location", "ALL");
		 model.addObject("locations", locations);
		 return model;

	}

	
}