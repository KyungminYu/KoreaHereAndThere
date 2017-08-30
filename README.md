# KoreaHereAndThere
## Develop Environment
 ### Lang
  Java(Swing)
 ### Data
  Web Crawling(URL:http://korean.visitkorea.or.kr)
## ER Diagram
![ER-Diagram](Image/ER-Diagram.png)
## Relation Schema
* Identity{ID, Password, Name, Phone, Address}
* TourInfo{T_ID, Name, Ddo, Tag, Image, LikeCnt, Local, Ask, Time, DayOff, During, Season, Spot, ViewTime, Appoint, Heritage, Description}
* CourseInfo{C_ID, Text, Tag, Image, LikeCnt}
* CourseRouteInfo{C_ID, R_ID, Name, Description, Tag, Image, Distance, Time, Text}
* secRouteDetInfo{C_ID, R_ID, Image}
* FavoriteTour{ID, T_ID} 
* FavoriteCourse{ID, C_ID} 
* TourComment{ID, T_ID, Comment}
* RouteDet{C_ID, R_ID}
* ImageSet{C_ID, R_ID}
## Database Table
![TableDesign](Image/TableDesign.png)
 ### Identity
 ![Identity](Image/Identity.PNG)
 ### TourInfo
  ![TourInfo](Image/TourInfo.PNG)
 ### TourComment
  ![TourComment](Image/TourComment.PNG)
 ### CourceInfo
  ![CourceInfo](Image/CourceInfo.PNG)
 ### CourseRouteInfo
  ![CourseRouteInfo](Image/CourseRouteInfo.PNG)
 ### secRouteDetInfo
  ![secRouteDetInfo](Image/secRouteDetInfo.PNG)
 ### FavoriteTour
  ![FavoriteTour](Image/FavoriteTour.PNG)
 ### FavoriteCourse
  ![FavoriteCourse](Image/FavoriteCourse.PNG)

