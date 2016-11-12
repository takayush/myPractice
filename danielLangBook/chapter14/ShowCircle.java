package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setRadius(20);
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.ANTIQUEWHITE);
		
		//create a pane to hold a circle
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("circle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
