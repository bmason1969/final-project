package com.promineotech.phone.controller.support;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;

public class FetchPhoneTestSupport extends BaseTest {
  protected List<Phone> buildExpected() {
    List<Phone> list = new LinkedList<>();
    
    // formatter:off
    list.add(Phone.builder()
        .modelId(PhoneModel.IPHONE14)
        .Price(new BigDecimal("800"))
        .build());
    
    list.add(Phone.builder()
        .modelId(PhoneModel.IPHONE13)       
        .Price(new BigDecimal("750"))
        .build()); 
     //@formatter:on
    
    Collections.sort(list);
    return list;
  }

}
