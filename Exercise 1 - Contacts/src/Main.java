public class Main {
    public static void main(String[] args){
        ContactsManager myContactManager = new ContactsManager();
//        System.out.println(myContactManager.friends.length);

        /*
        Exercise extension:

        Create a ContactsManager object called myContactsManager using the default constructor (we've already done so in the previous page)
        Create a new Contact variable
        Set the name to a friend's name
        Set the phoneNumber field to their phone number
        Call the addContact method in myContactsManager to add that contact
        Repeat steps 2 and 3 for 4 more contacts
        Search for a contact using the method searchContact and print out their phone number
        */
        Contact vina = new Contact();
        vina.name = "vina";
        vina.phone = "5597972657";
        myContactManager.addFriend(vina);
        Contact michael = new Contact();
        michael.name = "michael";
        michael.phone = "5135890389051";
        myContactManager.addFriend(michael);
        Contact dchoi = new Contact();
        dchoi.phone = "210...";
        dchoi.name = "dchoi";
        myContactManager.addFriend(dchoi);

        System.out.println(myContactManager.searchFriend("michael").name);
        System.out.println(myContactManager.searchFriend("vina").phone);
    }
}
