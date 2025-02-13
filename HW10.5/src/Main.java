import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            HashMap<String, String> contacts = new HashMap<>();
            Scanner num = new Scanner(System.in);

            while (true){
                System.out.println("Телефонная книга");
                System.out.println("1. Добавить контакт: ");
                System.out.println("2. показать все контакты: ");
                System.out.println("3. Найти контакт: ");
                System.out.println("4. Изменить номер: ");
                System.out.println("5. Удалить контакт: ");
                System.out.println("6. Выход на главную страницу.");
                System.out.print("Выберите действие: ");
                int choice = num.nextInt();
                num.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println();
                        System.out.print("Введите имя: ");
                        String name = num.nextLine();
                        if (contacts.containsKey(name)) {
                            System.out.println("Контакт уже существует!");

                        } else {

                            System.out.print("Введите номер телефона:");
                            String number = num.nextLine();
                            contacts.put(name, number);
                            System.out.println();
                            System.out.println("Контакт успешно добавлен!");
                            System.out.println();
                        }
                        break;
                    case 2:
                        if (contacts.isEmpty()) {
                            System.out.println();
                            System.out.println("Телефонная книга пуста!");
                        } else {
                            for (Map.Entry<String, String> info : contacts.entrySet()) {
                                System.out.println();
                                System.out.println(info);
                                System.out.println();
                            }
                        }
                        break;
                    case 3:
                        System.out.println();
                        System.out.print("Введите имя контакта: ");
                        String findName = num.nextLine();
                        if (contacts.containsKey(findName)) {
                            System.out.println(contacts.get(findName));
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("Контакт не найден!");
                            System.out.println();
                        }
                        break;
                    case 4:
                        System.out.println();
                        System.out.print("Введите имя: ");
                        String upName = num.nextLine();
                        if (contacts.containsKey(upName)) {
                            System.out.print("Введите номер телефона: ");
                            String upNum = num.nextLine();
                            contacts.put(upName, upNum);
                            System.out.println("Контакт успешно обновлен!");
                            System.out.println();
                        } else {
                            System.out.println("Контакт с таким именем не найден!");
                            System.out.println();
                        }
                        break;
                    case 5:
                        System.out.println();
                        System.out.print("Введите имя контакта которое хотите удалить: ");
                        String delName = num.nextLine();
                        if (contacts.containsKey(delName)){
                            contacts.remove(delName);
                            System.out.println("Контакт успешно удалён!");
                            System.out.println();
                        } else {
                            System.out.println("Контакт с таким именем не найден!");
                            System.out.println();
                        }
                        break;
                    case 6:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("ОШИБКА 402. Не корректный ввод!");
                }
            }
        }
    }
