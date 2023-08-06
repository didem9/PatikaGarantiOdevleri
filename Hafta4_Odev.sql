--1. country, lig, takım ve oyuncu adında tablo oluşturma
CREATE TABLE country(
	country_id SERIAL PRIMARY KEY,
	country_name VARCHAR(50) NOT NULL
);

CREATE TABLE league(
	league_id SERIAL PRIMARY KEY,
	league_name VARCHAR(50) NOT NULL,
	id_country INTEGER REFERENCES country(country_id)
);

CREATE TABLE team(
	team_id SERIAL PRIMARY KEY,
	team_name VARCHAR(50) NOT NULL,
	id_league INTEGER REFERENCES league(league_id),
	establishment_year INTEGER NOT NULL,
	scored_goal INTEGER NOT NULL,
	conceded_goal INTEGER NOT NULL,
	points INTEGER NOT NULL,
	level INTEGER NOT NULL	
);

CREATE TABLE player(
	player_id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	id_team INTEGER REFERENCES team(team_id),
	id_country INTEGER REFERENCES country(country_id),
	scored_goal_player INTEGER NOT NULL
);

--2. Tablolara ilgili verileri ekleme
INSERT INTO country (country_name)
VALUES
	('Türkiye'),
	('Almanya'),
	('İngiltere'),
	('Brezilya');

INSERT INTO league (league_name, id_country)
VALUES
	('Süper Lig', 1),
	('Bundesliga', 2),
	('Premiere League', 3),
	('Serie A', 4);

INSERT INTO team (team_name, id_league, establishment_year, scored_goal, conceded_goal, points, level)
VALUES
	('Beşiktaş', 1, 1903, 78, 36, 78, 1),
	('Galatasaray', 1, 1905, 83, 27, 88, 1),
	('Bayern Münih', 2, 1900, 92, 38, 71, 1),
	('Manchester City', 3, 1894, 94, 33, 89, 1),
	('Botafogo', 4, 1904, 32, 10, 43, 1);

INSERT INTO player (first_name, last_name, id_team, id_country, scored_goal_player)
VALUES
	('Umut','Meraş', 1, 1, 5),
	('Cenk','Tosun', 1, 2, 113),
	('Kazım','Karataş', 2, 1, 1),
	('Leroy','Sane', 2, 2, 57),
	('Philip','Foden', 3, 3, 35),
	('Francisco','Soares', 4, 4, 91);

--3. İsmi “Türkiye” olan ülkenin liglerinin listesini getiren scripti yazma
SELECT * FROM league
INNER JOIN country ON league.id_country= country.country_id
WHERE country_name = 'Türkiye';

--4. İsmi “Türkiye” olan ülkenin takımların listesini getiren scripti yazma
SELECT team_name FROM team
INNER JOIN league ON team.id_league = league.league_id
INNER JOIN country ON league.id_country = country.country_id
WHERE country_name = 'Türkiye';

--5. İsmi “Türkiye” olan en üst seviyeli ligdeki puan tablosunu getiren scripti yazma
SELECT team_name, points FROM team
INNER JOIN league ON team.id_league = league.league_id
INNER JOIN country ON league.id_country = country.country_id
WHERE country_name = 'Türkiye' AND level = 1;

--6. Türkiye liglerindeki puan ortalamalarını gösteren scrpit
SELECT ROUND(AVG(points), 2) FROM team
INNER JOIN league ON team.id_league = league.league_id
WHERE league_id = 1;

--7. Bir ligin Gol kralını getiren scprit
SELECT first_name, last_name, country_name, team_name, MAX(scored_goal_player) FROM player
INNER JOIN team ON player.id_team = team.team_id
INNER JOIN country ON player.id_country = country.country_id
GROUP BY first_name, last_name, country_name, team_name
ORDER BY MAX(scored_goal_player) DESC;

--8. Tüm liglerde attığı gol yediği golden daha küçük olan takımları getiren scripti
SELECT * FROM team
WHERE scored_goal < conceded_goal;

--9. Bir takımın oyuncularının toplam gol sayısını ve takımın gol sayısını yan yana getiren bir scprit
SELECT team_name, SUM(scored_goal_player), scored_goal  FROM player
INNER JOIN team ON player.id_team = team.team_id
WHERE id_team = 1
GROUP BY team_name, scored_goal;