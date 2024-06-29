package org.pds;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1. Gestión de Usuarios");
            System.out.println("2. Gestión de Salas");
            System.out.println("3. Gestión de Reservas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("1. Ver Usuarios");
                    System.out.println("2. Agregar Usuario");
                    System.out.println("3. Actualizar Usuario");
                    System.out.println("4. Eliminar Usuario");
                    System.out.print("Seleccione una opción: ");
                    int userOption = Integer.parseInt(scanner.nextLine());
                    switch (userOption) {
                        case 1:
                            User[] users = crud.getUsers();
                            for (User user : users) {
                                System.out.println(user.getId() + ". " + user.getName());
                            }
                            if (users.length > 0) {
                                System.out.println("Desea ver los detalles de un usuario? (s/n)");
                                String details = scanner.nextLine();
                                if (details.equals("s")) {
                                    System.out.print("ID: ");
                                    int id = Integer.parseInt(scanner.nextLine());
                                    User user = crud.getUser(id);
                                    System.out.println("Nombre: " + user.getName());
                                    System.out.println("Departamento: " + user.getDepartment());
                                    System.out.println("Descripción: " + user.getDescription());
                                }
                            } else {
                                System.out.println("No hay usuarios disponibles");
                            }
                            break;
                        case 2:
                            System.out.print("Nombre: ");
                            String name = scanner.nextLine();
                            System.out.print("Departamento: ");
                            String department = scanner.nextLine();
                            System.out.print("Descripción: ");
                            String description = scanner.nextLine();
                            crud.addUser(name, department, description);
                            System.out.println("Usuario agregado");
                            break;
                        case 3:
                            System.out.print("ID: ");
                            int id = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nombre: ");
                            name = scanner.nextLine();
                            System.out.print("Departamento: ");
                            department = scanner.nextLine();
                            System.out.print("Descripción: ");
                            description = scanner.nextLine();
                            crud.updateUser(id, name, department, description);
                            System.out.println("Usuario actualizado");
                            break;
                        case 4:
                            System.out.print("ID: ");
                            id = Integer.parseInt(scanner.nextLine());
                            crud.deleteUser(id);
                            System.out.println("Usuario eliminado");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Ver Salas");
                    System.out.println("2. Agregar Sala");
                    System.out.println("3. Actualizar Sala");
                    System.out.println("4. Eliminar Sala");
                    System.out.print("Seleccione una opción: ");
                    int roomOption = Integer.parseInt(scanner.nextLine());
                    switch (roomOption) {
                        case 1:
                            Room[] rooms = crud.getRooms();
                            for (Room room : rooms) {
                                System.out.println(room.getId() + ". " + room.getName());
                            }
                            if (rooms.length > 0) {
                                System.out.println("Desea ver los detalles de una sala? (s/n)");
                                String details = scanner.nextLine();
                                if (details.equals("s")) {
                                    System.out.print("ID: ");
                                    int id = Integer.parseInt(scanner.nextLine());
                                    Room room = crud.getRoom(id);
                                    System.out.println("Nombre: " + room.getName());
                                    System.out.println("Ubicación: " + room.getLocation());
                                    System.out.println("Disponible: " + room.getAvailability());
                                }
                            } else {
                                System.out.println("No hay salas disponibles");
                            }
                            break;
                        case 2:
                            System.out.print("Nombre: ");
                            String name = scanner.nextLine();
                            System.out.print("Ubicación: ");
                            String location = scanner.nextLine();
                            System.out.print("Disponible: ");
                            boolean available = Boolean.parseBoolean(scanner.nextLine());
                            crud.addRoom(name, location, available);
                            System.out.println("Sala agregada");
                            break;
                        case 3:
                            System.out.print("ID: ");
                            int id = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nombre: ");
                            name = scanner.nextLine();
                            System.out.print("Ubicación: ");
                            location = scanner.nextLine();
                            System.out.print("Disponible: ");
                            available = Boolean.parseBoolean(scanner.nextLine());
                            crud.updateRoom(id, name, available);
                            System.out.println("Sala actualizada");
                            break;
                        case 4:
                            System.out.print("ID: ");
                            id = Integer.parseInt(scanner.nextLine());
                            crud.deleteRoom(id);
                            System.out.println("Sala eliminada");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Ver Reservas");
                    System.out.println("2. Agregar Reserva");
                    System.out.println("3. Actualizar Reserva");
                    System.out.println("4. Eliminar Reserva");
                    System.out.print("Seleccione una opción: ");
                    int reservationOption = Integer.parseInt(scanner.nextLine());
                    switch (reservationOption) {
                        case 1:
                            Reservation[] reservations = crud.getReservations();
                            for (Reservation reservation : reservations) {
                                System.out.println(reservation.getId() + ". " + reservation.getDescription());
                            }
                            if (reservations.length > 0) {
                                System.out.println("Desea ver los detalles de una reserva? (s/n)");
                                String details = scanner.nextLine();
                                if (details.equals("s")) {
                                    System.out.print("ID: ");
                                    int id = Integer.parseInt(scanner.nextLine());
                                    Reservation reservation = crud.getReservation(id);
                                    System.out.println("ID de Usuario: " + reservation.getUserId());
                                    System.out.println("ID de Sala: " + reservation.getRoomId());
                                    System.out.println("Fecha: " + reservation.getDate());
                                    System.out.println("Descripción: " + reservation.getDescription());
                                }
                            } else {
                                System.out.println("No hay reservas disponibles");
                            }
                            break;
                        case 2:
                            System.out.print("ID de Usuario: ");
                            int userId = Integer.parseInt(scanner.nextLine());
                            System.out.print("ID de Sala: ");
                            int roomId = Integer.parseInt(scanner.nextLine());
                            System.out.print("Fecha (yyyy-mm-dd): ");
                            String date = scanner.nextLine();
                            System.out.print("Descripción: ");
                            String description = scanner.nextLine();
                            crud.addReservation(userId, roomId, LocalDate.parse(date), description);
                            System.out.println("Reserva agregada");
                            break;
                        case 3:
                            System.out.print("ID: ");
                            int id = Integer.parseInt(scanner.nextLine());
                            System.out.print("ID de Usuario: ");
                            userId = Integer.parseInt(scanner.nextLine());
                            System.out.print("ID de Sala: ");
                            roomId = Integer.parseInt(scanner.nextLine());
                            System.out.print("Fecha (yyyy-mm-dd): ");
                            date = scanner.nextLine();
                            System.out.print("Descripción: ");
                            description = scanner.nextLine();
                            crud.updateReservation(id, userId, roomId, LocalDate.parse(date), description);
                            System.out.println("Reserva actualizada");
                            break;
                        case 4:
                            System.out.print("ID: ");
                            id = Integer.parseInt(scanner.nextLine());
                            crud.deleteReservation(id);
                            System.out.println("Reserva eliminada");
                            break;
                    }
                    break;
                case 4:
                    running = false;
                    break;
            }
        }
    }
}