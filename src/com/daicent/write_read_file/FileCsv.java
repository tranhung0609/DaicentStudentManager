package com.daicent.write_read_file;

import com.daicent.model.Student;

import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class FileCsv {
    public List<Student> readFileStudent(List<Student>list, String filePath) throws Exception {
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);
        list.clear();
        if (scanner.nextLine() != null){
            while (scanner.hasNext()){
                String out = scanner.nextLine();
                String[] arr = out.split(",");
                Student student = new Student(arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
                student.setId(list.size()+1);
                list.add(student);
            }
        }else {
            throw new Exception();
        }
        return list;
    }
}
