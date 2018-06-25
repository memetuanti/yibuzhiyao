Ext.define('homework.view.HomeworkEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.homeworkEdit',
	title : '编辑作业',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'num',
				fieldLabel : '作业次数'
			}, {
				xtype : 'textfield',
				name : 'homework_list_name',
				fieldLabel : '作业名称'
			}, {
				xtype : 'textfield',
				name : 'homework_teacher',
				fieldLabel : '任课教师'
			}, {
				xtype : 'textfield',
				name : 'homework_end_time',
				fieldLabel : '截止时间'
			},{
				xtype : 'textfield',
				name : 'homework_state',
				fieldLabel : '批改状态'
			},
			{
				xtype : 'textfield',
				name : 'homework_score',
				fieldLabel : '作业分数'
			}
				/*{
					xtype : 'textfield',
					name : 'teskname',
					fieldLabel : '科目名称'
				}, {
					xtype : 'textfield',
					name : 'starttime',
					fieldLabel : '开始时间'
				}, {
					xtype : 'textfield',
					name : 'endtime',
					fieldLabel : '结束时间'
				}*/]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
