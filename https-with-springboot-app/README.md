
#####Generate Key:
```
keytool -genkey -alias tomcat  -storetype PKCS12 -keyalg RSA -keysize 2048  -keystore keystore.p12 -validity 3650
```


openssl req -newkey rsa:2048 -nodes -keyout key.pem -x509 -days 365 -out certificate.pem


openssl pkcs12  -inkey key.pem -in certificate.pem -name demo -export -out certificate.p12