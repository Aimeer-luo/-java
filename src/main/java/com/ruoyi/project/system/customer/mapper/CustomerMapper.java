package com.ruoyi.project.system.customer.mapper;

import com.ruoyi.project.system.customer.domain.Customer;
import java.util.List;

/**
 * 客户Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
public interface CustomerMapper 
{
    /**
     * 查询客户
     * 
     * @param customerId 客户ID
     * @return 客户
     */
    public Customer selectCustomerById(Long customerId);

    /**
     * 查询客户列表
     * 
     * @param customer 客户
     * @return 客户集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增客户
     * 
     * @param customer 客户
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改客户
     * 
     * @param customer 客户
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 删除客户
     * 
     * @param customerId 客户ID
     * @return 结果
     */
    public int deleteCustomerById(Long customerId);

    /**
     * 批量删除客户
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCustomerByIds(String[] customerIds);
}
