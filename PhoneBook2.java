import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook2 {
    public PhoneBook2() {
    }

    public static void main(String[] args) {
        Map<String, List<String>> phoneBook2 = new LinkedHashMap<>(); // Используем LinkedHashMap для сохранения порядка добавления элементов
        
        // Добавление записей в телефонную книгу
        addPhone(phoneBook2, "Сеня", "+79023456789");
        addPhone(phoneBook2, "Сеня", "86934567890");
        addPhone(phoneBook2, "Сеня", "85855678901");
        addPhone(phoneBook2, "Вера", "89096789012");
        addPhone(phoneBook2, "Вера", "85047890123");
        addPhone(phoneBook2, "Коля", "89078901234");

        // Вывод результатов
        for (Map.Entry<String, List<String>> entry : phoneBook2.entrySet()) {
            System.out.print(entry.getKey() + ": [");
            List<String> phones = entry.getValue();
            for (int i = 0; i < phones.size(); i++) {
                String phone = phones.get(i);
                System.out.print(phone.substring(0, 3) + "......" + phone.substring(phone.length() - 2));
                if (i < phones.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    
    /**
     * @param phoneBook2
     * @param name
     * @param phone
     */
    public static void addPhone(Map<String, List<String>> phoneBook2, String name, String phone) {
        if (!phoneBook2.containsKey(name)) {
            phoneBook2.put(name, new ArrayList<>());
        }
        phoneBook2.get(name).add(phone);
    }
}