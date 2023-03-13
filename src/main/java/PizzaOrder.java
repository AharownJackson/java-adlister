import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza-order")
public class PizzaOrder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pizzaOrder.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] toppings = req.getParameterValues("toppings");
        String address = req.getParameter("address");
        System.out.println("Your crust is: " + crust);
        System.out.println("Your sauce is: " + sauce);
        System.out.println("Your toppings are: " + Arrays.toString(toppings));
        System.out.println("We are delivering this pie to: " + address);
    }
}
