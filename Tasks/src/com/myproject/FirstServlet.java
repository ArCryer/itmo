package com.myproject;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		String var1 = req.getParameter("var1");
		double i1 = Double.parseDouble(var1);  
		String var2 = req.getParameter("var2");
		double i2 = Double.parseDouble(var2); 
		String result="Empty";
		Double i3=Double.parseDouble("10");
		Double i4=Double.parseDouble("10");
	if(i1<=i3){                  
			i3-=i1;
	} else {                  
			i3=i1-10f;
	};
	if(i2<=i4){                  
			i4-=i2;
	} else {                  
			i4=i2-10f;
	};
	if(i3==i4){                  
		result = "Equal"; 
	} else if(i3>i4){                   
		result = "Second one closer";             
	} else {
		result = "First one closer";
	};
		resp.getWriter().println(result);
	}
}
