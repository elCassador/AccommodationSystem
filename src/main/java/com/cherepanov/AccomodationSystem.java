package com.cherepanov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccomodationSystem {

    private List<Room> rooms;
    private List<Student> students;
    private Map<String, String> requests;

    public AccomodationSystem() {
        rooms = new ArrayList<>();
        students = new ArrayList<>();
        requests = new HashMap<>();
    }

    public void addNewRoom(Room room) {
        rooms.add(room);
    }

    public void addNewStudent(Student student) {
        students.add(student);
    }

    public void addNewRequest(String studentName, String text) {
        requests.put(studentName, text);
    }

    public void removeRequest(String studentName) {
        requests.remove(studentName);
    }

    public Room getRoomByNumber(Long number) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(number)) {
                return room;
            }
        }

        return null;
    }

    public Student getStudentByName(String name, String surname) {
        for (Student student : students) {
            if (student.getName().equals(name) &&
                    student.getSurname().equals(surname)) {
                return student;
            }
        }

        return null;
    }

    public void autoAccommodation() {
        for (Student student : students) {
            if (student.getRoom() == null) {
                addStudentToAvailableRoom(student);
            }
        }
    }

    private void addStudentToAvailableRoom(Student student) {
        Room room = findAvailableRoom();

        if (room != null) {
            room.addStudent(student);
        }
    }

    private Room findAvailableRoom() {

        for (Room room : rooms) {
            if (room.getStudentsInRoom().size() < 3) {
                return room;
            }
        }

        return null;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<String, String> getRequests() {
        return requests;
    }
}