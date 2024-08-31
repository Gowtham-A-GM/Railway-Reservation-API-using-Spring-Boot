package com.example.JavaBatch7.Controller;

import com.example.JavaBatch7.Model.*;
import com.example.JavaBatch7.Service.Service_Railway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/railway")
public class Controller_Railway {

    @Autowired
    private Service_Railway railwayService;

    // Passenger Details Endpoints
    @GetMapping("/getAllPassengers")
    public List<Model_PassengerDetails> getAllPassengers() {
        return railwayService.getAllPassengers();
    }

    @GetMapping("/getPassengerById/{id}")
    public Model_PassengerDetails getPassengerById(@PathVariable long id) {
        return railwayService.getPassengerById(id);
    }

    @PostMapping("/addPassenger")
    public Model_PassengerDetails addPassenger(@RequestBody Model_PassengerDetails passenger) {
        return railwayService.addPassenger(passenger);
    }

    @PostMapping("/addAllPassengers")
    public List<Model_PassengerDetails> addAllPassengers(@RequestBody List<Model_PassengerDetails> passengers) {
        return railwayService.addAllPassengers(passengers);
    }

    @PostMapping("/updatePassenger/{id}")
    public Model_PassengerDetails updatePassenger(@PathVariable long id, @RequestBody Model_PassengerDetails passenger) {
        return railwayService.updatePassenger(id, passenger);
    }

    @DeleteMapping("/deletePassenger/{id}")
    public String deletePassenger(@PathVariable long id) {
        railwayService.deletePassenger(id);
        return "Passenger details deleted!";
    }

    // Passenger Accommodation Endpoints
    @GetMapping("/getAllAccommodations")
    public List<Model_PassengerAccommodation> getAllAccommodations() {
        return railwayService.getAllAccommodations();
    }

    @GetMapping("/getAccommodationById/{id}")
    public Model_PassengerAccommodation getAccommodationById(@PathVariable long id) {
        return railwayService.getAccommodationById(id);
    }

    @PostMapping("/addAccommodation")
    public Model_PassengerAccommodation addAccommodation(@RequestBody Model_PassengerAccommodation accommodation) {
        return railwayService.addAccommodation(accommodation);
    }

    @PostMapping("/addAllAccommodations")
    public List<Model_PassengerAccommodation> addAllAccommodations(@RequestBody List<Model_PassengerAccommodation> accommodations) {
        return railwayService.addAllAccommodations(accommodations);
    }

    @PostMapping("/updateAccommodation/{id}")
    public Model_PassengerAccommodation updateAccommodation(@PathVariable long id, @RequestBody Model_PassengerAccommodation accommodation) {
        return railwayService.updateAccommodation(id, accommodation);
    }

    @DeleteMapping("/deleteAccommodation/{id}")
    public String deleteAccommodation(@PathVariable long id) {
        railwayService.deleteAccommodation(id);
        return "Passenger accommodation details deleted!";
    }

    // Passenger Ticket Endpoints
    @GetMapping("/getAllTickets")
    public List<Model_PassengerTicket> getAllTickets() {
        return railwayService.getAllTickets();
    }

    @GetMapping("/getTicketById/{sno}")
    public Model_PassengerTicket getTicketById(@PathVariable long sno) {
        return railwayService.getTicketById(sno);
    }

    @PostMapping("/addTicket")
    public Model_PassengerTicket addTicket(@RequestBody Model_PassengerTicket ticket) {
        return railwayService.addTicket(ticket);
    }

    @PostMapping("/addAllTickets")
    public List<Model_PassengerTicket> addAllTickets(@RequestBody List<Model_PassengerTicket> tickets) {
        return railwayService.addAllTickets(tickets);
    }

    @PostMapping("/updateTicket/{sno}")
    public Model_PassengerTicket updateTicket(@PathVariable long sno, @RequestBody Model_PassengerTicket ticket) {
        return railwayService.updateTicket(sno, ticket);
    }

    @DeleteMapping("/deleteTicket/{sno}")
    public String deleteTicket(@PathVariable long sno) {
        railwayService.deleteTicket(sno);
        return "Passenger ticket deleted!";
    }

    // Train Details Endpoints
    @GetMapping("/getAllTrainDetails")
    public List<Model_TrainDetails> getAllTrainDetails() {
        return railwayService.getAllTrainDetails();
    }

    @GetMapping("/getTrainDetailByTno/{tno}")
    public Model_TrainDetails getTrainDetailByTno(@PathVariable long tno) {
        return railwayService.getTrainDetailByTno(tno);
    }

    @PostMapping("/addTrainDetail")
    public Model_TrainDetails addTrainDetail(@RequestBody Model_TrainDetails trainDetails) {
        return railwayService.addTrainDetail(trainDetails);
    }

    @PostMapping("/addAllTrainDetails")
    public List<Model_TrainDetails> addAllTrainDetails(@RequestBody List<Model_TrainDetails> trainDetailsList) {
        return railwayService.addAllTrainDetails(trainDetailsList);
    }

    @PostMapping("/updateTrainDetail/{tno}")
    public Model_TrainDetails updateTrainDetail(@PathVariable long tno, @RequestBody Model_TrainDetails trainDetails) {
        return railwayService.updateTrainDetail(tno, trainDetails);
    }

    @DeleteMapping("/deleteTrainDetail/{tno}")
    public String deleteTrainDetail(@PathVariable long tno) {
        railwayService.deleteTrainDetail(tno);
        return "Train detail deleted!";
    }

    // Train Facilities Endpoints
    @GetMapping("/getAllTrainFacilities")
    public List<Model_TrainFacilities> getAllTrainFacilities() {
        return railwayService.getAllTrainFacilities();
    }

    @GetMapping("/getTrainFacilityByTrainNumber/{trainNumber}")
    public Model_TrainFacilities getTrainFacilityByTrainNumber(@PathVariable long trainNumber) {
        return railwayService.getTrainFacilityByTrainNumber(trainNumber);
    }

    @PostMapping("/addTrainFacility")
    public Model_TrainFacilities addTrainFacility(@RequestBody Model_TrainFacilities trainFacilities) {
        return railwayService.addTrainFacility(trainFacilities);
    }

    @PostMapping("/addAllTrainFacilities")
    public List<Model_TrainFacilities> addAllTrainFacilities(@RequestBody List<Model_TrainFacilities> trainFacilitiesList) {
        return railwayService.addAllTrainFacilities(trainFacilitiesList);
    }

    @PostMapping("/updateTrainFacility/{trainNumber}")
    public Model_TrainFacilities updateTrainFacility(@PathVariable long trainNumber, @RequestBody Model_TrainFacilities trainFacilities) {
        return railwayService.updateTrainFacility(trainNumber, trainFacilities);
    }

    @DeleteMapping("/deleteTrainFacility/{trainNumber}")
    public String deleteTrainFacility(@PathVariable long trainNumber) {
        railwayService.deleteTrainFacility(trainNumber);
        return "Train facility deleted!";
    }

    // Train Stations Endpoints
    @GetMapping("/getAllTrainStations")
    public List<Model_TrainStations> getAllTrainStations() {
        return railwayService.getAllTrainStations();
    }

    @GetMapping("/getTrainStationByTno/{tno}")
    public Model_TrainStations getTrainStationByTno(@PathVariable long tno) {
        return railwayService.getTrainStationByTno(tno);
    }

    @PostMapping("/addTrainStation")
    public Model_TrainStations addTrainStation(@RequestBody Model_TrainStations trainStations) {
        return railwayService.addTrainStation(trainStations);
    }

    @PostMapping("/addAllTrainStations")
    public List<Model_TrainStations> addAllTrainStations(@RequestBody List<Model_TrainStations> trainStationsList) {
        return railwayService.addAllTrainStations(trainStationsList);
    }

    @PostMapping("/updateTrainStation/{tno}")
    public Model_TrainStations updateTrainStation(@PathVariable long tno, @RequestBody Model_TrainStations trainStations) {
        return railwayService.updateTrainStation(tno, trainStations);
    }

    @DeleteMapping("/deleteTrainStation/{tno}")
    public String deleteTrainStation(@PathVariable long tno) {
        railwayService.deleteTrainStation(tno);
        return "Train station deleted!";
    }

    // Ticket Fare Calculation
    @GetMapping("/calculateFare/{sno}")
    public String calculateTicketFare(@PathVariable long sno, @RequestParam BigDecimal baseFare) {
        return railwayService.calculateTicketFare(sno, baseFare);
    }

    // Features
    // Find Stations by Name
    @GetMapping("/stationsByName")
    public List<Model_TrainStations> findStationsByName(@RequestParam String name) {
        return railwayService.findStationsByName(name);
    }

    // Cancel and Add Ticket
    @PostMapping("/cancelAndAddTicket/{sno}")
    public String cancelAndAddTicket(@PathVariable long sno, @RequestBody Model_PassengerTicket model_passengerTicket) {
        railwayService.cancelAndAddTicket(sno, model_passengerTicket);
        return "Ticket canceled and re-added to reservation.";
    }


    // Additional Features
    // Check Frequent Traveler
    @GetMapping("/checkFrequentTraveler/{id}")
    public String checkFrequentTraveler(@PathVariable long id, @RequestParam long frequentTimes) {
        boolean result = railwayService.checkFrequentTraveler(id, frequentTimes);
        return (result ? "Frequent Traveler !":"Not a Frequent Traveler !");
    }

    // Check Seat Availability
    @GetMapping("/checkSeatAvailability/{trainNumber}")
    public String checkSeatAvailability(@PathVariable long trainNumber) {
        long result = railwayService.checkSeatAvailability(trainNumber);
        return (result > 0 ? "Seat(s) Available: "+ result:"No Seats Available !");
    }

    // Check Whether the passenger paid any FINE ?
    @GetMapping("/passenger_Accommodation_fine/{id}")
    public String passenger_Accommodation_fine(@PathVariable long id) {
        return railwayService.passenger_Accommodation_fine(id);
    }
}
