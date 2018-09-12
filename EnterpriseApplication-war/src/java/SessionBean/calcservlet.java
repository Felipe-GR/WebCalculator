package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calcservlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/calculatorStyles.css\">");
            out.println("<title>Servlet calcservlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='calc-contain'>");
            out.println("<form name=\"calculator\">");
            out.println("<input type=\"text\" name=\"answer\" ");

            String answer = request.getParameter("answer");
            String[] parts;

            if (answer.contains("+")) {
                parts = answer.split("\\+");
                int numberOne = Integer.parseInt(parts[0]);
                int numberTwo = Integer.parseInt(parts[1]);
                out.println("<input type=\"text\" name=\"answer\" value=\"" + calcbean.addition(numberOne, numberTwo) + "\" />");
            }
            if (answer.contains("-")) {
                parts = answer.split("-");
                int numberOne = Integer.parseInt(parts[0]);
                int numberTwo = Integer.parseInt(parts[1]);
                out.println("<input type=\"text\" name=\"answer\" value=\"" + calcbean.subtraction(numberOne, numberTwo) + "\" />");
            }
            if (answer.contains("*")) {
                parts = answer.split("\\*");
                int numberOne = Integer.parseInt(parts[0]);
                int numberTwo = Integer.parseInt(parts[1]);
                out.println("<input type=\"text\" name=\"answer\" value=\"" + calcbean.multiplication(numberOne, numberTwo) + "\" />");
            }
            if (answer.contains("/")) {
                parts = answer.split("/");
                int numberOne = Integer.parseInt(parts[0]);
                int numberTwo = Integer.parseInt(parts[1]);
                out.println("<input type=\"text\" name=\"answer\" value=\"" + calcbean.division(numberOne, numberTwo) + "\" />");
            }

            out.println("<br>");
            out.println("<input type=\"button\" value=\" 1 \" onclick=\"calculator.answer.value += '1'\" />");
            out.println("<input type=\"button\" value=\" 2 \" onclick=\"calculator.answer.value += '2'\" />");
            out.println("<input type=\"button\" value=\" 3 \" onclick=\"calculator.answer.value += '3'\" />");
            out.println("<input type=\"button\" value=\" + \" onclick=\"calculator.answer.value += '+'\" />");
            out.println("<br/>");
            out.println("<input type=\"button\" value=\" 4 \" onclick=\"calculator.answer.value += '4'\" />");
            out.println("<input type=\"button\" value=\" 5 \" onclick=\"calculator.answer.value += '5'\" />");
            out.println("<input type=\"button\" value=\" 6 \" onclick=\"calculator.answer.value += '6'\" />");
            out.println("<input type=\"button\" value=\" - \" onclick=\"calculator.answer.value += '-'\" />");
            out.println("</br>");
            out.println("<input type=\"button\" value=\" 7 \" onclick=\"calculator.answer.value += '7'\" />");
            out.println("<input type=\"button\" value=\" 8 \" onclick=\"calculator.answer.value += '8'\" />");
            out.println("<input type=\"button\" value=\" 9 \" onclick=\"calculator.answer.value += '9'\" />");
            out.println("<input type=\"button\" value=\" x \" onclick=\"calculator.answer.value += '*'\" />");
            out.println("</br>");
            out.println("<input type=\"button\" value=\" c \" onclick=\"calculator.answer.value = ''\" />");
            out.println("<input type=\"button\" value=\" 0 \" onclick=\"calculator.answer.value += '0'\" />");
            out.println("<input type=\"submit\" value=\" = \" />");
            out.println("<input type=\"button\" value=\" / \" onclick=\"calculator.answer.value += '/'\" />");
            out.println("</br>");
            out.println("</form>");
            out.println("<div id=\"agh\">");
            out.println("<p>Develop by: D-Tech");
            out.println("</div>");
            out.println("</div>");
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
        processRequest(request, response);
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
