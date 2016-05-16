package com.myproject;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		String var1 = req.getParameter("var1");
		double i1 = Double.parseDouble(var1);  
		String var2 = req.getParameter("var2");
		double i2 = Double.parseDouble(var2); 
		String var3 = req.getParameter("var3");
		double i3 = Double.parseDouble(var3); 
		String result="Empty";
		Double D=Double.parseDouble("10");
		Double D1=Double.parseDouble("10");
		Double i4=Double.parseDouble("10");
		Double i5=Double.parseDouble("10");
		
	D=(i2*i2-4*i1*i3);
	if (D<0){
		i5=D;
		D=-1*D;
		i2=-1*i2;
		i1=i1*2;
	    D=Math.sqrt(D);
	    String formattedDouble = new DecimalFormat("#0.00").format(D);
	    result="D="+i5+" ==> Two roots: ("+i2+"+-i*"+formattedDouble+")/"+i1;
	} else if (D==0) {
		i4=(-i2)/(2*i1);
		result="D="+D+" ==> Answer is: "+i4;
	} else if (D>0){
		D1=D;
		D=Math.sqrt(D);
		i4=(-i2+D)/(2*i1);
		String formattedDoublei4 = new DecimalFormat("#0.00").format(i4);
		i5=(-i2-D)/(2*i1);
		String formattedDoublei5 = new DecimalFormat("#0.00").format(i5);
		result="D="+D1+" ==> Two roots: "+formattedDoublei4+" and "+formattedDoublei5;
	}
		resp.getWriter().println(result);
	
	
	}	
}
