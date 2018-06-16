Ext.define('score.view.ScoreEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.scoreEdit',
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
				name : 'num',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'db',
				fieldLabel : '数据库'
			}, {
				xtype : 'textfield',
				name : 'javaee',
				fieldLabel : 'javaee'
			},{
				xtype : 'textfield',
				name : 'math',
				fieldLabel : '数学'
			}, ]
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
