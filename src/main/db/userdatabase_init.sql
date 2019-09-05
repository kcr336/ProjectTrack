CREATE TABLE MY_STATES.userdatabase (
id INTEGER PRIMARY KEY, username VARCHAR (255) DEFAULT "", FULL_NAME TEXT, email VARCHAR (255) DEFAULT "");

INSERT INTO MY_STATES.userdatabase (id, username, FULL_NAME, email) VALUES (1, 'kcr336', 'Karen Beisel', 'kcr336@gmail.com');

INSERT INTO MY_STATES.userdatabase(id, username, FULL_NAME, email) VALUES (2, 'smb', 'Sophia Marie', 'smb@gmail.com');

INSERT INTO MY_STATES.userdatabase(id, username, FULL_NAME, email) VALUES (3, 'vtb', 'Vincent Theodore', 'vtb@gmail.com');

SELECT * FROM MY_STATES.userdatabase;