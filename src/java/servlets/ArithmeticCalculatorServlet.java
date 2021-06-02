
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("placeholder", "---");
     getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String numberOne = request.getParameter("first_number");
            String numberTwo = request.getParameter("second_number");
            
            request.setAttribute("firstNumber", numberOne);
            request.setAttribute("secondNumber", numberTwo);
            
            String calculate = request.getParameter("pressed");
            
            
            

            if(numberOne == null || numberOne.equals("") || numberOne.equals(" ") || Character.isLetter(numberOne.charAt(0))
                    || numberTwo == null || numberTwo.equals("") || numberTwo.equals(" ") || Character.isLetter(numberTwo.charAt(0))){
           //Message to help the user
            request.setAttribute("message", "Invalid Entry.");
            //forward the request and response objects to the JSP
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
                      

        }
//            int number_one = Integer.parseInt(numberOne);
//            int number_two = Integer.parseInt(numberTwo);
            
           if(calculate.equals("+")){
            int number_one = Integer.parseInt(numberOne);
            int number_two = Integer.parseInt(numberTwo) + number_one;
           
            request.setAttribute("answer", numberOne + " + " + numberTwo + " = " + number_two );
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
            
        }
            else if(calculate.equals("-")){
            int number_two = Integer.parseInt(numberTwo);
            int number_one = Integer.parseInt(numberOne) - number_two;
            
           
            request.setAttribute("answer", numberOne + " - " + numberTwo + " = " + number_one );
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
            
        }
            else if(calculate.equals("*")){
            int number_two = Integer.parseInt(numberTwo);
            int number_one = Integer.parseInt(numberOne) * number_two;
            
           
            request.setAttribute("answer", numberOne + " * " + numberTwo + " = " + number_one );
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        }
            else if(calculate.equals("%")){
            int number_two = Integer.parseInt(numberTwo);
            int number_one = Integer.parseInt(numberOne) % number_two;
            
           
            request.setAttribute("answer", numberOne + " % " + numberTwo + " = " + number_one );
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        } 

        }
  
        
    }