import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class Guess extends HttpServlet {

    Random random = new Random();
    int min = 1;
    int max = 3;
    int num = (int) (Math.random() * (max - min )) + min;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userGuess = Integer.parseInt(req.getParameter("guess"));
        if (userGuess == num) {
            resp.sendRedirect("/correct");
        } else {
            resp.sendRedirect("/incorrect");
        }
    }
}
