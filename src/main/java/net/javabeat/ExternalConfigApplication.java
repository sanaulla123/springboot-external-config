package net.javabeat;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalConfigApplication {

  private static final Logger logger = LoggerFactory.getLogger(ExternalConfigApplication.class);
  
  @Autowired
  private ExternalConfigComponent externalConfigComponent;
  
  public static void main(String[] args) throws Exception {
    SpringApplication springApplication = new SpringApplication(new Object[] { ExternalConfigApplication.class });
    
    Map<String, Object> defaultProperties = new HashMap<String, Object>();
    defaultProperties.put("property.one", "Value One");
    defaultProperties.put("property.two", "Value Two");
    
    springApplication.setDefaultProperties(defaultProperties);
    
    springApplication.run(args);

  }

}
