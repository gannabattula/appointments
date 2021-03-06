package com.milab.appointments.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * The Class ApplicationContextProvider.
 */
@Component("applicationContextProvider")
public class ApplicationContextProvider implements ApplicationContextAware
{
	
	//private static final Logger logger = LoggerFactory.getLogger(ApplicationContextProvider.class);

  /** The context. */
  private static ApplicationContext context = null;

  /* (non-Javadoc)
   * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
   */
  public void setApplicationContext(ApplicationContext context)
      throws BeansException
  {
    ApplicationContextProvider.context = context;
  }

 
  /**
   * Gets the application context.
   *
   * @return the application context
   */
  public static ApplicationContext getApplicationContext()
  {
    return context;
  }
  
 
  /**
   * Gets the bean.
   *
   * @param identfier the identfier
   * @return the bean
   * @throws AppException the app exception
   */
  public static Object getBean(String identfier) 
  {
    Object object =  context.getBean(identfier);
   // if(object == null)
    	//logger.error("Object is null");
      //throw new AppException();
    return object;
  }
  
 
  
}
