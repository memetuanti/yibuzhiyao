var pageSize = 20;

var scoreStore = Ext.create('score.store.ScoreStore');

Ext.define('score.view.ScoreGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.scoreGrid',
	title : 'Java EE 一步之遥——软件工程学生成绩表',
	store : scoreStore,
	columns : [/* {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, */{
		text : "学号",
		width : 120,
		sortable : true,
		dataIndex : 'num'
	}, {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'name'
	}, {
		text : "班级",
		width : 80,
		sortable : true,
		dataIndex : 'clas'
	},{
		text : "数据库",
		width : 80,
		sortable : true,
		dataIndex : 'DB'
	}, {
		text : " javaee",
		width : 80,
		sortable : true,
		dataIndex : 'javaee'
	}, {
		text : "数学",
		width : 80,
		sortable : true,
		dataIndex : 'math'
	} , {
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
		store : scoreStore,
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
