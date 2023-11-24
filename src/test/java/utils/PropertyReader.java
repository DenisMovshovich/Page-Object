package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    // Метод для получения URL из системных свойств.
    public static String getUrl() {
        return getProperty("url");
    }

    // Метод для получения типа браузера из системных свойств.
    public static Browser getBrowser() {
        return Browser.valueOf(getProperty("browser"));
    }

    // Приватный метод для получения значения свойства из системных свойств или файла свойств.
    private static String getProperty(String propertyName) {
        if (System.getProperty(propertyName) == null) {
            return getPropertyFromFile(propertyName);
        } else {
            return System.getProperty(propertyName);
        }
    }

    // Приватный метод для получения значения свойства из файла свойств.
    private static String getPropertyFromFile(String propertyName) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            // Загрузка файла свойств из указанного пути.
            input = new FileInputStream("src/test/resources/framework.properties");
            prop.load(input);
        } catch (IOException ex) {
            System.out.println("Cannot read property value for " + propertyName);
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // Возвращение значения свойства.
        return prop.getProperty(propertyName);
    }
}
