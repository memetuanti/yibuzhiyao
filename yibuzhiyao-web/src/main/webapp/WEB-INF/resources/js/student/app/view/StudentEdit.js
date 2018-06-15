Ext.define('student.view.StudentEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.studentEdit',
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
				name : 'num',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'clas',
				fieldLabel : '班级'
			}, {
				xtype : 'textfield',
				name : 'sex',
				fieldLabel : '性别'
			},{
				xtype : 'textfield',
				name : 'age',
				fieldLabel : '年龄'
			}, {
				xtype : 'textfield',
				name : 'score',
				fieldLabel : '分数'
			},   ]
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
