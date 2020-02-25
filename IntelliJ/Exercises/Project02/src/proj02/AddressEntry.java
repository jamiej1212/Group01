package proj02;

/**************************************************************
 * AddressEntry
 * Sets and gets the given information
 *************************************************************/
public class AddressEntry
{
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;


    /**
     * Initializes all the variables so that we can make sure
     * the program is deterministic.
     */
    public AddressEntry()
    {
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        state = "";
        zip = 0;
        phone = "";
        email = "";
    }
    /**
     * Creates an address Book with given information
     * this is used to point to the current variable declared in the class
     * @param firstName First names that we want to add
     * @param lastName last names that we want to add
     * @param street Street addresses that we want to add
     * @param state State addresses that we want to add
     * @param zip Zip codes that we want to add
     * @param phone Phone numbers that we want to add
     * @param email Email addresses that we want to add
     */
    public AddressEntry(String firstName, String lastName,
                        String street, String city, String state, int zip, String phone, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Sets First name
     * @param firstName First name of a person in the address book
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Gets First name
     * @return to first name after getting first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets Last name
     * @param lastName Last name of a person in the address book
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Gets Last name
     * @return to last name after getting last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets city address
     * @param city City address of a person in the address book
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * Gets city address
     * @return to City address after getting city address
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets street address
     * @param street Street address of a person in the address book
     */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /**
     * Gets street address
     * @return to the street address after getting street address
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * Sets state address
     * @param state State address of a person in the address book
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * Gets state address
     * @return to the state address after getting state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets zip code
     * @param zip zip code of a person in the address book
     */
    public void setZip(int zip)
    {
        this.zip = zip;
    }

    /**
     * Gets zip code
     * @return to the zip code after getting zip code
     */
    public int getZip()
    {
        return zip;
    }

    /**
     * Sets phone number
     * @param phone phone number of a person in the address book
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /**
     * Gets phone number
     * @return to phone number after getting phone number
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Sets an email address
     * @param email email address of a person in the address book
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Gets email address
     * @return to email address after getting one
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Formatting the output
     * @return to the formatted output
     */
    public String toString()
    {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nStreet: "
                + street + "\nCity: " + city + "\nState: " + state + "\nZip: " + zip +
                "\nEmail: " + email + "\nPhone Number: " + phone  +"\n";
    }
}
