package com.company.jmixpm2_7_1.security;

import com.company.jmixpm2_7_1.entity.User;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "UserPartialAccess", code = UserPartialAccessRole.CODE, scope = "UI")
public interface UserPartialAccessRole {
    String CODE = "user-partial-access";

    @EntityAttributePolicy(entityClass = User.class, attributes = {"active", "username"}, action = EntityAttributePolicyAction.VIEW)
    @EntityAttributePolicy(entityClass = User.class, attributes = {"lastName", "firstName", "email"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = User.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void user();

    @MenuPolicy(menuIds = "User.list")
    @ViewPolicy(viewIds = {"User.list", "User.detail"})
    void screens();
}