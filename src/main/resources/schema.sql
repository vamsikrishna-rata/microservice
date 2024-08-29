CREATE TABLE customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(15)  NOT NULL,
    created_at DATE NOT NULL,
    created_by VARCHAR(50) NOT NULL,
    updated_at DATE DEFAULT NULL,
    updated_by VARCHAR(50) DEFAULT NULL
);

CREATE TABLE accounts (
    customer_id INT NOT NULL,
    account_number BIGINT PRIMARY KEY,
    account_type VARCHAR(50) NOT NULL ,
    branch_address VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    created_at DATE NOT NULL,
    created_by VARCHAR(50) NOT NULL,
    updated_at DATE DEFAULT NULL ,
    updated_by VARCHAR(50) DEFAULT NULL
);
