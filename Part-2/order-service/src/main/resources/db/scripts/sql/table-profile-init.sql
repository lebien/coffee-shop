--insert users table
INSERT INTO users (user_id,user_name, name, mobile_phone, address, email)
VALUES (1,'user1', 'User One', '1234567890', '123 Main Street', 'user1@example.com');

INSERT INTO users (user_id,user_name, name, mobile_phone, address, email)
VALUES (2,'user2', 'User Two', '9876543210', '456 Elm Street', 'user2@example.com');

INSERT INTO users (user_id,user_name, name, mobile_phone, address, email)
VALUES (3,'user3', 'User Three', '5555555555', '789 Oak Avenue', 'user3@example.com');

INSERT INTO users (user_id,user_name, name, mobile_phone, address, email)
VALUES (4,'user4', 'User Four', '8888888888', '456 Birch Lane', 'user4@example.com');

INSERT INTO users (user_id,user_name, name, mobile_phone, address, email)
VALUES (5,'user5', 'User Five', '9999999999', '101 Pine Road', 'user5@example.com');
--insert shops table
INSERT INTO shops (shop_id,shop_name, location, contact_detail, open_time, close_time, max_queues)
VALUES (1,'Shop 1', '123 Main Street', 'Contact 1', '08:00 AM', '06:00 PM', 10);

INSERT INTO shops (shop_id,shop_name, location, contact_detail, open_time, close_time, max_queues)
VALUES (2,'Shop 2', '456 Elm Street', 'Contact 2', '09:00 AM', '07:00 PM', 15);

INSERT INTO shops (shop_id,shop_name, location, contact_detail, open_time, close_time, max_queues)
VALUES (3,'Shop 3', '789 Oak Avenue', 'Contact 3', '10:00 AM', '08:00 PM', 20);

INSERT INTO shops (shop_id,shop_name, location, contact_detail, open_time, close_time, max_queues)
VALUES (4,'Shop 4', '101 Pine Road', 'Contact 4', '07:30 AM', '05:30 PM', 12);

INSERT INTO shops (shop_id,shop_name, location, contact_detail, open_time, close_time, max_queues)
VALUES (5,'Shop 5', '222 Maple Lane', 'Contact 5', '08:30 AM', '06:30 PM', 18);
--insert Queue tale
INSERT INTO queues (queue_id,shop_id, queue_number, max_queue_size, current_status)
VALUES
  (1,1, 1, 10, true),
  (2,1, 2, 10, true),
  (3,2, 1, 15, true),
  (4,3, 1, 8, false),
  (5,3, 2, 8, false);





