package popup_modify_student;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_ModifyComponent extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("updatepopup.fxml"));// FXMLLoader.load(getClass().getResource());
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Modify Component");
			primaryStage.setScene(scene);

			// storing variable to main controller, just incase controller need
			// access of any of it
			popupController controller = (popupController) loader.getController();
			controller.setLoader(loader);
			controller.setScene(scene);
			controller.setPrimaryStage(primaryStage);

			// this will only close particular stage
			primaryStage.setOnCloseRequest(e -> {
				try {
					primaryStage.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			});

			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			// show stage
			primaryStage.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
