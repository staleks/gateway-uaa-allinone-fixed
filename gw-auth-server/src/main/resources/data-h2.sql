INSERT INTO users(username, password, enabled) VALUES ('admin', 'admin', 1);
INSERT INTO users(username, password, enabled) VALUES ('user', 'user', 1);

INSERT INTO authorities(username, authority) VALUES ('admin', 'ADMIN');
INSERT INTO authorities(username, authority) VALUES ('user', 'USER');
