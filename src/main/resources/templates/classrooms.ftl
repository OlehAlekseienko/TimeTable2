<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rooms</title>
</head>
<body>
<h3>List of Rooms</h3>
<table style="width:40%" border="3px">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Capacity</th>
    </tr>
    <#list rooms as room>
    <tr>
        <td>${room.id}</td>
        <td>${room.name}</td>
        <td>${room.capacity}</td>
    </tr>
    </#list>
</table>
</body>
</html>