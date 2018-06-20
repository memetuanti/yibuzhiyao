Ext.define('mark.model.MarkModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.markModel',
	fields : [{
			name : 'num',
			type : 'string',
			sortable : true
		}, {
			name : 'name',
			type : 'string',
			sortable : true
		}, {
			name : 'myclass',
			type : 'string',
			sortable : true
		}, {
			name : 'attdent1',
			type : 'string',
			sortable : true
		}, {
			name : 'attdent2',
			type : 'string',
			sortable : true
		},{
			name : 'attdent3',
			type : 'string',
			sortable : true
		},{
			name : 'attdent4',
			type : 'string',
			sortable : true
		},{
			name : 'attdent5',
			type : 'string',
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
