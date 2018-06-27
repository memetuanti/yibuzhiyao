<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页面</title>
</head>

<body>
	<div id="app">
                <div v-for="art in content">
                        <span>{{art.id}}</span>
                        <span>{{art.homework_list_name}}</span>
                        <span>{{art.homework_teacher}}</span>
                        <span>{{art.homework_end_time}}</span>
                        <span>{{art.homework_state}}</span>
                        <span>{{art.homework_score}}</span>
                </div>
            
        </div>
    <script type="text/javascript" src="https://unpkg.com/vue@2.3.4/dist/vue.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/homework/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
	var localObj = window.location;
	var contextPath = localObj.pathname.split("/")[1];
	var basePath = localObj.protocol + "//" + localObj.host + "/" + contextPath;
	var server_context = basePath;
</script>
<script language="JavaScript">
    var myModel = {"content":[]};
    var myViewModel = new Vue({
        el:'#app',
        data:myModel
    });
    $.ajax({
        url:server_context + '/homework/.json?_dc=1530084270505&page=1&start=0&limit=20',//实现跨域的URL路径
        type:'GET',
        dataType:'json',
        timeout:3000,
        success:function(result){
            alert(result);
            myModel.content = result.content;
        },
        error:function(XMLHttpRequest, textStatus, errorThrown){
            alert('服务器忙，请不要说脏话，理论上大家都是文明人');
            alert(textStatus+XMLHttpRequest.status);
        }
    });
</script>
</body>



</html>