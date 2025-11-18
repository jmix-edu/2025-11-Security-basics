package com.company.jmixpm2_7_1.security;

import com.company.jmixpm2_7_1.entity.Document;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "RestrictedDocumentsRole", code = RestrictedDocumentsRole.CODE)
public interface RestrictedDocumentsRole {
    String CODE = "restricted-documents-role";

    @JpqlRowLevelPolicy(entityClass = Document.class,
            join = "join {E}.project proj",
            where = "proj.manager.id = :current_user_id " +
                    "or {E}.createdBy = :current_user_username")
    void document();
}