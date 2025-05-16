package org.example.SQLAddress.helper;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFiles {

    public final static StringBuilder builder = new StringBuilder();
    public static final Scanner scan = new Scanner(System.in);


    public static String validateStringsDirty(String value) {
        while (!value.equals("c") && !value.equals("z")) {
            System.out.println("You've got wrong, just type c or z, please !!!!!");
            value = scan.nextLine().toLowerCase();
        }
        return value;
    }

    public static String readFile() {
        builder.setLength(0);
        final File file;
        final JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(chooser);
        try {
            final String path = chooser.getSelectedFile().getAbsolutePath();
            String read = "";
            file = new File(path);
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String auxiliar;
                while ((auxiliar = bufferedReader.readLine()) != null) {
                    builder.append(auxiliar);
                    read = builder.toString();
                }
                return read;
            } catch (IOException ex) {
                System.err.println("Error reading file: " + ex.getMessage());
                //ex.printStackTrace();
            }
        } catch (NullPointerException ex) {
            javax.swing.JOptionPane.showMessageDialog(chooser, "the open of the file has been cancelled, Closing...");
            //ex.printStackTrace();
            System.exit(0);
        }
        return null;
    }

    public static void CreateDocument(String documentName, String arrayString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(documentName))) {
            writer.write(arrayString);
            System.out.println(documentName + " - Out in Document");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
