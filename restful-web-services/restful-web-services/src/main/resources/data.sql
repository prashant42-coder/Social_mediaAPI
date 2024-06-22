-- Create the USER_DETIALS table
CREATE TABLE IF NOT EXISTS USER_DETIALS (
    id INT PRIMARY KEY,
    birth_date DATE,
    name VARCHAR(255)
);

-- Insert data into the USER_DETIALS table
INSERT INTO USER_DETIALS (id, birth_date, name) VALUES (1001, CURRENT_DATE(), 'ranga');
