package org.pfe.nadia.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GenericController
{
    ApplicationContext ctx;

    protected ApplicationContext getAppCtx()
    {
	if (null == ctx)
	{
	    ctx = new ClassPathXmlApplicationContext(
			new String[]
			{ "conf/spring/spring-config.xml" });
	}
	return ctx;
    }
    

}
