<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:wrapper>
    <h1>Dodaj nowe zadanie</h1>
    <form action="/todo/create" method="post" class="form-horizontal">

        <div class="form-group">
            <label for="title" class="control-label col-md-2">Tytuł</label>
            <div class="col-md-6">
                <input id="title" type="text" name="title" class="form-control" placeholder="Tytuł">
            </div>
        </div>
        <div class="form-group">
            <label for="description" class="control-label col-md-2">Opis</label>
            <div class="col-md-6">
                <input id="description" type="text" name="description" class="form-control"
                       placeholder="Opis">
            </div>
        </div>
        <div class="form-group">
            <label for="startdate" class="control-label col-md-2">Data</label>
            <div class="col-md-6">
                <input id="startdate" type="datetime-local" name="startdate" class="form-control"
                       placeholder="Data">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Dodaj</button>
            </div>
        </div>

    </form>
</t:wrapper>
