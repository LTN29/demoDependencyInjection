# Demo Dependency Injection (Java)

Dự án này minh họa cách sử dụng **Dependency Injection (DI)** trong Java, giúp tách biệt các thành phần của ứng dụng, dễ dàng bảo trì và mở rộng.

## 📂 Cấu trúc thư mục:
```plaintext
src
└── main
    ├── java/com/demodi/app
    │   ├── DIContainer.java
    │   ├── Notification.java
    │   ├── NotificationNoDI.java
    │   └── service/
    │       ├── EmailService.java
    │       ├── MessageService.java
    │       └── SMSService.java
    ├── resources
    │   ├── static/
    │   ├── templates/
    │   └── application.properties
└── test
```
## 🚀 Chạy dự án
1. **Clone repo**
   ```bash
   git clone https://github.com/<username>/demoDependencyInjection.git
   cd demoDependencyInjection
2. **Build với Maven:**
   ```bash
   mvn clean install
3. **Chạy ứng dụng:**
   ```bash
   mvn spring-boot:run

📌 **Nội dung chính:**

DIContainer: _Quản lý injection thủ công._

NoficationNoDI: _Cách code không dùng Dependency Injection._

Nofication: _Cách code khi sử dụng DI._

Các service: _EmailService, SMSService, MessageService._

🛠 **Công nghệ sử dụng:**

_Java 21_

_Spring Boot_

_Maven_
