package pixeleditor.domain;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;


public abstract class Tool {

    private final String iconFileName;

    /**
     * A constructor for all subclasses.
     * @param iconFileName name of the image file located in resources/images that's to be used as an icon
     */
    protected Tool(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    /**
     * Returns the filename of the icon.
     * @return name of the image file located in resources/images that is used as an icon for this tool
     */
    public String getIconFileName() {
        return this.iconFileName;
    }
    
    /**
     * An abstract method for updating the canvas when mouse is clicked on it.
     * @param gc GraphicsContext for updating the canvas
     * @param e  MouseEvent that was triggered on the canvas
     */
    public abstract void mousePressed(GraphicsContext gc, MouseEvent e);

    /**
     * An abstract method for updating the canvas when mouse is dragged on it.
     * @param gc GraphicsContext for updating the canvas
     * @param e  MouseEvent that was triggered on the canvas
     */
    public abstract void mouseDragged(GraphicsContext gc, MouseEvent e);

    /**
     * An abstract method for updating the canvas when mouse is released on it.
     * @param gc GraphicsContext for updating the canvas
     * @param e  MouseEvent that was triggered on the canvas
     */
    public abstract void mouseReleased(GraphicsContext gc, MouseEvent e);  
}
