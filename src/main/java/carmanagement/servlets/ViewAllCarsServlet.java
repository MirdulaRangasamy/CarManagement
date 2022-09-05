package carmanagement.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import carmanagement.entity.Car;
import carmanagement.service.CarService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewAllCarsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CarService cs = new CarService();
		PrintWriter out = resp.getWriter();
		out.println("<h1>Car Detail</h1>");
		out.print("<table border='1px'><tr><th>Car ID</th><th>Car Name</th>");
		out.println("<th>Car Cost</th></tr>");
		for(Car c: cs.viewAllCars()) {
			out.print("<tr><td>"+c.getId()+"</td><td>"+c.getName());
		out.print("</td><td>"+c.getCost()+"</td></tr>");
		}
		out.print("</table>");
	}
}
