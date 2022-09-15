package com.daicent.main;

import com.daicent.model.*;
import com.daicent.model.Comparable;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Clazz> clazzList = new ArrayList<>();
        List<Grade> gradeList = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();
        List<School> schoolList = new ArrayList<>();
        Map<Grade, List<Student>> gradeListMap = new HashMap<>();
        Map<School, List<Student>> schoolListMap = new HashMap<School, List<Student>>();
        LinkedList<Student> studentWithHighScore = new LinkedList<>();
        Map<School, Set<Grade>> schoolSetMap = new HashMap<>();

//
//        Student student1 = new Student("Hưng", 24, 5.5);
//        Student student2 = new Student("Thuận", 54, 6);c
//        Student student3 = new Student("Sơn", 44, 4.6);
//        Student student4 = new Student("Hoa", 64, 3);
//
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);

        System.out.println(studentList);

        Grade grade1 = new Grade(1, "A");
        Grade grade2 = new Grade(2, "B");

//        List<Student> studentList1 = Arrays.asList(student1, student2);
//        gradeListMap.put(grade1, studentList1);
//        gradeListMap.put(grade2, studentList1);
//        System.out.println("-----------------------");
//        System.out.println(gradeListMap);
//        System.out.println("-----------------------");

        School school1 = new School(1, "Daicent");
        School school2 = new School(2, "FPT");
        schoolList.add(school1);
        schoolList.add(school2);
        schoolListMap.put(school1, studentList);
        System.out.println(schoolListMap.values());
        System.out.println("---------------");

//        double maxScore = 0;
//        int i = 0;
//        while (i < studentList.size()) {
//            if (Double.parseDouble())
//        }


        Comparable comparable = new Comparable();
        Collections.sort(studentList, comparable);
        for (Student sd : studentList) {
            System.out.println(sd.toString());
        }

//        System.out.println("The best " + studentList.get(0));

        double sumSchool = 0;
        double avgSchool = 0;
        for (Map.Entry<School, List<Student>> listEntry : schoolListMap.entrySet()
        ) {
            for (Student st : listEntry.getValue()
            ) {
                sumSchool += st.getAvgScore();
                avgSchool = sumSchool / listEntry.getValue().size();

            }
            System.out.println("Avg of scholl " + avgSchool);

        }

        System.out.println("------------------------------------------------");
        System.out.println("Thằng giỏi nhất lớp mà sử dụng map thành list");

        Map<Clazz, Student> map = new HashMap<>();
        Clazz clazz1 = new Clazz(1, "A");
        Clazz clazz2 = new Clazz(2, "B");
        Clazz clazz3 = new Clazz(3, "C");
        Student student = new Student("abc", clazz1, 22, 4);
        Student student5 = new Student("bcd", clazz2, 23, 7);
        Student student6 = new Student("Anh Thuận Lon", clazz3, 24, 7);
        Student student7 = new Student("Anh Thuận gia", clazz2, 24, 5);
        Student student8 = new Student("Anh Thuận gia non", clazz3, 24, 5);

        map.put(clazz1, student);
        map.put(clazz2, student7);
        map.put(clazz3, student6);
        map.put(clazz2, student5);
        map.put(clazz3, student8);

        List<Student> result = createListFromMapEntries(map);
        List<Student> listWithoutDuplicateElements = result
                .stream()
                .distinct()
                .collect(Collectors.toList());
        listWithoutDuplicateElements.forEach(System.out :: println);

    }
    private static <Clazz, Student>  List<Student> createListFromMapEntries (Map<Clazz, Student> map){
        return new ArrayList<>(map.values());
    }

    }

