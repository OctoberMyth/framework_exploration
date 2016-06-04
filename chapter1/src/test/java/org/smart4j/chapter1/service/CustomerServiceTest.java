package org.smart4j.chapter1.service;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.smart4j.chapter1.model.Customer;

import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LY on 2016/5/22.
 */
public class CustomerServiceTest extends TestCase {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testGetCustomerList() throws Exception {
        List<Customer> customerList = customerService.getCustomerList(null);
        Assert.assertEquals(3, customerList.size());
    }

    public void testGetCustomer() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    public void testCreateCustomer() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    public void testUpdateCustomer() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    public void testDeleteCustomer() throws Exception {
        long id = 1;
        boolean result=customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}