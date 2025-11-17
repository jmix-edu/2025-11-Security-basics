package com.company.jmixpm2_7_1.view.document;

import com.company.jmixpm2_7_1.entity.Document;
import com.company.jmixpm2_7_1.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "documents/:id", layout = MainView.class)
@ViewController(id = "Document.detail")
@ViewDescriptor(path = "document-detail-view.xml")
@EditedEntityContainer("documentDc")
public class DocumentDetailView extends StandardDetailView<Document> {
}