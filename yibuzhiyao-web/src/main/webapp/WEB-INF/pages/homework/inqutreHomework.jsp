<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>查询操作</title>
    <script type="text/javascript" src="https://unpkg.com/vue@2.3.4/dist/vue.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/homework/jquery-3.2.1.min.js"></script>
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
<body>
    <div class="st">
        <h1>作业操作页面</h1>
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
                    <th>作业名称</th>
                    <th>发布老师</th>
                    <th>截止时间</th>
                    <th>批改状态</th>
                    <th>批改分数</th>
                    <th>操作</th>
                </tr>
                <tr v-cloak v-for="(item, index) of slist">
                    <td>{{index+1}}</td>
                    <td>{{item.homework_list_name}}</td>
                    <td>{{item.homework_teacher}}</td>
                    <td>{{item.homework_end_time}}</td>
                    <td>{{item.homework_state}}</td>
                    <td>{{item.homework_score}}</td>
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
                        <td>作业名</td>
                        <td><input type="text" v-model="modifylist.homework_list_name"></td>
                        </tr>
                        <tr>
                        <td>发布老师</td>
                        <td><input type="text" v-model="modifylist.homework_teacher"></td>
                        </tr>
                        <tr>
                        <td>截止时间</td>
                        <td><input type="text" v-model="modifylist.homework_end_time"></td>
                        </td>
                        </tr>
                        <tr>
                        <td>批改状态</td>
                        <td>
                        <select name="" id="" v-model="modifylist.homework_state">
                        <option value="已经批改">已经批改</option>
                        <option value="未批改">未批改</option>
                        </select>
                        </td>
                        </tr>
                        <tr>
                        <td>分数</td>
                        <td><input type="text" v-model="modifylist.homework_score"></td>
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
        url:server_context + '/homework/.json?_dc=1530084270505&page=1&start=0&limit=80',//实现跨域的URL路径
        type:'GET',
        dataType:'json',
        timeout:3000,
        success:function(result){
            alert("成功");
            app.list = result.content;
        },
        error:function(XMLHttpRequest, textStatus, errorThrown){
            alert('服务器忙，请不要说脏话，理论上大家都是文明人');
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
                	homework_list_name: 'java第6次',
                	homework_teacher : '刘小明',
                	homework_end_time : '2018/5/4',
                	homework_state : '未批改',
                	homework_score : '0'
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
                        if (item.homework_list_name.indexOf(v) > -1) {
                            if (self.searchlist.indexOf(item.homework_list_name) == -1) {
                                self.searchlist.push(item.homework_list_name);
                            }
                            ss.push(item);
                        } else if (item.homework_teacher.indexOf(v) > -1) {
                            if (self.searchlist.indexOf(item.homework_teacher) == -1) {
                                self.searchlist.push(item.homework_teacher);
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