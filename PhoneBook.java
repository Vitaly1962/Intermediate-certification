import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    // Конструктор класса, в котором происходит ввод контактов
    public PhoneBook() {
        contacts = new TreeMap<>();
        // Добавляем контакты
        addContact("Елена", "2345678");
        addContact("Елена", "3456789");
        addContact("Витя", "3456789");
        addContact("Витя", "2345678");
        addContact("Коля", "2345678");
        addContact("Коля", "4567890");
        addContact("Коля", "5678901");
        addContact("Максим", "5555555");
        addContact("Алексей", "1111111");
        addContact("Алексей", "2222222");
        addContact("Алексей", "3333333");
        addContact("Ольга", "9999999");
        addContact("Ольга", "8888888");
        addContact("Ольга", "7777777");
        addContact("Ольга", "6666666");
    }

    // Метод для добавления контакта
    public void addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        contacts.get(name).add(phoneNumber);
    }

    // Метод для получения контактов
    public Map<String, List<String>> getContacts() {
        return contacts;
    }
}