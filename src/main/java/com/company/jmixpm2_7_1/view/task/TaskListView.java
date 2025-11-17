package com.company.jmixpm2_7_1.view.task;

import com.company.jmixpm2_7_1.entity.Task;
import com.company.jmixpm2_7_1.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "tasks", layout = MainView.class)
@ViewController(id = "Task_.list")
@ViewDescriptor(path = "task-list-view.xml")
@LookupComponent("tasksDataGrid")
@DialogMode(width = "64em")
public class TaskListView extends StandardListView<Task> {
}