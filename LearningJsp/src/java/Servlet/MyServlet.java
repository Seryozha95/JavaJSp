package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Seryozha
 */
public class MyServlet extends HttpServlet {

    int a = 0;
    String CT = "";
    String docType
            = "<!doctype html public \"-//w3c//dtd html 4.0 "
            + "transitional//en\">\n";
    String content = "<html>\n"
            + "<head><title><TITLE></title></head>\n"
            + "<body bgcolor=\"#f0f0f0\">\n"
            + "<h1 align=\"center\"><TITLE></h1>\n"
            + "<p>Current Time is: <CT></p>\n";
    String title = "Auto Page Refresh using Servlet";
    Calendar calendar = null;

    public void init() throws ServletException {
    }

    public void getCurrentTime() {
        String am_pm;
        this.calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        if (calendar.get(Calendar.AM_PM) == 0) {
            am_pm = "AM";
        } else {
            am_pm = "PM";
        }
        CT = hour + ":" + minute + ":" + second + " " + am_pm;
    }

    public void destroy() {
        // Finalization code...
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setIntHeader("Refresh", 1);
        this.getCurrentTime();
        PrintWriter out = response.getWriter();
        out.println(this.content.replaceAll("<TITLE>", this.title).replaceAll("<CT>", this.CT));
        out.flush();
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        out.write("<h1><font color=\"green\">POST</font></h1>");
        out.flush();
        out.close();
    }
}
