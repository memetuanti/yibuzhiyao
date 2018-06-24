var pageSize=20;

Ext.define('main.store.GroupStore',{
					extend:'Ext.data.Store',
					alias:'widget,mainStore',
					autoLoad:true,
					autoSync:true,
					model:'main.model.GroupModel',
					proxy : {
					url : server_context + '/main/.json',
					type : 'ajax',
					api : {
						read : server_context + '/main/.json',
						update : server_context + '/main/.json'
					},
					reader : {
						type : 'json',
						root : 'content',
						totalProperty : 'totalElements'
					},
					writer : {
						type : 'json'
					}
				}
});