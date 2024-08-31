# Railway Reservation API using Spring Boot in Java

Welcome to the **Railway Reservation API** project! This API is designed to streamline railway ticketing processes, providing efficient solutions for passengers and administrators alike. Built using Spring Boot in Java, it offers a range of features to handle various aspects of railway reservations.
#### `Start Date :    03/08/2024` `End Date   :   31/08/2024`
## 🚀 Features

### 1. CRUD Operations
- Manage passenger details, ticket bookings, and train schedules efficiently.
- Full support for Create, Read, Update, and Delete operations to maintain data integrity and ensure the system is up-to-date.

### 2. Ticket Fare Calculation
- Automatically calculate ticket fares based on travel class and distance.
- Transparent pricing for passengers, ensuring a clear understanding of fare breakdowns.

### 3. Station Management
- Simplify station management with functionalities to add, remove, and search for stations.
- Optimizes route planning and station data management.

### 4. Ticket Cancellation and Modification
- Easily cancel or modify tickets, with real-time updates to avoid booking conflicts.
- Improves user experience by providing flexibility in booking management.

### 5. Seat Availability Check
- Perform real-time checks for seat availability.
- Enhances user satisfaction by helping passengers make informed booking decisions.

### 6. Frequent Traveler Identification
- Identify frequent travelers to offer rewards or discounts.
- Boosts customer loyalty and encourages repeat business.

### 7. Fine Calculation for Passenger Accommodation
- Track and calculate fines associated with passenger accommodations.
- Ensures clear and precise records, enhancing accountability.

## 🛠️ Technologies Used

- **Java**: The primary programming language used to build the API.
- **Spring Boot**: Framework for building the API, providing a robust and scalable solution.
- **Hibernate/JPA**: For managing database operations and ORM (Object-Relational Mapping).
- **MySQL**: Relational database management system to store and manage data.
- **Maven**: Dependency management and build tool.

## 📂 Project Structure

```
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.JavaBatch7
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       └── service
│   │   └── resources
│   │       ├── application.properties
│   └── test
├── pom.xml
└── README.md
```

## 📦 Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher
- MySQL or PostgreSQL

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/your-username/railway-reservation-api.git
   cd railway-reservation-api
   ```

2. **Configure the Database**:

   Update `src/main/resources/application.properties` with your database settings.


3. **Build the project**:

   ```bash
   mvn clean install
   ```

4. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**:

   Open your browser and navigate to `http://localhost:1999/h2-console/login.jsp`, or API client (like Postman) and navigate to `http://localhost:1999/railway`

## 📚 API Endpoints

### Passenger Details

- **GET /passengers**: Retrieve all passenger details.
- **POST /passengers**: Add a new passenger.
- **POST /passengers/{id}**: Update existing passenger details.
- **DELETE /passengers/{id}**: Delete a passenger.

### Passenger Accommodation

- **GET /accommodations**: Retrieve all passenger accommodation details.
- **POST /accommodations**: Add new passenger accommodation details.
- **POST /accommodations/{sno}**: Update passenger accommodation details by serial number.
- **DELETE /accommodations/{sno}**: Delete passenger accommodation by serial number.

### Ticket Booking

- **GET /tickets**: Retrieve all tickets.
- **POST /tickets**: Book a new ticket.
- **POST /tickets/{sno}**: Update ticket details by serial number.
- **DELETE /tickets/{sno}**: Cancel a ticket by serial number.

### Train Facilities

- **GET /train-facilities**: Retrieve all train facilities details.
- **POST /train-facilities**: Add new train facilities.
- **POST /train-facilities/{trainNumber}**: Update train facilities details by train number.
- **DELETE /train-facilities/{trainNumber}**: Delete train facilities by train number.

### Train Stations

- **GET /train-stations**: Retrieve all train station details.
- **POST /train-stations**: Add a new train station.
- **POST /train-stations/{tno}**: Update train station details by travel number.
- **DELETE /train-stations/{tno}**: Delete a train station by travel number.

### Train Schedule

- **GET /trains**: Retrieve all train schedules.
- **POST /trains**: Add a new train schedule.
- **POST /trains/{tno}**: Update train schedule details by travel number.
- **DELETE /trains/{tno}**: Remove a train schedule by travel number.

### Additional API Functionalities

- **POST /tickets/fare**: Calculate ticket fare based on class and base fare.
- **GET /passengers/{id}/fines**: Calculate total fines paid by a passenger.
- **GET /trains/{tno}/schedule-changes**: Check for any schedule changes for a train.
- **GET /train-facilities/{trainNumber}/availability**: Check seat availability for a specific train.
- **GET /passengers/{id}/frequent-traveler**: Check if a passenger is a frequent traveler based on their ticket history.

## 🤝 Acknowledgments

- Thanks to **Revamp Academy** for providing a platform to work on this project and enhance my skills.
- Special thanks to my mentors and peers for their guidance and support throughout the project development.
