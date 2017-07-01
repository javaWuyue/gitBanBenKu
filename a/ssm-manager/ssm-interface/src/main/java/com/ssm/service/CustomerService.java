package com.ssm.service;

import java.util.List;

import com.ssm.pojo.BaseDict;
import com.ssm.pojo.Customer;
import com.ssm.pojo.vo.QueryVo;



public interface CustomerService {

public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerById(Customer customer);
	
	public void deleteCustomerById(Long id);
	
	
}
