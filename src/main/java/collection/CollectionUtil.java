package collection;

import data.SpaceMarine;

/**
 * The class that realize methods for work with SpaceMarine
 */
public class CollectionUtil {
    static Validator validator = new Validator();

    /**
     * @param ID
     * @return
     */
        public boolean checkExist(Long ID) {
            for (SpaceMarine spaceMarine:CollectionManager.getCollection()) {
                if (spaceMarine.getId().equals(ID))
                    return true;
            }
            return false;
        }
    /**
     * displays information about the character with all fields
     *
     * @param spaceMarine
     */
        public static void display(SpaceMarine spaceMarine) {
            System.out.println("ID элемента коллекции – " + spaceMarine.getId());
            System.out.println("Имя бойца – " + spaceMarine.getName());
            System.out.println("Координата X – " + spaceMarine.getCoordinates().getX());
            System.out.println("Координата Y – " + spaceMarine.getCoordinates().getY());
            System.out.println("Дата создания элемента – " + spaceMarine.getCreationDate());
            System.out.println("Уровень здоровья – " + spaceMarine.getHealth());
            System.out.println("Категория – " + spaceMarine.getCategory());
            System.out.println("Тип оружия – " + spaceMarine.getWeaponType());
            System.out.println("Тип оружия ближнего боя – " + spaceMarine.getMeleeWeapon());
            System.out.println("Название дивизиона – " + spaceMarine.getChapter().getName());
            System.out.println("Количество бойцов дивизиона – " + spaceMarine.getChapter().getMarinesCount());
            System.out.println("_________________________________________________________\n");
        }
        public boolean checkIfCorrect(SpaceMarine spaceMarine){
            if (
                        validator.checkName(spaceMarine.getName()) ||
                        validator.checkCoordinateX(spaceMarine.getCoordinates().getX()) ||
                        validator.checkCoordinateY(spaceMarine.getCoordinates().getY()) ||
                        validator.checkHealth(spaceMarine.getHealth()) ||
                        validator.checkCategory(spaceMarine.getCategory()) ||
                        validator.checkWeapon(spaceMarine.getWeaponType()) ||
                        validator.checkMeleeWeapon(spaceMarine.getMeleeWeapon()) ||
                        validator.checkName(spaceMarine.getChapter().getName()) ||
                        validator.checkMarinesCount(spaceMarine.getChapter().getMarinesCount())
            ){
                return true;
            }
            return false;
        }
    }

