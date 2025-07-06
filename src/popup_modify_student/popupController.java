package popup_modify_student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class popupController {

	// Storing variable which is set by Main class
	// Just incase we need to access them
	FXMLLoader loader;
	Scene scene;
	Stage primaryStage;

	@FXML
	private CheckBox cb_manufacturing;

	@FXML
	private Button btn_cancel;

	@FXML
	private CheckBox cb_customer;

	@FXML
	private Button btn_update;

	@FXML
	private CheckBox cb_internal;

	@FXML
	private CheckBox cb_authrequire;

	public FXMLLoader getLoader() {
		return loader;
	}

	public void setLoader(FXMLLoader loader) {
		this.loader = loader;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	@FXML
	void initialize() throws Exception {
		cb_internal.setSelected(true);
	}

	@FXML
	void handle_update(ActionEvent event) {
		UpdateComponentProperties.setCustomer(cb_customer.isSelected());
		UpdateComponentProperties.setManufacturing(cb_manufacturing.isSelected());
		UpdateComponentProperties.setInternal(cb_internal.isSelected());
		UpdateComponentProperties.setAuthRequire(cb_authrequire.isSelected());
		UpdateComponentProperties.setNewData(true);
		getPrimaryStage().close();
	}

	@FXML
	void handle_cancel(ActionEvent event) {
		UpdateComponentProperties.setNewData(false);
		getPrimaryStage().close();
	}

}