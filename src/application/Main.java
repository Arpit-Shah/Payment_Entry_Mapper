package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.getIcons().add(new Image(ClassLoader.getSystemResourceAsStream("icons/arpitos_icon16x16.png")));
			primaryStage.setTitle(Static_Store.toolName + " " + Static_Store.currentRevision);
			primaryStage.setScene(scene);

			// Do not make it resizable
//			primaryStage.resizableProperty().setValue(Boolean.FALSE);

			// storing variable to main controller, just in case controller need
			// access of any of it
			MainController controller = (MainController) loader.getController();
			controller.setLoader(loader);
			controller.setScene(scene);
			controller.setPrimaryStage(primaryStage);

			// Close Application upon user request
			primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
				@Override
				public void handle(WindowEvent t) {
					System.out.println("User exits");
					Platform.exit();
					
					// Ensure background processes are closed
					System.exit(0);
				}
			});

			// show stage
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
