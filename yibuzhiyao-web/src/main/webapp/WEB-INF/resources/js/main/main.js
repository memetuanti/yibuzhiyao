Ext.require(['Ext.data.*','Ext.grid.*']);

Ext.define('main.MainModel',{
						extend:'Ext.data.Model'
});


var pageSize=20;
var store=new Ext.data.Store({
											autoLoad:true,
											autoSync:true,
											model:'main.MainModel',
											proxy : {
											type : 'rest',
											url : './.json',
											reader : {
												type : 'json',
												root : 'content',
												totalProperty : 'totalElements'
											},
											writer : {
												type : 'json'
											}
										},
										listeners : {
											write : function(store, operation) {
												var record = operation.getRecords()[0], name = Ext.String
														.capitalize(operation.action), verb;
												if (name == 'Destroy') {
													record = operation.records[0];
													verb = 'Destroyed';
												} else {
													verb = name + 'd';
												}
												Ext.example.msg(name, Ext.String.format("{0} main: {1}",
																verb, record.getId()));
											}
										}
});