<script>
    export default{};
</script>
<template>
    <form>
        <div class="mb-3">
            <label for="exampleInputPhone1" class="form-label" >手機號碼</label>
            <input type="phone" class="form-control" id="exampleInputPhone" placeholder="請輸入手機號碼">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">密碼</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="請輸入密碼">
        </div>
        <button type="submit" class="btn btn-dark position-relative ">註冊</button>
        <button type="submit" class="btn btn-link position-relative position-absolute top-50 end-0 translate-middle">登入</button>
  </form>
</template>