import java.util.*;

public class PhoneBook1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        
        // Добавление записей в телефонную книгу
        addPhone(phoneBook, "Alice", "555-1234");
        addPhone(phoneBook, "Bob", "555-5678");
        addPhone(phoneBook, "Alice", "555-7890");
        addPhone(phoneBook, "Bob", "555-9999");
        addPhone(phoneBook, "Alice", "555-4321");

        // Создание словаря для хранения имен и числа телефонов
        Map<String, Integer> namePhoneCount = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            namePhoneCount.put(entry.getKey(), entry.getValue().size());
        }

        // Сортировка по убыванию числа телефонов
        List<Map.Entry<String, Integer>> sortedNamePhoneCount = new ArrayList<>(namePhoneCount.entrySet());
        Collections.sort(sortedNamePhoneCount, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : sortedNamePhoneCount) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " phone(s)");
        }
    }
    
    public static void addPhone(Map<String, List<String>> phoneBook, String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }
}