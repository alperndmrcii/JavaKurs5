package Gun40;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
// ne kadar isim/kelime girilirse o kadar başharf alan method

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tam adınızı girin: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.trim().split("\\s+");
        int nameCount = names.length;

        StringBuilder initials = new StringBuilder();
        for (int i = 0; i < nameCount; i++) {
            initials.append(names[i].charAt(0)+".");
        }


        System.out.println("Tam adın baş harfleri: " + initials);
        System.out.println(nameCount);

            }
        }

