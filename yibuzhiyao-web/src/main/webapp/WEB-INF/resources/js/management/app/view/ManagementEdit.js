Ext.define('management.view.ManagementEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.managementEdit',
	title : '编辑学生成绩',
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
			}]
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
