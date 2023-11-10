package com.yume.Service.User;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yume.Dto.ProductsDto;
import com.yume.Entity.Categorys;



@Service
public class HomeServiceImpl {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;
	
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categoryDao.GetDataCategorys();
	}
	
	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		listProducts.get(0).getId_color();
		return listProducts;
	}
}