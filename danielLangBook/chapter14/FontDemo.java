package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new StackPane();
		Circle circle = new Circle(100, 100, 50, Color.ALICEBLUE);
		pane.getChildren().add(circle);

		// create label

		Label label = new Label();
		label.setText("JavaFx");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 20));
		pane.getChildren().add(label);
		

		primaryStage.setTitle("FontDemo");
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
