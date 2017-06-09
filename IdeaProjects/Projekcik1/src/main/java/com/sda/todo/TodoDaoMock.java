package com.sda.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 08.06.2017.
 */
public class TodoDaoMock implements TodoDao {
private List<TodoModel> todos;
public TodoDaoMock() {
    todos = new ArrayList<>();
    init();
}


private void init(){
        todos.add(new TodoModel("ZadanieDomowe", "Do zrobienia mam zadanie", false, 5, LocalDate.now()));
        todos.add(new TodoModel("Spotkanie", "Ze znajomymi", true, 1, LocalDate.now()));
        todos.add(new TodoModel("Impreza", "Do zrobienia ", false, 9, LocalDate.now()));

}


    @Override
    public List<TodoModel> getAllTodos() {
        return todos;
    }

    @Override
    public void addTodo(TodoModel todoModel) {
        todos.add(todoModel);
    }
}
