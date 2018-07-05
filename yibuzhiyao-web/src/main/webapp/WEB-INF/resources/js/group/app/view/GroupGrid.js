var pageSize = 80;

var groupStore = Ext.create('group.store.GroupStore');

Ext.define('group.view.GroupGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.groupGrid',
	title : 'Yibuzhiyao-学生分组列表',
	store : groupStore,
	columns : [{
		text : "学号",
		width : 120,
		sortable : true,
		dataIndex : 'g_snum'
	}, {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'g_name'
	},{
		text : "班级",
		width : 80,
		sortable : true,
		dataIndex : 'g_cla'
	}, {
		text : " 性别",
		width : 80,
		sortable : true,
		dataIndex : 'g_sex'
	}, {
		text : "年龄",
		width : 80,
		sortable : true,
		dataIndex : 'g_age'
	}, {
		text : "分组",
		width : 80,
		sortable : true,
		dataIndex : 'g_Major'
	}, {
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
		store : groupStore,
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

groupStore.load({
	callback : function(records, operation, successful) {
		if (successful) {
			console.log('department name:', records[0]);
		} else {
			console.log('the server reported an error');
		}
	}
});
