package ua.opnu.list.phone;


public class SmartPhone implements GPS, Cellular {

    private String phoneNumber;

    public SmartPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double[] getCoordinates() {

        double latitude = 49.842957;
        double longitude = 24.031111;
        return new double[]{latitude, longitude};
    }

    public void makeCall() {
        System.out.println(" (" + phoneNumber + ") здійснює дзвінок...");
    }

    public void receiveCall() {
        System.out.println(" (" + phoneNumber + ") приймає дзвінок...");
    }

    public String toString() {
        return "Телефон (" + ", номер='" + phoneNumber + '\'' + ')';
    }
}