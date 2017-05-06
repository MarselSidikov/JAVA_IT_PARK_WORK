CREATE TABLE auto (
id SERIAL PRIMARY KEY,
model VARCHAR(20),
owner_id INTEGER REFERENCES it_park_user(id)
);