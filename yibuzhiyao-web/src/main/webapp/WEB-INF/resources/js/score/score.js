Ext.require(['Ext.data.*', 'Ext.grid.*']);

Ext.define('score.ScoreModel', {		//ziji
			extend : 'Ext.data.Model',
			fields : [{
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
					}, {
						name : 'fifth',
						type : 'int',
						sortable : true
					}, {
						name : 'attendance',
						type : 'int',
						sortable : true
					}, {
						name : 'j2design',
						type : 'int',
						sortable : true
					}, {
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
					}]
		});

var pageSize = 80;

var store = new Ext.data.Store({
			autoLoad : true,
			autoSync : true,// 需要同步
			model : 'score.ScoreModel',
			proxy : {
				type : 'rest',
				url : './.json',
				reader : {
					type : 'json',
					root : 'content',
					totalProperty : 'totalElements'
				},
				writer : {
					type : 'json'
				}
			},
			listeners : {
				write : function(store, operation) {
					var record = operation.getRecords()[0], name = Ext.String
							.capitalize(operation.action), verb;
					if (name == 'Destroy') {
						record = operation.records[0];
						verb = 'Destroyed';
					} else {
						verb = name + 'd';
					}
					Ext.example.msg(name, Ext.String.format("{0} score: {1}",
									verb, record.getId()));
				}
			},
			// 每页显示的记录行数
			pageSize : pageSize
		});

var textFieldEditor = {
	xtype : 'textfield',
	allowBlank : false,
	blankText : '该字段不能为空！',
	minLength : 4,
	minText : '至少需要输入{0}个字符！',
	maxLength : 20,
	maxText : '最多输入{0}个字符！'
}


var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
			listeners : {
				cancelEdit : function(rowEditing, context) {
					// Canceling editing of a locally added, unsaved record:
					// remove it
					if (context.record.phantom) {
						store.remove(context.record);
					}
				}
			}
		});

var scoreGrid = new Ext.grid.GridPanel({
			id : 'scoreGrid',
			plugins : [rowEditing],
			store : store,
			region : 'center',
			columnLines : true,
			loadMask : true,
			stripeRows : true,
			width : 600,
			title : '学生成绩列表',
			columns : [{
						text : "学号",
						width : 120,
						sortable : true,
						dataIndex : 'num',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					}, {
						text : "姓名",
						width : 80,
						sortable : true,
						dataIndex : 'name',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					}, {
						text : "第一次上机",
						width : 80,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'first'
					},{
						text : "第二次上机",
						width : 50,
						sortable : true,
						dataIndex : 'second',
						editor : genderFieldEditor
					}, {
						text : "第三次上机",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'third'
					}, {
						text : "第三次上机",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'third'
					},{
						text : "第四次上机",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'fourth'
					},{
						text : "第五次上机",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'fifth'
					},{
						text : "考勤成绩",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'attendance'
					},{
						text : "课设成绩",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'j2design'
					},{
						text : "总成绩",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'total'
					},{
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
					}],
			viewConfig : {
				columnsText : '列',
				sortAscText : '升序',
				sortDescText : '降序'
			},
			tbar : {
				xtype : 'toolbar',
				frame : true,
				border : false,
				padding : 2,
				bbar : new Ext.PagingToolbar({
							pageSize : pageSize,// 每页显示的记录值
							store : store,
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
			}
		});

scoreGrid.getSelectionModel().on('selectionchange',
		function(selModel, selections) {
			scoreGrid.down('#delete').setDisabled(selections.length === 0);
		});

new Ext.form.NumberField({
	fieldLabel : '整数',
	allowDecimals : false, // 不允许输入小数
	nanText : '请输入有效整数', // 无效数字提示
	allowNegative : false
		// 不允许输入负数
	});

var clearForm = function() {
	Ext.Msg.alert('重置', '重置查询表单！');
	scoreForm.getForm().reset();
}

var queryForm = function() {
	Ext.Msg.alert('查询', '将开始执行查询！');
}
var scoreForm = new Ext.form.FormPanel({
			title : '信息查询',
			width : 200,
			height : 200,
			frame : true,
			region : 'north',
			defaultType : 'textfiled',
			labelWidth : 30,
			items : [{
						fieldLabel : "学号",
						xtype : 'textfield',
						name : 'num'
					}, {
						fieldLabel : "姓名",
						xtype : 'textfield',
						name : 'name'
					}],
			buttons : [{
						xtype : 'button',
						text : '查询',
						handler : queryForm,
						scope : this
					}, {
						xtype : 'button',
						text : '重置',
						handler : clearForm,
						scope : this
					}]
		})

Ext.application({
			name : '学生成绩信息',
			launch : function() {
				Ext.create('Ext.container.Viewport', {
							layout : 'border',
							items : [scoreForm, scoreGrid]
						});
			}
		});
