package com.promineotech.phone.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultPhoneSalesDao implements PhoneSalesDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Phone> fetchPhones(PhoneModel model) {
    log.debug("Dao: model={}", model);
    
    // @formatter:off
    String sql = "" 
        + "SELECT * "
        + "FROM models "
        + "WHERE model_id = :model_id";
    // @formatter:on
    Map<String, Object> params = new HashMap<>();
    params.put("model_id", model.toString());       
    return jdbcTemplate.query(sql, params,
        new RowMapper<>() {
      
      @Override
      public Phone mapRow(ResultSet rs, int rowNum) throws SQLException {
        // formatter:off
        return Phone.builder()
        .Price(new BigDecimal(rs.getString("Price")))
        .modelId(PhoneModel.valueOf(rs.getString("model_id")))
        .modelPK(rs.getLong("model_Pk"))        
        .build();
        // foprmatter:on
      }});
  }

}
