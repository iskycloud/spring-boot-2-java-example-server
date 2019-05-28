# 초기 설정
## 1. MySQL Query
<pre>
CREATE TABLE IF NOT EXISTS `user` (
`sid` bigint(20) NOT NULL AUTO_INCREMENT,
`id` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`mobile` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`address` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DELETE FROM `user`;

INSERT INTO `user` (`sid`, `id`, `name`, `mobile`, `address`) VALUES
  (1, 'test', '테스트', '01000000000', 'seoul');
</pre>

## 2. application.yml 파일 수정
* URL, Port, 데이터베이스 이름, 유저 이름, 유저 패스워드 수정

---

# 테스트 방법
* http://localhost:8080/users/test GET 요청에 대한 응답 확인
