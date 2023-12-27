package frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;

/**
 * Servlet implementation class Frontcontroller
 */
@WebServlet("/Frontcontroller")
public class Frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Frontcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegionDAO regionDAO = new RegionDAO();
		try {
			List<RegionDTO> ar  = regionDAO.getList();
			PrintWriter out = response.getWriter();
			out.print("<h1>Myhome</h1>");
			out.println("<table>");
			for(RegionDTO regionDTO:ar) {
			out.println("<tr>");
			out.println("<td>");
			out.println(regionDTO.getRegion_id());
			out.println("</td>");
			out.println("<td>");
			out.println(regionDTO.getRegion_name());
			out.println("</td>");
			out.println("</tr>");
			}
			out.println("</table>");
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("요청발생");
	      
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
