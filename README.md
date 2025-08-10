# Demo Dependency Injection (Java)

Dự án này minh họa cách sử dụng **Dependency Injection (DI)** trong Java, giúp tách biệt các thành phần của ứng dụng, dễ dàng bảo trì và mở rộng.

## 📂 Cấu trúc thư mục:
src
└── main
├── java/com/demodi/app
│ ├── DIContainer.java
│ ├── Nofication.java
│ ├── NoficationNoDI.java
│ └── service/
│ ├── EmailService.java
│ ├── MessageService.java
│ └── SMSService.java
├── resources
│ ├── static/
│ ├── templates/
│ └── application.properties
└── test

## 🚀 Chạy dự án
1. **Clone repo**
   ```bash
   git clone https://github.com/<username>/demoDependencyInjection.git
   cd demoDependencyInjection
2. **Build với Maven:**
bash
mvn clean install

3. **Chạy ứng dụng:**
bash
mvn spring-boot:run

📌 **Nội dung chính:**
DIContainer: Quản lý injection thủ công.
NoficationNoDI: Cách code không dùng Dependency Injection.
Nofication: Cách code khi sử dụng DI.
Các service: EmailService, SMSService, MessageService.

🛠 **Công nghệ sử dụng:**
Java 21
Spring Boot
Maven
