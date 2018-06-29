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
		name : 'first',
		type : 'int',
		sortable : true		
	}, {
		name : 'second',
		type : 'int',
		sortable : true
	}, {
		name : 'third',
		type : 'int',
		sortable : true
	}, {
		name : 'fourth',
		type : 'int',
		sortable : true
	},{
		name : 'fifth',
		type : 'int',
		sortable : true
	},{
		name : 'attendance',
		type : 'int',
		sortable : true
	},{
		name : 'j2design',
		type : 'int',
		sortable : true
	},{
		name : 'total',
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