package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class color
{
	@RequestMapping("/show")
	public String colorgame(HttpServletRequest req)
	{
		String color=req.getParameter("color");
		HttpSession session=req.getSession();
		session.setAttribute("colorgame", color);
		return "NewFile1.jsp";
	}
}
