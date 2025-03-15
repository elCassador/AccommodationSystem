package com.cherepanov;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private Long roomNumber;
    private List<Student> studentsInRoom;

    public Room(Long number) {
        studentsInRoom = new ArrayList<>();
        this.roomNumber = number;
    }

    public void addStudent(Student student) {

        if (!isRoomEmpty() && !isSameGenderInRoom(student)) {
            return;
        }

        if (studentsInRoom.size() < 3) {
            studentsInRoom.add(student);
        }
    }

    private boolean isSameGenderInRoom(Student student) {
        Student studentFromRoom = studentsInRoom.get(0);

        return studentFromRoom.getGender().equals(student.getGender());
    }

    public void removeStudent(Student student) {
        studentsInRoom.remove(student);
    }

    public boolean isRoomEmpty() {
        return studentsInRoom.isEmpty();
    }

    public List<Student> getStudentsInRoom() {
        return studentsInRoom;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }
}