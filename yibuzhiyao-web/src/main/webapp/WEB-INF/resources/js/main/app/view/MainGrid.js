var pagrSize=20;

var mainStore=Ext.create('main.store.MainStore');

Ext.define('main.view.MainGrid',{	
				extend:'Ext.grid.GridPanel',
				alias:'widget.groupGrid',
				title:'学生考勤主页',
				store:mainStore
});