package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.sql.RowSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;

@Repository
public class ProductDaoImp implements IProductDAO {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public ProductDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}

	@Override
	public boolean createProduct(Product product) {

		String insertQuery = "insert into Product(pid,pname,price) values(?,?,?)";

		int count = jdbcTemplate.update(insertQuery, product.getPid(), product.getProductName(), product.getPrice());

		return count > 0;
	}

	@Override
	public boolean updateProduct(Product product) {

		String updateQuery = "update product set pname = ? , price = ? where pid = ?";

		int count = jdbcTemplate.update(updateQuery, product.getProductName(), product.getPrice(), product.getPid());

		return count > 0;
	}

	@Override
	public boolean deleteProduct(int pid) {

				String delete = "delete from product where pid = ?";
		
				
			int count =		jdbcTemplate.update(delete,pid);
		
		return count > 0;
	}

	@Override
	public Product getProductById(int pid) {

		String selectById = "select pid,pname,price from product where pid =?";

		Product product = jdbcTemplate.queryForObject(selectById, new ProductMapper(), pid);

		return product;
	}

	@Override
	public List<Product> getAllProducts() {

		String selectAll = "select * from product";

		List<Product> list = jdbcTemplate.query(selectAll, new ProductMapper());

		return list;
	}

}
