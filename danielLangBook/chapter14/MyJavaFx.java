package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;
public class MyJavaFx extends Application{
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		javafx.scene.control.Button btn = new javafx.scene.control.Button("Ok");
	    Scene scene = new Scene(btn, 200, 250);
	    primaryStage.setTitle("MyJavaFX"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
