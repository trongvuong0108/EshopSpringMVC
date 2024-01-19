<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container-fluid">
    <button type="button" class="btn btn-dark btn-lg m-lg-5"><i class="fa fa-plus" aria-hidden="true"></i> Thêm sản phẩm </button>
    <div class="row px-xl-5">
        <div class="menu-bar">
            <div class="menu">
                <ul class="menu-links">
                    <li class="nav-link">
                        <a href="qlhoadon.html">
                            <i class='bx bx-list-ol'></i>
                            <span class="text nav-text">Hóa đơn</span>
                        </a>
                    </li>

                    <li class="nav-link">
                        <a href="qltaikhoan.html">
                            <i class='bx bxs-user-account'></i>
                            <span class="text nav-text">Tài khoản</span>
                        </a>
                    </li>

                    <li class="nav-link">
                        <a href="qlloai.html">
                            <i class='bx bx-laptop'></i>
                            <span class="text nav-text">Loại SP</span>
                        </a>
                    </li>

                    <li class="nav-link">
                        <a href="qlsanpham.html">
                            <i class='bx bxl-product-hunt'></i>
                            <span class="text nav-text">Sản Phẩm</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-lg-10 table-responsive mb-5">
            <table class="table table-light table-borderless table-hover text-center mb-5">
                <thead class="thead-dark">
                <tr>
                    <th>Mã Sản Phẩm</th>
                    <th>Tên Sản Phẩm</th>
                    <th>Mô tả</th>
                    <th>Giá nhập</th>
                    <th>Giá bán</th>
                    <th>Số Lượng</th>
                    <th>Hình ảnh</th>
                    <th>Xóa</th>
                    <th>Sửa</th>
                </tr>
                </thead>
                <tbody class="align-middle">
                <c:forEach items="${productList}" var="product">
                    <tr>
                        <td class="align-middle">${product.getId()}</td>
                        <td class="align-middle">${product.getName()}</td>
                        <td class="align-middle">${product.getDescription()}</td>
                        <td class="align-middle">${product.getPriceIn()}</td>
                        <td class="align-middle">${product.getPriceOut()}</td>
                        <td class="align-middle">${product.getQuantity()}</td>
                        <td class="align-middle">${product.getImg()}</td>
                        <td class="align-middle">
                            <button class="btn btn-sm btn-danger"><i class="fa fa-times"></i></button>
                        </td>
                        <td class="align-middle">
                            <button class="btn btn-sm btn-danger"><i class="fa-solid fa-pen-to-square"></i></button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
