package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("Ok"));
		Scene scene = new Scene(pane,400,200);
		primaryStage.setTitle("pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
