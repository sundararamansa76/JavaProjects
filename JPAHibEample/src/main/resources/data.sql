insert into Course_Details(id, name,created_date, last_updated_date) values(10001, 'Hare Krsna', sysdate(), sysdate());
insert into Course_Details(id, name,created_date, last_updated_date) values(10002, 'Hare Rama', sysdate(), sysdate());
insert into Course_Details(id, name,created_date, last_updated_date) values(10003, 'Hari Bol', sysdate(), sysdate());
insert into Course_Details(id, name,created_date, last_updated_date) values(10004, 'Balarama', sysdate(),sysdate() );

insert into Passport(id, number,created_date, last_updated_date) values(3004, 'Aozlsfkjf11', sysdate(),sysdate() );
insert into Passport(id, number,created_date, last_updated_date) values(3005, 'Bozlsfkjf11', sysdate(),sysdate() );
insert into Passport(id, number,created_date, last_updated_date) values(3006, 'Cozlsfkjf11', sysdate(),sysdate() );


insert into Student(id, name, passport_id, created_date, last_updated_date) values(2004, 'Balarama', 3004, sysdate(),sysdate() );
insert into Student(id, name,passport_id, created_date, last_updated_date) values(2005, 'Krsna',  3005, sysdate(),sysdate() );
insert into Student(id, name, passport_id, created_date, last_updated_date) values(2006, 'Radhe', 3006, sysdate(),sysdate() );


insert into Review(id, rating,description, course_id, created_date, last_updated_date) values(4001, '4','good', 10001, sysdate(),sysdate() );
insert into Review(id, rating,description, course_id, created_date, last_updated_date) values(4002, '5','Super',10001, sysdate(),sysdate() );
insert into Review(id, rating,description, course_id, created_date, last_updated_date) values(4003, '5','Excell', 10002, sysdate(),sysdate() );
