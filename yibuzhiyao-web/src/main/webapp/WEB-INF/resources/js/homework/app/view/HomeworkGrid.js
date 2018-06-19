var pageSize = 20;

var homeworkStore = Ext.create('homework.store.HomeworkStore');

Ext.define('homework.view.HomeworkGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.homeworkGrid',
	title : 'Java EE 一步之遥——软件工程学生作业表',
	store : homeworkStore,
	columns : [{
		text : "作业次数",
		width : 120,
		sortable : true,
		dataIndex : 'num'
	}, {
		text : "作业名称",
		width : 80,
		sortable : true,
		dataIndex : 'homework_list_name'
	}, {
		text : "任课教师",
		width : 80,
		sortable : true,
		dataIndex : 'homework_teacher'
	}, {
		text : " 截止时间",
		width : 80,
		sortable : true,
		dataIndex : 'homework_end_time'
	}, {
		text : "批改状态",
		width : 80,
		sortable : true,
		dataIndex : 'homework_state'
	} , {
		text : "作业分数",
		width : 80,
		sortable : true,
		dataIndex : 'homework_score'
	} ,{
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : homeworkStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});

homeworkStore.load({
	callback : function(records, operation, successful) {
		if (successful) {
			console.log('department name:', records[0]);
		} else {
			console.log('the server reported an error');
		}
	}
});

