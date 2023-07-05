# SpringSecurityJwts
post man 테스트 방법
post http://yourlocalip:9797/authenticate
header: Content-Type: application/json
body: raw: {
    "username":"aonee",
    "password":"aoneepw"
}

토큰값 체크 
http://172.30.1.6:9797/api/vertifyJwt 

토큰 체크 공식 홈페이지 
https://jwt.io/#libraries-io 
