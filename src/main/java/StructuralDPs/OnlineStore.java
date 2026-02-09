package StructuralDPs;

public class OnlineStore {

    private  PaymentProcessor paymentProcessor;

    public OnlineStore(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public  void checkout(int amount){
        paymentProcessor.pay(amount);
    }

    public static void main(String[] args) {
        LegacyPaymentService legacyPaymentService = new LegacyPaymentService();
        AdapterClass adapterClass = new AdapterClass(legacyPaymentService);
        OnlineStore onlineStore = new OnlineStore(adapterClass);
        onlineStore.checkout(1000);
    }
}
