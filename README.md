```aidl

curl -c cookie.txt http://user:pass@localhost:8080/t1 | grep div | cut -c6-41 > token

curl -b cookie.txt -d"_csrf=`cat token`" -X POST -v http://localhost:8080/t

```