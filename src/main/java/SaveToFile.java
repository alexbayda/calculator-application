//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class SaveToFile {
//
//    public void writeToFile() {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String date = sdf.format(new Date());
//            String filename = "calculations.txt";
//            File file = new File(filename);
//            Application app = new Application();
//            FileWriter fileWriter = new FileWriter(file, true);
//            fileWriter.write(date + fileWriter);
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//        }
//    }
//
//}
