package shapes.plain;

import java.util.Date;

public class Figure implements FigureInterface {
    Figure figure = new Figure();
    String figureId, figureType, version, createdBy;
    double length, width, radius;
    Date createdAt, lastModifiedAt, lastModifiedBy;

    @Override
    public double area(Figure figure) {
        return 0;
    }
}