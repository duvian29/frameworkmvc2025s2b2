# 🪴 Proyecto Floristería – Spring Boot (v1)
### Backend desarrollado con Spring Boot 3.5.7 · Java 21 · Maven · JPA · Thymeleaf · MySQL

---

## 📌 Descripción del proyecto

Este proyecto corresponde al desarrollo del backend de una aplicación de gestión para una floristería.  
Incluye la instalación, configuración y ejecución del entorno necesario: **Java 21**, **IntelliJ IDEA**, **Docker**, **MySQL**, **VS Code** y herramientas adicionales para desarrollo ágil.

En el apartado técnico se configuró el archivo `pom.xml`, agregando dependencias clave como:
- Spring Web  
- Spring Data JPA  
- Thymeleaf  
- MySQL Connector  
- Lombok  
- DevTools  

Además, se ajustó la propiedad `<java.version>` a **Java 21**, compatible con la versión usada de Spring Boot (3.5.7).

También se trabajó bajo metodología **Scrum**, incluyendo:
- definición de Sprint  
- estimación con Planning Poker  
- trabajo colaborativo con Git mediante ramas y merge requests  

---

## 🚀 Tecnologías utilizadas

### **Backend**
- Java 21  
- Spring Boot 3.5.7  
- Maven  
- Spring Web  
- Spring Data JPA  
- Spring Boot DevTools  
- Thymeleaf  
- Lombok  

### **Base de Datos**
- MySQL (local o Docker)

### **Herramientas**
- IntelliJ IDEA (JetBrains Toolbox)  
- Visual Studio Code  
- Git + GitHub/GitLab  
- Docker  

---

# 📦 Dependencias principales (`pom.xml`)

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
</dependency>
