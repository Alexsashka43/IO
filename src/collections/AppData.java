package collections;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void saveData() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("demo.csv"))) {
            for (String i: header) {
                out.write(i + ";");
            }
            for (int j = 0; j < data.length; j++) {
                out.write("\n");
                for (int k = 0; k < data[0].length; k++) {
                    out.write(data[j][k] + ";");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



