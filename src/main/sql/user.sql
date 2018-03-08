CREATE TABLE user1
(
    id              INT PRIMARY KEY AUTO_INCREMENT,
    user_name       VARCHAR(20) NOT NULL ,
    address         VARCHAR(60)
) ENGINE=Innodb CHARSET=utf8 COMMENT ='用户表'

INSERT INTO `user1` VALUES(1,'陈大','深圳市南山区');
INSERT INTO `user1` VALUES(2,'王二','深圳市福田区');
INSERT INTO `user1` VALUES(3,'张三','深圳市龙华新区');
INSERT INTO `user1` VALUES(4,'李四','深圳市龙岗区');

-- 卡表
CREATE TABLE `card1`(
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `card_no` VARCHAR(18),
    `remark` VARCHAR(100),
    `user_id` INT-- 用于关联user1的主键id(不设置外键，避免级联问题)
) ENGINE=INNODB CHARSET=utf8;
INSERT INTO `card1` VALUES(1,'420001','工资卡',1);
INSERT INTO `card1` VALUES(2,'420002','工资卡',2);
INSERT INTO `card1` VALUES(3,'420003','工资卡',3);
INSERT INTO `card1` VALUES(4,'420004','工资卡',3);

SELECT
t1.id user_id, t1.user_name,t1.address,t2.id,t2.card_no,t2.remark
FROM
user1 t1, card1 t2
WHERE
t1.id=t2.user_id and t1.id=3

SELECT t1.id user_id, t1.user_name,t1.address,t2.id,t2.card_no,t2.remark FROM user1 t1, card1 t2 WHERE t1.id=t2.user_id and t1.id=1;

SELECT
    t1.id user_id, t1.user_name,t1.address,t2.id,t2.card_no,t2.remark
FROM
    user1 t1, card1 t2
WHERE
    t1.id=t2.user_id;
ORDER BY
t1.id