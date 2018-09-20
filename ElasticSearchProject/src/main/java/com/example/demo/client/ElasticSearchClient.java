package com.example.demo.client;

import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Get;

@Service
public class ElasticSearchClient {
	
private static JestClient jestClient = null;

private static final String hostName = "localhost";
private static final String portNumber = "9200";


public Employee employeeDetail(String id) throws Exception {

	JestClientFactory factory = new JestClientFactory();
	factory.setHttpClientConfig(new HttpClientConfig.Builder("http://" + hostName +":" + portNumber).multiThreaded(true).build());
	jestClient = factory.getObject();
	Get get = new Get.Builder("employees", id).type("empid").build();
	
	JestResult results = jestClient.execute(get);
	Employee employeeConsumer = new Employee();
	
	if(results.isSucceeded()) {
		
		Employee employee = new ObjectMapper().readValue(results.getJsonObject().get("_source").toString(), Employee.class);
		employeeConsumer.setEmpName(employee.getEmpName());
		employeeConsumer.setEmpId(employee.getEmpId());
		employeeConsumer.setEmpDept(employee.getEmpDept());
	}
	
	return employeeConsumer;
}

}
