package com.cherepanov;

public class Supervisor {

    private Long id;
    private String name;
    private AccomodationSystem accomodationSystem;

    public Supervisor(Long id, String name, AccomodationSystem accomodationSystem) {
        this.id = id;
        this.name = name;
        this.accomodationSystem = accomodationSystem;
    }

    public void addStudentToRoom(Student student, Long roomNumber) {
        Room room = accomodationSystem.getRoomByNumber(roomNumber);
        room.addStudent(student);
    }

    public void removeStudentFromRoom(Student student, Long roomNumber) {
        Room room = accomodationSystem.getRoomByNumber(roomNumber);
        room.removeStudent(student);
    }

    public void printRequests() {
        System.out.println(accomodationSystem.getRequests());
    }

    public void closeRequest(String studentName) {
        accomodationSystem.removeRequest(studentName);
    }

    public void startAutoAccommodation() {
        accomodationSystem.autoAccommodation();
    }
}