package com.company.jmixpm2_7_1.security;

import com.company.jmixpm2_7_1.entity.Document;
import com.company.jmixpm2_7_1.entity.Project;
import com.company.jmixpm2_7_1.entity.Task;
import com.company.jmixpm2_7_1.entity.User;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Project Management role", code = ProjectManagementRole.CODE, scope = "UI")
public interface ProjectManagementRole {
    String CODE = "project-management";

    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Project.class, actions = EntityPolicyAction.ALL)
    void project();

    @EntityAttributePolicy(entityClass = Document.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Document.class, actions = EntityPolicyAction.ALL)
    void document();

    @EntityAttributePolicy(entityClass = Task.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Task.class, actions = EntityPolicyAction.ALL)
    void task();

    @EntityAttributePolicy(entityClass = User.class, attributes = {"username", "active"}, action = EntityAttributePolicyAction.VIEW)
    @EntityAttributePolicy(entityClass = User.class, attributes = {"firstName", "lastName", "email"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = User.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void user();

    @MenuPolicy(menuIds = {"User.list", "Project.list", "Task_.list", "Document.list"})
    @ViewPolicy(viewIds = {"User.list", "Project.list", "Task_.list", "Document.list", "Document.detail", "Project.detail", "Task_.detail", "User.detail"})
    void screens();

}