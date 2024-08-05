package com.chap06.level01.basic.student.run;

import com.chap06.level01.basic.student.model.dto.StudentDTO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];
        int[] avg = new int[10];
        int count = 0;
        char ch;

        label:
        while(count < students.length) {
            for (int i = 0; i < 10; i++) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("학년 : ");
                int grade = scanner.nextInt();
//                students[i].setGrade(grade);

                System.out.print("반 : ");
                int classRoom = scanner.nextInt();
//                students[i].setClassroom(classRoom);

                System.out.print("이름 : ");
                String name = scanner.next();
//                students[i].setName(name);

                System.out.print("국어점수 : ");
                int kor = scanner.nextInt();
//                students[i].setKor(kor);

                System.out.print("영어점수 : ");
                int eng = scanner.nextInt();
//                students[i].setEng(eng);

                System.out.print("수학점수 : ");
                int math = scanner.nextInt();
//                students[i].setMath(math);

                students[i] = new StudentDTO(grade, classRoom, name, kor, eng, math);
                avg[i] = (kor + eng + math) / 3;

                System.out.print("계속 추가할 겁니까 ? (y/n) : ");
                ch = scanner.next().charAt(0);

                count++;

                if (ch == 'n' || ch == 'N') break label;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(students[i].getInformation());
            System.out.println("평균=" + avg[i]);
        }
    }
}