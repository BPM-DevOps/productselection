package com.itechgenie.webportal.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itechgenie.webportal.web.dao.CatalogueDao;
import com.itechgenie.webportal.web.model.Catalogue;
import com.itechgenie.webportal.web.service.CatalogueService;

@Service("catalogueService")
public class CatalogueServiceImpl implements CatalogueService{

	@Autowired
	CatalogueDao catalogueDao;
	
	public List<Catalogue> getProduct(String locId)
	{
		return catalogueDao.getProduct(locId);
	}

	@Override
	public List<Catalogue> getProducts() {
		return catalogueDao.getProducts() ;
	}
	
}
