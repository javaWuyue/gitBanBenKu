package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.CustomerMapper;
import com.ssm.dao.DictMapper;
import com.ssm.pojo.BaseDict;
import com.ssm.pojo.Customer;
import com.ssm.pojo.vo.QueryVo;
import com.ssm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private DictMapper dictMapper;
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<BaseDict> findDictByCode(String code) {
		List<BaseDict> list = dictMapper.findDictByTypeCode(code);
		return list;
	}

	@Override
	public List<Customer> findCustomerByVo(QueryVo vo) {
		List<Customer> list = customerMapper.findCustomerByVo(vo);
		return list;
	}

	@Override
	public Integer findCustomerByVoCount(QueryVo vo) {
		Integer count = customerMapper.findCustomerByVoCount(vo);
		return count;
	}

	@Override
	public Customer findCustomerById(Long id) {
		Customer customer = customerMapper.findCustomerById(id);
		return customer;
	}

	@Override
	public void updateCustomerById(Customer customer) {
		customerMapper.updateCustomerById(customer);
	}

	@Override
	public void deleteCustomerById(Long id) {
		customerMapper.delCustomerById(id);
		
	}

}
