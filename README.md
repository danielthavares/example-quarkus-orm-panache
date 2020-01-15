# example-quarkus-orm-panache
Exemplo de uso do framework quarkus com o hibernate orm panache

### Criar Projeto

mvn io.quarkus:quarkus-maven-plugin:0.15.0:create \
    -DprojectGroupId=com.company \
    -DprojectArtifactId=app \
    -DprojectVersion=1.0 \
    -DclassName="com.company.Home"

* modifique a versao do framework ou acesse o get start no site quarkus.io

### Dependências utilizadas

mvn quarkus:add-extension -Dextensions=quarkus-resteasy-jsonb,quarkus-hibernate-orm-panache,quarkus-jdbc-h2

### Configuração do banco em memória H2

* quarkus.datasource.url=jdbc:h2:mem:test
* quarkus.datasource.driver=org.h2.Driver
* quarkus.datasource.username=h2
* quarkus.datasource.password=
* quarkus.hibernate-orm.database.generation=drop-and-create
* quarkus.hibernate-orm.log.sql=true

### Iniciar em dev

./mvnw compile quarkus:dev

### Testa endpoints

arquivo endpoint.http

GET http://localhost:8080/carro HTTP/1.1


POST http://localhost:8080/carro HTTP/1.1
content-type: application/json

{
    "nome": "Ford Focus",
    "modelo": "2012/2013",
    "cor": "Preto"
}

