import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Templates {

    public void fadeIn(FadeTransition ft, Node n){
        ft.setDuration(Duration.millis(2000));
        ft.setFromValue(0.1);
        ft.setToValue(0.9);
        ft.setNode(n);
        ft.setCycleCount(1);
        ft.play();
    }

    public Node ImgNode(String s) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(s);
        Image i = new Image(fis);
        return new ImageView(i);
    }

}
