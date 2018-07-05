<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生查询-yibuzhiyao</title>
<!-- 引入样式 -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

</head>


<script>
  export default {
    data() {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style>
  .el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  
  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }
  
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }
  
  body > .el-container {
    margin-bottom: 40px;
  }
  
  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }
  
  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
</style>



<body>

<h1 align="center">学生查询<sub>--Yibuzhiyao</sub></h1>


	<div id="app">
	
	

<el-menu
  :default-active="activeIndex2"
  class="el-menu-demo"
  mode="horizontal"
  @select="handleSelect"
  background-color="#545c64"
  text-color="#fff"
  active-text-color="#ffd04b">
  <el-submenu index="1">
  <div slot="title">个人信息</div>
  <el-menu-item index="1-1" ><a href="http://localhost:8080/yibuzhiyao-web/student/inqutrestudent.html" target="_blank">查询信息</a></el-menu-item>
  <el-menu-item index="1-2" ><a href="http://localhost:8080/yibuzhiyao-web/student/index.html" target="_blank">全部信息</a></el-menu-item>
  </el-submenu>
  <el-submenu index="2">
  <div slot="title">分组管理</div>
  <el-menu-item index="2-1"><a  href="http://localhost:8080/yibuzhiyao-web/group/inqutregroup.html" target="_blank">查询分组</a></el-menu-item>
  <el-menu-item index=”2-2” ><a href="http://localhost:8080/yibuzhiyao-web/group/index.html" target="_blank">全部分组</a></el-menu-item>
  </el-submenu>
  <el-submenu index="3">
    <div slot="title">成绩管理</div>
    <el-menu-item index="3-1" disabled>成绩录入（功能开发中）</a></el-menu-item>
    <el-menu-item index="3-2"><a href="http://localhost:8080/yibuzhiyao-web/score/index.html" target="_blank">全部成绩</a></el-menu-item>
    <el-menu-item index="3-3"><a href="http://localhost:8080/yibuzhiyao-web/score/inqutrescore.html" target="_blank">成绩查询</a></el-menu-item>
  </el-submenu>
 <el-submenu index="4">
  <div slot="title">作业管理</div>
  <el-menu-item index="4-1"><a  href="http://localhost:8080/yibuzhiyao-web/homework/inqutreHomework.html" target="_blank">查询作业</a></el-menu-item>
  <el-menu-item index=”4-2” ><a href="http://localhost:8080/yibuzhiyao-web/homework/index.html" target="_blank">全部作业</a></el-menu-item>
  </el-submenu>
  <el-submenu index="5">
  <div slot="title">考勤管理</div>
  <el-menu-item index="5-1"><a href="http://localhost:8080/yibuzhiyao-web/mark/index.html" target="_blank">全部考勤</a></el-menu-item>
  <el-menu-item index="5-2"  disabled>考勤录入</el-menu-item>
  <el-menu-item index="5-3">考勤分析</el-menu-item>
  </el-submenu>
  <el-submenu index="6">
  <div slot="title">任务管理</div>
   <el-submenu index="6-1">
      <div slot="title">查询任务</div>
      <el-menu-item index="6-6-1">时间查询</el-menu-item>
    </el-submenu>
  <el-menu-item index="6-2"><a href="http://localhost:8080/yibuzhiyao-web/management/index.html" target="_blank">全部任务</a></el-menu-item>
  </el-submenu>
</el-menu>
	

<el-container>
  <el-aside  width="154px">个人信息</el-aside>
  <el-container>
    <el-main>分组管理</el-main>
     <el-aside width="154px">成绩管理</el-aside>
     <el-main >作业管理</el-main>
      <el-aside width="154px">考勤管理</el-aside>
      <el-main>任务管理</el-main>
  </el-container>
</el-container>
<br><br>
    &nbsp&nbsp&nbsp&nbsp<el-button type="info" >个人信息</el-button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <el-button type="info">分组管理</el-button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <el-button type="info">成绩管理</el-button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <el-button type="info">作业管理</el-button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <el-button type="info">考勤管理</el-button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <el-button type="info">任务管理</el-button>


</div>


</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data : function() {
			return {
				visible : false
			}
		}
	})

</script>
</html>