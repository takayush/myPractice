package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(5,5,5,5));
		pane.setHgap(10);
		pane.setVgap(10);
		
		
		//place nodes in pane especially label
		pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
		
		//create a scene and place it on the stage	
		Scene scene = new Scene(pane,300,250);
		primaryStage.setTitle("ShowFlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
