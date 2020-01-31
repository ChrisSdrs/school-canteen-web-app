<form action="/admin/orders/search" name="orderSearchForm" method="POST">
    <div class="mb-3">
        <label for="dateBefore">From date:</label>
        <input type="date" class="form-control mr-sm-2" name="dateBefore" id="dateBefore">
    </div>
    <div class="mb-3">
        <label for="dateAfter">Until date:</label>
        <input type="date" class="form-control mr-sm-2" name="dateAfter" id="dateAfter">
    </div>
    <div class="mb-3">
        <input type="text" class="form-control mr-sm-2" name="regn" id="regn" placeholder="Registration Number" style="margin-top: 55px;">
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
