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
  en esta pare vva para los servicios
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Servicios - Roller Speed</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
      <a class="navbar-brand" th:href="@{/}">Roller Speed</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#menu">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="menu">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item"><a class="nav-link" th:href="@{/mision}">Misión</a></li>
          <li class="nav-item"><a class="nav-link" th:href="@{/vision}">Visión</a></li>
          <li class="nav-item"><a class="nav-link" th:href="@{/valores}">Valores</a></li>
          <li class="nav-item"><a class="nav-link" th:href="@{/servicios}">Servicios</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Contenido Principal -->
  <div class="container mt-5">
    <div class="row">
      <div class="col-md-10 mx-auto">
        <h1 th:text="${mensaje}">Servicios</h1>
        <hr>
        <p class="lead">
          Ofrecemos una amplia gama de servicios para todos los niveles de experiencia:
        </p>
        
        <div class="row mt-4">
          <div class="col-md-6 mb-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Clases Privadas</h5>
                <p class="card-text">
                  Entrenamiento personalizado con instructores certificados adaptado a tu nivel y objetivos.
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mb-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Clases Grupales</h5>
                <p class="card-text">
                  Clases para principiantes, intermedios y avanzados en un ambiente comunitario y divertido.
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mb-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Alquiler de Patines</h5>
                <p class="card-text">
                  Patines de calidad para todos los tamaños disponibles para alquiler por horas o días.
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mb-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Competiciones</h5>
                <p class="card-text">
                  Organizamos torneos y competiciones para atletas de todos los niveles durante el año.
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mb-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Campamentos</h5>
                <p class="card-text">
                  Campamentos intensivos durante vacaciones para mejorar tus habilidades de patinaje.
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mb-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Eventos Especiales</h5>
                <p class="card-text">
                  Organizamos eventos, fiestas y reuniones en nuestras instalaciones.
                </p>
              </div>
            </div>
          </div>
        </div>

        <a th:href="@{/}" class="btn btn-primary mt-3">Volver al Inicio</a>
      </div>
    </div>
  </div>

  <!-- Pie de pagina -->
  <footer class="bg-dark text-light text-center py-3 mt-5">
    <p class="mb-0">&copy; <span th:text="${#dates.format(#dates.createNow(),'yyyy')}">2025</span> Roller Speed</p>
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
