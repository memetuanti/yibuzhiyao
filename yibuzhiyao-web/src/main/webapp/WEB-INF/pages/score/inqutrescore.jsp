<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>查询操作</title>
    <script type="text/javascript" src="https://unpkg.com/vue@2.3.4/dist/vue.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/score/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
	var localObj = window.location;
	var contextPath = localObj.pathname.split("/")[1];
	var basePath = localObj.protocol + "//" + localObj.host + "/" + contextPath;
	var server_context = basePath;
</script>
<script type="text/javascript" src="https://unpkg.com/vue@2.3.4/dist/vue.js"></script>

    <style type="text/css">
        [v-cloak] {
            display: none
        }
        table {
            border: 1px solid #ccc;
            padding: 0;
            border-collapse: collapse;
            table-layout: fixed;
            margin-top: 10px;
            width: 100%;
        }
        table td,
        table th {
            height: 30px;
            border: 1px solid #ccc;
            background: #fff;
            font-size: 15px;
            padding: 3px 3px 3px 8px;
        }
        table th:first-child {
            width: 30px;
        }
        .container,
        .st {
            width: 1000px;
            margin: 10px auto 0;
            font-size: 13px;
            font-family: 'Microsoft YaHei'
        }
        .container .search {
            font-size: 15px;
            padding: 4px;
        }
        .container .add {
            padding: 5px 15px;
        }
        .container .indexed {
            padding: 5px 15px;
        }
        .overlay {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: 6;
            background: rgba(0, 0, 0, 0.7);
        }
        .overlay td:first-child {
            width: 60px;
        }
        .overlay .con {
            position: absolute;
            width: 600px;
            min-height: 300px;
            background: #fff;
            left: 50%;
            top: 50%;
            -webkit-transform: translate3d(-50%, -50%, 0);
            transform: translate3d(-50%, -50%, 0);
            /*margin-top: -150px;*/
            padding: 20px;
            
        }
    </style>
</head>
<body style="background-color:azure;>
    <div class="st">
        <h1 align="center">成绩操作页面</h1>
    </div>
    <div class="container" id="app">
        <div>
         	
            <input type="text" placeholder="search" @input="search" list="cars" class="search">
            <datalist id="cars">
                <option v-for="item in searchlist" :value="item"></option>
            </datalist>
            <input type="button" class="add" @click="add" value="新增" >
            <input type="button" class="indexed" @click="indexed" value="显示所有数据">
        </div>
        <div>
            <table>
                <tr>
                    <th>id</th>
                    <th>学生姓名</th>
                    <th width="110">学生学号</th>
                    <th>第一次上机</th>
                    <th>第二次上机</th>
                    <th>第三次上机</th>
                    <th>第四次上机</th>
                    <th>第五次上机</th>
                    <th>考勤成绩</th>
                    <th>课设成绩</th>
                    <th>总成绩</th>
                </tr>
                <tr v-cloak v-for="(item, index) of slist">
                    <td>{{index+1}}</td>
                    <td>{{item.name}}</td>
                    <td>{{item.num}}</td>
                    <td>{{item.first}}</td>
                    <td>{{item.second}}</td>
                    <td>{{item.third}}</td>
                    <td>{{item.fourth}}</td>
                    <td>{{item.fifth}}</td>
                    <td>{{item.attendance}}</td>
                    <td>{{item.j2design}}</td>
                    <td>{{item.total}}</td>
                    <td><a href="javascript:;" @click="showOverlay(index)">修改</a> | <a href="javascript:;" @click="del(index)">删除</a></td>
                </tr>
            </table>
        </div>
        <model :list='selectedlist' :isactive="isActive" v-cloak @change="changeOverlay" @modify="modify"></model>
    </div>
</body>
<script type="text/javascript">
    Vue.component('model', {
        props: ['list', 'isactive'],
        template: `<div class="overlay" v-show="isactive">
                        <div class="con">
                        <h2 class="title">新增 | 修改</h2>
                        <div class="content">
                        <table>
                        <tr>
                        <td>学生姓名</td>
                        <td><input type="text" v-model="modifylist.name"></td>
                        </td>
                        </tr>
                        <tr>
                        <td >学生学号</td>
                        <td><input type="text" v-model="modifylist.num"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>第一次上机</td>
                        <td><input type="text" v-model="modifylist.first"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>第二次上机</td>
                        <td><input type="text" v-model="modifylist.second"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>第三次上机</td>
                        <td><input type="text" v-model="modifylist.third"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>第四次上机</td>
                        <td><input type="text" v-model="modifylist.fourth"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>第五次上机</td>
                        <td><input type="text" v-model="modifylist.fifth"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>考勤成绩</td>
                        <td><input type="text" v-model="modifylist.attendance"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>课设成绩</td>
                        <td><input type="text" v-model="modifylist.j2design"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>总成绩</td>
                        <td><input type="text" v-model="modifylist.total"></td>
                        </td>
                        </tr>
                        </table>
                        <p>
                        <input type="button" @click="changeActive" value="取消">
                        <input type="button" @click="modify" value="保存">
                        </p>
                        </div>
                        </div>
                    </div>`,
        computed: {
            modifylist() {
                return this.list;
            }
        },
        methods: {
            changeActive() {
                this.$emit('change');
            },
            modify() {
                this.$emit('modify', this.modifylist);
            }
        }
    });
    $.ajax({
        url:server_context + '/score/.json?_dc=1530084270505&page=1&start=0&limit=80',//实现跨域的URL路径
        		
        type:'GET',
        dataType:'json',
        timeout:3000,
        success:function(result){
            alert("欢迎来到查询系统！！！");
            app.list = result.content;
        },
        error:function(XMLHttpRequest, textStatus, errorThrown){
            alert('服务器忙，请稍后');
            alert(textStatus+XMLHttpRequest.status);
        }
    });
    var app = new Vue({
        el: '#app',
        data: {
            isActive: false,
            selected: -1,
            selectedlist: {},
            slist: [],
            searchlist: [],
            list: []
        },
        created() {
            console.log(Date.now());
            this.setSlist(this.list);
        },
        methods: {
            // 修改数据
            showOverlay(index) {
                this.selected = index;
                this.selectedlist = this.list[index];
                this.changeOverlay();
            },
            // 点击保存按钮
            modify(arr) {
                if (this.selected > -1) {
                    Vue.set(this.list, this.selected, arr);
                } else {
                    this.list.push(arr);
                }
                this.setSlist(this.list);
                this.changeOverlay();
            },
            indexed(){
            	this.setSlist(this.list);
            },
            add: function () {
                this.selectedlist = {
                	name: '赵向阳',
                	num : '201608040218',
                	first : '87',
                	second : '88',
                	third : '89',
                	fourth : '89',
                	fifth : '90',
                	attendance : '87',
                	j2design : '88',
                	total : '89'
                };
                this.isActive = true;
            },
            // delete list in index location
            del(index) {
                this.list.splice(index, 1);
                this.setSlist(this.list);
            },
            changeOverlay() {
                this.isActive = !this.isActive;
            },
            // 获取需要渲染到页面中的数据
            setSlist(arr) {
                this.slist = JSON.parse(JSON.stringify(arr));
            },
            // 搜索
            search(e) {
                var v = e.target.value,
                    self = this;
                self.searchlist = [];
                if (v) {
                    var ss = [];
                    // 过滤需要的数据
                    this.list.forEach(function (item) {
                        if (item.name.indexOf(v) > -1) {
                            if (self.searchlist.indexOf(item.name) == -1) {
                                self.searchlist.push(item.name);
                            }
                            ss.push(item);
                        } else if (item.num.indexOf(v) > -1) {
                            if (self.searchlist.indexOf(item.num) == -1) {
                                self.searchlist.push(item.num);
                            }
                            ss.push(item);
                        }
                    });
                    this.setSlist(ss); // 将过滤后的数据给了slist
                } else {
                    // 没有搜索内容，则展示全部数据
                    this.setSlist(this.list);
                }
            }
        },
        watch: {
        }
    });
</script>

</html>