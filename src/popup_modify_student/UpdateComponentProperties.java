package popup_modify_student;

public class UpdateComponentProperties {

	private static boolean manufacturing = false;
	private static boolean customer = false;
	private static boolean internal = false;
	private static boolean newData = false;
	private static boolean authRequire = false;

	public static boolean isManufacturing() {
		return manufacturing;
	}

	public static void setManufacturing(boolean manufacturing) {
		UpdateComponentProperties.manufacturing = manufacturing;
	}

	public static boolean isCustomer() {
		return customer;
	}

	public static void setCustomer(boolean customer) {
		UpdateComponentProperties.customer = customer;
	}

	public static boolean isInternal() {
		return internal;
	}

	public static void setInternal(boolean internal) {
		UpdateComponentProperties.internal = internal;
	}

	public static boolean isNewData() {
		// only let user one time call and reset
		if (newData) {
			newData = false;
			return true;
		}
		return false;
	}

	public static void setNewData(boolean newData) {
		UpdateComponentProperties.newData = newData;
	}

	public static boolean isAuthRequire() {
		return authRequire;
	}

	public static void setAuthRequire(boolean authRequire) {
		UpdateComponentProperties.authRequire = authRequire;
	}
}
