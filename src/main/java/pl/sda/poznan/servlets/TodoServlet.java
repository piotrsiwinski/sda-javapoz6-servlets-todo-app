package pl.sda.poznan.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.sda.poznan.repository.TodoRepository;
import pl.sda.poznan.service.TodoService;
import util.PersistenceUtil;

@WebServlet(name = "TodoServlet", urlPatterns = {"/todo"})
public class TodoServlet extends HttpServlet {

  private TodoService todoService;

  public TodoServlet() {
    this.todoService = new TodoService(new TodoRepository(PersistenceUtil.getEntityManager()));
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("/todo/index.jsp").forward(req, resp);
  }
}
