package proj02;

import java.io.*;


/**************************************************************
 * main : AddressBookApplication
 * Invokes methods from other classes
 *************************************************************/
class AddressBookApplication
{
    /**
     *Main method
     * Creates an instance of AddressBook then use it to
     * call menu prompt in Menu class
     *
     * @param args contains the supplied command line arguments
     */
    public static void main(String args[]) throws IOException
    {
        AddressBook book = new AddressBook();
        Menu menuCall = new Menu();
        menuCall.menu(book);
    }
}
