var pageSize = 80;

var scoreStore = Ext.create('score.store.ScoreStore');

Ext.define('score.view.ScoreGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.scoreGrid',
	title : 'Java EE 一步之遥——软件工程学生成绩表',
	store : scoreStore,
	columns : [{
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
		text : "第一次上机",
		width : 80,
		sortable : true,
		dataIndex : 'first'
	}, {
		text : " 第二次上机",
		width : 80,
		sortable : true,
		dataIndex : 'second'
	}, {
		text : "第三次上机",
		width : 80,
		sortable : true,
		dataIndex : 'third'
	} ,{
		text : "第四次上机",
		width : 80,
		sortable : true,
		dataIndex : 'third'
	} ,{
		text : "第五次上机",
		width : 80,
		sortable : true,
		dataIndex : 'fifth'
	} ,{
		text : "考勤成绩",
		width : 80,
		sortable : true,
		dataIndex : 'attendance'
	} ,{
		text : "课设成绩",
		width : 80,
		sortable : true,
		dataIndex : 'j2design'
	} ,{
		text : "总成绩",
		width : 80,
		sortable : true,
		dataIndex : 'total'
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

scoreStore.load({
	callback : function(records, operation, successful) {
		if (successful) {
			console.log('department name:', records[0]);
		} else {
			console.log('the server reported an error');
		}
	}
});