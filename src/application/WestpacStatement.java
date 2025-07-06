package application;

import javafx.scene.control.CheckBox;
//import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WestpacStatement {

	public WestpacStatement(CheckBox select, String date, String amount, String otherParty, String description, String reference,
			String particularCode, String analysis, String personName, String personRole) {
		super();
		this.select = select;
		this.date = date;
		this.amount = amount;
		this.otherParty = otherParty;
		this.description = description;
		this.reference = reference;
		this.particularCode = particularCode;
		this.analysis = analysis;
		this.personName = personName;
		this.personRole = personRole;
	}

	private CheckBox select;
	private String date;
	private String amount;
	private String otherParty;
	private String description;
	private String reference;
	private String particularCode;
	private String analysis;
	private String personName;
	private String personRole;

	public CheckBox getSelect() {
		return select;
	}

	public void setSelect(CheckBox select) {
		this.select = select;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOtherParty() {
		return otherParty;
	}

	public void setOtherParty(String otherParty) {
		this.otherParty = otherParty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getParticularCode() {
		return particularCode;
	}

	public void setParticularCode(String particularCode) {
		this.particularCode = particularCode;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonRole() {
		return personRole;
	}

	public void setPersonRole(String personRole) {
		this.personRole = personRole;
	}

}
