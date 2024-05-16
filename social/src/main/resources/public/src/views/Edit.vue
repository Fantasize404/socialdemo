<script>

</script>
<template>
    <form >
        <div class="edit-form">
            <div class="col">
                <div class="editcomment">
                    <textarea id="edit" class="edit" name="edit" onkeyup="autogrow(this)">新增文章內容</textarea>
                    <img src="../../432412670_7721165957916645_5439624432220003193_n.jpg" class="img-fluid">
                </div>
                <div class="editbtn">
                    <button type="button" class="btn btn-primary">保存</button>
                </div>
            </div>
        </div>
    </form>
    <!-- <div class="test"></div> -->
</template>

<style scoped>
.col {
    position: fixed;
    background-color: black;
    top: 0px;
	right: 0px;
  	bottom: 0px;
	left: 0px;
}
.editcomment {
    background-color: aliceblue;
    border: solid;
    position: absolute;
    width: 500px;
	height: 600px;
    top: 5px;
    right: 0px;
	left: 0px;
    margin: auto;
}
.img-fluid {
    position: absolute;
    width: 300px;
    height: 300px;
    margin: auto;
    top: 100px;
    left: 100px;
}
.edit {
    width: 495px;
}
.editbtn {
    position: absolute;
    bottom: 30px;
    right: 400px;
}
</style>