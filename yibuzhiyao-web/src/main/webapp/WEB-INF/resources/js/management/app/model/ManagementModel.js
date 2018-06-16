Ext.define('management.model.ManagementModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.ManagementModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'taskname',
		type : 'string',
		sortable : true
	}, {
		name : 'starttime',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'endtime',
		type : 'date',
		dateFormat : 'time',
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