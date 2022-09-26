# MovieBooking_SpingBoot
Rest API for Movie Booking

## Supported features

*  Able to list the cities where affiliate cinemas are located [localhost:8080/cinemas/PVR/cities](localhost:8080/cinemas/PVR/cities).

* Each cinema can have multiple halls and each hall can run one movie show at a time[localhost:8080/shows](localhost:8080/shows).

* Customers should be able to search movies by their title, language, release date, and city name [localhost:8080/movies/search?city=indore&languae=tamil](localhost:8080/movies/search?city=indore&languae=tamil).

* The customer should be able to select a show at a particular cinema and book their tickets[localhost:8080/bookings](localhost:8080/bookings).

* The customer should be able to distinguish between available seats and booked ones[localhost:8080/cinemaseats/cinemahallid/1001](localhost:8080/cinemaseats/cinemahallid/1001).

* The system ensure that no two customers can reserve the same seat

## For Open-API documention open api-docs.json file


## For Running the application

* Inport the application as maven
* jInstall the dependencies
* Run the application
* Make API calls using postman collection 