SELECT * FROM it_park_user;

SELECT * FROM it_park_user WHERE age = 20;

SELECT * FROM it_park_user WHERE age = 20 AND name = 'Ilyas';

SELECT * FROM it_park_user ORDER BY age;

SELECT (name) FROM it_park_user ORDER BY age;

SELECT (name, model) FROM auto a, it_park_user u WHERE a.owner_id = u.id;

SELECT COUNT(*) 
FROM auto a WHERE a.owner_id = 
(SELECT (id) FROM it_park_user u 
WHERE u.name = 'Lenar');


