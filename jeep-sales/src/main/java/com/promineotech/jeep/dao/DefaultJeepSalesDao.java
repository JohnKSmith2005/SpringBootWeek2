package com.promineotech.jeep.dao;

import java.util.List;
import org.springframework.stereotype.Component;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultJeepSalesDao implements JeepSalesDao {
  
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
  log.debug("DAO: model={}, trim={}", model, trim);
  return null;
}

}

