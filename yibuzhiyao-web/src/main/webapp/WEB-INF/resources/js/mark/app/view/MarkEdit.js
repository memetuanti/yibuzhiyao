Ext.define('mark.view.MarkEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.markEdit',
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
				name : 'attdent1',
				fieldLabel : '第一次'
			}, {
				xtype : 'textfield',
				name : 'attdent2',
				fieldLabel : '第二次'
			}, {
				xtype : 'textfield',
				name : 'attdent3',
				fieldLabel : '第三次'
			}, {
				xtype : 'textfield',
				name : 'attdent4',
				fieldLabel : '第四次'
			},{
				xtype : 'textfield',
				name : 'attdent5',
				fieldLabel : '第五次'
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
