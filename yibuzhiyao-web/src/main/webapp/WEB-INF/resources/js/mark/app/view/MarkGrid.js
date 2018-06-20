var pageSize = 20;

var markStore = Ext.create('mark.store.MarkStore');

markStore.load({
			callback : function(records, operation, successful) {
				if (successful) {
					console.log('department name:', records[0]);
				} else {
					console.log('the server reported an error');
				}
			}
		});
Ext.define('mark.view.MarkGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.markGrid',
	title : 'Java EE 一步之遥——软件工程学生考勤表',
	store : markStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
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
		dataIndex : 'myclass'
	},{
		text : "第一次",
		width : 80,
		sortable : true,
		dataIndex : 'attdent1'
	},{
		text : "第二次",
		width : 80,
		sortable : true,
		dataIndex : 'attdent2'
	},{
		text : "第三次",
		width : 80,
		sortable : true,
		dataIndex : 'attdent3'
	},{
		text : "第四次",
		width : 80,
		sortable : true,
		dataIndex : 'attdent4'
	}, {
		text : " 第五次",
		width : 80,
		sortable : true,
		dataIndex : 'attdent5'
	}, {
		text : "分数",
		width : 80,
		sortable : true,
		dataIndex : 'score'
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
		store : markStore,
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
