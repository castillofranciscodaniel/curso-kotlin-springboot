CREATE TABLE Item (
                      id SERIAL PRIMARY KEY,
                      "name" VARCHAR(255) NOT NULL,
                      category VARCHAR(255) NOT NULL,
                      description TEXT,
                      price DOUBLE PRECISION NOT NULL,
                      created_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                      updated_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);