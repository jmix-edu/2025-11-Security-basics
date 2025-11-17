package com.company.jmixpm2_7_1.view.document;

import com.company.jmixpm2_7_1.entity.Document;
import com.company.jmixpm2_7_1.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "documents", layout = MainView.class)
@ViewController(id = "Document.list")
@ViewDescriptor(path = "document-list-view.xml")
@LookupComponent("documentsDataGrid")
@DialogMode(width = "64em")
public class DocumentListView extends StandardListView<Document> {
}