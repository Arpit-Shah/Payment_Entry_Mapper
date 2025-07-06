package application;

import javafx.scene.control.CheckBox;

public class CMFA implements Comparable<CMFA> {

	public CMFA(String subject, String studentName, String grade, String birth, String enrolDate, String level, String month1, String month2,
			String month3, String month4, String month5, String month6, String month7, String month8, String month9, String month10, String month11,
			String month12) {
		super();
		this.subject = subject;
		this.studentName = studentName;
		this.grade = grade;
		this.birth = birth;
		this.enrolDate = enrolDate;
		this.level = level;
		this.month1 = month1;
		this.month2 = month2;
		this.month3 = month3;
		this.month4 = month4;
		this.month5 = month5;
		this.month6 = month6;
		this.month7 = month7;
		this.month8 = month8;
		this.month9 = month9;
		this.month10 = month10;
		this.month11 = month11;
		this.month12 = month12;
	}

	private CheckBox select = new CheckBox();
	private String subject;
	private String studentName;
	private String grade;
	private String birth;
	private String enrolDate;
	private String level;
	private String month1;
	private String month2;
	private String month3;
	private String month4;
	private String month5;
	private String month6;
	private String month7;
	private String month8;
	private String month9;
	private String month10;
	private String month11;
	private String month12;

	public void setSelect(CheckBox select) {
		this.select = select;
	}

	public CheckBox getSelect() {
		return select;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEnrolDate() {
		return enrolDate;
	}

	public void setEnrolDate(String entrolDate) {
		this.enrolDate = entrolDate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMonth1() {
		return month1;
	}

	public void setMonth1(String month1) {
		this.month1 = month1;
	}

	public String getMonth2() {
		return month2;
	}

	public void setMonth2(String month2) {
		this.month2 = month2;
	}

	public String getMonth3() {
		return month3;
	}

	public void setMonth3(String month3) {
		this.month3 = month3;
	}

	public String getMonth4() {
		return month4;
	}

	public void setMonth4(String month4) {
		this.month4 = month4;
	}

	public String getMonth5() {
		return month5;
	}

	public void setMonth5(String month5) {
		this.month5 = month5;
	}

	public String getMonth6() {
		return month6;
	}

	public void setMonth6(String month6) {
		this.month6 = month6;
	}

	public String getMonth7() {
		return month7;
	}

	public void setMonth7(String month7) {
		this.month7 = month7;
	}

	public String getMonth8() {
		return month8;
	}

	public void setMonth8(String month8) {
		this.month8 = month8;
	}

	public String getMonth9() {
		return month9;
	}

	public void setMonth9(String month9) {
		this.month9 = month9;
	}

	public String getMonth10() {
		return month10;
	}

	public void setMonth10(String month10) {
		this.month10 = month10;
	}

	public String getMonth11() {
		return month11;
	}

	public void setMonth11(String month11) {
		this.month11 = month11;
	}

	public String getMonth12() {
		return month12;
	}

	public void setMonth12(String month12) {
		this.month12 = month12;
	}

	@Override
	public int compareTo(CMFA cmfa) {
		return this.getStudentName().compareTo(cmfa.getStudentName());
	}

}
