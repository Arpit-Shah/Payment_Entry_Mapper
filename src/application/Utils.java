package application;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;

import com.opencsv.CSVReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DialogPane;
import javafx.util.Callback;

public class Utils {

	public static Alert createAlertWithOptOut(AlertType type, String title, String headerText, String message,
			String optOutMessage, Callback<Boolean, Void> optOutAction, ButtonType... buttonTypes) {
		Alert alert = new Alert(type);
		// Need to force the alert to layout in order to grab the graphic,
		// as we are replacing the dialog pane with a custom pane
		alert.getDialogPane().applyCss();
		Node graphic = alert.getDialogPane().getGraphic();
		// Create a new dialog pane that has a checkbox instead of the hide/show
		// details button
		// Use the supplied callback for the action of the checkbox
		alert.setDialogPane(new DialogPane() {
			@Override
			protected Node createDetailsButton() {
				CheckBox optOut = new CheckBox();
				optOut.setText(optOutMessage);
				optOut.setOnAction(e -> optOutAction.call(optOut.isSelected()));
				return optOut;
			}
		});
		alert.getDialogPane().getButtonTypes().addAll(buttonTypes);
		alert.getDialogPane().setContentText(message);
		// Fool the dialog into thinking there is some expandable content
		// a Group won't take up any space if it has no children
		alert.getDialogPane().setExpandableContent(new Group());
		alert.getDialogPane().setExpanded(true);
		// Reset the dialog graphic using the default style
		alert.getDialogPane().setGraphic(graphic);
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		return alert;
	}

	/**
	 * Show Confirmation Dialog for user
	 * 
	 * @param title
	 * @param data
	 * @return
	 */
	public static boolean createConfirmationDialog(String title, String data) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation");
		alert.setHeaderText(title);
		alert.setContentText(data);

		// set width
		alert.setResizable(true);
		alert.getDialogPane().setPrefWidth(680);

		Optional<ButtonType> result = alert.showAndWait();

		if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
			return true;
		}
		return false;
	}

	/**
	 * Show Information Dialog for user
	 * 
	 * @param data
	 */
	public static void createInformationDialog(String data) {
		createInformationDialog("Information/Warning", data);
	}

	/**
	 * Show Information Dialog for user
	 * 
	 * @param data
	 */
	public static void createInformationDialog(String headerText, String data) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText(headerText);
		alert.setContentText(data);

		// set width
		alert.setResizable(true);
		alert.getDialogPane().setPrefWidth(680);

		alert.showAndWait();
	}

	/**
	 * Get the method name for a depth in call stack.
	 * 
	 * <PRE>
	 * depth in the call stack 
	 * 0 = current method
	 * 1 = call method
	 * etc..
	 * </PRE>
	 * 
	 * @return method name
	 */
	public static String printMethodName() {
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("\nMethod : " + methodName + "()");
		return methodName;
	}

	public static ObservableList<WestpacStatement> readCSV(File file, boolean showDebitTransaction,
			boolean showCreditTransaction) {
		try (CSVReader reader = new CSVReader(new FileReader(file))) {
			List<String[]> r = reader.readAll();

			ObservableList<WestpacStatement> westpacStatementLines = FXCollections.observableArrayList();
			for (String[] arr : r) {
				if (arr[0].contains("Date")) {
					continue;
				}

				if (showDebitTransaction && arr[1].contains("-")) {
					westpacStatementLines
							.add(new WestpacStatement(new CheckBox(), arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], "", ""));
				}
				if (showCreditTransaction && !arr[1].contains("-")) {
					westpacStatementLines
							.add(new WestpacStatement(new CheckBox(), arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], "", ""));
				}

			}

			return westpacStatementLines;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
