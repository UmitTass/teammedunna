package utilities;
import pojos.Registrant;
import java.io.BufferedWriter;
import java.io.FileWriter;




public class TXTWriter {

    public static void saveUIRegistrantData(Registrant registrant) {

        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("applicant_data"), true);

            // file creation
            // location + fileName + txt

            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(registrant.toString() + "\n");
            bw.close();

        }catch (Exception e) {
            e.printStackTrace();

        }

    }
}