package Models;

public class Contact <T,U> {
    private T name;
    private U phone;

    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPhone() {
        return phone;
    }

    public void setPhone(U phone) {
        this.phone = phone;
    }

    public String toString() {
        return "\tContact [ " + "name = " + name + ", phone = " + phone + " ]\n";
    }
}

