package com.promineotech.phone.service;

import java.util.List;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;

public interface PhoneSalesService {
  
  /**
   * 
   * @param model
   * @return
   */

  List<Phone> fetchPhones(PhoneModel model);

}
