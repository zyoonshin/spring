<p align="center"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/1920px-Spring_Framework_Logo_2018.svg.png" height="150px"></p>

# Spring

> 공부 내용 정리 : <a href="https://waiting-antique-acf.notion.site/Spring-intro-ac2481b00c1c47a28c6dfb12ab884edf"><img src="https://img.shields.io/badge/notion-000000?style=flat-square&logo=notion&logoColor=white"></a>

## spring의 특징

- POJO 프로그래밍 지향
  - POJO : Plain Old Java Object
  - 순수 Java만을 통해서 생성한 객체
  - 순수 Java만을 사용한다는 것은 Java 및 Java의 스펙에 정의된 기술만 사용
- IoC / DI (Inversion of Control / Dependency Injection, 제어의 역전 / 의존성 주입)
- AOP (Aspect Oriented Programming, 관심 지향 프로그래밍)
  - 핵심 관심 사항 : 애플리케이션의 핵심 기능과 관련된 관심 사항
  - 공통 관심 사항 : 모든 핵심 관심 사항에 공통적으로 적용되는 관심 사항들
  - 핵심 관심 사항과 공통 관심 사항이 코드에 같이 모여 있으면 필연적으로 공통 관심 사항과 관련된 코드가 중복될 수밖에 없음. 이럴 경우 공통 관심 사항을 수행하는 로직이 변경되면 모든 중복 코드를 찾아서 일일이 수정해야 함
