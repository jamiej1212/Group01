package proj02;

import java.io.File;
import java.util.*;
import java.io.*;

/**************************************************************
 * AddressBook
 * Using objects gets from AddressEntry and Menu class
 * to invoke various methods
 *
 *************************************************************/
public class AddressBook
{
    ArrayList<AddressEntry> table = new ArrayList<>();
    AddressEntry user;
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();


    /**
     * Gets information from AddressEntry and adds them to the list.
     * @param entry information that we are going to add in the collection
     */
    public void add(AddressEntry entry)
    {
        entry.setFirstName(menu.prompt_FirstName());
        entry.setLastName(menu.prompt_LastName());
        entry.setStreet(menu.prompt_Street());
        entry.setCity(menu.prompt_City());
        entry.setState(menu.prompt_State());
        entry.setZip(menu.prompt_Zip());
        entry.setPhone(menu.prompt_Telephone());
        entry.setEmail(menu.prompt_Email());

        String firstName = entry.getFirstName();
        String lastName = entry.getLastName();
        String street = entry.getStreet();
        String city = entry.getCity();
        String state = entry.getState();
        int zip = entry.getZip();
        String phone = entry.getPhone();
        String email = entry.getEmail();

        user = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);

        table.add(user);
        System.out.println(user.toString());
        System.out.println("\nAdded Successfully!");

    }

    /**
     * Iterates through the collection.
     * Sorts the collection using sort and compare methods
     * Prints the collection
     */
    public void list()
    {
        Collections.sort(table, new Comparator<AddressEntry>()
        {
            @Override
            public int compare(AddressEntry first, AddressEntry second)
            {
                if(first.getLastName().equals(second.getLastName()))
                    return first.getFirstName().compareTo(second.getFirstName());
                else
                    return first.getLastName().compareTo(second.getLastName());
            }
        });

        for(AddressEntry element : table)
        {
            System.out.println(element.toString());
        }

    }

    /**
     * Reads and prints information from a file
     * Stores information into the collection
     *
     * @param file file that this method gets information from
     * @throws IOException
     */
    public void readFromFile(File file) throws IOException
    {
        Scanner scanFile = new Scanner(new FileReader(file));
        ArrayList<AddressEntry> read = new ArrayList<>();

        while(scanFile.hasNextLine())
        {
            String firstName = scanFile.nextLine();
            String lastName = scanFile.nextLine();
            String street = scanFile.nextLine();
            String city = scanFile.nextLine();
            String state = scanFile.nextLine();
            int zip = Integer.parseInt(scanFile.nextLine());
            String phone = scanFile.nextLine();
            String email = scanFile.nextLine();

            user = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);
            table.add(user);
            read.add(user);
        }

        for(AddressEntry print : read)
        {
            System.out.println(print.toString());
        }

        System.out.println("Read File Successfully!");
    }

    /**
     * Prints a list of information that matches with user input
     * Removes an object in collection which is chosen by user
     * @param startOf_lastName full or a part of (from beginning) last name
     *                         that user entered
     */
    public void remove(String startOf_lastName)
    {
        ArrayList<AddressEntry> match = new ArrayList<>();
        for(int i = 0; i < table.size(); i++)
        {
            if(table.get(i).getLastName().toLowerCase().matches(startOf_lastName.toLowerCase()))
            {
                match.add(table.get(i));
            }
        }
        for(int i = 0; i < match.size(); i++)
        {
            System.out.println(i + "\n" + match.get(i).toString());
        }

        System.out.println("Please select a number");
        int select = Integer.parseInt(scan.next());

        for(int i = 0; i < match.size(); i++)
        {
            if(select == i)
            {
                for(AddressEntry element : table)
                {
                    if(match.get(select).getPhone().equals(element.getPhone()))
                    {
                        System.out.println("Are you sure? (Y/N)");
                        String answer = scan.next();
                        if(answer.toLowerCase().equals("y"))
                        {
                            table.remove(element);
                            break;
                        }

                        else
                            System.out.println("Canceled");
                    }
                }
            }
        }
        System.out.println("Removed Successfully!");



    }

    /**
     * Finds and prints a list of contacts that user wants to find
     * @param startOf_lastName full or a part of (from beginning) last name
     *                         that user entered
     */
    public void find(String startOf_lastName)
    {
        ArrayList<AddressEntry> match = new ArrayList<>();

        for(int i = 0; i < table.size(); i++)
        {
            if(table.get(i).getLastName().toLowerCase().matches(startOf_lastName.toLowerCase()))
            {
                match.add(table.get(i));
            }
        }

        System.out.println(match.size() + " contact(s) found");

        for(int i = 0; i < match.size(); i++)
        {
            System.out.println(i + "\n" + match.get(i).toString());
        }
    }
}