Ext.define('homework.model.HomeworkModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.homeworkModel',
	fields : [{
		name : 'num',
		type : 'String',
		sortable : true
	}, {
		name : 'homework_list_name',
		type : 'String',
		sortable : true
	}, {
		name : 'homework_teacher',
		type : 'String',
		sortable : true
	}, {
		name : 'homework_end_time',
		type : 'String',
//		type : 'Date',
//		dateFormat : 'time',
		sortable : true
	}, {
		name : 'homework_state',
		type : 'boolean',
		sortable : true
	},{
		name : 'homework_score',
		type : 'int',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}]
});