# Backend moderno con Spring Boot 🚀

Demo sencilla de una API REST utilizando Spring Boot.

Proyecto utilizado para una charla introductoria sobre:

- Backend moderno
- APIs REST
- Java y Spring Boot
- Arquitectura profesional
- Seguridad básica
- Herramientas reales como Postman

---

# 🧠 Objetivo

El objetivo de este proyecto NO es crear una aplicación compleja.

La idea es mostrar cómo se estructura una API backend moderna de forma mantenible y profesional.

---

# 🛠️ Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- H2 Database
- Spring Security (rama secure)
- Postman

---

# 📦 Estructura del proyecto

```text
controller → endpoints HTTP
service    → lógica de negocio
repository → acceso a datos
entity     → entidades
config     → seguridad y configuración
```

---

# 🌐 Endpoints

## Obtener tareas

```http
GET /tasks
```

---

## Obtener tarea por ID

```http
GET /tasks/{id}
```

---

## Crear tarea

```http
POST /tasks
```

Body JSON:

```json
{
    "title": "string",
    "description": "string",
    "completed": boolean
}
```

---

## Actualizar tarea

```http
PUT /tasks/{id}
```

---

## Eliminar tarea

```http
DELETE /tasks/{id}
```

---

# ▶️ Ejecutar el proyecto

## 1. Clonar repositorio

```bash
git clone https://github.com/TU-USUARIO/springboot-task-api-demo.git
```

---

## 2. Entrar en el proyecto

```bash
cd backend-moderno-springboot-demo
cd demo-backend-moderno
```

---

## 3. Ejecutar aplicación

```bash
mvn spring-boot:run
```

---

# 🎯 Objetivo educativo

Este proyecto está orientado a:

- estudiantes DAW/DAM
- perfiles junior
- personas que quieren entender backend moderno

---

# 💡 Idea principal

> No basta con hacer aplicaciones que funcionen.
> También deben ser mantenibles, organizadas y seguras.
