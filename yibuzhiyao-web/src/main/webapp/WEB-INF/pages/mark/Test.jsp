<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<script>
function getData(){
	var data=[{"a":"aa","d":"dd"},{"a":"ab","d":"dc"}];
	reTB(data);
}
function reTB(data){
	var tb = document.getElementById("tb");
	for(var n=tb.row.length-1;n>1;n--){
		tb.deleteRow(n);
	}
	for(var i=0;i<data.length;i++){
		var row =tb.insertRow(tb,rows.length);
		var c1=row.insertCell(0);
		c1.innerHTML=data[i].a;
		var c2=row.insertCell(1);
		c2.innerHTML=data[i].d;
	}
}

</script>
<input type="button" value="re" onclick="getData"/>
<table id="tb" border="1">
<tr><td colspan="2">a</td></tr>
<tr><td>b</td><td>c</td></tr>
<tr><td>b1</td><td>c2</td></tr>
<tr><td>b3</td><td>c4</td></tr>
</table>
</body>
</html>