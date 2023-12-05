
CREATE TABLE comics (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    available INT,
    returned INT
);

CREATE TABLE data (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    offsets INT,
    limite INT,
    total INT,
    count INT
);

CREATE TABLE events(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    available INT,
    returned INT
);

CREATE TABLE items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    resourceURI VARCHAR(255),
    name VARCHAR(255),
    type VARCHAR(255)
);

CREATE TABLE respuesta(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(255),
    status VARCHAR(255),
    copyright VARCHAR(255),
    attributionText VARCHAR(255),
    attributionHTML VARCHAR(255),
    etag VARCHAR(255),
    data_id INT,
    FOREIGN KEY (data_id) REFERENCES Data(id)
);

CREATE TABLE results(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    modified DATETIME,
    resourceURI VARCHAR(255),
    thumbnail_id INT,
    comics_id INT,
    stories_id INT,
    events_id INT,
    series_id INT,
    FOREIGN KEY (thumbnail_id) REFERENCES Thumbnail(id),
    FOREIGN KEY (comics_id) REFERENCES Comics(id),
    FOREIGN KEY (stories_id) REFERENCES Stories(id),
    FOREIGN KEY (events_id) REFERENCES Events(id),
    FOREIGN KEY (series_id) REFERENCES Series(id)
);

CREATE TABLE series(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    available INT,
    returned INT
);

CREATE TABLE stories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    available INT,
    returned INT
);

CREATE TABLE thumbnail (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    path VARCHAR(255)
);

CREATE TABLE urls (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255),
    url VARCHAR(255),
    result_id INT,
    FOREIGN KEY (result_id) REFERENCES Results(id)
);
