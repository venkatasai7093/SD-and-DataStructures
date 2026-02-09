package StructuralDPs;

public class AdapterClass implements PaymentProcessor{

    private LegacyPaymentService legacyPaymentService;

    public AdapterClass(LegacyPaymentService legacyPaymentService) {
        this.legacyPaymentService = legacyPaymentService;
    }

    @Override
    public void pay(int amount) {
        legacyPaymentService.makePayment((double)amount);
    }
}
