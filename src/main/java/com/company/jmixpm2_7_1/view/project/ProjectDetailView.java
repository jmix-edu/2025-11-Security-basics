package com.company.jmixpm2_7_1.view.project;

import com.company.jmixpm2_7_1.entity.Project;
import com.company.jmixpm2_7_1.entity.User;
import com.company.jmixpm2_7_1.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "projects/:id", layout = MainView.class)
@ViewController(id = "Project.detail")
@ViewDescriptor(path = "project-detail-view.xml")
@EditedEntityContainer("projectDc")
public class ProjectDetailView extends StandardDetailView<Project> {

    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Project> event) {
        final User user = (User) currentAuthentication.getUser();
        event.getEntity().setManager(user);
    }
}