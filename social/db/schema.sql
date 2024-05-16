CREATE TABLE IF NOT EXISTS user (
                                    user_id INT AUTO_INCREMENT PRIMARY KEY,
                                    user_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    cover_image VARCHAR(255),
    biography TEXT
    );

CREATE TABLE IF NOT EXISTS post (
                                    post_id INT AUTO_INCREMENT PRIMARY KEY,
                                    user_id INT,
                                    content TEXT NOT NULL,
                                    image VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES user(user_id)
    );

CREATE TABLE IF NOT EXISTS comment (
                                       comment_id INT AUTO_INCREMENT PRIMARY KEY,
                                       user_id INT,
                                       post_id INT,
                                       content TEXT NOT NULL,
                                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                       FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (post_id) REFERENCES post(post_id)
    );
