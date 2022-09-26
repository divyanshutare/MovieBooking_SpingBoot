insert into users (user_id, email, name, password, phone) values (1001, 'div@gmail.com', 'divyanshu', '123', 7804056380);
insert into users (user_id, email, name, password, phone) values (1002, 'divy@gmail.com', 'divyanshu Tare', '123', 7804056381);
insert into users (user_id, email, name, password, phone) values (1003, 'divya@gmail.com', 'div Tare', '123', 7804056382);


insert into city (city_id, name, state) values (1001, 'Indore', 'MP');
insert into city (city_id, name, state) values (1002, 'Pune', 'MH');
insert into city (city_id, name, state) values (1003, 'Mumbai', 'MH');

insert into cinema (cinema_id, location, name, city_city_id) values (1001, 'TI', 'PVR', 1001);
insert into cinema (cinema_id, location, name, city_city_id) values (1002, 'TI Next', 'Inox', 1001);
insert into cinema (cinema_id, location, name , city_city_id) values (1003, 'Sapna Sangeeta', 'Inox', 1001);
insert into cinema (cinema_id, location, name, city_city_id) values (1004,'Phoenix Mall',  'PVR', 1002);
insert into cinema (cinema_id, location, name, city_city_id) values (1005, 'Phoenix','PVR', 1003);
insert into cinema (cinema_id, location, name, city_city_id) values (1006, 'Oberoi','PVR', 1003);


insert into cinema_hall (cinema_hall_id, total_seat, screen, cinema_cinema_id) values (1001, 10, '1', 1001);
insert into cinema_hall (cinema_hall_id, total_seat, screen, cinema_cinema_id) values (1002, 10, '1', 1002);
insert into cinema_hall (cinema_hall_id, total_seat, screen, cinema_cinema_id) values (1003, 10, '1 ', 1003);
insert into cinema_hall (cinema_hall_id, total_seat, screen, cinema_cinema_id) values (1004, 10, '1', 1004);
insert into cinema_hall (cinema_hall_id, total_seat, screen, cinema_cinema_id) values (1005, 10, '1', 1005);
insert into cinema_hall (cinema_hall_id, total_seat, screen, cinema_cinema_id) values (1006, 10, '1', 1006);

insert into movie (movie_id, description, country, duration, genre, language, release_date, title)
    values (1001, 'An accidental, yet destined meet up between two strangers Ruhaan and Reet, ends up with them visiting Reet`s home town in Rajasthan. Fate leads them to opening up an old secret due to which all hell breaks loose leading to one lie, leading to a whole pile of lies sends Ruhaan and Reet on a scary rollercoaster ride and their tragedy keeps becoming our comedy.',
    'India', '02:10:00', 'Comedy, Horror', 'Hindi', '2022-05-20 00:00:00.00', 'Bhool Bhulaiyaa 2');

insert into movie (movie_id, description, country, duration, genre, language, release_date, title)
        values (1002, 'Doctor Strange in the Multiverse of Madness - a thrilling ride through the Multiverse with Doctor Strange, his trusted friend Wong and Wanda Maximoff, aka Scarlet Witch.',
        'India', '02:06:00', 'Action, Adventure, Fantasy', 'English, Hindi, Kannada, Malayalam, Tamil, Telugu', '2022-05-06 00:00:00.00', 'Doctor Strange: In The Multiverse Of Madness');



insert into show (show_id, date, end_time, start_time, CINEMA_HALLID_CINEMA_HALL_ID, movie_movie_id)
    values (1001, '2022-06-05', '12:00:00', '09:45:00', '1001', '1001');

insert into show (show_id, date, end_time, start_time, CINEMA_HALLID_CINEMA_HALL_ID, movie_movie_id)
    values (1002, '2022-06-05', '15:15:00', '13:00:00', '1001', '1001');

insert into show (show_id, date, end_time, start_time, CINEMA_HALLID_CINEMA_HALL_ID, movie_movie_id)
    values (1003, '2022-06-05', '12:00:00', '09:45:00', '1002', '1002');

insert into show (show_id, date, end_time, start_time, CINEMA_HALLID_CINEMA_HALL_ID, movie_movie_id)
    values (1004, '2022-06-03', '12:00:00', '09:45:00', '1004', '1002');


insert into show (show_id, date, end_time, start_time, CINEMA_HALLID_CINEMA_HALL_ID, movie_movie_id)
     values (1005, '2022-06-02', '12:00:00', '09:45:00', '1005', '1002');


insert into booking (booking_id, status, time,show_show_id, user_user_id)
values (1001, 'booked', CURRENT_TIMESTAMP,1001, 1001);
insert into booking (booking_id, status, time,show_show_id, user_user_id)
values (1002, 'booked', CURRENT_TIMESTAMP,1002, 1002);
insert into booking (booking_id, status, time,show_show_id, user_user_id)
values (1003, 'Canceled', CURRENT_TIMESTAMP,1002, 1003);
insert into booking (booking_id, status, time,show_show_id, user_user_id)
values (1004, 'booked', '2022-06-05 18:47:52.69' ,1002 , 1001);


insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID  )
    values (1001, 1, 'premium', 1001);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
    values (1002, 2, 'premium', 1001);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1003, 3, 'premium', 1001);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1004, 4, 'premium', 1001);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1005, 5, 'premium', 1001);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1006, 6, 'premium', 1001);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1007, 7, 'premium', 1001);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1008, 8, 'premium', 1001);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1009, 9, 'premium', 1001);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1010, 10, 'premium', 1001);



 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1011, 1, 'premium', 1002);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1012, 2, 'premium', 1002);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1013, 3, 'premium', 1002);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1014, 4, 'premium', 1002);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1015, 5, 'premium', 1002);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1016, 6, 'premium', 1002);

    insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1017, 7, 'premium', 1002);

    insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1018, 8, 'premium', 1002);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1019, 9, 'premium', 1002);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1020, 10, 'premium', 1002);



 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1021, 1, 'premium', 1003);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1022, 2, 'premium', 1003);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1023, 3, 'premium', 1003);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1024, 4, 'premium', 1003);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1025, 5, 'premium', 1003);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1026, 6, 'premium', 1003);

    insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1027, 7, 'premium', 1003);

    insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1028, 8, 'premium', 1003);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1029, 9, 'premium', 1003);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1030, 10, 'premium', 1003);




insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
    values (1031, 1, 'premium', 1004);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
    values (1032, 2, 'premium', 1004);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1033, 3, 'premium', 1004);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1034, 4, 'premium', 1004);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1035, 5, 'premium', 1004);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1036, 6, 'premium', 1004);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1037, 7, 'premium', 1004);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1038, 8, 'premium', 1004);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1039, 9, 'premium', 1004);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1040, 10, 'premium', 1004);



insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
    values (1041, 1, 'premium', 1005);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
    values (1042, 2, 'premium', 1005);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1043, 3, 'premium', 1005);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1044, 4, 'premium', 1005);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1045, 5, 'premium', 1005);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1046, 6, 'premium', 1005);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1047, 7, 'premium', 1005);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1048, 8, 'premium', 1005);

insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
     values (1049, 9, 'premium', 1005);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1050, 10, 'premium', 1005);


  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1051, 1, 'premium', 1006);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
      values (1052, 2, 'premium', 1006);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1053, 3, 'premium', 1006);

   insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
        values (1054, 4, 'premium', 1006);

    insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1055, 5, 'premium', 1006);

    insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1056, 6, 'premium', 1006);

     insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
          values (1057, 7, 'premium', 1006);

     insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
          values (1058, 8, 'premium', 1006);

  insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
       values (1059, 9, 'premium', 1006);

 insert into cinema_seat (cinema_seat_id, seat_number, type, CINEMA_HALL_CINEMA_HALL_ID)
         values (1060, 10, 'premium', 1006);



insert into show_seat (show_seat_id, price, status, booking_booking_id, 	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
    values(1001, 50, 'Booked', 1001, 1001, 1001);

 insert into show_seat (show_seat_id, price, status, booking_booking_id, 	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
     values(1002, 50, 'Booked', 1001, 1002, 1001);

 insert into show_seat (show_seat_id, price, status, booking_booking_id, 	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
     values(1004, 50, 'Booked', 1001, 1004, 1001);

insert into show_seat (show_seat_id, price, status, booking_booking_id,	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
    values(1005, 50, 'Booked', 1002, 1011, 1002);

 insert into show_seat (show_seat_id, price, status, booking_booking_id, 	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
     values(1006, 50, 'Booked', 1003, 1012, 1002);

 insert into show_seat (show_seat_id, price, status, booking_booking_id, 	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
     values(1007, 50, 'Booked', 1004, 1013, 1002);

 insert into show_seat (show_seat_id, price, status, booking_booking_id, 	CINEMA_SEAT_CINEMA_SEAT_ID  , show_show_id)
     values(1008, 50, 'Booked', 1004, 1014, 1002);


