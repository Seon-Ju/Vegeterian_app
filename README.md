# 🌱 Veganning
<img src = "https://img.shields.io/badge/Project%20Type-Team%20Project-yellow?style=flat-square"> <img src = "https://img.shields.io/badge/Tools-Android%20Studio-brightgreen?style=flat-square&logo=AndroidStudio"> <img src = "https://img.shields.io/badge/Tools-R%20Studio-brightgreen?style=flat-square&logo=R"> <img src = "https://img.shields.io/badge/Tools-Firebase-brightgreen?style=flat-square&logo=Firebase"> <img src = "https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=Java"> <img src = "https://img.shields.io/badge/Language-R-orange?style=flat-square&logo=R">

> **서비스명**<br>‘Veganning’은 보통 ‘채식주의자’ 하면 떠올리는 단어인 비건(Vegan)과 ‘시작’을 뜻하는 비기닝(Beginning)을 조합하여 채식을 시작했거나 시작하려 하는 사용자들의 채식생활을 돕는다는 뜻을 담고 있습니다.

> **기능**<br>‘Veganning’은 가공식품의 성분을 분석하여 해당 식품이 어느 채식 단계에 해당하는지 알려주는 기능을 메인 서비스로 제공하며, 원활한 채식 생활을 위한 보조 기능을 더해 채식에 대한 접근성을 높이는 것을 궁극적인 목표로 삼고 있습니다.

<br>


## 🏆 Award
1) [2021 식의약 데이터 활용 경진대회] : Team 베지, Award 창업부문 장려상
2) [2021-2 홍익대학교 컴퓨터공학과 졸업전시회] : Award 우수작품 선정<br><br>


##  💭  Background
### 1. 빠르게 성장하는 채식 인구수
국내 채식 인구는 2008년 15만명에서 2018년 150만명으로 크게 증가하였고, 전 세계 비건 시장의 규모도 매년 9.6% 성장하여 2025년에는 약 29조 7170억원에 준하는 규모에 달할 것으로 추측됩니다.
### 2. 채식 인구 증가 추세를 뒷받침하지 못하는 국내 채식 인프라
국내에서 채식인이 느끼는 불편함 중에서도 식품 선택 과정, 즉 식품을 구매할 때마다 식품의 성분을 하나하나 찾아 읽어보고 본인의 채식 단계에서 섭취해도 되는 음식인지 파악해야 하는 번거로운 중간과정에 주목했습니다.
### 3. 채식에 대한 접근 장벽 존재
채식이라고 하면 육류, 가금류, 난류 등을 아예 섭취하지 않아야 한다는 인식이 만연합니다. 이 때문에 비채식인이지만 채식에 도전하고자 하는 사용자는 급진적으로 식생활을 바꿔야 하는 것에 부담을 느끼곤 합니다.
### 4. 실천 단계에 따라 자유롭게 나뉘는 채식 단계
채식주의자는 육류, 가금류, 어류, 난류, 유제품 섭취 여부를 기준으로 하여 비건, 락토, 락토오보, 페스코, 폴로, 플렉시테리언으로 나뉩니다. 이렇게 채식은 각자의 실천 정도에 따라 여러 단계가 존재하고, 자신의 신념대로 단계를 넘나드는 유연한 채식을 허락합니다.<br>
- <br><img src = "https://user-images.githubusercontent.com/48851230/143682587-5f32fee4-18b0-4ae4-815a-93a186dd1d06.png" width="80%" height="80%"><br><br>


##  📝  Features
### 1. 성분 분석을 통해 식품의 채식 단계 제시
구매하고자 하는 식품의 이름을 검색하거나 오프라인 매장에서 식품의 바코드를 스캔하면 해당 식품의 성분 정보를 분석하여 이 식품이 어떠한 성분을 함유하고 있으며 어느 단계의 채식을 하는 사용자에게 적합한지에 대한 정보를 제공합니다.
### 2. 사용자 맞춤형 채식 단계 제시
어플리케이션 상에서 본인의 채식 단계를 설정한 사용자의 경우 1번 기능에 덧붙여 이 식품을 섭취할 수 있는지 사용자 맞춤형으로 표기해줍니다.
### 3. 채식 관련 실시간 뉴스
사용자가 채식 시장의 동향이나 신제품출시 소식, 새로운 채식 서비스 등에 대한 정보를 접하기 쉽도록 매스컴에서 발행하는 채식 관련 기사를 실시간으로 업데이트하여 제공합니다.
### 4. 기본 가이드 제공
채식 입문자가 채식을 어렵지 않게 받아들일 수 있도록 채식에 대한 기본적인 설명을 담은 가이드를 제공합니다.<br><br><br>


##  📱  Preview
### 와이어프레임
![Wireframe](https://user-images.githubusercontent.com/48851230/143682360-4d34c0c6-10db-4fc4-a4b0-294f8c385d3c.png)

<details><summary><b>검색</b></summary><div markdown="1">
 
![Search](https://user-images.githubusercontent.com/48851230/143685922-712436cf-a9b7-4c99-a8f8-ac754ee80c97.png)
 1) 식품정보 <br>
  (1) 식품 이미지, 식품명, 식품 분류 표기
 2) 채식단계 분석 <br>
  (1) 해당 식품을 섭취할 수 있는 가장 엄격한 단계의 이미지, 이름 표기 <br>
  (2) 그 아래에 해당 식품을 섭취할 수 있는 모든 채식단계 표기 <br>
  (3) 어플리케이션상에서 본인의 채식단계를 설정한 사용자의 경우 이 식품을 섭취할 수 있는지 사용자 맞춤형으로 표기
 3) 채식단계 분류 성분 <br>
  (1) 채식단계 분류 기준(육류, 가금류, 어류, 난류, 유제품)에 해당하는 모든 함유성분 표기</div></details>

<details><summary><b>바코드</b></summary><div markdown="1">
 
![Barcode](https://user-images.githubusercontent.com/48851230/143686119-5b298ced-b89e-4e75-9910-b6f4955a346d.png)
 1) 상기 설명과 기능 동일</div></details>
 
<details><summary><b>가이드</b></summary><div markdown="1">
 
![Guide](https://user-images.githubusercontent.com/48851230/143686231-c80c0ee2-9615-4a9c-a41a-5d5e04010424.png)
 1) 뉴스 <br>
  (1) ‘채식’, ‘비건’ 키워드로 크롤링한 실시간 기사 <br>
  (2) 기사 클릭시 각 기사 전문으로 웹 링크 이동
 2) 가이드 <br>
  (1) 채식 입문자들을 위한 채식의 기본 정보 제공 <br></div></details>
 
<details><summary><b>설정</b></summary><div markdown="1">
 
![Setting](https://user-images.githubusercontent.com/48851230/143686364-6f7d238b-869f-417c-8883-9833f044972d.png)
 1) 사용자 정보 <br>
  (1) 닉네임, 채식단계 표기
 2) 사용자 정보 변경 <br>
  (1) 사용자는 유연하게 채식단계 변경 가능 <br>
  (2) 사용자는 자유롭게 닉네임 변경 가능</div></details><br>


##  📚  Stack & Library
| Tools | 목적 |
| ------ | ------ |
| Android (Java) | 안드로이드 네이티브 어플리케이션 구축 |
| R | Open API로부터 필요한 데이터 추출 및 정제 |
| Firebase | Realtime Database |
| Photoshop | UI/UX 디자인 |
| Google Zxing Library | 바코드 인식 |
| Google News RSS | 뉴스 크롤링 |
| HACCP Open API | 제품명, 제품이미지, 성분정보, 바코드번호 사용 |

<br>


##  🛠️  Architecture
![Architecture](https://user-images.githubusercontent.com/48851230/143681503-caef3536-528e-4aa1-8eae-02fbfcd3444a.png)


##  📹 Video
하단의 이미지를 **클릭**👆하면 실제 안드로이드 기기에서 시연하는 과정이 담긴 어플리케이션 소개 영상으로 링크됩니다.<br><br>
[![Video](https://user-images.githubusercontent.com/48851230/143681926-22eb2843-6397-472d-8824-6efcc7a82269.png)](https://youtu.be/EzufkGbLAdg)<br><br>


## 🙋‍♂️ Role

| 이름 | 담당 업무 |
| ------ | ------ |
| 김선주([@Seon-Ju]) | 식품 검색 로직 구현, DB 통신 구현, UI/UX 디자인 |
| 이현정([@a956a]) | 채식 단계 분석 로직 구현, 뉴스 크롤링 구현 |
| 장희주([@gmlwn4009]) | 식품 성분 데이터 정제, DB 구축 |


[2021 식의약 데이터 활용 경진대회]: <https://data.mfds.go.kr/blbd/2/34>
[2021-2 홍익대학교 컴퓨터공학과 졸업전시회]: <https://wwwce.hongik.ac.kr/dept/0401.html?pkid=148900>
[@Seon-Ju]: <https://github.com/Seon-Ju>
[@a956a]: <https://github.com/a956a>
[@gmlwn4009]: <https://github.com/gmlwn4009>
