<form action="/admin/orders/search" name="orderSearchForm" method="POST">
    <div class="mb-3">
        <label for="dateFrom">From date:</label>
        <input type="date" class="form-control mr-sm-2" name="dateFrom" id="dateFrom">
    </div>
    <div class="mb-3">
        <label for="dateTo">Until date:</label>
        <input type="date" class="form-control mr-sm-2" name="dateTo" id="dateTo">
    </div>
    <div class="mb-3">
        <label for="regn" style="padding-top: 5px;">Student's Registration Number:</label>
        <input type="text" class="form-control mr-sm-2" name="regn" id="regn" placeholder="Registration Number" >
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
