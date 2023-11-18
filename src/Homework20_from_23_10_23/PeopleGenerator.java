package Homework20_from_23_10_23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PeopleGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        File firstFile = new File("name_Female.txt");
        File secondFile = new File("nameMale.txt");
        File TtirdFile = new File("PensionFund.txt");

        FileReader fileReader = new FileReader(firstFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> people = bufferedReader.lines()
                .toList();
    }
}
