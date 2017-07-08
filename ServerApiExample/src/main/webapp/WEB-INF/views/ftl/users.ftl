<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Пользователи</title>
<link rel="stylesheet" type="text/css" href="/resources/list.css">
</head>
<body>
<form method="get" action="/some">
    <input type="text" name="name"/>
    <input type="text" name="age"/>
    <input type="submit">
</form>
<ul class="drop_down_list">
<#list model.users as user>
    <li>${user.name}</li>
    <li>${user.age}</li>
    <ul>
        <#list user.autos as auto>
            <li>${auto.model}</li>
        </#list>
    </ul>
</#list>
</ul>
</body>