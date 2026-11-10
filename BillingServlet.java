package com.mediflow.system;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BillingServlet")
public class BillingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServeletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            // Basahin ang mga halagang in-input mula sa dashboard form
            double consultation = Double.parseDouble(request.getParameter("consultationFee"));
            double lab = Double.parseDouble(request.getParameter("labFee"));
            double medicines = Double.parseDouble(request.getParameter("medicineCost"));
            double room = Double.parseDouble(request.getParameter("roomCharge"));
            
            // Formula-driven core calculations ng MediFlow MVP
            double grandTotal = consultation + lab + medicines + room;
            
            // Render ng Professional Automated Invoice Summary
            out.println("<html><head><style>");
            out.println("body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; background-color: #f4f6f9; }");
            out.println(".invoice { background: white; display: inline-block; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); border-top: 10px solid #e67e22; text-align: left; min-width: 350px; }");
            out.println(".item { display: flex; justify-content: space-between; margin: 10px 0; }");
            out.println("button { width: 100%; padding: 10px; background-color: #3498db; color: white; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; margin-top: 20px; }");
            out.println("</style></head><body>");
            out.println("<div class='invoice'>");
            out.println("<h2 style='text-align:center; color:#2c3e50;'>MediFlow HMS Invoice</h2>");
            out.println("<p style='text-align:center; font-size:12px; color:#7f8c8d;'>Flora, Apayao Branch Facility</p>");
            out.println("<hr>");
            out.println("<div class='item'><span>Consultation Fee:</span> <strong>₱" + consultation + "</strong></div>");
            out.println("<div class='item'><span>Laboratory Fee:</span> <strong>₱" + lab + "</strong></div>");
            out.println("<div class='item'><span>Medicine Costs:</span> <strong>₱" + medicines + "</strong></div>");
            out.println("<div class='item'><span>Room Charges:</span> <strong>₱" + room + "</strong></div>");
            out.println("<hr>");
            out.println("<div class='item' style='font-size:18px;'><span><strong>Grand Total:</strong></span> <span style='color: #e67e22;'><strong>₱" + grandTotal + "</strong></span></div>");
            out.println("<a href='index.jsp'><button>Back to Dashboard</button></a>");
            out.println("</div></body></html>");
            
        } catch (NumberFormatException e) {
            out.println("<h3>Error processing transaction formulas. Make sure all values entered are valid numbers.</h3>");
            out.println("<a href='index.jsp'>Return to Dashboard</a>");
        }
    }
}

