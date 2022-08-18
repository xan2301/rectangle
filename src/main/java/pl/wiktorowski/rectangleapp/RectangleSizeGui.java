package pl.wiktorowski.rectangleapp;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route

public class RectangleSizeGui extends VerticalLayout {


    private RectangleRepo rectangleRepo;

    private TextArea textAreaRectangle;

    @Autowired

    public RectangleSizeGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
        textAreaRectangle = new TextArea();

        textAreaRectangle.setValue(rectangleRepo.getBigRectangles().toString());

        add(textAreaRectangle);

    }
}
