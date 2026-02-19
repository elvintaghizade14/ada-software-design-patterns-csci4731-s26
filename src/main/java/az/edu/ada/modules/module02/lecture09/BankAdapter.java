package az.edu.ada.modules.module02.lecture09;

public class BankAdapter {

    private final LegacyBankApi legacyBankApi;

    public BankAdapter(LegacyBankApi legacyBankApi) {
        this.legacyBankApi = legacyBankApi;
    }

    public String getCustomer() {
        // call legacy API
        // convert from XML to JSON
        return null;
    }

    public String updateCustomer() {
        // convert result from JSON to XML
        // call legacy API
        return null;
    }
}
