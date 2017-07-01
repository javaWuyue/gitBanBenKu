package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Customer;
import com.ssm.pojo.vo.QueryVo;



public interface CustomerMapper {

	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerById(Customer customer);
	
	public void delCustomerById(Long id);
}
