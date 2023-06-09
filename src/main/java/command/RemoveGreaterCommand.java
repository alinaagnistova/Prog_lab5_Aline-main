package command;


import collection.CollectionManager;
import error.InvalidInputException;
/**
 * Command remove_greater {element} : remove all elements from the collection that exceed the specified
 */
public class RemoveGreaterCommand extends BaseCommand{
    private final CollectionManager collection;

    public RemoveGreaterCommand(CollectionManager collection) {
        this.collection = collection;
    }

    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Вы неправильно ввели команду");
        } if (collection.getCollection().size() == 0){
            System.out.println("Удалять нечего, файл пуст...");
        } else {
            collection.removeGreater(Float.valueOf(args[1]));
        }
    }


    public void getDescription() {
        String description = "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный";
        System.out.println(description);
    }
}
