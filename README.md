# 📘 Spring & Spring Boot Learning Repository

This repository, maintained by **Prabhat Kumar**, serves as a comprehensive learning resource for **Spring** and **Spring Boot** development. It includes code examples and projects covering fundamental to advanced concepts in Spring, Spring Boot, Spring Security, and related technologies.

---

## 🛠️ Tech Stack & Tools

<p align="left">
  <img src="https://img.shields.io/badge/Java-17+-red?logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring-Framework-6.0-brightgreen?logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/SpringBoot-Application-6.0-success?logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/SpringSecurity-Secure-blue?logo=springsecurity&logoColor=white" />
  <img src="https://img.shields.io/badge/IntelliJ-IDEA-darkblue?logo=intellijidea&logoColor=white" />
  <img src="https://img.shields.io/badge/Google-OAuth2-red?logo=google&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-OAuth2-black?logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/React-Frontend-blue?logo=react&logoColor=white" />
</p>

---

---

## 🚀 Features

✅Core Spring Concepts: Dependency Injection, Autowiring, XML Configuration, Constructor and Setter Injection.
✅Spring Boot Fundamentals: Web application setup, MVC architecture, and HTTP methods (GET, POST, PUT, DELETE).
✅Spring Data JPA: Integration with H2 database, JpaRepository, and data loading.
✅Spring Security: Custom login, CSRF token handling, Bcrypt password encoding, JWT generation and validation.
✅OAuth2 Authentication: Implementation of Google and GitHub login using OAuth2.
✅React Integration: Frontend setup for projects with image handling and CORS configuration.
✅Project-Based Learning: Practical examples with features like search, image fetching, and CRUD operations.

---

## 📁 Project Structure

```
SpringOauth2Demo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/springoauth2demo/
│       │       ├── config/
│       │       │   └── SecurityConfig.java
│       │       ├── controller/
│       │       │   └── HomeController.java
│       │       └── SpringOauth2DemoApplication.java
│       └── resources/
│           ├── application.properties
│           └── templates/
│               └── home.html
├── pom.xml
└── README.md
```


## 🔐 Google OAuth2 Setup Instructions

1. Visit [Google Cloud Console](https://console.cloud.google.com/)
2. Create a project.
3. Go to `APIs & Services > Credentials`
4. Click "Create Credentials" > "OAuth client ID"
5. Choose `Web application`
6. Under "Authorized redirect URIs", add:
   ```
   http://localhost:8080/login/oauth2/code/google
   ```
7. Copy the **Client ID** and **Client Secret** for use below.

---


> ✅ Replace `YOUR_CLIENT_ID` and `YOUR_CLIENT_SECRET` with the values from Google Cloud Console.

## 📦 Build & Run

### ⌨️ Build with Maven

```bash
./mvnw clean install
```

### ▶️ Run the App

```bash
./mvnw spring-boot:run
```

Now open [http://localhost:8080](http://localhost:8080)

---

## 🧪 Test It

1. Open `http://localhost:8080`
2. You’ll be redirected to Google Sign-In
3. After login, you’ll see a welcome message with your name and email

---

## ❓ Troubleshooting

- **Error 400: redirect_uri_mismatch**  
  → Make sure the redirect URI in Google Console matches exactly:  
  `http://localhost:8080/login/oauth2/code/google`

- **403 Forbidden or unauthorized**  
  → Ensure all URLs are whitelisted and you're logged in with a valid account.

---

## 🧾 License

Licensed under the MIT License.

---

## 🙋‍♂️ Author

**Prabhat Kumar**  
📧 [prabhatsharma84226@gmail.com](mailto:prabhatsharma84226@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/prabhat-kumar-1260a5259) | [GitHub](https://github.com/prabhatadvait)
