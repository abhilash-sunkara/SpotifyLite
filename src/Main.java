import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;

import java.io.FileNotFoundException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Templates tTemplate = new Templates();
        startMenu(stage, tTemplate);
    }

    public static void main(String[] args) {

        launch();
    }

    public void startMenu(Stage stage, Templates t) throws FileNotFoundException {
        final double stageX = 1500;
        final double stageY = 800;

        stage.setTitle("SpotifyLite");
        Group startGroup = new Group();
        Scene startScene = new Scene(startGroup, stageX, stageY);

        Rectangle backRect = new Rectangle(stageX, stageY);
        backRect.setX(0);
        backRect.setFill(Color.BLACK);

        Button buttonRect = new Button();
        buttonRect.setGraphic(t.ImgNode("src/StartLogo.png"));
        buttonRect.setTranslateX(stageX/2-150);
        buttonRect.setTranslateY(stageY/3+150);
        buttonRect.setBackground(Background.fill(Color.DARKSEAGREEN));
        buttonRect.setMinHeight(stageY/10);
        buttonRect.setMinWidth(stageX/5);
        EventHandler<ActionEvent> nextScene = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                playMenu(stage, t);
            }
        };

        buttonRect.setOnAction(nextScene);



        FadeTransition rectFade = new FadeTransition();
        t.fadeIn(rectFade, backRect);
        t.fadeIn(rectFade, buttonRect);



        startGroup.getChildren().add(backRect);
        startGroup.getChildren().add(buttonRect);

        stage.setScene(startScene);
        stage.show();
    }

    public void playMenu(Stage stage, Templates t){
        final double stageX = 1500;
        final double stageY = 800;

        Group menuGroup = new Group();
        Scene menuScene = new Scene(menuGroup, stageX, stageY);

        Rectangle backRect = new Rectangle(stageX, stageY);
        backRect.setX(0);
        backRect.setFill(Color.BLACK);
        backRect.setOpacity(0.9);

        menuGroup.getChildren().add(backRect);

        stage.setScene(menuScene);


    }
}