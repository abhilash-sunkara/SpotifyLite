import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

import java.awt.desktop.SystemSleepEvent;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final int stageX = 1500;
        final int stageY = 800;

        stage.setTitle("SpotifyLite");
        Group startGroup = new Group();
        Scene startScene = new Scene(startGroup, stageX, stageY);

        Rectangle backRect = new Rectangle(stageX, stageY);
        backRect.setX(0);
        //backRect.setY(-640);
        backRect.setFill(Color.BLACK);

        FadeTransition rectFade = new FadeTransition();
        rectFade.setDuration(Duration.millis(2000));
        rectFade.setFromValue(0.1);
        rectFade.setToValue(10);
        rectFade.setNode(backRect);
        rectFade.setCycleCount(1);
        EventHandler <ActionEvent> stopFade = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                rectFade.pause();
                System.out.println("pause");
            }
        };

        rectFade.play();






        startGroup.getChildren().add(backRect);

        stage.setScene(startScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}