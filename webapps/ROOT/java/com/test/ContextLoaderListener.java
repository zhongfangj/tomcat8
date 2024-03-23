/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.test;

import javax.servlet.*;
import java.util.HashSet;
import java.util.Set;


public class ContextLoaderListener  implements ServletContextListener {

    private Set<String> urlMappings = new HashSet<>();
    private MultipartConfigElement multipartConfig = new MultipartConfigElement("D://testFile");


	@Override
	public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();

       String contextPath = servletContext.getContextPath();

        TestServlect testServlect = new TestServlect();

        testServlect.getServletConfig();

        ServletRegistration.Dynamic registration = servletContext.addServlet("firstTestServlect",TestServlect.class);

//        ServletRegistration.Dynamic registration = servletContext.addServlet("firstTestServlect",testServlect);

        urlMappings.add("/firstTestServlect");

        registration.setAsyncSupported(true);



//        registration.setInitParameters(this.initParameters);

        String[] urlMapping = (String[])this.urlMappings.toArray(new String[this.urlMappings.size()]);

        registration.addMapping(urlMapping);
        registration.setLoadOnStartup(-1);

        registration.setMultipartConfig(multipartConfig);


        System.out.println("dddddssss" + contextPath);
	}

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }




}
