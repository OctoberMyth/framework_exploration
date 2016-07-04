package org.smart4j.chapter1.service;

import org.slf4j.LoggerFactory;
import org.smart4j.chapter1.helper.DatabaseHelper;
import org.smart4j.chapter1.model.Customer;
import org.smart4j.chapter1.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by LY on 2016/5/22.
 */
public class CustomerService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     *
     * @param kyword
     * @return
     */
    public List<Customer> getCustomerList(String kyword) {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        String sql = "select * from customer where id='"+id+"'";
        return DatabaseHelper.queryEntity(Customer.class,sql);
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
       return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新客户
     *
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
