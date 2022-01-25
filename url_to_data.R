install.packages("dplyr")
library(dplyr)
library(XML)

serviceURL <- "http://apis.data.go.kr/B553748/CertImgListService/"
operaion <- "getCertImgListService"
rows <- 100
pg <- 1
ServiceKey <- "kVYcCisbHyjiLHSoknw1iZbhenW6Glc2mM4hfGf1EeIHjXagq6P9g98eMXs6lFGtlksA74tis6Z677Ol%2FjiHrw%3D%3D"

# url 생성
url <- paste0(serviceURL,
              paste0(operaion),
              paste0("?ServiceKey=",ServiceKey),
              paste0("&pageNo=",pg),
              paste0("&numOfRows=",rows))

xmlDocument <- xmlTreeParse(url, useInternalNodes=TRUE, encoding='UTF-8')   #internet 설정
rootNode <- xmlRoot(xmlDocument)
numOfRows<-as.numeric(xpathSApply(rootNode,"//numOfRows",xmlValue))
totalCount <- as.numeric(xpathSApply(rootNode,"//totalCount",xmlValue))
loopCount <- round(totalCount/numOfRows,0)

# numOfRows와 totalCount로 반복 회수 계산
if(loopCount*numOfRows < totalCount){
  loopCount <- loopCount+1
}

# data frame 양식 설정
totalData <- data.frame('rnum'=c(0),
                        'prdlstNm'=c('prdlstNm'),
                        'rawmtrl'=c('rawmtrl'),
                        'allergy'=c('allergy'),
                        'prdkind'=c('prdkind'),
                        'barcode'=c(8888888888888),    #지수표기법이 아닌 숫자로 표시하기 위함
                        'imgurl1'=c('imageurlname'))

# 데이터를 frame에 저장
for(i in 1:loopCount){
  url <- paste0(serviceURL,
                operaion,
                paste0("?ServiceKey=",ServiceKey),
                paste0("&numOfRows=",rows),
                paste0("&pageNo=",i))
  
  doc <- xmlTreeParse(url, useInternalNodes = TRUE, encoding="UTF-8")
  rootNode <- xmlRoot(doc)
  xmlData <- xmlToDataFrame(nodes=getNodeSet(rootNode,'//item'))
  xmlData2 <- xmlData %>%
    select(rnum, prdlstNm, rawmtrl, allergy, prdkind, barcode, imgurl1)  #원하는 데이터만 추출
  totalData <- rbind(totalData, xmlData2)
}

# csv파일 생성
write.csv(totalData, "allergy.csv", row.names=FALSE)
