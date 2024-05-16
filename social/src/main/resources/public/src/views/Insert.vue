<script>
    export default{};
</script>
<template>
    <form>
        <div>
            <label for="content">文章内容：</label>
        </div>
        <div>
            <textarea id="content" name="content" cols="110" rows="4" onkeyup="autogrow(this)">新增文章內容</textarea>
        </div>
        <div class="input-group mb-3">
            <input type="file" class="form-control" id="inputGroupFile02">
        </div>
        <div>
            <button type="submit">更新文章</button>
        </div>
    </form>
</template>