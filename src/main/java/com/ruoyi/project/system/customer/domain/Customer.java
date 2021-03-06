package com.ruoyi.project.system.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 客户对象 sys_customer
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户id */
    private Long customerId;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customerName;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phonenumber;

    /** 客户性别 */
    @Excel(name = "客户性别")
    private String sex;

    /** 客户生日 */
    @Excel(name = "客户生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("phonenumber", getPhonenumber())
            .append("sex", getSex())
            .append("birthday", getBirthday())
            .append("remark", getRemark())
            .toString();
    }
}
