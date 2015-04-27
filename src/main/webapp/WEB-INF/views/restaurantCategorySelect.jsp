<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<select id="category.id" name="category.id" class="form-control">
    <c:forEach items="${categories}" var="category">

        <option value="${category.id}">${category.name}</option>

    </c:forEach>
</select>