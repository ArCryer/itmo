package com.myproject;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FourthServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		String result = "";
		int[][] Mas = new int[5][8];
		int count=0;
		int max=-100;
		resp.getWriter().println("<html><body><br></body></html>");
		for(int i=0;i<Mas.length;i++){
            for(int j=0;j<Mas[i].length;j++){
                Mas[i][j]=(int)(Math.random()*199)-99;
                if (count == 0){
                max=Mas[i][j];
                count=1;
                };
                if (Mas[i][j]>max){
                max=Mas[i][j];	
                }
                result+=" "+Mas[i][j];
            }
            resp.getWriter().println(result+"<html><body><br></body></html>");
            result="";
		}
		resp.getWriter().println("Maximum: "+max);
	}
	
}
