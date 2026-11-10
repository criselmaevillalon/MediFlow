package com.mediflow.system;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("patientName");
        String history = request.getParameter("medicalHistory");
        
        out.println("<html><head><style>");
        out.println("body { font-family: Arial; text-align: center; margin-top: 50px; background-color: #f4f6f9; }");
        out.println(".card { background: white; display: inline-block; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); border-top: 10px solid #27ae60; text-align: left; max-width: 400px; }");
        out.println("</style></head><body>");
        out.println("<div class='card'>");
        out.println("<h2 style='color:#27ae60;'>✔ Patient Record Saved</h2>");
        out.println("<hr>");
        out.println("<p><strong>Patient Name:</strong> " + name + "</p>");
        out.println("<p><strong>Medical Diagnostics/History:</strong><br>" + history + "</p>");
        out.println("<hr>");
        out.println("<a href='index.jsp'><button style='padding: 10px; cursor:pointer; width:100%; background:#3498db; color:white; border:none; border-radius:4px;'>Return to Dashboard</button></a>");
        out.println("</div></body></html>");
    }
}

