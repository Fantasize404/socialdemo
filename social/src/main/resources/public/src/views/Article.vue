<script>
    export default{};
</script>

<template>
    <form>
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="dropdown">
                        <button class="dropbtn">三</button>
                        <div class="dropdown-content">
                            <a href="http://localhost:5173/Edit">修改</a>
                            <a href="#">刪除</a>
                        </div>
                    </div>
                    <span id="content" class="content">內容12312312312321312312312312312312312312412413431414124124</span>
                    <img src="../../432412670_7721165957916645_5439624432220003193_n.jpg" class="img-fluid">
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" placeholder="新增留言..." aria-label="Example text with button addon" aria-describedby="button-addon1">
                        <button class="btn btn-outline-secondary" type="button" id="button-addon1">新增</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</template>

<style scoped>
.col {
    background-color: aquamarine; 
    border: solid;
}
.content {
    word-wrap: break-word;
}
.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}
.dropdown {
    position: relative;
    float:right;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
.dropdown-content a:hover {
    background-color: #f1f1f1
}
.dropdown:hover .dropdown-content {
    display: block;
}
.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>