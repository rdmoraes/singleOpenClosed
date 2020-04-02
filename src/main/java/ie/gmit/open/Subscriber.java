package ie.gmit.open;
//Abstract class to hold subscribers instances and calculateBill method
//Renan Moraes
//24/03/2020
public abstract class Subscriber {

    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;


    public abstract double calculateBill();

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}
