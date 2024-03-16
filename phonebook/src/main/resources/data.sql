

INSERT INTO users
( user_id, name, surname, middlename, login, password )
 values (10001 , 'Kamil', 'Perwez','', 'kamil', 'kamil');
 
 
INSERT INTO contacts
( contact_id, user_id, name, surname, middlename, homephone, mobilephone, workphone, address, email) 
	values ( 1000000001, 10001, 'Kamil', 'Perwez', '', '', '7894586213', '', 'delhi', 'abc@gmail.com' );
	
INSERT INTO contacts
( contact_id, user_id, name, surname, middlename, homephone, mobilephone, workphone, address, email) 
	values ( 1000000002, 10001, 'Kamil2', 'Perwez', '', '', '7894586214', '', 'delhi', 'abc@gmail.com' );
