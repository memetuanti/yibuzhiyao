var pageSize = 20;

Ext.define('homework.store.HomeworkStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.homeworkStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'homework.model.HomeworkModel',
	proxy : {
		url : server_context + '/homework/.json',
		type : 'ajax',
		api : {
			read : server_context + '/homework/.json',
			update : server_context + '/homework/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});