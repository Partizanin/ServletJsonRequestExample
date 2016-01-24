import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with Intellij IDEA.
 * Project name: ServletJsonRequestExample.
 * Date: 24.01.2016.
 * Time: 15:59.
 * To change this template use File|Setting|Editor|File and Code Templates.
 */
@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain; charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        JSONObject sendObject = new JSONObject();


        try {
            sendObject.accumulate("text",new Word("Hello World!"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

        writer.println(sendObject);
        writer.flush();

    }
}
