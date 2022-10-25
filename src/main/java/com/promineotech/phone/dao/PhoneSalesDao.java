package com.promineotech.phone.dao;

import java.util.List;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;

public interface PhoneSalesDao {
  
  /**
   * 
   * @param model
   * @return
   */

  List<Phone> fetchPhones(PhoneModel model);

}
