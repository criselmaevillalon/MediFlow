package com.mediflow.system;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String doctor = request.getParameter("doctor");
        String room = request.getParameter("room");
        String time = request.getParameter("scheduleTime");
        
        // Lilinisin natin ang format ng date-time text para madaling basahin ng hospital staff
        String cleanTime = time.replace("T", " ");
        
        out.println("<html><head><style>");
        out.println("body { font-family: Arial; text-align: center; margin-top: 50px; background-color: #f4f6f9; }");
        out.println(".card { background: white; display: inline-block; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); border-top: 10px solid #3498db; text-align: left; max-width: 450px; }");
        out.println("</style></head><body>");
        out.println("<div class='card'>");
        out.println("<h2 style='color:#3498db;'>📅 Appointment Successfully Scheduled</h2>");
        out.println("<hr>");
        out.println("<p><strong>Assigned Doctor:</strong> " + doctor + "</p>");
        out.println("<p><strong>Allocated Location/Room:</strong> " + room + "</p>");
        out.println("<p><strong>Schedule Date & Time:</strong> " + cleanTime + "</p>");
        out.println("<hr>");
        out.println("<a href='index.jsp'><button style='padding: 10px; cursor:pointer; width:100%; background:#27ae60; color:white; border:none; border-radius:4px;'>Return to Dashboard</button></a>");
        out.println("</div></body></html>");
    }
}
