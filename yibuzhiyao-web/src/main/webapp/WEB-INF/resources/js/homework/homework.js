Ext.require(['Ext.data.*', 'Ext.grid.*']);

Ext.define('homework.Homework', {		
			extend : 'Ext.data.Model',
			fields : [{
						name : 'num',
						type : 'String',
						sortable : true
					}, {
						name : 'homework_list_name',
						type : 'String',
						sortable : true
					}, {
						name : 'homework_teacher',
						type : 'String',
						sortable : true
					}, {
						name : 'homework_end_time',
						type : 'date',
						dateFormat : 'time',
						sortable : true
					}, {
						name : 'homework_state',
						type : 'boolean',
						sortable : true
					},{
						name : 'homework_score',
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

var pageSize = 20;

var store = new Ext.data.Store({
			autoLoad : true,
			autoSync : true,// 需要同步
			model : 'homework.HomeworkModel',
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
					Ext.example.msg(name, Ext.String.format("{0} homework: {1}",
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
var genderFieldEditor = {
		xtype : 'combo',
		triggerAction : 'all',
		forceSelection : true,
		displayField : 'label',
		valueField : 'id',
		mode : 'local',
		store : {
			xtype : 'jsonstore',
			fields : ['id', 'label'],
			data : [{
						id : '男',
						label : '男'
					}, {
						id : '女',
						label : '女'
					}]
		}
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

var homeworkGrid = new Ext.grid.GridPanel({
			id : 'HomeworkGrid',
			plugins : [rowEditing],
			store : store,
			region : 'center',
			columnLines : true,
			loadMask : true,
			stripeRows : true,
			width : 600,
			title : '学生作业表',
			columns : [/*{
						text : "学号",
						width : 120,
						sortable : true,
						dataIndex : 'num',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					}, {
						text : "作业名称",
						width : 80,
						sortable : true,
						dataIndex : 'homework_list_name',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					}, {
						text : "任课教师",
						width : 80,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'homework_teacher'
					},{
						text : "截止时间",
						width : 50,
						sortable : true,
						dataIndex : 'homework_end_time',
						editor : genderFieldEditor
					}, {
						text : "批改状态",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'homework_state'
					}, {
						text : "批改状态",
						width : 50,
						sortable : true,
						editor : textFieldEditor,
						dataIndex : 'homework_score'
					},*/{
						text : '科目名称',
						width : 50,
						sortable : true,
						dataIndex : 'teskname'
							editor : textFieldEditor,
							field : {
								xtype : 'textfield'
							}
					}, {
						text : "开始时间",
						width : 120,
						sortable : true,
						dataIndex : 'starttime',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					}, {
						text : "结束时间",
						width : 80,
						sortable : true,
						dataIndex : 'endtime',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
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
							homework : homework,
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

homeworkGrid.getSelectionModel().on('selectionchange',
		function(selModel, selections) {
			homeworkGrid.down('#delete').setDisabled(selections.length === 0);
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
	homeworkForm.getForm().reset();
}

var queryForm = function() {
	Ext.Msg.alert('查询', '将开始执行查询！');
}
var homeworkForm = new Ext.form.FormPanel({
			title : '信息查询',
			width : 200,
			height : 200,
			frame : true,
			region : 'north',
			defaultType : 'textfiled',
			labelWidth : 30,
			items : [/*{
						fieldLabel : "作业次数",
						xtype : 'textfield',
						name : 'num'
					}, {
						fieldLabel : "作业名称",
						xtype : 'textfield',
						name : 'homework_list_name'
					}*/{
						fieldLabel : "科目名称",
						xtype : 'textfield',
						name : 'teskname'
					}, {
						fieldLabel : "开始时间",
						xtype : 'textfield',
						name : 'starttime'
					}, {
						fieldLabel : "结束时间",
						xtype : 'textfield',
						name : 'endtime'
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
			name : '学生作业查询',
			launch : function() {
				Ext.create('Ext.container.Viewport', {
							layout : 'border',
							items : [homeworkForm, homeworkGrid]
						});
			}
		});
