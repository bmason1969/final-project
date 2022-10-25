package com.promineotech.phone.controller;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import com.promineotech.phone.controller.support.FetchPhoneTestSupport;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;
import lombok.Getter;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Sql(scripts = {
    "classpath:flyway/migrations/V1.0__Phone_Schema.sql",
    "classpath:flyway/migrations/V1.1__Phone_Data.sql"},
    config = @SqlConfig(encoding = "utf-8"))

class FetchPhoneTest extends FetchPhoneTestSupport{
  
  @Autowired
  @Getter
  private TestRestTemplate restTemplate;

  @LocalServerPort
  private int serverPort; 
  
  @Test
  void testThatPhonesAreReturnedWhenAValidPhoneModelAndTrimAreSupplied() {
    // Given: a valid model and URI
    
    PhoneModel model = PhoneModel.IPHONE14;
    String uri = String.format("http://localhost:%d/phones?model=%s", serverPort, model);    
//    String uri = 
//        String.format("%s?model=%s", getBaseUri(), model);
    
    // When: a connection is made to the URI
    
   ResponseEntity<List<Phone>> response = 
       getRestTemplate().exchange(uri, HttpMethod.GET, null, 
           new ParameterizedTypeReference<>() {});   
    // Then: a success (OK - 200) status code is returned
   
   assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
   
   // And the actual list returned is the same as the expected list 
//   List<Phone> actual = response.getBody();
//   List<Phone> expected = buildExpected();     
//  
//  actual.forEach(phone -> phone.setModelPK(null));
//  
//  assertThat(actual).isEqualTo(expected);
//  }
  
   List<Phone> expected = buildExpected();
   assertThat(response.getBody()).isEqualTo(expected);
 }

 protected List<Phone> buildExpected() {
              
     return new ArrayList<>();
  }

  }
