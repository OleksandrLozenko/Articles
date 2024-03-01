INSERT INTO users(id, username, email, password, bio, created_at, image_url)
VALUES(1, "test1", "test1@mail.ru", "12345test", "/");

INSERT INTO tag(id, created_at, name) VALUES(1, "2002-02-07", "test");
INSERT INTO tag(id, created_at, name) VALUES(2, "2007-08-06", "sanya");

INSERT INTO article_comments(article_id, author_id, created_at, id, content) VALUES(2,1,"2010-03-02",5,"Test content1");
INSERT INTO article_comments(article_id, author_id, created_at, id, content) VALUES(1,2,"2012-04-03",6,"Test content2");

INSERT INTO article_favorites(article_id, created_at, id, user_id) VALUES(1, "2015-11-11", 6, 1);
INSERT INTO article_favorites(article_id, created_at, id, user_id) VALUES(2, "2016-12-12", 7, 3);

INSERT INTO article_tags(article_id, created_at, id, tag_id) VALUES(1, "2018-12-12", 3, 1);
INSERT INTO article_tags(article_id, created_at, id, tag_id) VALUES(2, "2014-12-11", 2, 2);

INSERT INTO user_follows(created_at, follower_id, following_id) VALUES("2020-04-09", 1, 2);
INSERT INTO user_follows(created_at, follower_id, following_id) VALUES("2019-05-07", 2, 1);
