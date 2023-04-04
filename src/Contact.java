class contact {

    String fname;
    String lname;
    String adress;
    String city;
    String state;
    String zip;
    String phonenum;
    String email;

    public contact(String firstName, String lastName, String adress, String city, String state,
                   String zipcode, String phoneNum, String email) {
        this.fname = firstName;
        this.lname = lastName;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.zip = zipcode;
        this.phonenum = phoneNum;
        this.email = email;
        System.out.println(firstName);
    }

    public String getFname() {

        return fname;
    }

    public String getLname() {

        return lname;
    }

    public String getAdress() {

        return adress;
    }

    public String getCity() {

        return city;
    }

    public String getState() {

        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhonenum() {

        return phonenum;
    }

    public String getEmail() {

        return email;
    }
}