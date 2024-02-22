import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем объект телефонной книги
        PhoneBook phoneBook = new PhoneBook();

        // Получаем телефонную книгу из объекта phoneBook
        Map<String, List<String>> contacts = phoneBook.getContacts();

        // Создаем новую карту для хранения количества телефонов для каждого контакта
        Map<String, Integer> phoneCounts = new HashMap<>();

        // Подсчитываем количество телефонов для каждого контакта
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            phoneCounts.put(entry.getKey(), entry.getValue().size());
        }

        // Сортируем телефонные номера по убыванию количества цифр
        for (List<String> phones : contacts.values()) {
            phones.sort(Comparator.comparingInt(String::length).reversed());
        }

        // Сортируем контакты по убыванию количества телефонов
        List<Map.Entry<String, Integer>> sortedPhoneCounts = new ArrayList<>(phoneCounts.entrySet());
        sortedPhoneCounts.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        // Выводим отсортированные контакты и их телефонные номера
        for (Map.Entry<String, Integer> entry : sortedPhoneCounts) {
            String name = entry.getKey();
            List<String> phones = contacts.get(name);
            System.out.print(name + ": [");
            for (int i = 0; i < phones.size(); i++) {
                String formattedPhone = formatPhoneNumber(phones.get(i));
                System.out.print(formattedPhone);
                if (i < phones.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    // Метод для форматирования телефонного номера
    private static String formatPhoneNumber(String phone) {
        if (phone.length() > 6) {
            return phone.substring(0, 3) + "....." + phone.substring(phone.length() - 2);
        } else {
            return phone;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
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
}