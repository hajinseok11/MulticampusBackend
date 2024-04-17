package basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Ex07_CalcServlet
 */
@WebServlet(name = "calc", urlPatterns = { "/calc.do" })
public class Ex07_CalcServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 한글셋팅과 출력스트림 구하기
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out = response.getWriter();
				// 클라이언트가 입력한 요청정보를 추출
				String num1 = request.getParameter("num1");
				String num2 = request.getParameter("num2");
				String method = request.getParameter("method");
		
				// 응답메시지를 생성
				out.print("<h1>계산결과</h1>");
				out.println("<hr/>");
				if (method.equals("+")) {
					out.print("<h3>num1의" + num1+"과 num2의"+num2+" 를 연산한 결과는 "+ 
				(Integer.parseInt(num1)+Integer.parseInt(num2))+" 입니다.</h3>");
				} else if (method.equals("-")) {
					out.print("<h3>num1의" + num1+"과 num2의"+num2+" 를 연산한 결과는 "+ 
				(Integer.parseInt(num1)-Integer.parseInt(num2))+" 입니다.</h3>");
				} else if (method.equals("*")) {
					out.print("<h3>num1의" + num1+"과 num2의"+num2+" 를 연산한 결과는 "+ 
				(Integer.parseInt(num1)*Integer.parseInt(num2))+" 입니다.</h3>");
				} else if (method.equals("/")) {
					out.print("<h3>num1의" + num1+"과 num2의"+num2+" 를 연산한 결과는 "+ 
				(Integer.parseInt(num1)/Integer.parseInt(num2))+" 입니다.</h3>");
				}							
	}
}
