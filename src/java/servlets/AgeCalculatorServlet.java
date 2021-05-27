
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          //getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

          String age = request.getParameter("user_age");
          
          if(age == null || age.equals("") || age.equals(" ") || Character.isLetter(age.charAt(0))){
           //Message to help the user
            request.setAttribute("message", "Invalid Entry, Please enter your current age as a digit.");
            //forward the request and response objects to the JSP
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
                      

        }else{
          int number = Integer.parseInt(age) +  1;
          request.setAttribute("answer", "Your age next birthday is " + number );
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
          }
        }
  
        
    }

