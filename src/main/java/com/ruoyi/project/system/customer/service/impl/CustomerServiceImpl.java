package com.ruoyi.project.system.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.customer.mapper.CustomerMapper;
import com.ruoyi.project.system.customer.domain.Customer;
import com.ruoyi.project.system.customer.service.ICustomerService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
@Service
public class CustomerServiceImpl implements ICustomerService 
{
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询客户
     * 
     * @param customerId 客户ID
     * @return 客户
     */
    @Override
    public Customer selectCustomerById(Long customerId)
    {
        return customerMapper.selectCustomerById(customerId);
    }

    /**
     * 查询客户列表
     * 
     * @param customer 客户
     * @return 客户
     */
    @Override
    public List<Customer> selectCustomerList(Customer customer)
    {
        return customerMapper.selectCustomerList(customer);
    }

    /**
     * 新增客户
     * 
     * @param customer 客户
     * @return 结果
     */
    @Override
    public int insertCustomer(Customer customer)
    {
        return customerMapper.insertCustomer(customer);
    }

    /**
     * 修改客户
     * 
     * @param customer 客户
     * @return 结果
     */
    @Override
    public int updateCustomer(Customer customer)
    {
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 删除客户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerByIds(String ids)
    {
        return customerMapper.deleteCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param customerId 客户ID
     * @return 结果
     */
    @Override
    public int deleteCustomerById(Long customerId)
    {
        return customerMapper.deleteCustomerById(customerId);
    }
}
