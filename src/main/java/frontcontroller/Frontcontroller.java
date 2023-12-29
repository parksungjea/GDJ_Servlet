package frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/FrontController")
public class Frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	 public Frontcontroller() {
		 super();
	 } // TODO Auto-generated constructor stub }
	 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		String contextPath = request.getContextPath();
//		System.out.println("contexPath : "+contextPath);
//		String method = request.getMethod();
//		System.out.println("method : "+method);
//		
//		 String pathInfo = request.getPathInfo();
//		 System.out.println("pathInfo : " + pathInfo);
//		 String uri = request.getRequestURI();
//		 System.out.println("uri : "+uri);
//		 String url = request.getRequestURL().toString();
//		 System.out.println("url : "+url);
//		 System.out.println(n);
//		 String [] names = uri.split("/");
//		 
//		 System.out.println(names.length);
//		 for(String n: names) {
//		 }
		String uri = request.getRequestURI();
		String [] names = uri.split("/");
		String v = "/WEB-INF/views/index.jsp";
		try {
			if(names[1].equals("regions")) {
				//regionDAO 사용
				RegionDAO regionDAO = new RegionDAO();
				if(names[2].equals("list")){
					List<RegionDTO> ar = regionDAO.getList();
					request.setAttribute("list", ar);
					v = "/WEB-INF/views/regions/list.jsp";
				}else if(names[2].equals("Detail")) {
					String id = request.getParameter("region_id");
					RegionDTO regionDTO = new RegionDTO();
					regionDTO.setRegion_id(Integer.parseInt(id));
					regionDTO = regionDAO.getDetail(regionDTO);
					v = "/WEB-INF/views/regions/Detail.jsp";
					request.setAttribute("dto", regionDTO);
				}
			}else if(names[1].equals("countries")) {
				//countriesDAO 사용
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
	//jsp의 절대경로
		 RequestDispatcher view =
		 request.getRequestDispatcher(v);
		 view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
