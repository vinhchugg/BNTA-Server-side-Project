CREATE TABLE houses (
       id SERIAL PRIMARY KEY,
       buildingName TEXT,
       capacity INT NOT NULL,
       allotment_id INT REFERENCES allotments(id)
);