package com.promineotech.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;
import com.promineotech.phone.service.PhoneSalesService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultPhoneSalesController implements PhoneSalesController {
  
  @Autowired
  private PhoneSalesService phoneSalesService;

  @Override
  public List<Phone> fetchPhones(PhoneModel model) {
    log.debug("model={}", model);
    return phoneSalesService.fetchPhones(model);
  }
}


