package shapes.plain;

public interface FigureInterface {
    enum figureType {
        Square,
        Rectangle,
        Disk
    }
    default double area(Figure figure) {
        switch (figure.figureType) {
            case "Square","Rectangle":
                return figure.length* figure.width;
            case "Disk":
                return Math.PI*Math.pow(figure.radius,2);
            default:
                System.out.println("Error");
                break;

        }

        return 0;
    }

}
