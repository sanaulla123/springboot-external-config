package net.javabeat;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalConfigComponent {
  private static Logger logger = LoggerFactory.getLogger(ExternalConfigComponent.class);
  
  @Value("${property.one}")
  private String propertyOne;
  
  @Value("${property.two}")
  private String propertyTwo;
  
  @Value("${property.three}")
  private String propertyThree;
  
  @Value("${property.four}")
  private String propertyFour;
  
  @Value("${property.five}")
  private String propertyFive;
  
  @Value("${property.six}")
  private String propertySix;
  
  @Value("${property.seven}")
  private String propertySeven;
  
  @PostConstruct
  public void postConstruct(){
    logger.info("Property One: " + propertyOne);
    logger.info("Property Two: " + propertyTwo);
    logger.info("Property Three: " + propertyThree);
    logger.info("Property Four: " + propertyFour);
    logger.info("Property Five: " + propertyFive);
    logger.info("Property Six: " + propertySix);
    logger.info("Property Seven: " + propertySeven);
  }
  
}
