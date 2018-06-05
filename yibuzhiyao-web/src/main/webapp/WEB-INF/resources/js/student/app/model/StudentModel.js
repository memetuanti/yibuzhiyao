Ext.define('student.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.studentModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'num',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'clas',
		type : 'string',
		sortable : true
	}, {
		name : 'sex',
		type : 'string',
		sortable : true
	}, {
		name : 'age',
		type : 'int',
		sortable : true
	}, {
		name : 'score',
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
	} ]
});