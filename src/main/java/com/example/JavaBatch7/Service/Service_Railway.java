package com.example.JavaBatch7.Service;

import com.example.JavaBatch7.Model.*;
import com.example.JavaBatch7.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class Service_Railway {

    @Autowired
    private Repository_PassengerDetails passengerDetailsRepository;

    @Autowired
    private Repository_PassengerAccommodation passengerAccommodationRepository;

    @Autowired
    private Repository_PassengerTicket passengerTicketRepository;

    @Autowired
    private Repository_TrainDetails trainDetailsRepository;

    @Autowired
    private Repository_TrainFacilities trainFacilitiesRepository;

    @Autowired
    private Repository_TrainStations trainStationsRepository;

    // CRUD operations for Model_PassengerDetails
    public List<Model_PassengerDetails> getAllPassengers() {
        return passengerDetailsRepository.findAll();
    }

    public Model_PassengerDetails getPassengerById(long id) {
        return passengerDetailsRepository.findById(id).orElse(null);
    }

    public Model_PassengerDetails addPassenger(Model_PassengerDetails passenger) {
        return passengerDetailsRepository.save(passenger);
    }

    public List<Model_PassengerDetails> addAllPassengers(List<Model_PassengerDetails> passengers) {
        return passengerDetailsRepository.saveAll(passengers);
    }

    public Model_PassengerDetails updatePassenger(long id, Model_PassengerDetails passengerModel) {
        Model_PassengerDetails oldData = passengerDetailsRepository.findById(id).orElse(null);
        if (oldData != null) {
            oldData.setName(passengerModel.getName());
            oldData.setPhone(passengerModel.getPhone());
            oldData.setEmail(passengerModel.getEmail());
            return passengerDetailsRepository.save(oldData);
        }
        return null;
    }

    public void deletePassenger(long id) {
        passengerDetailsRepository.deleteById(id);
    }

    // CRUD operations for Model_PassengerAccommodation
    public List<Model_PassengerAccommodation> getAllAccommodations() {
        return passengerAccommodationRepository.findAll();
    }

    public Model_PassengerAccommodation getAccommodationById(long id) {
        return passengerAccommodationRepository.findById(id).orElse(null);
    }

    public Model_PassengerAccommodation addAccommodation(Model_PassengerAccommodation accommodation) {
        return passengerAccommodationRepository.save(accommodation);
    }

    public List<Model_PassengerAccommodation> addAllAccommodations(List<Model_PassengerAccommodation> accommodations) {
        return passengerAccommodationRepository.saveAll(accommodations);
    }

    public Model_PassengerAccommodation updateAccommodation(long id, Model_PassengerAccommodation accommodationModel) {
        Model_PassengerAccommodation oldData = passengerAccommodationRepository.findById(id).orElse(null);
        if (oldData != null) {
            oldData.setFood(accommodationModel.getFood());
            oldData.setFoodPrice(accommodationModel.getFoodPrice());
            oldData.setFine(accommodationModel.isFine());
            oldData.setFinePrice(accommodationModel.getFinePrice());
            return passengerAccommodationRepository.save(oldData);
        }
        return null;
    }

    public void deleteAccommodation(long id) {
        passengerAccommodationRepository.deleteById(id);
    }

    // CRUD operations for Model_PassengerTicket
    public List<Model_PassengerTicket> getAllTickets() {
        return passengerTicketRepository.findAll();
    }

    public Model_PassengerTicket getTicketById(long sno) {
        return passengerTicketRepository.findById(sno).orElse(null);
    }

    public Model_PassengerTicket addTicket(Model_PassengerTicket ticket) {
        return passengerTicketRepository.save(ticket);
    }

    public List<Model_PassengerTicket> addAllTickets(List<Model_PassengerTicket> tickets) {
        return passengerTicketRepository.saveAll(tickets);
    }

    public Model_PassengerTicket updateTicket(long sno, Model_PassengerTicket ticketModel) {
        Model_PassengerTicket oldData = passengerTicketRepository.findById(sno).orElse(null);
        if (oldData != null) {
            oldData.setId(ticketModel.getId());
            oldData.setType(ticketModel.getType());
            oldData.setTime(ticketModel.getTime());
            oldData.setTno(ticketModel.getTno());
            return passengerTicketRepository.save(oldData);
        }
        return null;
    }

    public void deleteTicket(long sno) {
        passengerTicketRepository.deleteById(sno);
    }

    // CRUD operations for Model_TrainDetails
    public List<Model_TrainDetails> getAllTrainDetails() {
        return trainDetailsRepository.findAll();
    }

    public Model_TrainDetails getTrainDetailByTno(long tno) {
        return trainDetailsRepository.findById(tno).orElse(null);
    }

    public Model_TrainDetails addTrainDetail(Model_TrainDetails trainDetails) {
        return trainDetailsRepository.save(trainDetails);
    }

    public List<Model_TrainDetails> addAllTrainDetails(List<Model_TrainDetails> trainDetailsList) {
        return trainDetailsRepository.saveAll(trainDetailsList);
    }

    public Model_TrainDetails updateTrainDetail(long tno, Model_TrainDetails trainDetailsModel) {
        Model_TrainDetails oldData = trainDetailsRepository.findById(tno).orElse(null);
        if (oldData != null) {
            oldData.setTrainNumber(trainDetailsModel.getTrainNumber());
            oldData.setFromPlace(trainDetailsModel.getFromPlace());
            oldData.setToPlace(trainDetailsModel.getToPlace());
            oldData.setFromTime(trainDetailsModel.getFromTime());
            oldData.setToTime(trainDetailsModel.getToTime());
            return trainDetailsRepository.save(oldData);
        }
        return null;
    }

    public void deleteTrainDetail(long tno) {
        trainDetailsRepository.deleteById(tno);
    }

    // CRUD operations for Model_TrainFacilities
    public List<Model_TrainFacilities> getAllTrainFacilities() {
        return trainFacilitiesRepository.findAll();
    }

    public Model_TrainFacilities getTrainFacilityByTrainNumber(long trainNumber) {
        return trainFacilitiesRepository.findById(trainNumber).orElse(null);
    }

    public Model_TrainFacilities addTrainFacility(Model_TrainFacilities trainFacilities) {
        return trainFacilitiesRepository.save(trainFacilities);
    }

    public List<Model_TrainFacilities> addAllTrainFacilities(List<Model_TrainFacilities> trainFacilitiesList) {
        return trainFacilitiesRepository.saveAll(trainFacilitiesList);
    }

    public Model_TrainFacilities updateTrainFacility(long trainNumber, Model_TrainFacilities trainFacilitiesModel) {
        Model_TrainFacilities oldData = trainFacilitiesRepository.findById(trainNumber).orElse(null);
        if (oldData != null) {
            oldData.setSeats(trainFacilitiesModel.getSeats());
            oldData.setCompartments(trainFacilitiesModel.getCompartments());
            oldData.setSpeed(trainFacilitiesModel.getSpeed());
            return trainFacilitiesRepository.save(oldData);
        }
        return null;
    }

    public void deleteTrainFacility(long trainNumber) {
        trainFacilitiesRepository.deleteById(trainNumber);
    }

    // CRUD operations for Model_TrainStations
    public List<Model_TrainStations> getAllTrainStations() {
        return trainStationsRepository.findAll();
    }

    public Model_TrainStations getTrainStationByTno(long tno) {
        return trainStationsRepository.findById(tno).orElse(null);
    }

    public Model_TrainStations addTrainStation(Model_TrainStations trainStations) {
        return trainStationsRepository.save(trainStations);
    }

    public List<Model_TrainStations> addAllTrainStations(List<Model_TrainStations> trainStationsList) {
        return trainStationsRepository.saveAll(trainStationsList);
    }

    public Model_TrainStations updateTrainStation(long tno, Model_TrainStations trainStationsModel) {
        Model_TrainStations oldData = trainStationsRepository.findById(tno).orElse(null);
        if (oldData != null) {
            oldData.setStationId(trainStationsModel.getStationId());
            oldData.setStationName(trainStationsModel.getStationName());
            return trainStationsRepository.save(oldData);
        }
        return null;
    }

    public void deleteTrainStation(long tno) {
        trainStationsRepository.deleteById(tno);
    }

    // Features

    public String calculateTicketFare(long sno, BigDecimal baseFare) {
        BigDecimal fare = passengerTicketRepository.calculateFare(sno, baseFare);
        if (fare != null) {
            return "Fare calculated successfully: " + fare.toString();
        } else {
            return "Failed to calculate fare.";
        }
    }

    // Features
    public List<Model_TrainStations> findStationsByName(String name) {
        return trainStationsRepository.findStationsByName(name);
    }

    @Transactional
    public void cancelAndAddTicket(long sno, Model_PassengerTicket model_passengerTicket) {
        passengerTicketRepository.cancelTicket(sno);
        passengerTicketRepository.save(model_passengerTicket);
    }

    // Additional Features
    public boolean checkFrequentTraveler(long id, long frequentTimes) {
        return passengerTicketRepository.isFrequentTraveler(id, frequentTimes);
    }

    public long checkSeatAvailability(long trainNumber) {
        return trainFacilitiesRepository.isSeatAvailable(trainNumber);
    }

    public String passenger_Accommodation_fine(long id) {
        List<Model_PassengerAccommodation> allAccommodations = passengerAccommodationRepository.findAllById(id);
        BigDecimal totalFine = BigDecimal.ZERO, totalFoodPrice = BigDecimal.ZERO;

        if (allAccommodations.isEmpty()) {
            return "No Accommodations found for ID: " + id;
        }

        StringBuilder accommodationsData = new StringBuilder("Accommodations for ID " + id + ":\n");

        for (Model_PassengerAccommodation accommodation : allAccommodations) {
            // Add to total fine if applicable
            totalFoodPrice = totalFoodPrice.add(accommodation.getFoodPrice());
            if (accommodation.isFine()) {
                totalFine = totalFine.add(accommodation.getFinePrice());
            }
        }
        accommodationsData.append("Total Food Price: ").append(totalFoodPrice).append("\n");
        accommodationsData.append("Total Fine Paid: ").append(totalFine.compareTo(BigDecimal.ZERO) > 0 ? totalFine : "No Fine!");

        return accommodationsData.toString();
    }

}
