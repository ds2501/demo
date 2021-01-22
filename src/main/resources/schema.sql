CREATE TABLE user(
    id INT auto_increment PRIMARY KEY,
    user_id VARCHAR(10) UNIQUE NOT NULL,
    user_name VARCHAR(10) UNIQUE NOT NULL,
    email_address VARCHAR(40) UNIQUE NOT NULL,
    password VARCHAR(40) NOT NULL,
    created_at VARCHAR(40) NOT NULL,
    updated_at VARCHAR(40) NOT NULL
);