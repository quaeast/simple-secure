# Simple demo of Spring secure

features:

* remote postgresql server
* JPA user persistence 
* basic HTTP authentication
* register with restful api

## Run

This demo has a simple login and a simple restful api.

```bash
# should run on java8
mvn spring-boot:run
```

## Test

### register

```python
import requests

url = 'http://localhost:8080/register'
data = {'username': 'fang', 'password': 'fang'}
r = requests.post(url=url, json=data)
print(r.status_code)
print(r.text)

```

### get

```python
import requests

url = 'http://localhost:8080/'
author = ('fang', 'fang')
r = requests.get(url=url, auth=author)
print(r.status_code)
print(r.text)
```

## Tips

### Access denied 403 after post

disable csrf in `SecurityConfig` 
