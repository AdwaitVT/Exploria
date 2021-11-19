create table destiantion
(
    Country    varchar(255) not null,
    City       varchar(255) not null,
    `Zip Code` varchar(255) not null
);

create table user_registration
(
    Customer_Id int          not null
        primary key,
    Name        varchar(255) not null,
    Username    varchar(255) not null,
    Password    varchar(255) not null,
    Phone       varchar(255) not null,
    Email       varchar(255) not null
);

create table package_booking
(
    Customer_Id     int          not null,
    Booking_Id      int auto_increment
        primary key,
    Name            varchar(255) not null,
    Package_Name    varchar(255) not null,
    Date_of_Journey date         not null,
    No_of_Person    int          not null,
    Amount          int          not null,
    Destination     varchar(255) not null,
    constraint package_booking_fk0
        foreign key (Customer_Id) references user_registration (Customer_Id)
);

create table flight_booking
(
    Customer_Id     int          not null,
    Name            varchar(255) not null,
    Email           varchar(255) not null,
    `Flight Number` varchar(255) not null,
    Source          varchar(255) not null,
    Destination     varchar(255) not null,
    From_Date       date         not null,
    To_Date         date         not null,
    constraint flight_booking_fk0
        foreign key (Customer_Id) references package_booking (Customer_Id)
);

create table hotel_booking
(
    Customer_Id     int          not null,
    Name            varchar(255) not null,
    Email           int          not null,
    Hotel_Name      int          not null,
    `From`          date         not null,
    `To`            date         not null,
    No_of_Persons   date         not null,
    Payment_Details varchar(255) not null,
    Booking_Id      int          not null,
    Amount          varchar(255) not null,
    constraint hotel_booking_fk0
        foreign key (Customer_Id) references package_booking (Customer_Id),
    constraint hotel_booking_fk5
        foreign key (Booking_Id) references package_booking (Booking_Id)
);


