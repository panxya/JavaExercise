package d04_00enums;

public enum Size {
	SMALL("S"),MEDIA("M"),LARGE("L"),EXTRA_LARGE("XL");
	private String abbreviation;
	
	private Size(String abbreviation) {
		this.abbreviation =abbreviation;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	
}
