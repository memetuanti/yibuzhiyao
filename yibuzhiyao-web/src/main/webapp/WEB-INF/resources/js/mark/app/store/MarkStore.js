var pageSize = 20;

Ext.define('mark.store.MarkStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.markStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'mark.model.MarkModel',
	proxy : {
		url : server_context + '/mark/.json',
		type : 'ajax',
		api : {
			read : server_context + '/mark/.json',
			update : server_context + '/mark/.json'
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