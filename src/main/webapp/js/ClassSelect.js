const deleteRow = async(id) =>{
    const data = new FormData();
    data.set("num" ,id);
    const res = await fetch("deleteServlet" ,{
        method:'post',
        body: new URLSearchParams(data),
    })


    location.reload();

}


function searchRow(){
    document.getElementById(search);
}

const submit = async(id,name) => {
    const data = new FormData();
    data.set("num",id);
    data.set("name",name);
    const res = await fetch('SubmitServlet', {
        method: 'post',
        body: new URLSearchParams(data),
    })
    const response = await res.json();
    if(response.flag){
        alert("申请成功！");
        location.reload();
    }else{
        alert("请勿重复申请！");
    }


}


function modify(){

}

const search = async() =>{
    const name = document.getElementById("searchtext").value;
    const data = new FormData();
    data.set("name",name);
    const res = await fetch("ClassSelectServlet",{
        method:'post',
        body:new URLSearchParams(data),
    })
    const response = await res.json();
    const id = response.num;
    const name1 = response.name;
    if(response.flag){
        document.getElementById("querydata").innerHTML="<tr><th>id</th><th>name</th><th>action</th></tr>"+"<tr><td>"+response.num+
            "</td><td>" +response.name+
            "</td><td><input type=\"button\" value=\"申请\" onclick=\"submit("+id+","+"\'"+name1+"\'"+")\">"+"</td></tr>"

    }else{
        alert("没有该课程！")
    }
}