package chapter14;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowGridPane extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		gridPane.setVgap(5.5);
		gridPane.setHgap(5.5);
		
		//place nodes in the pane
		gridPane.add(new Label("First Name:"), 0, 0);
		gridPane.add(new TextField(), 1, 0);
		gridPane.add(new Label("MI:"), 0, 1);
		gridPane.add(new TextField(), 1, 1);
		gridPane.add(new Label("Last Name:"), 0, 2);
		gridPane.add(new TextField(), 1, 2);
		Button btnAdd = new Button("Add Name");
		gridPane.add(btnAdd, 1, 3);
		GridPane.setHalignment(btnAdd, HPos.RIGHT);
		
		//Create scene and place it in the stage
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
