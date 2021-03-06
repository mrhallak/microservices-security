package com.shahbour.client;

import com.shahbour.domain.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by shahbour on 14/06/17.
 */
@FeignClient(value = "resource-service")
public interface ResourceClient {

    @RequestMapping(method = RequestMethod.GET,value = "/customers")
    List<Customer> getCustomers();

    @RequestMapping(method = RequestMethod.GET,value = "/customers/{customerId}")
    Customer getCustomer(@PathVariable("customerId") int customerId);


}
