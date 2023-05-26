INSERT INTO  users (id,login, pwd, account, last_name, first_name, email) VALUES
(1,'admin', 'admin', 1000000, 'admin', 'admin', 'admin@gmail.com'),
(2,'user', 'user', 1000, 'user', 'user', 'user@gmail.com'),
(3,'user2', 'user2', 1000, 'user2', 'user2', 'user2@gmail.com')
ON CONFLICT(id) DO NOTHING;

INSERT INTO card (id,name, description, family, affinity, energy, hp, defence, attack, user_Id) VALUES
(1,'Pokecrotte', 'oui oui baguette', 'La miff', 'oui', 100, 100, 100, 100, 1)
ON CONFLICT(id) DO NOTHING;