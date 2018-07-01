var pageSize = 80;

Ext.define('group.store.GroupStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.groupStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'group.model.GroupModel',
	proxy : {
		url : server_context + '/group/.json',
		type : 'ajax',
		api : {
			read : server_context + '/group/.json',
			update : server_context + '/group/.json'
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
