package fv.microservice.ecommerce.orderservice.enums;

public enum OrderStatus {
    CREATE("CREATE"),
    PENDING("PENDING"),
    CANCELED("CANCELED");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
