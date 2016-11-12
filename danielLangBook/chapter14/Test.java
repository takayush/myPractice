package chapter14;

import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {
	public Test() {
		System.out.println("Test Constructor is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Launch Application");
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Start method is invoked");
	}

}
