<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${news.title}</title>
    <link rel="stylesheet" href="assets/css/style.css"> <!-- Đường dẫn tới CSS của bạn -->
</head>
<body>

    <div class="container">
        <h1>${news.title}</h1>
        <div class="post-info">
            <p><strong>Ngày đăng:</strong> ${news.posteddate}</p>
            <p><strong>Tác giả:</strong> ${news.author}</p>
            <p><strong>Danh mục:</strong> ${news.categoryid}</p>
        </div>

        <div class="post-content">
            <img src="/Java3_asm/images/${news.image}" alt="Image for ${news.title}" style="width: 100%; max-width: 600px;">
            <p>${news.content}</p>
        </div>

        <div class="post-footer">
            <p><strong>Đã xem:</strong> ${news.viewcount}</p>
        </div>
    </div>

</body>
</html>