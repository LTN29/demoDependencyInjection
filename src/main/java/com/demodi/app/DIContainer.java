package com.demodi.app;

import com.demodi.service.EmailService;
import com.demodi.service.MessageService;

//Vai trò của DIContainer
//Quản lý việc khởi tạo các đối tượng (dependency):
//Thay vì để Notification tự new một EmailService, DIContainer sẽ tạo sẵn và tiêm (inject) vào.
//
//Tách biệt phần tạo dependency khỏi phần sử dụng dependency:
//Notification chỉ biết dùng MessageService (interface), còn việc chọn implementation (EmailService hay SMSService) nằm ở DIContainer.
//
//Điểm duy nhất cần sửa khi thay đổi implementation:
//Nếu muốn đổi từ email sang SMS, chỉ sửa ở DIContainer.
public class DIContainer {
    public static Nofication createNotification() {
        //Chỉ thay đổi ở đây
        //Tạo một instance của EmailService và truyền vào Nofication
        //Đây là nơi bạn có thể thay đổi để sử dụng các service khác nhau
        //Ví dụ: nếu muốn sử dụng SMSService, chỉ cần thay đổi dòng này
        MessageService messageService = new EmailService();
        return new Nofication(messageService);
    }

    // Liên hệ với Spring Boot
    //Trong Spring Boot, DIContainer tương đương với Spring IoC Container.
    //
    //Spring quét annotation (@Component, @Service, @Repository) để tạo bean,
    // rồi tự tiêm vào các class cần dùng (@Autowired hoặc constructor injection).
    //
    //Nhờ vậy bạn không phải viết DIContainer thủ công — Spring làm hết.
}
