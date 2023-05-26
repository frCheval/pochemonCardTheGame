INSERT INTO users (login, pwd, account, last_name, first_name, email) VALUES
('admin', 'admin', 1000000, 'admin', 'admin', 'admin@gmail.com'),
('user', 'user', 1000, 'user', 'user', 'user@gmail.com'),
('user2', 'user2', 1000, 'user2', 'user2', 'user2@gmail.com');

INSERT INTO card (name, description, family, affinity, energy, hp, defence, attack, user_Id) VALUES
('Pokecrotte', 'oui oui baguette', 'La miff', 'oui', 100, 100, 100, 100, 1)