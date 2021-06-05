<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Rooms</title>

</head>
<body background="https://www.google.com/url?sa=i&url=https%3A%2F%2Ffunart.pro%2F11149-ugarnye-fony-45-foto.html&psig=AOvVaw21dga1yulJZN5-IE9k3d_H&ust=1622974099824000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIiil7OegPECFQAAAAAdAAAAABAD">
<center>

    <h3>List of Rooms</h3></center>
<table class="table table-sm" style="width: 40%" align="center">
    <thead class="table-dark">

    <th>ID</th>
        <th>Name</th>
        <th>Capacity</th>
        <th>Delete</th>
    </thead>
    <#list rooms as room>
    <tr>
        <td>${room.id}</td>
        <td>${room.name}</td>
        <td>${room.capacity}</td>
        <td><button><a href="/ui/rooms/delete/${room.id}">Delete</a></button></td>
    </tr>
    </#list>
</table>
<center><button><a href="/index.html">Return</a></button></center>
<center><button><a href="/ui/rooms/ReNew">ReNew</a></button></center>
</body>
</html>