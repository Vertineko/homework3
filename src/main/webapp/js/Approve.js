const Approve = async(id,flag) =>{
    const data = new FormData()
    data.set("num",id)
    data.set("flag",flag)
    const res = await fetch("ApproveServlet",{
        method:'post',
        body:new URLSearchParams(data),
    })
    const response = await res.json();
    if(response.flag){
        alert("操作成功！");
        location.reload();
    }else {

        alert("选中的项目已不在表单中！");
    }

}