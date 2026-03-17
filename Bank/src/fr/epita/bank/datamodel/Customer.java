package fr.epita.bank.datamodel;

public class Customer {

    private Integer id;
    private String name;
    private String address;


    /**
     *  <code style='color:red'>only for frame works</code>
     */

    public Customer(){
    }


    /** to be used only when the customer does not exist yet */
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }


    /** nominal case */
    public Customer(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }




    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }
}