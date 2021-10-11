package BMS;

import lombok.Builder;
import lombok.Setter;

import java.time.LocalDateTime;
@Builder
@Setter
public class User {
    String userId;
    String userName;
    String ShowId;
    String CinemaId;
    String Movie;
    LocalDateTime timeOfBooking;
}
