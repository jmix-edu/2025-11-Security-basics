package com.company.jmixpm2_7_1.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "CombinedManagerRole", code = CombinedManagerRole.CODE, scope = "UI")
public interface CombinedManagerRole extends UiMinimalRole,
        ProjectFullAccessRole,
        DocumentFullAccessRole,
        TaskFullAccessRole,
        UserPartialAccessRole{
    String CODE = "combined-manager-role";

}