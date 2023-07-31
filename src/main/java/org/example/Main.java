package org.example;


/* Achieve encapsulation using getters/setters for a class House that has the following instance variables:
    an int floorsNumber
    a string address
    an array of strings residentsNames
    use a tester class to:
    set the values by asking the user to input them
    for the residentsNames,
    the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
    prints the house details using the getters and String.format() */
public class Main {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;


    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }


}
