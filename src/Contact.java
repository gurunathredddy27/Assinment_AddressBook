class Contact {

    String fname;
    String lname;
    String adress;
    String city;
    String state;
    String zip;
    String phonenum;
    String email;

    public Contact(String firstName, String lastName, String adress, String city, String state,
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

    public static void setAddress(String lname) {
    }

    public  String getFname() {

        return fname;
    }
    public static void setFname(String fname){
        fname = fname;
    }

    public String getLname() {

        return lname;
    }
    public static void setLname(String lname){
        lname = lname;
    }

    public String getAdress() {

        return adress;
    }
    public void setAdress(String adress){
        adress = adress;
    }

    public String getCity() {

        return city;
    }
    public static void setCity(String city){
        city = city;
    }

    public String getState() {

        return state;
    }
    public static void setState(String state){
        state = state;
    }

    public String getZip() {
        return zip;
    }
    public static void setZip(String zip){
        zip = zip;
    }

    public String getPhonenum() {

        return phonenum;
    }
    public static void setPhonenum(String phonenum){
        phonenum = phonenum;
    }

    public String getEmail() {

        return email;
    }
    public static void setEmail(String email){
        email = email;
    }
}