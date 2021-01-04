package infrastructure;

public enum CloudConectors {
    SALESFORCE("Selesforce"),
    GoogleSuite("G Suite"),
    Office365Admin("Office 365 Admin"),
    Dynamics365("Selesforce");

    private String dropdownText;

    CloudConectors(String dropdownText) {
        this.dropdownText = dropdownText;
    }

    public String getDropdownText() {
        return dropdownText;
    }
}
