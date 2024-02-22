import java.util.*;

public class PhoneBook3 {
    public static void main(String[] args) {
        PhoneBook3 phoneBook = new PhoneBook3();
        phoneBook.addContact("John", "1234567890");
        phoneBook.addContact("John", "9876543210");
        phoneBook.addContact("John", "9876543211");
        phoneBook.addContact("Alice", "9876543210");
        phoneBook.addContact("Alice", "1231231234");
        phoneBook.addContact("Bob", "1111111111"); // добавляем контакт с одним телефонным номером

        phoneBook.displayContacts();
    }

    private Map<String, Set<String>> contacts;

    public PhoneBook3() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }

    public void displayContacts() {
        // Создаем список записей для сортировки
        List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());

        // Сортируем записи по убыванию числа телефонов
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Выводим отсортированные контакты
        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map<String, Set<String>> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Set<String>> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
}