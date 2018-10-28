import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by MoriMorou on 10.07.2018.
 */
public class HW6 {

/*    1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
      2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
      3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
      4. ** Написать метод, проверяющий, есть ли указанное слово в папке
*/

    public static void main(String[] args) {

        String vratar = "Mori Morou";

        String simvol = "Marlin Manson Mikko milk 2012";

        try {
            FileOutputStream fos = new FileOutputStream("text_one.txt");
            byte[] buffer = vratar.getBytes();  // переводим в байты
            fos.write(buffer, 0, buffer.length);
            fos.write(simvol.getBytes());       // переводим в байты (вариант2)
        } catch (FileNotFoundException e) {
            System.out.println("A file is not found!");
        } catch (IOException e) {
            System.out.println("Writing failed!");
        }

        FindWord("text_one.txt", "_");
    }

        private static void FindWord(String filename, String word) {  // метод для поиска слова

            try {
                FileInputStream fis = new FileInputStream(filename);
                int symbol = 0;
                int index = 0;
                byte[] wordbuffer = word.getBytes();
                do {
                    symbol = fis.read();
                    if (wordbuffer[index] == symbol) {
                        index++;
                        if (index == wordbuffer.length) {
                            System.out.println("This word is " + word);
                            break;
                        }
                    } else {
                        index = 0;
                    }
                } while (symbol != -1);
            } catch (FileNotFoundException e) {
                System.out.println("A file is not found!");
            } catch (IOException e) {
                System.out.println("Writing failed!");
        }
    }
}
