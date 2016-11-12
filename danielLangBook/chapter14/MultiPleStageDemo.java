package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiPleStageDemo extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Hi");
		Scene scene = new Scene(btn, 200, 210);
		primaryStage.setTitle("First Stage");
		primaryStage.setScene(scene);
		primaryStage.show();
		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene (new Button("Cancel"),100,100));
		stage.show();
		
	
		
	}

}
