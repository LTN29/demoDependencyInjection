package com.demodi.app;

import com.demodi.service.EmailService;

public class NoficationNoDI {
    private final EmailService emailService;

    public NoficationNoDI() {
        this.emailService = new EmailService();//tự new -> coupling(chặt chẽ)
        // Không sử dụng DI, nên không thể dễ dàng thay đổi EmailService
    }

    public void send(String message) {
        emailService.sendMessage(message);
    }

    //Hậu quả:
    // - Khó kiểm tra: Không thể mock EmailService trong unit test.
    // - Khó thay đổi: Nếu cần thay đổi EmailService, phải sửa mã nguồn
    // - Khó tái sử dụng: Không thể sử dụng Nofication với các
    // dịch vụ khác mà không thay đổi mã nguồn.
    // - Khó bảo trì: Mã nguồn trở nên khó hiểu và khó bảo trì
    // - Khó mở rộng: Không thể mở rộng Nofication để hỗ trợ các
    //   dịch vụ khác mà không thay đổi mã nguồn.
    // - Khó quản lý vòng đời: Không thể quản lý vòng đời của EmailService
    //   thông qua DI container, dẫn đến khó khăn trong việc giải phóng tài nguyên
    // - Khó kiểm soát phụ thuộc: Không thể kiểm soát phụ thuộc của
    //   Nofication với EmailService, dẫn đến việc khó khăn trong việc quản lý
    //   các phụ thuộc trong ứng dụng lớn hơn.
}
