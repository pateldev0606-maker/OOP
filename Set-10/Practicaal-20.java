
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class BouncingBallFX extends Application {

    private double dx = 2; 
    private boolean running = false;

    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();
        pane.setPrefSize(600, 400);

        Circle ball = new Circle(20, Color.BLUE);
        ball.setCenterX(50);
        ball.setCenterY(200);

        Button startBtn = new Button("Start");
        Button stopBtn = new Button("Stop");

        Slider speedSlider = new Slider(1, 10, 2);
        speedSlider.setShowTickLabels(true);

        HBox controls = new HBox(10, startBtn, stopBtn, speedSlider);
        controls.setAlignment(Pos.CENTER);
        controls.setLayoutY(350);

        pane.getChildren().addAll(ball, controls);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (!running) return;

                double radius = ball.getRadius();

                dx = speedSlider.getValue();

                ball.setCenterX(ball.getCenterX() + dx);

                if (ball.getCenterX() + radius >= pane.getWidth() || 
                    ball.getCenterX() - radius <= 0) {
                    dx = -dx;
                }
            }
        };

        startBtn.setOnAction(e -> {
            running = true;
            timer.start();
        });

        stopBtn.setOnAction(e -> running = false);

        Scene scene = new Scene(pane);
        stage.setTitle("Bouncing Ball JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}        // package name BouncingBallFX.java
