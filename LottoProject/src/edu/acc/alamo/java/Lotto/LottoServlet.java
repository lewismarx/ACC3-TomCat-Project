package edu.acc.alamo.java.Lotto;

import sun.print.PrinterJobWrapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by lewis on 5/2/16.
 */
@WebServlet(name = "Lotto", urlPatterns = "/lotto", displayName = "lotto")

public class LottoServlet extends HttpServlet {
	
    protected LotteryDrawingIF simulator;

    /**
	 * 
	 */
	private static final long serialVersionUID = -2370917141047783346L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Lotto lotto = new Lotto();
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        String[] args = {"-b", "6", "-p", "54", "-y", "1" };
		if (args.length % 2 != 0) Lotto.die("Invalid number of arguments");
		Lotto.process_flags(args, lotto);  
//		out.println("Flags: -b " + lotto.num_lotto_balls + " -p " + lotto.max_ball_num
//				            + " -y " + lotto.simulation_years);

//		out.printf("\nThe odds are 1 in %,d using %d balls and %d ball numbers%n", 
//				              lotto.calc_odds(), lotto.num_lotto_balls, lotto.max_ball_num);
//		
        lotto.simulator = new LotteryDrawing(lotto.num_lotto_balls,
        		                             lotto.max_ball_num,
        		                             lotto.simulation_years);
		long start_time = Calendar.getInstance().getTimeInMillis();
        lotto.simulator.run_simulation();
//      lotto.simulator.run_simulation_using_Set();
		long elapsed = Calendar.getInstance().getTimeInMillis() - start_time;
		int i = 0;  // match counter
		out.println("Matches   Count  Percent");
ArrayList<String> resultnum = new ArrayList();
ArrayList<String> resultnext = new ArrayList();
ArrayList<String> resultyears = new ArrayList();
		for (int next_result : lotto.simulator.get_results()) {  // print one line per result
//			("%7s %7s %7.1f%%\n", i++, next_result, 
//					          (next_result/(lotto.simulation_years*104.))*100.);
			resultnum.add(String.valueOf(i++));
			resultnext.add(String.valueOf(next_result));
			double years = next_result/(lotto.simulation_years*104.)*100;
			resultyears.add(String.valueOf(years));
			
		}
		request.setAttribute("resultnum", resultnum);
		request.setAttribute("resultnext", resultnext);
		request.setAttribute("resultyears", resultyears);
		request.getRequestDispatcher("/Simulation.jsp").forward(request,response);
		
        
        


    }
    
    

}
