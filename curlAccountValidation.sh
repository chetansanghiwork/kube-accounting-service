# kubectl get pods -o wide and ip from there
curl --location --request GET 'http://172.31.235.200:9000/account/validate?username=cgs200&account=10000'
curl --location --request GET 'http://172.31.235.201:9000/account/validate?username=cgs201&account=10000'
