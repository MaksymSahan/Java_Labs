package ua.lviv.iot.work;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MilitaryMachineryWriter {

    public final void writeToFile(final List<MilitaryMachinery> models) {
        try (PrintWriter fileWriter = new PrintWriter("MilitaryMachinery.csv")) {
            fileWriter.println(models.get(0).getHeaders());
            for (MilitaryMachinery militaryMachinery : models) {

                fileWriter.println(militaryMachinery.toCSV());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
