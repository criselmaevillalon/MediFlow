# 🏥 MediFlow Hospital Management System (HMS) - MVP

*MediFlow* is a dynamic web application built using Java (Jakarta EE), Servlets, and JSPs inside the Eclipse IDE. This project is specifically designed to address the healthcare workflow opportunities and core operational demands for facilities located in *Flora, Apayao*.

---

## 🌟 Core MVP Pillars (Yellow Scope)
The Minimum Viable Product (MVP) digitizes three fundamental areas of daily hospital administration:
1. **Patient Record Management (PatientServlet.java)** – Safe, electronic recording of patient names and medical health histories to remove manual paperwork.
2. **Room & Doctor Scheduling (ScheduleServlet.java)** – Real-time allocation engine mapping available medical staff to designated hospital wards and private rooms.
3. **Automated Medical Billing (BillingServlet.java)** – Formula-driven calculator summing up consultation fees, laboratory fees, medicine costs, and room charges to optimize discharge speed and prevent human calculation errors.

---

## 🏗️ Technical Stack & Architecture
* *Frontend Interface:* JSP (JavaServer Pages), Responsive HTML5, and CSS Layouts (index.jsp)
* *Backend Controller:* Java Servlets mapped via Jakarta Enterprise web infrastructure (com.mediflow.system)
* *Deployment Descriptor:* Server routing rules mapped securely using configurations (web.xml)
* *Target Runtime Engine:* Apache Tomcat Server (v9.0 / v10.x compatible)

---

## 💻 How to Run the Project in Eclipse

Follow these configuration steps to spin up the local hosting environment:

1. *Clone/Download the Files:* Download this repository workspace code directly onto your computer.
2. *Import into Eclipse:* Open Eclipse IDE for Enterprise Java and Web Developers ➔ Go to File ➔ Import... ➔ Select Existing Projects into Workspace.
3. *Configure the Tomcat Server Runtime:*
   * Right-click the project folder ➔ Select *Properties*.
   * Click *Targeted Runtimes* and check your local *Apache Tomcat Server* instance.
4. *Deploy and Launch:*
   * Right-click index.jsp or the project root folder.
   * Select *Run As* ➔ *Run on Server*.
   * The system dashboard will automatically open in the browser at: http://localhost:8080/MediFlow/

---
Developed as a structured software engineering architecture submission.
localhost

