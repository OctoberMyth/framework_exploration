package org.smart4j.chapter1.service;

import org.smart4j.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by LY on 2016/5/22.
 */
public class CustomerService {
    /**
     * 获取客户列表
     * @param kyword
     * @return
     */
    public List<Customer> getCustomerList(String kyword){
        //TODO
        return null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        //TODO
        return  null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }
}
