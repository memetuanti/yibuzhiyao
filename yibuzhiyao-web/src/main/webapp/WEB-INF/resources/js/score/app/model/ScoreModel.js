Ext.define('score.model.ScoreModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.scoreModel',
	fields : [ {
		name : 'num',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'DB',
		type : 'int',
		sortable : true		
	}, {
		name : 'javaee',
		type : 'int',
		sortable : true
	}, {
		name : 'math',
		type : 'int',
		sortable : true
	}, {
		name : 'age',
		type : 'int',
		sortable : true
	},/* {
		name : 'score',
		type : 'int',
		sortable : true
	},*/{
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