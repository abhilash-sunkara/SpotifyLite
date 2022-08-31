import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;

public class MediaHandler {
    public MediaHandler(Stage s) throws MalformedURLException {


        String source = "C:/Users/abhil/Downloads/Videos/Material/CantTellMeNothing.mp4";
        File f = new File("C:/Users/abhil/Downloads/Videos/Material/CantTellMeNothing.mp4");
        Media media = new Media(f.toURI().toURL().toString());
        MediaPlayer mp = new MediaPlayer(media);

        MediaView mv = new MediaView(mp);



    }

    public void changeSong(MediaPlayer mp){




    }

}
