package az.edu.ada.modules.module02.lecture09;

public class ModernBankApi {

    private final BankAdapter bankAdapter;

    public ModernBankApi(BankAdapter bankAdapter) {
        this.bankAdapter = bankAdapter;
    }

    /**
     *
     * @return customer info
     */
    public String updateCustomerInfo() {
        //...

        new LegacyBankApi()         // dependency injection!
                .getCustomerXml();  // call legacy API
        // convert from XML to JSON

        // do Business Processes (BP)

        // create result JSON

        // convert result from JSON to XML
        new LegacyBankApi()
                .updateCustomerXml(); // call legacy API

        return null;
    }

    public String updateCustomerInfoV2() {
        bankAdapter.getCustomer();
        // do Business Processes (BP)
        bankAdapter.updateCustomer();
        return null;
    }
}
