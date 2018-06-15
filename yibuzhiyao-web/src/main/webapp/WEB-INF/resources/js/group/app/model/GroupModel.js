Ext.define('group.model.GroupModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.groupModel',
	fields : [ {
		name : 'g_snum',
		type : 'string',
		sortable : true
	}, {
		name : 'g_name',
		type : 'string',
		sortable : true
	}, {
		name : 'g_cla',
		type : 'string',
		sortable : true
	},{
		name : 'g_sex',
		type : 'string',
		sortable : true
	}, {
		name : 'g_age',
		type : 'int',
		sortable : true
	}, {
		name : 'g_Major',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});
