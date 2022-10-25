package com.promineotech.phone.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.phone.dao.PhoneSalesDao;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultPhoneSalesService implements PhoneSalesService {
  
  @Autowired
  private PhoneSalesDao phoneSalesDao;

  @Override
  public List<Phone> fetchPhones(PhoneModel model) {
    log.info("The fetchPhones method was called with model={}", model);
    List <Phone> phones = phoneSalesDao.fetchPhones(model);
    
    Collections.sort(phones);
    
    return phoneSalesDao.fetchPhones(model);
  }

}
