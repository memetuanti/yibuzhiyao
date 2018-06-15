Ext.define('group.view.GroupEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.groupEdit',
	title : '编辑学生信息',
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
				name : 'g_snum',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'g_name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'g_cla',
				fieldLabel : '班级'
			}, {
				xtype : 'textfield',
				name : 'g_sex',
				fieldLabel : '性别'
			}, {
				xtype : 'textfield',
				name : 'g_age',
				fieldLabel : '年龄'
			}, {
				xtype : 'textfield',
				name : 'g_major',
				fieldLabel : '分组'
			} ]
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
