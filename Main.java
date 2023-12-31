package T4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("Finish");
                } catch (Exception ignored) {
                }

            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

}
