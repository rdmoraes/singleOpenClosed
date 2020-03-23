package ie.gmit.single;

//Handle storage services, can be expand to database in future
public class StorageService {

    //Store used by controller
    private Store store = new Store();;


    public void storeInMemory(User user) {
        store.store(user);
    }
}
