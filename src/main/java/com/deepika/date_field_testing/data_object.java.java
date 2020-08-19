package com.deepika.date_field_testing;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class data_object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.Date start_date = new Date();
	private java.util.Date end_date = new Date();

	private java.lang.String attr_62;

	private int date_day;

	public data_object() {
	}

	public java.util.Date getStart_date() {
		return this.start_date;
	}

	public void setStart_date(java.util.Date start_date) {
	/*	SimpleDateFormat DateFor = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			this.start_date = DateFor.parse(start_date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
        this.start_date = start_date;
	}

	public java.util.Date getEnd_date() {

		return this.end_date;
	}

	public void setEnd_date(java.util.Date end_date) {
		/*SimpleDateFormat DateFor = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			this.end_date = DateFor.parse(end_date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		 this.end_date = end_date;

	}

	public java.lang.String getAttr_62() {
		return this.attr_62;
	}

	public void setAttr_62(java.lang.String attr_62) {
		this.attr_62 = attr_62;
	}

	public int dateDay(java.util.Date in_date) {
		Calendar c = Calendar.getInstance();
		c.setTime(in_date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

	public int getDate_day() {
		return this.date_day;
	}

	public void setDate_day(int date_day) {
		this.date_day = date_day;
	}

}