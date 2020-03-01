curl --header "version: 1" http://localhost:8080/api/

curl --header "version: 2" http://localhost:8080/api/


curl -i -H "application/apiversion-v2+json" http://localhost:8080/api

curl -i -H "application/apiversion-v1+json" http://localhost:8080/api

