var pageSize = 80;

Ext.define('score.store.ScoreStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.scoreStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'score.model.ScoreModel',
	proxy : {
		url : server_context + '/score/.json',
		type : 'ajax',
		api : {
			read : server_context + '/score/.json',
			update : server_context + '/score/.json'
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