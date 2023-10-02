<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<form>
    <input type="text" name="searchTen" value="${param.searchTen}">
    <button type="submit">Search</button>
</form>
<form action="/lab56/home/add" method="post">
    <div class="row">
        <div class="form-group col-md-6">
            <label >ten ô tô</label>
            <input type="text" class="form-control" name="tenOtoa" required value="${oto.tenOtoa}">
        </div>
        <div class="form-group col-md-6">
            <label >thương hiệu</label>
            <input type="text" class="form-control" name="thuongHieua" required value="${oto.thuongHieua}" >
        </div>
    </div>
    <div class="row">
        <div class="form-group col-md-6">
            <label >dung tích</label>
            <input type="text" class="form-control" name="dungTicha" required value="${oto.dungTicha}">
        </div>
        <div class="form-group col-md-6">
            <label >số chỗ ngồi</label>
            <input type="number" step="any" class="form-control" name="soChoNgoia" value="${oto.soChoNgoia}">
        </div>
    </div>
    <button type="submit" class="btn btn-primary" onclick="return confirm('Ban co dong y them')">Add</button>
</form>

<form action=""> </form>
<table border="1">
    <tr>
        <th>Ma </th>
        <th>Ten</th>
        <th>thuong hieu</th>
        <th>dung tich</th>
        <th>so cho ngoi</th>

    </tr>

    <c:forEach items="${otos}" var="sp">
        <tr>
            <td> <a href="/lab56/oto/${sp.productId}">${sp.productId}</a></td>
            <td><p>${sp.tenOtoa}</p></td>
            <td><p>${sp.thuongHieua}</p></td>
            <td><p>${sp.dungTicha}</p></td>
            <td><p>${sp.soChoNgoia}</p></td>


        </tr>
    </c:forEach>
</table>
<c:if test="${hocSinhPage.getNumber()+1 > 1}">
    <a href="?page=${hocSinhPage.getNumber()+1 -1}">Prev</a>
</c:if>

<span>${hocSinhPage.getNumber()+1} / ${hocSinhPage.getTotalPages()}</span>

<c:if test="${hocSinhPage.getNumber()+1 < hocSinhPage.getTotalPages()}">
    <a href="?page=${hocSinhPage.getNumber()+1 +1}">Next</a>
</c:if>