package ua.company.taxi.model.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;

@Service
public class ScannerService {
    private static final String FILE = "C:\\Users\\dropt\\Desktop\\FinalProjects\\TaxiServiceSpring\\src\\main\\resources\\confirm_order";

    @PostConstruct
    public void initScanSimulator() {
        try {
            File file = new File(FILE);
            Files.write(file.toPath(), "NotAllow".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String startScanSimulator() {
        String line = " ";
        try {
            File file = new File(FILE);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            line = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }
}
