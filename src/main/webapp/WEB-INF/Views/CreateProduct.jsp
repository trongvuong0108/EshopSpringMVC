<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container form-text">
    <div class="row">
        <div class="col-sm-12">
            <h1>Thêm Sản Phẩm</h1>
        </div>
        <div class="col-sm-12">

            <form method="post" enctype="multipart/form-data">

                <div class="form-group">
                    <label for="txtname">Tên sản phẩm</label>
                    <input class="form-control" id="txtname" type="text" name="txtname" value="">
                </div>

                <div class="form-group">
                    <label for="txtdesc">Mô tả sản phẩm</label>
                    <textarea class="form-control" type="text" id="txtdesc" name="txtdesc" rows="3" value=""></textarea>
                </div>

                <div class="form-group">
                    <label for="txtquantity">Số lượng sản phẩm</label>
                    <input class="form-control" type="number" id="txtquantity" name="txtquantity" value="">
                </div>

                <div class="form-group">
                    <label for="txtprice">Giá sản phẩm</label>
                    <input class="form-control" type="number" id="txtprice" name="" value="">
                </div>

                <div class="form-group">
                    <label>Loại sản phẩm</label>
                    <select class="form-control" name="txtcateid">
                        <option value="" selected>-- Chọn loại --</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="txtpic">Hình ảnh</label>
                    <div class="custom-file">
                        <input type="file" id="txtpic" name="txtpic" accept=".png,.gif,.jpg,.jpeg">
                        <label class="custom-file-label" for="txtpic">Chọn hình</label>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary" name="btnsubmit">Thêm sản phẩm</button>
            </form>
        </div>
    </div>
</div>