INSERT INTO user (user_name, email, password, biography) VALUES ('John Doe', 'john@example.com', 'password123', 'Hello, I am John!');
INSERT INTO post (user_id, content) VALUES (1, 'This is my first post!');
INSERT INTO comment (user_id, post_id, content) VALUES (1, 1, 'Great post!');
