package com.sda.todo;

import java.util.List;

/**
 * Created by lenovo on 08.06.2017.
 */
public interface TodoDao {
   List<TodoModel> getAllTodos();
   void addTodo(TodoModel todoModel);

}
