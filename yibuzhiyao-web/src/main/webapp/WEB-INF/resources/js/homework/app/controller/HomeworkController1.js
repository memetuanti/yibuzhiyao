Ext.define('homework.controller.HomeworkController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.homeworkController',
	stores : [ 'HomeworkStore' ],
	models : [ 'HomeworkModel' ],
	views : [ 'HomeworGrid', 'HomeworkEdit' ],
	init : function() {
		this.control({
			'homeworkGrid' : {
				itemdblclick : this.editHomework
			},
			'homeworkEdit button[action=save]' : {
				click : this.updateHomework
			}
		});
	},
	editHomework : function(grid, record) {
		var view = Ext.widget('homeworkEdit');
		view.down('form').loadRecord(record);
	},
	updateHomework : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
