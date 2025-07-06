//package application;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.collections.transformation.FilteredList;
//import javafx.collections.transformation.SortedList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.SelectionMode;
//import javafx.scene.control.TableCell;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableRow;
//import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.paint.Color;
//import javafx.stage.FileChooser;
//import javafx.stage.Stage;
//
//abstract class CMFA_Controller {
//
//	
//
//	// Component table in "CMFA" tab
//	TableColumn<CMFA, CheckBox> selectCMFACol;
//	TableColumn<CMFA, String> subjectCol;
//	TableColumn<CMFA, String> studentNameCol;
//	TableColumn<CMFA, String> gradeCol;
//	TableColumn<CMFA, String> birthCol;
//	TableColumn<CMFA, String> enrolDateCol;
//	TableColumn<CMFA, String> levelCol;
//	TableColumn<CMFA, String> month1Col;
//	TableColumn<CMFA, String> month2Col;
//	TableColumn<CMFA, String> month3Col;
//	TableColumn<CMFA, String> month4Col;
//	TableColumn<CMFA, String> month5Col;
//	TableColumn<CMFA, String> month6Col;
//	TableColumn<CMFA, String> month7Col;
//	TableColumn<CMFA, String> month8Col;
//	TableColumn<CMFA, String> month9Col;
//	TableColumn<CMFA, String> month10Col;
//	TableColumn<CMFA, String> month11Col;
//	TableColumn<CMFA, String> month12Col;
//
//	public CMFA_Controller() {
//
//		// Component table in "CMFA" tab
//		this.selectCMFACol = new TableColumn<CMFA, CheckBox>("Select");
//		this.subjectCol = new TableColumn<CMFA, String>("Subject");
//		this.studentNameCol = new TableColumn<CMFA, String>("StudentName");
//		this.gradeCol = new TableColumn<CMFA, String>("Grade");
//		this.birthCol = new TableColumn<CMFA, String>("Birth");
//		this.enrolDateCol = new TableColumn<CMFA, String>("EnrolDate");
//		this.levelCol = new TableColumn<CMFA, String>("Level");
//		this.month1Col = new TableColumn<CMFA, String>("M1");
//		this.month2Col = new TableColumn<CMFA, String>("M2");
//		this.month3Col = new TableColumn<CMFA, String>("M3");
//		this.month4Col = new TableColumn<CMFA, String>("M4");
//		this.month5Col = new TableColumn<CMFA, String>("M5");
//		this.month6Col = new TableColumn<CMFA, String>("M6");
//		this.month7Col = new TableColumn<CMFA, String>("M7");
//		this.month8Col = new TableColumn<CMFA, String>("M8");
//		this.month9Col = new TableColumn<CMFA, String>("M9");
//		this.month10Col = new TableColumn<CMFA, String>("M10");
//		this.month11Col = new TableColumn<CMFA, String>("M11");
//		this.month12Col = new TableColumn<CMFA, String>("M12");
//
//		init_Tab_AddCMFA_Tableview_Component();
//	}
//
//	public void init_Tab_AddCMFA_Tableview_Component() {
//
//		Utils.printMethodName();
//
//		// set width of each column
//		selectCMFACol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.04));
//		subjectCol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.04));
//		studentNameCol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.16));
//		gradeCol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.04));
//		birthCol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.08));
//		enrolDateCol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.08));
//		levelCol.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month1Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month2Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month3Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month4Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month5Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month6Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month7Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month8Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month9Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month10Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month11Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//		month12Col.prefWidthProperty().bind(tbl_cmfa.widthProperty().multiply(0.06));
//
//		// bind value to column
//		selectCMFACol.setCellValueFactory(new PropertyValueFactory<CMFA, CheckBox>("select"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<CMFA, String>("subject"));
//		studentNameCol.setCellValueFactory(new PropertyValueFactory<CMFA, String>("studentName"));
//		gradeCol.setCellValueFactory(new PropertyValueFactory<CMFA, String>("grade"));
//		birthCol.setCellValueFactory(new PropertyValueFactory<CMFA, String>("birth"));
//		enrolDateCol.setCellValueFactory(new PropertyValueFactory<CMFA, String>("enrolDate"));
//		levelCol.setCellValueFactory(new PropertyValueFactory<CMFA, String>("level"));
//		month1Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month1"));
//		month2Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month2"));
//		month3Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month3"));
//		month4Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month4"));
//		month5Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month5"));
//		month6Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month6"));
//		month7Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month7"));
//		month8Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month8"));
//		month9Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month9"));
//		month10Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month10"));
//		month11Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month11"));
//		month12Col.setCellValueFactory(new PropertyValueFactory<CMFA, String>("month12"));
//
//		// Disable column sorting because it clashes with search sorting
//		selectCMFACol.setSortable(false);
//		subjectCol.setSortable(false);
//		// studentNameCol.setSortable(false);
//		gradeCol.setSortable(false);
//		birthCol.setSortable(false);
//		enrolDateCol.setSortable(false);
//		levelCol.setSortable(false);
//		month1Col.setSortable(false);
//		month2Col.setSortable(false);
//		month3Col.setSortable(false);
//		month4Col.setSortable(false);
//		month5Col.setSortable(false);
//		month6Col.setSortable(false);
//		month7Col.setSortable(false);
//		month8Col.setSortable(false);
//		month9Col.setSortable(false);
//		month10Col.setSortable(false);
//		month11Col.setSortable(false);
//		month12Col.setSortable(false);
//
//		// Add columns to table view
//		tbl_cmfa.getColumns().clear();
//		tbl_cmfa.getColumns().addAll(selectCMFACol, subjectCol, studentNameCol,
//				/*
//				 * gradeCol, birthCol, enrolDateCol, levelCol, month1Col, month2Col, month3Col, month4Col, month5Col, month6Col, month7Col,
//				 */ month8Col, month9Col, month10Col, month11Col, month12Col);
//
//		// If Student Math then blue otherwise Green.
//		subjectCol.setCellFactory(column -> {
//			return new TableCell<CMFA, String>() {
//				@Override
//				protected void updateItem(String item, boolean empty) {
//					super.updateItem(item, empty);
//
//					if (item == null || empty) {
//						setText(null);
//						setStyle("");
//					} else {
//						String type = item;
//						setText(item);
//						if (type.contains("MATH")) {
//							setTextFill(Color.BLUE);
//							setStyle("-fx-font-weight: bold");
//						} else {
//							setTextFill(Color.GREEN);
//							setStyle("-fx-font-weight: bold");
//						}
//					}
//				}
//			};
//		});
//
//		// If student absent then red otherwise green
//		month12Col.setCellFactory(column -> {
//			return new TableCell<CMFA, String>() {
//
//				@Override
//				protected void updateItem(String item, boolean empty) {
//					super.updateItem(item, empty);
//
//					if (item == null || empty) {
//						setText(null);
//						setStyle("");
//					} else {
//						String type = item;
//						setText(item);
//						if (type.contains("**")) {
//							setTextFill(Color.RED);
//							setStyle("-fx-font-weight: bold");
//						} else {
//							setTextFill(Color.GREEN);
//							setStyle("-fx-font-weight: bold");
//						}
//					}
//				}
//			};
//		});
//
//		// If student absent then mark raw yellow
//		tbl_cmfa.setRowFactory(row -> new TableRow<CMFA>() {
//
//			@Override
//			protected void updateItem(CMFA item, boolean empty) {
//				super.updateItem(item, empty);
//
//				if (item == null || empty) {
//					setStyle("");
//				} else {
//					// Now 'item' has all the info of the Person in this row
//					if (item.getMonth12().contains("**")) {
//						// We apply now the changes in all the cells of the row
//						for (int i = 0; i < getChildren().size(); i++) {
//							setStyle("-fx-background-color: yellow");
//						}
//					} else {
//						setStyle("");
//					}
//				}
//			}
//		});
//
//		// Configure table selection properties
//		tbl_cmfa.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//
//		// Let table be sorted by Student Name Column
//		tbl_cmfa.getSortOrder().add(studentNameCol);
//
//	}
//
//	@FXML
//	void handle_btn_selectfileCMFA(ActionEvent event) throws Exception {
//		Utils.printMethodName();
//		if (null != lastSelectedParentDir && !lastSelectedParentDir.exists()) {
//			lastSelectedParentDir = new File("C:\\");
//		}
//
//		// Let user choose file/files
//		FileChooser chooser = new FileChooser();
//		chooser.setTitle("Open File");
//		// Set extension filter
//		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Excel (*.xlsx)", "*.xlsx");
//		chooser.getExtensionFilters().add(extFilter);
//
//		// If we have record of last user selection then use that
//		if (null != lastSelectedParentDir) {
//			chooser.setInitialDirectory(lastSelectedParentDir);
//		}
//		try {
//			selectedCMFAFileslist = chooser.showOpenMultipleDialog(primaryStage);
//		} catch (Exception e) {
//			if (e.getMessage().contains("Folder parameter must be a valid folder")) {
//				Utils.createInformationDialog(lastSelectedParentDir.getAbsolutePath() + " might not be accessible");
//				return;
//			} else {
//				throw e;
//			}
//		}
//
//		if (null == selectedCMFAFileslist) {
//			// If user press cancel then set previously selected file to avoid null pointer error
//			selectedCMFAFileslist = lastSelectedCMFAFileList;
//			return;
//		}
//
//		// Remember user selection so next time we open same dir location
//		if (null != selectedCMFAFileslist) {
//			// Store it for future use
//			lastSelectedCMFAFileList = selectedCMFAFileslist;
//			lastSelectedParentDir = selectedCMFAFileslist.get(0).getParentFile();
//
//			tf_filepathCMFA.setText(selectedCMFAFileslist.get(0).getAbsolutePath());
//		}
//
//		loadCMFATableView();
//
//	}
//
//	private void loadCMFATableView() {
//
//		List<CMFA> studentListMaths = null;
//		List<CMFA> studentListEnglish = null;
//		try {
//			studentListMaths = readCMFA(selectedCMFAFileslist.get(0), "Student (Maths)", "Maths");
//			studentListEnglish = readCMFA(selectedCMFAFileslist.get(0), "Student (English)", "English");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		// Merge all students
//		List<CMFA> studentAll = new ArrayList<>();
//		studentAll.addAll(studentListMaths);
//		studentAll.addAll(studentListEnglish);
//
//		// Render on screen
//		ObservableList<CMFA> listStudentCMFA = FXCollections.observableArrayList(studentAll);
//
//		// Apply search filter
//		SortedList<CMFA> sortedData = getFilteredCMFAData(listStudentCMFA);
//
//		// Apply sort on filtered list (sort by student name is allowed)
//		sortedData.comparatorProperty().bind(tbl_cmfa.comparatorProperty());
//
//		tbl_cmfa.setItems(sortedData);
//	}
//
//	private List<CMFA> readCMFA(File CMFAfile, String sheetName, String subject) throws Exception {
//		FileInputStream file = new FileInputStream(CMFAfile);
//		Workbook workbook = new XSSFWorkbook(file);
//		List<CMFA> listStudentCMFA = new ArrayList<>();
//
//		// Find Math Students
//		Sheet sheet = workbook.getSheet(sheetName);
//
//		// Map<Integer, List<String>> data = new HashMap<>();
//		int currentRowNum = 0;
//		int SheetOffsetNumber = 14;
//		boolean studentFirstRow = true;
//		for (Row row : sheet) {
//
//			if (currentRowNum == 8) {
//
//				int start = 0;
//				for (Cell cell : row) {
//					if (start == 27) {
//						if (subject.equals("Maths")) {
//							lbl_reporting_month_math.setText(cell.getStringCellValue());
//						} else {
//							lbl_reporting_month_eng.setText(cell.getStringCellValue());
//						}
//					}
//					start++;
//				}
//			}
//
//			// Ignore all header information
//			if (currentRowNum < SheetOffsetNumber) {
//				currentRowNum++;
//				continue;
//			}
//
//			// Validate First Column is student name otherwise offset is wrong
//			if (currentRowNum == SheetOffsetNumber) {
//				String value = row.getCell(1).getStringCellValue();
//				if (null == value || !value.contains("STUDENT NAME")) {
//					throw new Exception("Excel Sheet Starting is not correct");
//				} else {
//					String studentName = row.getCell(1).getStringCellValue();
//					String grade = row.getCell(15).getStringCellValue();
//					String birth = row.getCell(20).getStringCellValue();
//					String entrolDate = row.getCell(27).getStringCellValue();
//					String level = row.getCell(34).getStringCellValue();
//					String month1 = row.getCell(39).getStringCellValue();
//					String month2 = row.getCell(39 + 4).getStringCellValue();
//					String month3 = row.getCell(39 + 8).getStringCellValue();
//					String month4 = row.getCell(39 + 12).getStringCellValue();
//					String month5 = row.getCell(39 + 16).getStringCellValue();
//					String month6 = row.getCell(39 + 20).getStringCellValue();
//					String month7 = row.getCell(39 + 24).getStringCellValue();
//					String month8 = row.getCell(39 + 28).getStringCellValue();
//					String month9 = row.getCell(39 + 32).getStringCellValue();
//					String month10 = row.getCell(39 + 36).getStringCellValue();
//					String month11 = row.getCell(39 + 40).getStringCellValue();
//					String month12 = row.getCell(39 + 44).getStringCellValue();
//
//					studentNameCol.setText(studentName);
//					gradeCol.setText(grade);
//					birthCol.setText(birth);
//					enrolDateCol.setText(entrolDate);
//					month1Col.setText(month1);
//					month2Col.setText(month2);
//					month3Col.setText(month3);
//					month4Col.setText(month4);
//					month5Col.setText(month5);
//					month6Col.setText(month6);
//					month7Col.setText(month7);
//					month8Col.setText(month8);
//					month9Col.setText(month9);
//					month10Col.setText(month10);
//					month11Col.setText(month11);
//					month12Col.setText(month12);
//				}
//			}
//
//			if (currentRowNum > SheetOffsetNumber) {
//				if (row.getCell(1).getStringCellValue().contains("DISCONTINUED STUDENTS:")) {
//					break;
//				}
//			}
//
//			// Process Student Cell
//			if (currentRowNum > SheetOffsetNumber) {
//				// int totalcolumn = row.getPhysicalNumberOfCells();
//				// System.err.println(totalcolumn);
//
//				String studentName = row.getCell(1).getStringCellValue();
//				String grade = row.getCell(15).getStringCellValue();
//				String birth = row.getCell(20).getStringCellValue();
//				String enrolDate = row.getCell(27).getStringCellValue();
//				String level = row.getCell(34).getStringCellValue();
//				String month1 = row.getCell(39).getStringCellValue();
//				String month2 = row.getCell(39 + 4).getStringCellValue();
//				String month3 = row.getCell(39 + 8).getStringCellValue();
//				String month4 = row.getCell(39 + 12).getStringCellValue();
//				String month5 = row.getCell(39 + 16).getStringCellValue();
//				String month6 = row.getCell(39 + 20).getStringCellValue();
//				String month7 = row.getCell(39 + 24).getStringCellValue();
//				String month8 = row.getCell(39 + 28).getStringCellValue();
//				String month9 = row.getCell(39 + 32).getStringCellValue();
//				String month10 = row.getCell(39 + 36).getStringCellValue();
//				String month11 = row.getCell(39 + 40).getStringCellValue();
//				String month12 = row.getCell(39 + 44).getStringCellValue();
//
//				// System.out.println(studentName);
//				// System.out.println(grade);
//				// System.out.println(birth);
//				// System.out.println(entrolDate);
//				// System.out.println(level);
//				// System.out.println(month1);
//				// System.out.println(month2);
//				// System.out.println(month3);
//				// System.out.println(month4);
//				// System.out.println(month5);
//				// System.out.println(month6);
//				// System.out.println(month7);
//				// System.out.println(month8);
//				// System.out.println(month9);
//				// System.out.println(month10);
//				// System.out.println(month11);
//				// System.out.println(month12);
//
//				if (studentFirstRow) {
//					listStudentCMFA.add(new CMFA(subject, studentName, grade, birth, enrolDate, level, month1, month2, month3, month4, month5, month6,
//							month7, month8, month9, month10, month11, month12));
//					studentFirstRow = false;
//				} else {
//					CMFA cmfaobj = listStudentCMFA.get(listStudentCMFA.size() - 1);
//					cmfaobj.setStudentName(cmfaobj.getStudentName() + "\r\n" + studentName);
//					cmfaobj.setGrade(cmfaobj.getGrade() + "\r\n" + grade);
//					cmfaobj.setBirth(cmfaobj.getBirth() + "\r\n" + birth);
//					cmfaobj.setEnrolDate(cmfaobj.getEnrolDate() + "\r\n" + enrolDate);
//					cmfaobj.setLevel(cmfaobj.getLevel() + "\r\n" + level);
//					cmfaobj.setMonth1(cmfaobj.getMonth1() + "\r\n" + month1);
//					cmfaobj.setMonth2(cmfaobj.getMonth2() + "\r\n" + month2);
//					cmfaobj.setMonth3(cmfaobj.getMonth3() + "\r\n" + month3);
//					cmfaobj.setMonth4(cmfaobj.getMonth4() + "\r\n" + month4);
//					cmfaobj.setMonth5(cmfaobj.getMonth5() + "\r\n" + month5);
//					cmfaobj.setMonth6(cmfaobj.getMonth6() + "\r\n" + month6);
//					cmfaobj.setMonth7(cmfaobj.getMonth7() + "\r\n" + month7);
//					cmfaobj.setMonth8(cmfaobj.getMonth8() + "\r\n" + month8);
//					cmfaobj.setMonth9(cmfaobj.getMonth9() + "\r\n" + month9);
//					cmfaobj.setMonth10(cmfaobj.getMonth10() + "\r\n" + month10);
//					cmfaobj.setMonth11(cmfaobj.getMonth11() + "\r\n" + month11);
//					cmfaobj.setMonth12(cmfaobj.getMonth12() + "\r\n" + month12);
//
//					studentFirstRow = true;
//				}
//
//				// int j = 0;
//				// for (Cell cell : row) {
//				// System.out.println(j + " " + cell.getStringCellValue().trim());
//				// j++;
//				// }
//				// System.out.println();
//			}
//			currentRowNum++;
//		}
//		return listStudentCMFA;
//
//	}
//
//	private String getCellValue(Row row, int cellindex) {
//		if (null == row.getCell(cellindex)) {
//			return "";
//		}
//
//		CellType type = row.getCell(cellindex).getCellType();
//		if (type == CellType.NUMERIC) {
//			return Double.toString(row.getCell(cellindex).getNumericCellValue());
//		} else if (type == CellType.BOOLEAN) {
//			return Boolean.toString(row.getCell(cellindex).getBooleanCellValue());
//		} else if (type == CellType.STRING) {
//			return row.getCell(cellindex).getStringCellValue();
//		} else {
//			return "";
//		}
//	}
//
//	// Apply filter in table view based on text in search box
//	private SortedList<CMFA> getFilteredCMFAData(ObservableList<CMFA> CMFAData) {
//
//		FilteredList<CMFA> filteredData = new FilteredList<CMFA>(CMFAData, b -> true);
//
//		// User types filter keyword in Search box and based on typed text filter data
//		tf_filterCMFA.textProperty().addListener((Observable, oldValue, newValue) -> {
//			filteredData.setPredicate(CMFA -> {
//
//				// If Search box is empty then display all the values
//				if (newValue == null || newValue.isEmpty()) {
//					return true;
//				}
//
//				String lowerCaseFilter = newValue.toLowerCase();
//
//				if (CMFA.getStudentName().toLowerCase().indexOf(lowerCaseFilter) != -1) {
//					return true;
//				} else {
//					return false;
//				}
//			});
//		});
//
//		SortedList<CMFA> sortedData = new SortedList<CMFA>(filteredData);
//		return sortedData;
//	}
//
//}
