package com.sda.todo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;


public class TodoServlet extends HttpServlet {
    private TodoDao todoDao;
    private TodoView todoView;
private TodoChain todoChain;
    //    public static void main(String[] args) {
//       List<String> todos = Arrays.asList("Banicja", "Anna", "Grzechu");
//       todos.stream()
//               .flatMap(e-> Arrays.asList(e.toCharArray()).stream())
//               .map(e-> new String(e).toLowerCase())
//               .distinct()
//               .sorted()
//               .forEach(e-> System.out.println(e));
//    }
    @Override
    public void init() throws ServletException {
        todoDao = new TodoDaoFile(getServletContext(),"/todo/data");
        todoView = new TodoViewHtml();
        todoChain = new TodoChain(todoView, todoDao);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println(todoChain.invoke(req, resp));
//        List<TodoModel> allTodos = todoDao.getAllTodos();
//        String todosView = todoView.show(allTodos);
//        System.out.println(todosView);
//        writer.println(todosView);
    }
}
//        writer.println("<ul>");
//       for (TodoModel model:allTodos) {
//           writer.println("<h3>"+model.getDate().toString() + "</h3>");
//           writer.println("<h1>"+model.getName() + "</h1>");
//           writer.println("<li>");
//           writer.println("<p>"+model.getDescription() + "</p>");
//           writer.print("<p>");
//           for (int i = 0; i < model.getPriority(); i++) {
//               writer.print("X");
//           }
//           writer.print("</p>");
//           writer.print("</li>");
//           }
//
//
//        writer.println("</ul>'");
//    }
//}



//<!----> startup.bat = uruchamia tomcata