# 스프링 부트 웹 서비스

## 실행 방법

프로젝트 폴더에서 

### 빌드 

```
./gradlew build
```

### 실행 

```
java -jar build/libs/springboot-webservice-0.0.1-SNAPSHOT.jar
```


### API 호출 방법

터미널에서 

```
curl http://localhost:8080/api/companies
```

```
curl http://localhost:8080/api/companies?reqRanking=1
```

또는 브라우저에서 


[http://localhost:8080/api/companies](http://localhost:8080/api/companies)

[http://localhost:8080/api/companies?reqRanking=1](http://localhost:8080/api/companies?reqRanking=1)


## 프로젝트 생성 정보

https://start.spring.io/

- Project : Gradle Project
- Language : Java (version 1.8)
- Spring Boot (version 2.1.4)
- Dependency : Web (Servlet web application with Spring MVC and Tomcat)

## 개발 관련 자료

### 참고 문서 

* [Official Gradle documentation](https://docs.gradle.org)

### 가이드

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### 추가 링크

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

