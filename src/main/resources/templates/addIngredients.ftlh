<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <form class="needs-validation" novalidate="" action="/ingredients/add" method="post">
        <div class="col-12">
            <label for="name" class="form-label">Добавление ингредиента</label>
            <input name="name" required="" id="name" type="text" placeholder="Введите например: Помидор">
        </div>
        <button class="w-100 btn btn-success btn-lg" type="submit">Добавить</button>
    </form>
</div>
</body>
</html>