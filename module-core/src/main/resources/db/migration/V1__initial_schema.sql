CREATE TABLE member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(30) NOT NULL,
    name VARCHAR(10) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    member_type VARCHAR(10) NOT NULL,
    created_dt TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    modified_dt TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT member_type CHECK (member_type IN ('게스트', '호스트'))
);

CREATE TABLE accommodation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    address VARCHAR(255) NOT NULL,
    description TEXT,
    accommodation_type VARCHAR(20) NOT NULL,
    contact VARCHAR(20) NOT NULL,
    rating DOUBLE PRECISION,
    created_dt TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    modified_dt TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT accommodation_typeCHECK (accommodation_type IN ('호텔', '펜션', '게스트 하우스', '모텔'))
);
