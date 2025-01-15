package lab3.prob4;

public class Address {
    private String street;
    private String city;
    private String state;
    private int zip;

    Address(String s, String c, String st, int z) {
        this.street = s;
        this.city = c;
        this.state = st;
        this.zip = z;
    }

    public String getAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.street);
        sb.append(", ");
        sb.append(this.city);
        sb.append(", ");
        sb.append(this.street);
        sb.append(" ");
        sb.append(this.zip);
        return sb.toString();
    }
}
