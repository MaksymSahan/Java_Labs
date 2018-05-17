package ua.lviv.iot.work;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MilitaryMachineryWriter {

    public final void writeToFile(final List<MilitaryMachinery> models) {
        try (PrintWriter fileWriter = new PrintWriter("MilitaryMachinery.csv")) {
            for (MilitaryMachinery model : models) {
                fileWriter.println(model.getHeaders());
                fileWriter.println(model.toCSV());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
