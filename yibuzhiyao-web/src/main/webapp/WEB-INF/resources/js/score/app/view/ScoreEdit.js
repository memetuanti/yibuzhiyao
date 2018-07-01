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
				name : 'first',
				fieldLabel : '第一次上机'
			}, {
				xtype : 'textfield',
				name : 'second',
				fieldLabel : '第二次上机'
			},{
				xtype : 'textfield',
				name : 'third',
				fieldLabel : '第三次上机'
			},{
				xtype : 'textfield',
				name : 'fourth',
				fieldLabel : '第四次上机'
			},{
				xtype : 'textfield',
				name : 'fifth',
				fieldLabel : '第五次上机'
			},{
				xtype : 'textfield',
				name : 'attendance',
				fieldLabel : '考勤成绩'
			},{
				xtype : 'textfield',
				name : 'j2design',
				fieldLabel : '课设成绩'
			},{
				xtype : 'textfield',
				name : 'total',
				fieldLabel : '总成绩'
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
