DROP TABLE IF EXISTS Transaction;

CREATE TABLE Transaction (
  transaction_id INT  PRIMARY KEY,
  transaction_amount FLOAT NOT NULL,
  customer_id VARCHAR(50) NOT NULL,
  transaction_timestamp TIMESTAMP NOT NULL
);

INSERT INTO Transaction(transaction_id, transaction_amount, customer_id, transaction_timestamp) VALUES
(1, 120.0,'customer-1', '2019-12-2 12:03:29'),
(2,120.5,'customer-2','2019-11-14 12:03:19'),

(3,120.0,'customer-2','2019-11-14 12:03:19'),
(4,120.0,'customer-2','2019-11-14 12:05:00'),
(5,120.0,'customer-2','2019-11-14 12:03:19'),


(6,120.0,'customer-2','2019-12-15 12:03:19'),
(7,120.0,'customer-2','2019-12-16 12:03:19'),
(8,120.0,'customer-2','2019-12-17 12:03:19'),

(9,80.50,'customer-3','2020-01-03 12:03:49'),
(10,101.0,'customer-2','2020-02-07 12:03:54'),
(11,160.5,'customer-5','2020-01-08 12:34:19');