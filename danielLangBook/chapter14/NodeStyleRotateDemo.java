package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane pane = new StackPane();
		pane.setMaxWidth(100);
		Button btnOk = new Button("Ok");
		btnOk.setStyle("-fx-border-color:blue;");
		pane.getChildren().add(btnOk);
		pane.setRotate(45);
		pane.setStyle("-fx-border-color:grey;-fx-background-color:red;");
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		Scene scene =  new Scene(pane, 100, 100);

		primaryStage.setTitle("NodeStyleRotate");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
