# multielec
> 인기있는 전자제품을 취급하는 온라인 쇼핑몰

![로고 이미지](https://user-images.githubusercontent.com/86956783/197341585-9af17c75-1df7-43eb-ad79-59763c3cc182.png)


## 1. 제작 기간 & 참여 인원

* 2022년 10월 11일 ~ 10월 17일
* 팀 프로젝트
  * 박성훈(팀장)
  * 고용훈(팀원)
  * 김서윤(팀원)
  * 유승리(팀원)
 
<br>

## 2. 사용 기술

* **Back-end**
  * Java 11
  * Spring Boot 2.7.4
  * Maven
  * MySQL 8.0.17
  * Mybatis 3.2.2  
  
<br>

* **Front-end**
  * HTML
  * CSS
  * JS  
  * jQuery
  * Thymeleaf
  * Ajax
  
<br>

## 3. ERD 설계

![erd3](https://user-images.githubusercontent.com/86956783/196098200-cb1ddcbe-ca8b-4c4e-b20d-57e03c9c65fa.png)


<br>

## 4. 프로젝트 개요 및 핵심 기능

이 서비스의 핵심 기능은 상품을 장바구니에 담기 및 상품 구매 입니다.<br>
전체적인 서비스의 메뉴 구조와 핵심 기능이 동작하는 과정을 확인하실 수 있습니다.

<details>
<summary>개요 및 핵심 기능 설명 펼치기</summary>
<div markdown="1">

<br>

### 4-1. 메뉴 구조도 및 IA
![메뉴 구조도](https://user-images.githubusercontent.com/86956783/197332574-f9a7362c-4b2b-45dd-97e1-b2a8bccfb9f0.png)

### 4-2. 유저 플로우
![유저 플로우](https://user-images.githubusercontent.com/86956783/197332657-2b86fdaa-64dc-4de7-8f2c-6710bd9c4785.png)

### 4-3. 장바구니에 상품 담기
![장바구니 담기2](https://user-images.githubusercontent.com/86956783/197334099-dd4d1d98-89c1-4ebd-b9db-5a751bd2269b.gif)

* 상품 상세페이지에서 장바구니 담기 버튼을 클릭시 장바구니 페이지로 이동 가능합니다.
* 장바구니 페이지에서 주문할 상품 확인 후 구매 버튼을 통해 결제 페이지로 이동합니다.

### 4-4. 상품 구매 
![구매](https://user-images.githubusercontent.com/86956783/197333147-44f827e2-b0c7-4413-8398-52d8998aeb15.gif)

* 상품 결제 페이지에서는 구매할 상품을 확인 가능합니다.
* 수령자 정보는 기본적으로 상품을 구매할 사용자의 정보와 동일하나 원하는 정보로 수정 가능합니다.

</div>
</details>

<br>

## 5. 트러블슈팅

<details>
<summary>박성훈</summary>
<div markdown="1">


### 5-1. 기능별 CRUD를 구현한 후 JUnit 프레임워크를 활용한 단위 테스트 과정에서 발생한 문제
  * auto_incerment가 걸려있는 id변수에 null값을 입력했을때 오류가 발생하였습니다.
      * id변수 타입인 int자료형을 null값을 처리할 수 있는 integer 래퍼클래스로 변경하여 해결했습니다.

  * 고객정보를 입력하는 테스트 과정 중 회원 등록일인  custrdate를 date타입으로 선언하였는데 insert 시 문자를 직접하여 오류가 발생했습니다.
      * custmapper.xml의 insert 쿼리문에서 #{custrdate}를 sysdate()로 수정하여 해결했습니다.

<br>

### 5-2. 메인화면의 전체 카테고리창 클릭시 드랍다운이 한번에 적용되는 문제
  * 각 카테고리 메뉴를 div태그로 묶고 class명을 각각 지정한 후 main.js파일에서 각 클래스마다  slideToggle()메서드가 적용되도록 JS코드를 수정하여 해결했습니다.

<br>

### 5-3. 프로젝트를 war파일로 변환 후 클라우드 서버에 배포하는 과정에서 클라우드의 공인ip와 연동된 계정의 권한을 데이터베이스에 부여하기 위해 MySQL 워크벤치의 root계정에서 grant 쿼리문을 날린 후 `' #1142 - SELECT command denied to user ... '` 오류가 발생
  *  putty에 직접 설치한 mysql을 통해 워크벤치의 프로젝트 데이터베이스 계정에 권한을 부여하여 해결하였습니다.


</div>
</details>

<details>
<summary>고용훈</summary>
<div markdown="1">

### 5-1. `paymentimpl`클래스에서 ship 데이터들을 못 읽어들이는 현상
  * `location.href`를 통해 직접적으로 데이터를 전송하여 해결했습니다.
  
<br>

### 5-2. `paymentimpl`클래스에서 생성된 `orderlist`의 `orderid`가 바로 `orderdetail`에 입력이 안되는 현상
  * 먼저 `orderlist`에 들어가는 변수들을 정의해주고 `for`문을 돌려서 `cart`에 list들을 하나의 `orderid`에 담아서 저장을 하고 이 `orderid`를 따로 `int r`이라는 변수로 저장하여 `orderdetail`에 입력하여 해결했습니다.

<br>

### 5-3. 장바구니의 삭제와 로그아웃 할 때 페이지가 넘어가지 않는 현상
  * 로그아웃 클래스의 리턴 값에 `redirect:`에 루트를 붙여줘서 홈으로 가게끔 하고, 잡아구니의 `location.href`에서 루트에는 `[[@{}]]`를 해주는데 `&`는 그대로 냅둬서 해결했습니다.

</div>
</details>

<details>
<summary>김서윤</summary>
<div markdown="1">


### 5-1. 장바구니에 추가된 품목들에 대한 데이터 취합 안 됨
  * 장바구니에서 선택된 품목개수, 상세 품목개수, 합계금액, 배송비 부분 장바구니 테이블과 연동하여 출력했습니다.

<br>

### 5-2. 장바구니에서 주문 안 됨
  * 장바구니에 있는 모든 품목을 그대로 결제창으로 넘기는 방식으로 일부 해결하였습니다. 

</div>
</details>

<details>
<summary>유승리</summary>
<div markdown="1">

### 5-1. 결제창 결제완료의 버튼의 위치를 중앙으로 옮기고자 하였으나 안 됨
  * 버튼 생성 HTML을 div를 적용시켜서 justify-content : center; 를 입력하여 중앙 배치 해결 성공했습니다.

<br>

### 5-2. 결제창 결제완료 버튼의 크기 조정이 먹히지 않아 재조정
  * button에 style을 적용시켜 크기를 조정하여 해결했습니다.

<br>

### 5-3. 결제완료를 누른 후 alert으로 결제완료 메세지가 안 뜸
  * div로 button과 하나의 덩어리로 만들어서 해결했습니다.

<br>

### 5-4. 클라우드 서버에 올렸을 때 이미지 안보이는 증상 발생
  *  @{/img/item/} 으로 처리 해야하나 /가 하나 빠진 @{/img/item}상태로 확인되어 추가함으로 해결했습니다.

</div>
</details>