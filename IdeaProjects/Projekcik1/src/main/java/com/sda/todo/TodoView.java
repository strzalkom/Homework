package com.sda.todo;

import java.util.List;

/**
 * Created by lenovo on 08.06.2017.
 */
public interface TodoView {
    String show(List<TodoModel> todos);

    String show(TodoModel model);
    String showAddForm();
}
