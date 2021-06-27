/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raushan PC
 */
@WebServlet(urlPatterns = {"/ManageEmpSerevlet"})
public class ManageEmpServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ManageEmpServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ManageEmpServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String EmpId = request.getParameter("empid");
        String EmpName = request.getParameter("empname");
        String EmpCNo = request.getParameter("empcno");
        String EmpAdd = request.getParameter("empadd");
        String EmpEmail = request.getParameter("empemail");
        String EmpSex = request.getParameter("sex");
        String EmpOpt = request.getParameter("operation");
        PrintWriter out = response.getWriter();
        
        if(EmpOpt.equals("Insert")){
            try {
                String driver="com.mysql.jdbc.Driver";
                Class.forName(driver);
                String url="jdbc:mysql://localhost:3306/leavedb";
                Connection con=DriverManager.getConnection(url,"root","");
                String sql= "INSERT INTO user  VALUES('"+EmpId+"', '"+EmpName+"' , '"+EmpCNo+"', '"+EmpAdd+"','"+EmpEmail+"','"+EmpSex+",'"+EmpOpt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);  
                out.println("<script>alert('You Have Succsessfully Inserted Emp Info')</script>");
                RequestDispatcher rd = request.getRequestDispatcher("ManEmp.jsp");
            }
            catch(ClassNotFoundException | SQLException ex){
            }
        }
        else if(EmpOpt.equals("Update")){
            try {
                String driver="com.mysql.jdbc.Driver";
                Class.forName(driver);
                String url="jdbc:mysql://localhost:3306/leavedb";
                Connection con=DriverManager.getConnection(url,"root","");
                String sql= "UPDATE user SET('"+EmpId+"', '"+EmpName+"' , '"+EmpCNo+"', '"+EmpAdd+"','"+EmpEmail+"','"+EmpSex+",'"+EmpOpt+") WHERE empid="+EmpId+"";
                Statement st=con.createStatement();
                st.executeUpdate(sql); 
                out.println("<script>alert('You Have Succsessfully Updated Emp Info')</script>");
                RequestDispatcher rd = request.getRequestDispatcher("ManEmp.jsp");

            }
            catch(ClassNotFoundException | SQLException ex){
            }
        }
        else if(EmpOpt.equals("Delete")){
            try {
                String driver="com.mysql.jdbc.Driver";
                Class.forName(driver);
                String url="jdbc:mysql://localhost:3306/leavedb";
                Connection con=DriverManager.getConnection(url,"root","");
                String sql= "DELETE FROM user WHERE empid="+EmpId+"";
                Statement st=con.createStatement();
                st.executeUpdate(sql);  
                out.println("<script>alert('You Have Succsessfully Deleted Emp Info')</script>");
                RequestDispatcher rd = request.getRequestDispatcher("ManEmp.jsp");

            }
            catch(ClassNotFoundException | SQLException ex){
            }
        }
        else{
            out.println("<script>alert('Oops Somthing Went Wrong!!')</script>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
