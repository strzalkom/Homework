package com.sda.todo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 09.06.2017.
 */
public class AddTodoChainElement implements TodoChainElement {
    //    dodac warstwe klasy abstrakcyjnej + przerobic pozostale elementy pod klase abstrakcyjna
    private String path;
    private TodoDao todoDao;
    private TodoView todoView;

    public AddTodoChainElement(String path, TodoDao todoDao, TodoView todoView) {
        this.path = path;
        this.todoDao = todoDao;
        this.todoView = todoView;
    }


    @Override
    public boolean isMyResponsibility(String path) {
        return this.path.equals(path);
    }

    @Override
    public String action(HttpServletRequest req, HttpServletResponse resp) {
        String valueToReturn = "<h1>OK</h1>";
        if (TodoUtil.isWriteRequest(req)) {
            TodoModel todoModel = TodoMapper.map(req);
            todoDao.addTodo((todoModel));
        } else {
            valueToReturn = todoView.showAddForm();
        }
            return valueToReturn;
        }
}