package com.example.task.database;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.task.model.Model;
import java.util.ArrayList;

public class Task extends MyDatabase {

    public static final String TABLE_NAME = "task ";
    public static final String ROW_ID = "field1";
    public static final String ORDER_ID = "field2";
    public static final String ORDER_DATE = "field3";
    public static final String SHIP_DATE = "field4";
    public static final String SHIP_MODE = "field5";
    public static final String CUSTOMER_ID = "field6";
    public static final String CUSTOMER_NAME = "field7";
    public static final String SEGMENT = "field8";
    public static final String COUNTRY = "field9";
    public static final String CITY = "field10";
    public static final String STATE = "field11";
    public static final String POSTAL_CODE = "field12";
    public static final String REGION = "field13";
    public static final String PRODUCT_ID = "field14";
    public static final String CATEGORY = "field15";
    public static final String SUB_CATEGORY = "field16";
    public static final String PRODUCT_NAME = "field17";
    public static final String SALES = "field18";
    public static final String DIFF = "field19";


    public Task(Context context) {
        super(context);
    }
//  Method for get list from task Table.
    public ArrayList<Model> getList(){
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<Model> list = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        for (int i = 0; i < cursor.getCount() ; i++){
            Model model = new Model();
            model.setField1(cursor.getString(cursor.getColumnIndex(ROW_ID)));
            model.setField2(cursor.getString(cursor.getColumnIndex(ORDER_ID)));
            model.setField3(cursor.getString(cursor.getColumnIndex(ORDER_DATE)));
            model.setField4(cursor.getString(cursor.getColumnIndex(SHIP_DATE)));
            model.setField5(cursor.getString(cursor.getColumnIndex(SHIP_MODE)));
            model.setField5(cursor.getString(cursor.getColumnIndex(CUSTOMER_ID)));
            list.add(model);
            cursor.moveToNext();
        }
        cursor.close();
        db.close();
        return list;

    }

    public int DDfg(int id){
        SQLiteDatabase db  = getReadableDatabase();
        String query = "SELECT COUNT("+ROW_ID+") FROM " + TABLE_NAME + "WHERE " + DIFF + " = ?";
        Cursor cursor = db.rawQuery(query, new String[]{String.valueOf(id)});
        int result = cursor.getCount();
        cursor.close();
        db.close();
        return result;
    }

}
