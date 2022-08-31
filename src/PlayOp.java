import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.File;
import java.net.MalformedURLException;

public class PlayOp {

    public PlayOp(String s) throws MalformedURLException {

        File f = new File(s);



        Media song = new Media(f.toURI().toURL().toString());
        MediaPlayer songPlayer = new MediaPlayer(song);

        Circle playCirc = new Circle(50);
        playCirc.setFill(Color.DARKSEAGREEN);
        EventHandler nextScene = new EventHandler() {
            @Override
            public void handle(Event event) {

            }

        };

        playCirc.setOnMouseClicked(nextScene);


    }

}
