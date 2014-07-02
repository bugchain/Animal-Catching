package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainDataBase extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "animal.db";
	private static final int DATABASE_VERSION = 1;

	public static final String AnimalTableColAid = "aid";
	public static final String AnimalTableName = "Animal";
	public static final String AnimalTableColAnameth = "anameth";
	public static final String AnimalTableColAnameen = "anameen";
	public static final String AnimalTableColAnamesci = "anamesci";
	public static final String AnimalTableColAdetail = "adeatil";
	public static final String AnimalTableColimage = "aimage";
	public static final String AnimalTableColAlattitude = "alat";
	public static final String AnimalTableColAlongtitude = "alng";
	public static final String AnimalTableColAicon = "aicon";
	public static final String AnimalTableColAcatched = "acatch";
	public static final String AnimalTableColAtime = "atime";
	public static final String AnimalTableColAbase = "abase";
	public static final String AnimalTableColAtype = "atype";
	public static final String AnimalTableColApalceBg = "place_bg";

	public MainDataBase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub

		db.execSQL("CREATE TABLE " + AnimalTableName + " (" + AnimalTableColAid
				+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ AnimalTableColAnameth + " TEXT, " + AnimalTableColAnameen
				+ " TEXT, " + AnimalTableColAnamesci + " TEXT, "
				+ AnimalTableColAdetail + " TEXT, " + AnimalTableColimage
				+ " TEXT, " + AnimalTableColAlattitude + " DOUBLE,"
				+ AnimalTableColAlongtitude + " DOUBLE," + AnimalTableColAicon
				+ " TEXT, " + AnimalTableColAtime +  " TEXT, "
				+ AnimalTableColAcatched + " BOOLEAN DEFAULT FALSE, "
				+ AnimalTableColAbase +" TEXT, "
				+ AnimalTableColAtype + " TEXT,"
				+ AnimalTableColApalceBg + " TEXT);");

		insertData(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

	public long insertAnimalData(String nameEn, String nameTh, String nameSci,
			String detail, double lat, double lng, String imgName, String icon,
			String time) {

		SQLiteDatabase db;
		db = this.getWritableDatabase();

		ContentValues cv = new ContentValues();
		cv.put(AnimalTableColAnameen, nameEn);
		cv.put(AnimalTableColAnameth, nameTh);
		cv.put(AnimalTableColAnamesci, nameSci);
		cv.put(AnimalTableColAdetail, detail);
		cv.put(AnimalTableColAlattitude, lat);
		cv.put(AnimalTableColAlongtitude, lng);
		cv.put(AnimalTableColimage, imgName);
		cv.put(AnimalTableColAicon, icon);
		cv.put(AnimalTableColAtime, time);

		long rows = db.insert(AnimalTableName, null, cv);
		db.close();
		return rows;
	}

	public void insertData(SQLiteDatabase db) {

		/* Kang Kra Jan National Park เก่งกระจาน */
		db.execSQL("INSERT INTO " + AnimalTableName + "("
				+ AnimalTableColAnameen + "," + AnimalTableColAnameth + ","
				+ AnimalTableColAnamesci + "," + AnimalTableColAdetail + ","
				+ AnimalTableColAlattitude + "," + AnimalTableColAlongtitude
				+ "," + AnimalTableColimage + "," + AnimalTableColAicon + ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase +"," + AnimalTableColAtype +","+ AnimalTableColApalceBg+") VALUES (" + "'Freshwater',"
				+ "'จระเข้น้ำจืด'," + "'Crocodylus siamensis',"
				+ "'มีขนาดปานกลาง ค่อนมาทางใหญ่ (3 - 4 เมตร) มีเกล็ดท้ายทอด ',"
				+ 6.009895 + "," + 101.382258
				+ ",'freshwater_bg','freshwater_icon','day','เก่งกระจาน','1010111','kang_kra_jan');");// 6.009895,
																				// 101.382258

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase
				+ "," + AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Leopard cat','แมวดาว','Prionailurus bengalensis','เป็นสัตว์เลี้ยงลูกด้วยนม มีขนาดเล็กใกล้เคียงแมวบ้าน แต่ขายาวกว่าเล็กน้อย มีลายจุดทั่วทั้งตัว แมวดาวตัวผู้ใหญ่กว่าตัวเมีย ว่ายน้ำและปีนต้นไม้ได้คล่องแคล่ว ออกหากินในเวลากลางคืน อาหารหลักของแมวดาวคือสัตว์เลี้ยงลูกด้วยน้ำนมขนาดเล็ก',"
				+ 6.143392 + "," + 101.804428
				+ ",'leopard_cat_bg','leopard_cat_icon','day','เก่งกระจาน','1100001','kang_kra_jan');");// 6.143392,
				//																// 101.804428

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Malayan porcupine','เม่นใหญ่แผงคอยาว','Hystrix brachyura','เป็นเม่นขนาดใหญ่ ขนตามลำตัวสีดำหรือสีน้ำตาลเข้มเกือบดำ มีขนแข็งแหลมและยาวมากบนหลังและสะโพก มีฟันหน้าที่ใหญ่ยาวและแข็งแรงมาก  หลับนอนในโพรงที่ขุดขึ้นมาเอง บริเวณปากโพรงจะปกคลุมด้วยพืชรกชัฏเพื่ออำพราง  ออกหากินในเวลากลางคืน  กินอาหารจำพวกรากพืช หน่อไม้ เปลือกไม้ ผลไม้สุกที่ร่วงจากต้น กระดูกสัตว์รวมทั้งเขาสัตว์ด้วย',"
				+ 12.753522
				+ ","
				+ 99.441306
				+ ",'malayan_porcupine_bg','malayan_porcupine_icon','night','เก่งกระจาน','1100000','kang_kra_jan');");// 6.582628,
																								// 99.664568

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Wild pig','หมูป่า','Sus scrofa','เป็นสัตว์จัดอยู่ในไฟลัมสัตว์มีแกนสันหลัง สัตว์เลี้ยงลูกด้วยนมในอันดับสัตว์กีบคู่  เป็นต้นสายพันธุ์ของหมูบ้านในปัจจุบัน มีรูปร่างหน้าตาคล้ายหมูบ้าน แต่มีขนตามลำตัวยาวกว่า ลำตัวมีสีเทาดำ บางตัวอาจมีสีน้ำตาลเข้ม ขนบริเวณหัวชี้ยาวออกไปทางด้านหลัง  ตัวเมียมีเต้านม 5 คู่ ลูกที่เกิดใหม่มีสีน้ำตาลเข้มค่อนไปทางดำและมีแถบสีดำพาดผ่านตามยาวลำตัว ดูคล้ายลายของแตงไทย มีขนาดความยาวลำตัวและหัว 135-150 เซนติเมตร  มีน้ำหนักประมาณ 75-200 กิโลกรัม  ตัวผู้จะมีน้ำหนักหนักกว่าตัวเมีย สามารถวิ่งได้เร็ว 30 ไมล์//ชั่วโมง ตัวเมียสามารถมีลูกได้ครอกละ 10-11 ตัว ปีละ 2 ครอก',"
				+ 13.025275 + "," + 99.526450
				+ ",'wild_pig_bg','wild_pig_icon','night','เก่งกระจาน','0001100','kang_kra_jan');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Sambar deer','กวางป่า','Rusa unicolor','เป็นกวางที่มีขนาดใหญ่ที่สุดที่พบได้ในภูมิภาคเอเชียตะวันออกเฉียงใต้  มีความยาวลำตัวและหัว 180-200 เซนติเมตร หนักได้ถึง 185-220 กิโลกรัม  เพศผู้จะมีขนาดใหญ่กว่าเพศเมีย มีขนสั้นหยาบสีน้ำตาลแกมเหลือง บางตัวน้ำตาลแกมแดง  พบตามป่าดงดิบชอบหากินตามทุ่งโล่ง ชายป่า ในตอนเช้าตรู่และพลบค่ำ กลางวันจะหลับนอนตามพุ่มไม้ใกล้ชายป่า  กินพืช ทั้งใบ ยอด และต้องการดินโป่ง ในธรรมชาติชอบอยู่ตัวเดียวหรืออยู่เป็นกลุ่มเล็กๆ พร้อมลูก ๆ ฤดูผสมพันธุ์ส่วนใหญ่เป็นฤดูหนาว',"
				+ 12.796379 + "," + 99.433066
				+ ",'sambar_deer_bg','sambar_deer_icon','day','เก่งกระจาน','1100001','kang_kra_jan');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Gaur,Indian bison','กระทิง','Bos gaurus','มีขนยาว ตัวสีดำหรือดำแกมน้ำตาล  เว้นแต่ที่ตรงหน้าผากและครึ่งล่างของขาทั้ง 4 เป็นสีขาวเทา ๆ หรือเหลืองอย่างสีทอง เรีบกว่า หน้าโพ ขาทั้ง 4 ข้างตั้งแต่เหนือเข่าลงไปถึงกีบเท้ามีสีขาวเทาหรือเหลืองทอง ทำให้มองดูเหมือนสวมถุงเท้า  กระทิงตัวผู้มีขนาดใหญ่กว่าตัวเมีย  ลูกที่เกิดขึ้นจะมีสีน้ำตาลแกมแดงเหมือนสีขนของเก้ง มีเส้นสีดำพาดกลางหลัง ลูกกระทิงขนาดเล็กจะยังไม่มีถุงเท้าเหมือนกระทิงตัวโต มีความยาวลำตัวและหัว 250 - 300 เซนติเมตร น้ำหนัก 650 - 900 กิโลกรัม และมีที่อุทยานแห่งชาติเขาใหญ่',"
				+ 13.065411 + "," + 99.199607
				+ ",'bos_gaurus_bg','bos_gaurus_icon','day','เก่งกระจาน','1100001','kang_kra_jan');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Malayan tapir, Asian tapir','สมเสร็จมลายู','Tapirus indicus','เป็นสัตว์ป่าสงวนตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 สมเสร็จมลายูเป็นสัตว์เลี้ยงลูกด้วยนมในอันดับสัตว์กีบคี่ นับเป็นสมเสร็จชนิดที่มีขนาดใหญ่ที่สุดและเป็นชนิดเดียวที่พบในทวีปเอเชีย มีจมูกที่ยื่นยาวออกมาคล้ายงวงของช้าง รูปร่างหน้าตาคล้ายหมูที่มีขายาว หางสั้นคล้ายหมีและมีกีบเท้าคล้ายแรด ตัวผู้จะมีขนาดเล็กกว่าตัวเมีย โตเต็มที่ความยาวลำตัวและหัว 220-240 เซนติเมตร มีน้ำหนัก 250-300 กิโลกรัม อาศัยและหากินอยู่ตามลำพัง ชอบแช่น้ำ เมื่อหลบภัยก็จะหลบไปหนีแช่ในน้ำจนกว่าแน่ใจว่าปลอดภัยแล้วจึงขึ้นมา รวมทั้งผสมพันธุ์ในน้ำด้วย มีความสามารถว่ายน้ำได้เก่ง อาหารของสมเสร็จได้แก่ ยอดไม้อ่อน, ยอดหวาย, หน่อไม้ ออกหากินในเวลากลางคืน สายตาไม่ดีนัก แต่มีระบบประสาทดมกลิ่นและฟังเสียงที่ดีมาก ใช้จมูกที่ยาวเหมือนงวงช้างช่วยในการดมกลิ่นหาอาหาร',"
				+ 12.698600
				+ ","
				+ 99.423453
				+ ",'malayan_tapir_bg','malayan_tapir_icon','night','เก่งกระจาน','1100001','kang_kra_jan');");
//
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian wild dog, Asian red dog','หมาใน','Cuon alpinus','เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535 เป็นสัตว์เลี้ยงลูกด้วยนมชนิดหนึ่ง เป็นหมาป่าที่มีขนาดใหญ่กว่าหมาจิ้งจอก  จมูกสั้น ใบหูกลมมีขนาดใหญ่ ขนตามลำตัวค่อนข้างสั้นมีสีน้ำตาลแดง หางยาวเป็นพวง ปลายหางมีสีเทาเข้มหรือดำ  มักอาศัยอยู่รวมกันเป็นฝูงใหญ่ออกล่าเหยื่อในเวลากลางวัน แต่ในบางครั้งอาจล่าในเวลากลางคืนหรือพลบค่ำหรือเช้าตรู่ได้  อาหาร คือ สัตว์กินพืชขนาดใหญ่ เช่น กวางป่า, เก้ง และกระต่ายป่า',"
				+ 12.918216
				+ ","
				+ 99.239432
				+ ",'asian_wild_dog_bg','asian_wild_dog_icon','night','เก่งกระจาน','1100000','kang_kra_jan');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+  AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asiatic black bear','หมีควาย','Ursus thibetanus','หมีควายมีลำตัวอ้วนใหญ่ หัวมีขนาดใหญ่ ตาเล็กและหูกลม ขาอ้วนล่ำและหนา หางสั้น มีนิ้วเท้ายาวทั้งหมดห้านิ้ว กรงเล็บสั้น ขนตามลำตัวหยาบมีสีดำ  ลักษณะเด่นคือ ขนบริเวณหน้าอกเป็นรูปตัว V มีสีขาว ตัวผู้มีขนาดใหญ่กว่าตัวเมียเล็กน้อย ขนาดเมื่อโตเต็มที่ ความยาวลำตัวและหัว 120-150 เซนติเมตร น้ำหนักอาจหนักได้ถึง 200กิโลกรัม อาหาร คือ เนื้อสัตว์, ผลไม้, ใบไม้, หน่อไม้, ซากสัตว์, แมลง, รังผึ้ง และตัวอ่อนของผึ้ง ออกหากินในเวลากลางคืน ปีนต้นไม้ไม่เก่ง  ตามปกติมักอาศัยและหากินตามลำพัง',"
				+ 13.013233
				+ ","
				+ 99.320456
				+ ",'asiatic_black_bear_bg','asiatic_black_bear_icon','night','เก่งกระจาน','1100001','kang_kra_jan');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Woodpecke','นกหัวขวาน','Picidae','เป็นนกที่มีสามารถไต่ขึ้นลงตามต้นไม้ได้ดีเป็นแนวตั้ง ด้วยขาที่สั้น และเล็บที่แหลมคม นกหัวขวานเป็นนกประเภทอยู่รู หรืออยู่อาศัยตามโพรงไม้ จุดเด่นของนกหัวขวานก็คือ สามารถใช้จะงอยปากที่แหลมยาวและแข็งแรงเหมือนลิ่ม เจาะลำต้นของต้นไม้ใหญ่ประเภทไม้ยืนต้นจนเป็นรูหรือเป็นโพรงได้เป็นอย่างดี  ได้รับฉายาว่า หมอรักษาต้นไม้',"
				+ 12.760219 + "," + 99.507224
				+ ",'woodpecke_bg','woodpecke_icon','day','เก่งกระจาน','1100000','kang_kra_jan');");

		/* Kao Yai National Park เขาใหญ่ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Indian elephant','ช้างอินเดีย','Elephas maximus indicus','เป็นสัตว์เลี้ยงลูกด้วยนมขนาดใหญ่ มีความสูงประมาณ 2-4 เมตร (จากเท้าถึงหัวไหล่) มีน้ำหนักประมาณ 3,000-5,000 กิโลกรัม ช้างตัวเมียที่มีอายุมากที่สุดเป็น จ่าฝูง เรียกว่า  แม่แปรก ตัวเมียจะไม่มีงา ช้างตัวผู้หากมีงาสั้น ๆ จะเรียกว่า ช้างสีด อาศัยอยู่ในป่าโปร่ง หรือทุ่งหญ้า',"
				+ 14.292337
				+ ","
				+ 101.658493
				+ ",'indian_elephant_bg','indian_elephant_icon','day','เขาใหญ่ ','1100001','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Tiger','เสือโคร่ง','Panthera tigris','เป็นสัตว์เลี้ยงลูกด้วยน้ำนม เป็นเสือชนิดที่ใหญ่ที่สุดด้วยความยาวโดยเฉลี่ยจากหัวไปจนถึงโคนหาง 1.4-2.8 เมตร น้ำหนักตัว 130-260 กิโลกรัม มีขนลำตัวสีน้ำตาลเหลืองหรือเหลืองอมส้ม มีลายสีดำ พาดขวางตลอดทั้งลำตัวเป็นจุดเด่น ซึ่งลายเส้นนี้เป็นเอกลักษณ์เฉพาะตัว ยชอบอยู่เพียงลำพังตัวเดียวโดด ๆ นิสัยปกติจะหวงถิ่น โดยการหันก้นปัสสาวะรดตามต้นไม้ โขดหิน เพื่อประกาศอาณาเขต',"
				+ 14.294998 + "," + 101.777969
				+ ",'tiger_bg','tiger_icon','day','เขาใหญ่ ','1100001','kao_yai');");
//
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Barking deer','เก้ง','Muntiacinae','เป็นกวางขนาดกลางและเล็ก กระจายพันธุ์อยู่ตั้งแต่ทวีปอินเดีย, ประเทศจีนทางตอนใต้ไปจนถึงภูมิภาคอินโดจีน และเกาะต่าง ๆ ในฟิลิปปินส์และอินโดนีเซีย มีรูปร่างโดยรวมคือ มีขนตามลำตัวสีน้ำตาล อาจมีสีอื่นผสมแตกต่างกันออกไปตามแต่ละชนิด ใต้ตามีต่อมน้ำตาเห็นได้ชัดเจน เป็นเส้นสีดำเป็นร่องยาว เก้งเป็นกวางที่หากินในสภาพภูมิประเทศได้หลากหลาย ทั้ง ป่าดิบ, ทุ่งหญ้า และพื้นที่ที่เป็นป่าเสื่อมโทรมหรือถูกแผ้วถาง',"
				+ 14.281066 + "," + 101.579518
				+ ",'barking_deer_bg','barking_deer_icon','day','เขาใหญ่ ','1100001','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Mouse deer','กระจงหนู','Tragulidae','เป็นกระจงชนิดหนึ่งที่พบได้ในประเทศไทย เป็นกระจงชนิดที่มีขนาดเล็กที่สุดในโลก กระจงถือเป็นสัตว์เคี้ยวเอื้อง มีรูปร่างลักษณะทั่วไปคล้ายกับกวาง (Cervidae) พบกระจายพันธุ์ในทวีปแอฟริกาและเอเชีย ในอนุทวีปอินเดีย และเอเชียอาคเนย์',"
				+ 14.223832 + "," + 101.547932
				+ ",'mouse_deer_bg','mouse_deer_icon','day','เขาใหญ่ ','1100000','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Cobra','งูเห่า','Naja','เป็นงูพิษขนาดกลาง เป็นงูที่มีพิษร้ายแรง มีนิสัยดุร้ายเช่นเดียวกับงูจงอางแผ่นหนังที่อยู่หลังบริเวณคอออกเป็นแผ่นด้านข้างเรียกว่า แม่เบี้ย หรือ พังพาน มีพิษมีฤทธิ์ทำลายระบบประสาทที่รุนแรง และเป็นสาเหตุที่ทำให้ผู้ที่ถูกกัดเสียชีวิต ขนาดเมื่อโตเต็มที่ประมาณ 1 เมตร  พบกระจายพันธุ์ไปทั่วในเขตร้อนและเขตอบอุ่นของทวีปเอเชียและแอฟริกา สามารถปรับตัวให้เข้ากับสภาพแวดล้อมต่าง ๆ  ได้เป็นอย่างดี ทั้งทะเลทราย ป่าดิบ ทั้งบนพื้นที่ราบ',"
				+ 14.253117 + "," + 101.620717
				+ ",'cobra_bg','cobra_icon','day','เขาใหญ่ ','0010111','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Water monitor','ตัวเงินตัวทอง','aranus salvator','เป็นสัตว์เลื้อยคลานขนาดใหญ่ชนิดหนึ่ง ตัวอ้วนใหญ่สีดำ มีลายดอกสีเหลืองพาดขวาง หางยาว อาศัยบริเวณใกล้น้ำ มีรูปร่างคล้ายกิ้งก่าขนาดใหญ่ ความยาว 2.5-3 เมตร  มีลิ้นแยกเป็นสองแฉกคล้ายงู ใช้สำหรับรับกลิ่น มีลายดอกสีเหลืองพาดขวางทางยาว ชอบอาศัยอยู่บริเวณใกล้แหล่งน้ำ ว่ายน้ำเก่งและ ดำน้ำนาน   ชอบหากินของเน่าเปื่อย เศษซากอาหาร บางครั้งก็จะกินสัตว์เป็นๆ เช่นไก่, เป็ด, ปู, หอย, งู, หนู, นก และไข่ของสัตว์ต่าง ๆ  รวมทั้งปลา',"
				+ 14.468638 + "," + 101.427083
				+ ",'water_monitor_bg','water_monitor_icon','day','เขาใหญ่ ','000000','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'King Cobra','งูจงอาง ','Ophiophagus','เป็นงูพิษขนาดใหญ่ โดยทั่วไปมีความยาวเฉลี่ยประมาณ 2.5 - 4 เมตร จัดเป็นงูพิษที่มีขนาดยาวที่สุดในโลก ซึ่งตัวที่ยาวเป็นสถิติโลกมีความยาวถึง 5.59 เมตร เป็นงูจงอางไทย สามารถแผ่แม่เบี้ยได้เช่นเดียวกับงูเห่า ลำตัวเรียวยาว  ว่ายน้ำเก่งมีพิษร้ายแรงแต่ไม่เท่างูเห่า งูจงอางมีนิสัยค่อนข้างดุร้าย อาหารของงูจงอางคืองูอื่น ๆ ที่มีขนาดเล็กกว่า กบหรือตะกวดและสัตว์เลี้ยงลูกด้วยนมขนาดเล็กเช่นหนู เป็นต้น พบในประเทศไทย ประเทศอินเดีย ประเทศพม่าประเทศอินโดนีเซีย และประเทศมาเลเซีย สำหรับประเทศไทยมีมากในป่าจังหวัดนครสวรรค์ เพชรบูรณ์ และนครราชสีมา และในป่าทุกภาค แต่ชุกชุมทางภาคใต้มากที่สุด',"
				+ 14.241137 + "," + 101.778645
				+ ",'king_cobra_bg','king_cobra_icon','day','เขาใหญ่ ','0010111','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Banded krait','งูสามเหลี่ยม','ungarus fasciatus','พบในอินเดีย, บังคลาเทศ, เอเชียตะวันออกเฉียงใต้ ไปจนถึงเอเชียตะวันออก มีหัวกลม ลำตัวเรียวยาว ปลายหางมักทู่ บางตัวหัวแบนเล็กน้อย ลำตัวเป็นสันสามเหลี่ยมชัดเจน อันเป็นเลื้อยช้าแต่ว่ายน้ำได้เร็ว เป็นงูที่มีความว่องไวปราดเปรียวในน้ำ สีของลำตัวเป็นปล้องดำสลับเหลืองทั้งตัว กินอาหาร จำพวก หนู, กบ, เขียด หรือปลา รวมถึงงูด้วยกันขนาดเล็กด้วย หากินในเวลากลางคืน มักขดนอนตามโคนกอไม้ไผ่, ป่าละเมาะ, พงหญ้าริมน้ำ เป็นงูที่ไม่ดุ ไม่ฉกกัด นอกจากจะมีคนเดินไปเหยียบหรือเดินผ่านขณะที่งูสามเหลี่ยมกำลังไล่กัดงูซึ่งเป็นอาหารก่อน ตอนกลางวันจะซึมเซา แต่ตอนกลางคืนจะว่องไว ',"
				+ 14.253117 + "," + 101.560292
				+ ",'banded_krait_bg','banded_krait_icon','day','เขาใหญ่ ','0000000','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+  AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Hornbill','นกเงือก ','Bucerotidae','นกเงือก เป็นนกป่าขนาดใหญ่  จุดเด่น คือ จะงอยปากหนาที่ใหญ่และมีโหนกทางด้านบนเป็นโพรง ภายในโพรงมีเนื้อเยื่อคล้ายฟองน้ำส่วนใหญ่ลำตัวมีสีขาวดำหางยาว ปีกกว้างใหญ่ บินได้แข็งแรง  กินผลไม้เป็นอาหารหลัก และสัตว์เลื้อยคลานเล็ก ๆ เป็นอาหารเสริม มีการแพร่กระจายอยู่ในแถบเขตร้อน ของทวีปแอฟริกา และเอเชีย นกเงือกเป็นนกผัวเดียวเมียเดียว นกเงือก เป็นดัชนีชี้วัดความอุดมสมบูรณ์ของธรรมชาติได้ประการหนึ่ง เนื่องจากจะอาศัยอยู่ในป่าหรือพื้นที่ที่มี ความอุดมสมบูรณ์เท่านั้น',"
				+ 14.297036 + "," + 101.606984
				+ ",'hornbill_bg','hornbill_icon','day','เขาใหญ่ ','1100001','kao_yai');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Pileated gibbon','ชะนีมงกุฎ','ylobates pileatus','มักอาศัยอยู่ในป่าดิบที่มียอดไม้สูงและรกชัน อาหารหลัก คือ ผลไม้, ใบไม้, แมลงและสัตว์เลื้อยคลาน ดื่มน้ำโดยใช้วิธีการเลียตามขนตัวเองและหาตามโพรงไม้  ชะนีมงกุฎในอุทยานแห่งชาติเขาใหญ่ มีการผสมข้ามพันธุ์กับชะนีมือขาว จนเกิดเป็นชะนีลูกผสมซึ่งมีลักษณะรูปร่างที่แตกต่างออกไป รวมถึงเสียงร้องด้วย  อันเนื่องจากอุทยานแห่งชาติเขาใหญ่นับเป็นสถานที่แห่งเดียวในโลก ที่มีชะนีทั้ง 2 ชนิดนี้อาศัยอยู่ในพื้นที่เดียวกัน',"
				+ 14.442042
				+ ","
				+ 101.407856
				+ ",'pileated_gibbon_bg','pileated_gibbon_icon','day','เขาใหญ่ ','1100001','kao_yai');");

		/* Inthanon National Park ดอยอินทนนท์ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian palm civet','อีเห็นข้างลาย','Paradoxurus hermaphroditus','เป็นอีเห็นขนาดเล็ก มี สีขนตามลำตัวเป็นสีเทาเข้มจนเกือบดำ  ยกเว้นบริเวณรอบจมูก หู ขา และปลายหางมีสีดำมีลายสีขาวพาดขวางบริเวณหน้าผาก หลังมีจุดเล็ก ๆ สีดำเรียงตัวเป็นแนวยาว 3 เส้น  มีความยาวลำตัวและหัว 43-71 เซนติเมตร น้ำหนัก 2-5 กิโลกรัมมีพฤติกรรมมักอาศัยและหากินตามลำพัง  ปรับตัวให้อยู่ในสภาพแวดล้อมที่หลากหลายได้ ตั้งแต่ ป่าดิบชื้น, ป่าดิบแล้ง ไปจนถึงชายป่าที่ใกล้กับพื้นที่เกษตรกรรมของมนุษย์ กินอาหารได้ทั้งพืชและสัตว์ เช่น สัตว์ขนาดเล็กจำพวกแมลง และน้ำหวานของเกสรดอกไม้ ออกหากินในเวลากลางคืน นอนหลับในเวลากลางวัน ใช้เวลาส่วนมากตามพื้นดินและจะใช้เวลาน้อยมากอยู่บนต้นไม้ ออกลูกครั้งละ 2-4 ตัว โดยจะเลี้ยงลูกอ่อนไว้ตามโพรงไม้หรือโพรงหิน',"
				+ 18.449203
				+ ","
				+ 98.618800
				+ ",'asian_palm_civet_bg','asian_palm_civet_icon','day','ดอยอินทนนท์','0000000','inthanon');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Large-spotted civet','ชะมดแผงสันหางดำ','Viverra megaspila','จัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวน และคุ้มครองสัตว์ป่าแห่งประเทศไทย พุทธศักราช 2535 หางของชะมดแผงสันหางดำจะมีลายขวางสีดำบริเวณด้านบนของหางลากยาวมาจากโคนหางถึงปลายหาง ทำให้ปล้องหางไม่แยกขาดจากกันเหมือนชะมดแผงหางปล้อง ปลายหางมีสีดำและมีลายจุดสีดำกระจายไปทั่วตัว มีความยาวลำตัวและส่วนหัว 72-85 เซนติเมตร  น้ำหนักประมาณ 8-9 กิโลกรัมมีการกระจายพันธุ์อยู่ทั่วไปในภูมิภาคเอเชียตะวันออกเฉียงใต้ สามารถอาศัยอยู่ได้ในป่าหลากหลายประเภท ทั้งป่าสมบูรณ์  และตามสวนเกษตรกรรมต่าง ๆ แต่ส่วนมากมักพบเห็นตามพื้นที่ที่มีความสูงตั้งแต่ 80-200 เมตร จากระดับน้ำทะเลโดยปกติแล้วมักอาศัยและหากินตามลำพัง',"
				+ 18.505862
				+ ","
				+ 98.628413
				+ ",'large_spotted_civet_bg','large_spotted_civet_icon','day','ดอยอินทนนท์','0010000','inthanon');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Himalayan newt','กะท่าง','Tylototriton verrucosus','เป็นสิ่งมีชีวิตที่จัดอยู่ในไฟลัมสัตว์มีแกนสันหลังชั้นสัตว์สะเทินน้ำสะเทินบก เป็นสัตว์จำพวกนิวต์ หรือ ซาลาแมนเดอร์ขนาดเล็กที่อาศัยอยู่ได้ทั้งบนบกและในน้ำ เป็นเพียงชนิดเดียวที่พบได้ในประเทศไทย มีรูปร่างสีน้ำตาลคล้ำ มีแต้มสีส้มเหลืองบนส่วนปากและปุ่มบนแผ่นหลังและหางสีส้ม ด้านใต้ท้องสีออกส้มจนถึงสีน้ำตาลเหลือง นิ้วเท้าหน้ามี 4 นิ้ว นิ้วเท้าหลังมี 5 นิ้ว มีลักษณะพิเศษคือ เมื่อขาหรือหางขาดไป สามารถงอกใหม่ได้ อาศัยในลำธารตามเชิงเขา มีอาณาบริเวณแคบ ๆ มีต้นไม้ใหญ่ เช่น ยาง, ไทร, กระบาก, มะไฟ, มะกอกป่า และเถาวัลย์ขึ้นปกคลุม ความยาวประมาณ 13-15 เซนติเมตรในประเทศไทย พบอาศัยอยู่ตามภูเขาสูงในภาคเหนือและภาคตะวันออกเฉียงเหนือตอนบน เช่นที่ ดอยอินทนนท์, ดอยเชียงดาว,ดอยสุเทพ-ปุย และดอยอ่างขางในจังหวัดเชียงใหม่, ภูหลวงในจังหวัดเลย, น้ำตกแม่สุรินทร์ในจังหวัดแม่ฮ่องสอน และดอยภูคาในจังหวัดน่าน พบอยู่ในระดับสูง 1,200-2,000 เมตร ในป่าดงดิบเขา',"
				+ 18.568360
				+ ","
				+ 98.549449
				+ ",'himalayan_newt_bg','himalayan_newt_icon','day','ดอยอินทนนท์','1000000','inthanon');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Siamese Big-headed Turtle','เต่าปูลู','Platysternon megacephalum peguense Gray','กระดองหลังสีน้ำตาลดำ กระดองท้องสีเหลืองและมีจุดสีน้ำตาลหัวและหางสีน้ำตาลอมส้ม หนังสีครีมถึงส้ม หัวใหญ่จรอยปาก แหลมคล้ายปากนกแก้ว หดหัวเข้ากระดองได้ไม่เต็มที่ขาใหญ่และหดเข้ากระดองไม่ได้ เท้ามีเล็บเหมาะสำหรับปีนขอนไม้ และก้อนหิน หางยาวกว่าความยาวของกระดองและมีเกล็ดรูปกลมหุ้ม หางพับเข้ากระดองได้เมื่ออยู่นิ่ง มีเดือยแหลมขนาดเล็ก บริเวณขา รอบๆ รูทวารและที่โคนหาง  อาศัยอยุ่ในลำธารบนภูเขา ในน้ำไหลและเย็น ',"
				+ 18.481768 + "," + 98.497951
				+ ",'pulu_turtle_bg','pulu_turtle_icon','day','ดอยอินทนนท์','1001101','inthanon');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Oriental garden lizard','กิ้งก่าหัวสีฟ้า','Calotes mystaceus','จัดเป็นสัตว์ป่าคุ้มครองตามกฎหมายในประเทศไทย จัดเป็นกิ้งก่าชนิดที่พบได้บ่อยและง่ายที่สุดมีลักษณะลำตัวปกคลุมด้วยเกล็ดสันชี้มาด้านหลังในลักษณะเฉียงขึ้น มีหนามหลังตา 1 อัน หนามบริเวณเหนือเยื่อหู 2 อัน เยื่อหูปรากฏชัด ด้านหน้าของไหล่มีรอยพับของผิวหนังซึ่งภายในปกคลุมด้วยเกล็ดสีดำ ขนาดของเกล็ดลำตัวเท่ากัน ลำตัวสีเขียวถึงน้ำตาลเทา หัวด้านบนสีน้ำตาล มีแถบดำพาดตั้งแต่บริเวณจมูกมาถึงท้ายทอยเหนือเยื่อหู ริมฝีปากบนสีขาว คางและเหนียงสีเทาดำ หลังมีแถบสีน้ำตาล 6 แถบพาดขวางลำตัว หางมีแถบสีเทาสลับกับดำพาดขวา',"
				+ 18.507815
				+ ","
				+ 98.498637
				+ ",'oriental_garden_lizard_bg','oriental_garden_lizard_icon','day','ดอยอินทนนท์','0100101','inthanon');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Hawk','เหยี่ยว','Falco','เหยี่ยวมีลักษณะคล้ายกับอินทรี ซึ่งเป็นนกล่าเหยื่อเช่นเดียวกัน แต่เหยี่ยวมีขนาดเล็กกว่า มีจะงอยปากที่งองุ้ม มีกรงเล็บที่แหลมคมและแข็งแรง บินได้อย่างรวดเร็ว กางปีกได้กว้างและยาว สามารถบินหรือเหินได้สูง และมีสายตาที่ดีมาก',"
				+ 18.482419 + "," + 98.532283
				+ ",'hawk_bg','hawk_icon','day','ดอยอินทนนท์','0001001','inthanon');");

		/* Pha dang National park อุทยานแห่งชาติผาแดง */

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Goral','กวางผา','Naemorhedus','กวางผามีรูปร่างคล้ายแพะหรือเลียงผา (Capricornis spp.) ที่มีขนาดเล็ก ซึ่งครั้งหนึ่งเลียงผาเองก็เคยใช้ชื่อสกุลเดียวกับกวางผาด้วย มีเขาสั้น ๆ ทั้งตัวผู้และตัวเมีย เป็นกรวยปลายเรียวแหลมคล้ายกันทั้ง 2 ข้าง ไม่มีการแตกกิ่งเขา เปลือกนอกเป็นปลอกเขาแข็งสวมทับบนแกนเขา ซึ่งเป็นแกนกระดูกที่งอกติดกับกะโหลกศีรษะชิ้นหน้าผาก ตัวเขาเจริญขึ้นตามอายุ และมีชุดเดียวตลอดชีวิต ไม่มีการผลัดเขาเหมือนกวาง',"
				+ 19.331392 + "," + 98.956053
				+ ",'goral_bg','goral_icon','day','อุทยานแห่งชาติผาแดง ','1100001','pha_dang');");// 19.331392,
		// 98.956053

		/* อุทยานแห่งชาติขุนแจ */

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Slow loris, Loris','ลิงลม','Nycticebus','ลิงลม โดยปกติแล้วที่เคลื่อนไหวได้เชื่องช้ามาก แต่จะว่องไวในเวลากลางคืน เมื่อหาอาหาร และเวลาที่โดนลมพัด อันเป็นที่มาของชื่อ เมื่อตกใจจะเอาแขนซุกใบหน้าไว้ อันเป็นที่มาของชื่อสามัญในภาษาไทยลิงลมมีรูปร่างโดยรวม คือ มีขนนุ่มสั้นเหมือนกำมะหยี่ ลำตัวป้อมกลมอ้วน รูปร่างหน้าตาน่ารักเหมือนตุ๊กตา มีตากลมโต สีขนมีความหลากหลายแตกต่างกันตามสภาพพื้นที่ที่อยู่อาศัย และแต่ละชนิด บางชนิดจะมีรอยขีดคาดตามใบหน้า, ส่วนหัว, ดวงตา และเส้นกลางหลัง อันเป็นลักษณะสำคัญในการแบ่งแยกชนิด มีส่วนหางที่สั้นมากจนดูเหมือนไม่มีหาง น้ำหนักเมื่อโตเต็มที่ประมาณ 1 กิโลกรัม',"
				+ 19.207921 + "," + 99.338232
				+ ",'loris_bg','loris_icon','night','อุทยานแห่งชาติขุนแจ','1101111','khun_ja');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Crested serpent-eagle','เหยี่ยวรุ้ง','Spilornis cheela','เป็นนกล่าเหยื่อขนาดกลางจำพวกเหยี่ยวที่พบได้ในป่าในทวีปเอเชียเขตร้อน มีการกระจายพันธุ์กว้าง ด้วยความที่นกในสกุลนี้กินอาหารหลัก คือ งู เหยี่ยวรุ้งเป็นนกล่าเหยื่อขนาดกลาง ขนาดลำตัวยาวประมาณ 51-71 เซนติเมตร  มีแผ่นหนังสีเหลืองสดใสบริเวณโคนปากไปจนถึงดวงตา  ขนบริเวณท้ายทอยค่อนข้างยาวคล้ายมีขนหงอนที่หัว ซึ่งมีลักษณะคล้ายพัดเป็นสีดำลายซีดสีขาว  ที่เมื่อเวลาโกรธหรือขู่คู่ต่อสู้ให้กลัวจะแผ่ออก ลำตัวด้านบนเป็นสีน้ำตาลเข้ม โดยเฉพาะที่ปีกจะมีจุดสีขาวกระจายอยู่ ลำตัวด้านล่างเป็นสีน้ำตาลและมีลายจุดสีขาวกระจายอยู่ทั่วไป ตัวที่โตเต็มวัยขณะบินจะเห็นแถบกว้างสีขาวที่หาง และใต้ปีกชัดเจน พบในอินเดีย, จีน, ไหหลำ, ไต้หวัน, พม่า, ไทย, อินโดจีน, มาเลเซีย ในประเทศไทยพบได้ทุกภาคในปริมาณปานกลาง อาศัยอยู่ตามป่าที่ราบและตามป่าบนยอดเขาใกล้ ๆ แหล่งน้ำต่าง ๆ สัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 19.173551
				+ ","
				+ 99.461828
				+ ",'crested_serpent_eagle_bg','crested_serpent_eagle_icon','day','อุทยานแห่งชาติขุนแจ','1100001','khun_ja');");// 19.173551,
		// 99.461828

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Blue-winged Leafbird','นกเขียวก้านตองปีกสีฟ้า','Chloropsis cochinchinensis','นกเขียวก้านตองปีกสีฟ้ามีความยาวจากปลายปากถึงปลายหาง 19 เซนติเมตร ลำตัวอยู่ในแนวนอน บริเวณตะโพกมีขนยาวและฟูเช่นเดียวกับนกปรอด ปากยาว เรียวโค้ง และมีความยาวพอๆกับหัว เหมาะที่จะใช้สอดเข้าไปในกรวยดอกไม้เพื่อดูดกินน้ำหวานตอนปลายปากงุ้มลงเล็กน้อย รูจมูกเป็นรูปไข่ ขนที่หน้าผากยาวลงมาถึงรูจมูก ที่มุมปากมีขนเส้นเล็กๆแข็งๆ สั้นๆ มองเห็นไม่เด่นชัดนัก ปีกมนกลม ขนปลายปีกมี 10 เส้น ขนหางมี 12 เส้น หางยาวตัดตรง ขาและนิ้วเท้าสีเทาอมฟ้า ขาท่อนล่างสั้นมาก นิ้วเท้าเล็กยื่นไปข้างหน้า 3 นิ้วยื่นไปข้างหลัง 1 นิ้ว ส่วนบนของลำตัวตั้งแต่หลังคอ หลัง ไหล่ ตะโพก จนถึงขนคลุมโคนหางด้านบน เป็นสีเขียวสดเช่นเดียวกับบนหัวและท้ายทอย ปีกสีเขียวเข้มแต่มีแถบสีฟ้าสะท้อนแสงที่ขนคลุมปีกเห็นได้ชัดเจน และครีบขนด้านนอกของขนปลายปีกทุกเส้นเป็นสีฟ้า แต่เห็นไม่ค่อยชัดเพราะนกมักหุบปีกตลอดเวลา แต่ถ้าหากนำไปเทียบกับนกเขียวก้านตองชนิดอื่นแล้ว จะเห็นว่านกเขียวก้านตองปีกสีฟ้า มีปีกสีออกฟ้าชัดเจนกว่าแม้ว่าจะมิได้มีสีฟ้าทั่วทั้งปีก ขนหางคู่กลางเป็นสีเขียวเข้มเช่นเดียวกับปีกแต่ขนหางที่เหลืออีก 5 คู่เป็นสีฟ้าเช่นเดียวกับครีบขนด้านนอกของขนปลายปีก นกเขียวก้านตองปีกสีฟ้าเป็นนกที่มีความแตกต่างระหว่างเพศ แบบเห็นได้ชัด โดยเพศผู้จะมีขนรอบดวงตา รอบปาก และบริเวณคางเป็นสีดำ ภายในแถบสีดำยังมีขีดสั้นๆ เฉียงๆ ีน้ำเงินอยู่สองข้างคางอีกด้วย แต่ไม่ชัดเจน นอกจากนี้รอบแถบสีดำจะมีแถบสีเหลืองล้อมรอบอีกชั้นหนึ่ง ซึ่งค่อยๆกลมกลืนส่วนบริเวณหัวจะมีสีเขียวออกไปทางเหลือง หน้าผากและแถบสั้นๆเหนือตาเป็นสีเหลืองสดใส แล้วค่อยๆเปลี่ยนเป็นสีเขียวสดทางตอนบนและด้านข้างของหัว บริเวณท้ายทอยเจือสีทองเล็กน้อย ซึ่งลักษณะดังกล่าวนี้มักเข้าใจผิดว่าเป็นนกเขียวก้านตองหน้าผากสีทอง แต่จุดที่ต่างคือสีเหลืองจะไม่เข้มมาก และแถบสีฟ้าที่ปีกจะดูเด่นชัดกว่า นกที่ยังไม่เต็มวัย ทั้งสองเพศจะมีสีเขียวตลอดตัว และมีสีเหลืองแซมเล็กน้อยที่ท้ายทอย แต่ก็ยังคงเอกลักษณ์มีแถบสีฟ้าสดใสที่ ขนคลุมปีก ขนปลายปีก ขนหางคู่นอก สีฟ้าจะดูหม่นกว่านกเพศผู้ตัวเต็มวัยเล็กน้อย',"
				+ 19.164795
				+ ","
				+ 99.433676
				+ ",'blue_winged_leafbird_bg','blue_winged_leafbird_icon','day','อุทยานแห่งชาติขุนแจ','1100001','khun_ja');");// 19.164795,
		// 99.433676

		/* อุทยานแห่งชาติ คลองลาน */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Smooth-coated otter','นากใหญ่ขนเรียบ','Lutrogale perspicillata','จัดเป็นนากชนิดที่ใหญ่ที่สุดที่พบในภูมิภาคเอเชียตะวันออกเฉียงใต้ ตัวผู้มีขนาดใหญ่กว่าตัวเมียมาก มีลักษณะแตกต่างไปจากนากใหญ่ธรรมดา (Lutra lutra) และ นากจมูกขน (L. sumatrana) คือ มีหัวกลม แนวขนบนจมูกเป็นรูปตัววีคว่ำ ขนสั้น  หูมีขนาดเล็กและมีลิ้นปิดหูเวลาว่ายน้ำเพื่อมิให้น้ำเข้าหู ขนตามลำตัวมีสีน้ำตาลปนสีดำหรือสีน้ำตาลอ่อน  บริเวณท้องมีสีอ่อนกว่าบริเวณหลัง หางแบน และมีความยาวประมาณร้อยละ 60 ของลำตัว  อุ้งเท้าและนิ้วเท้ามีขนาดใหญ่ มีความยาวลำตัวและหัว 65-75 เซนติเมตร ความยาวหาง 40-45 เซนติเมตร น้ำหนักเต็มที่ 7-11 กิโลกรัม มีการกระจายพันธุ์ตั้งแต่เนปาล, อินเดีย, ภาคตะวันตกของมณฑลยูนาน, พม่า, ไทย, ลาว, กัมพูชา, เวียดนามตอนใต้, มาเลเซีย และเกาะสุมาตรา มีพฤติกรรมอาศัยตามพื้นที่ชุ่มน้ำที่เป็นที่ลุ่มต่ำ เช่น ริมทะเลสาบ ลำธาร คลอง  ใช้หนวดเป็นประสาทสัมผัสในการรับรู้ เช่นเดียวกับนากชนิดอื่น ๆ  โดยใช้หนวดทำหน้าที่รับแรงสั่นสะเทือนจากการเคลื่อนไหวของสิ่งมีชีวิตใต้น้ำ กินอาหารได้หลากหลายประเภท ทั้ง สัตว์น้ำชนิดต่าง ๆ รวมทั้งนกหรือสัตว์เลี้ยงลูกด้วยน้ำนมขนาดเล็ก เช่น  หนู ด้วย  ออกหากินทั้งกลางวันและกลางคืน มักอยู่รวมกันเป็นครอบครัวเล็ก ๆ  ยกเว้นในสถานที่ที่มีอาหารอุดมสมบูรณ์อาจอยู่รวมเป็นฝูงใหญ่  มีเท้าและเล็บแข็งแรงจึงสามาถขุดรูริมตลิ่งได้ลึกถึง 3 เมตร เพื่อใช้การเลี้ยงดูลูกอ่อน  ลูกนากที่เกิดใหม่จะลืมตาภายในเวลา 10 วัน และออกหากินได้เองเมื่ออายุได้ 3 เดือน พบได้ทั่วทุกภาคในประเทศไทย',"
				+ 16.340246
				+ ","
				+ 99.103356
				+ ",'smooth_coated_otter_bg','smooth_coated_otter_icon','day','อุทยานแห่งชาติขุนแจ','1100000','khun_ja');");// 16.340246,
		// 99.103356

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Banteng','วัวแดง','Bos javanicus','เป็นวัวป่ารูปร่างคล้ายวัวบ้าน (B. taurus) ทั่วไป แต่มีลักษณะสำคัญที่ต่างไปจากวัวบ้านและกระทิง (B. gaurus) คือ มีวงก้นขาวทั้งในตัวผู้และตัวเมีย มีเส้นขาวรอบจมูก ขาทั้ง 4 ข้างมีสีขาวตั้งแต่หัวเข่าจนถึงกีบเท้า ระหว่างโคนขาของตัวผู้ไม่มีขน แต่เป็นหนังตกกระแข็ง ๆ เรียกว่า \"กระบังหน้า\" ความยาวลำตัวและหัวประมาณ 190 - 255 เซนติเมตร หางยาว 65 - 70 เซนติเมตร สูงประมาณ 155 - 165 เซนติเมตร และมีน้ำหนักราว 600 - 800 กิโลกรัม พบในพม่า, ไทย, อินโดจีน, ชวา, บอร์เนียว, เกาะบาหลี, ซาราวัก, เซเลบีส  สำหรับประเทศไทยเคยพบได้ทุกภาค วัวแดงกินหญ้าอ่อน ๆ ใบไผ่อ่อน หน่อไม้อ่อน ลูกไม้ป่าบางชนิด ใบไม้ ยอดอ่อนของพืช และดอกไม้ป่าบางชนิด  ปกติจะเริ่มออกหากินตั้งแต่ตอนพลบค่ำไปจนถึงเช้าตรู่ บางครั้งอาจเข้าไปรวมฝูงกับกระทิงและกูปรี (B. sauveli) กลางวันนอนหลบตามพุ่มไม้ทึบ ชอบอยู่ตามป่าโปร่งหรือป่าทุ่ง ชอบกินดินโป่งไม่ชอบนอนแช่ปลัก รักสงบ ปกติไม่ดุร้ายเหมือนกระทิง หากินโดยมีตัวเมียเป็นจ่าฝูง มีอายุยืนประมาณ 30 ปี วัวแดงยังมีชื่อเรียกอื่น ๆ อีก เช่น \"วัวเพลาะ\" เป็นต้น เป็นสัตว์ที่มีรายชื่อในพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535',"
				+ 16.371871
				+ ","
				+ 99.174767
				+ ",'banteng_bg','banteng_icon','night','อุทยานแห่งชาติขุนแจ','1100001','khun_ja');");// 16.371871,
		// 99.174767

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian golden cat','เสือไฟ','Pardofelis temminckii หรือ Catopuma temminckii','เป็นแมวป่าขนาดกลาง มีขนาดเล็กกว่าเสือลายเมฆ แต่ใหญ่กว่าแมวลายหินอ่อน มีสีขนหลากหลาย คือ สีน้ำตาลแดง น้ำตาลอมเทา ตลอดจนสีส้ม สีขนบริเวณใบหน้าจะเข้มกว่าลำตัว  มีลักษณะเด่นคือ มีแถบขนสีขาวบนใบหน้า เหนือตาและแก้ม หางยาวปลายหางด้านล่างมีสีขาวตลอด  ท้องและใต้หางมีสีขาว  มีความยาวลำตัวและหัว 76–81 เซนติเมตร ความยาวหาง 43–49 เซนติเมตร น้ำหนักตั้งแต่ 12–15 กิโลกรัม ขนของเสือไฟมีตั้งแต่สีแดงถึงน้ำตาลทอง น้ำตาลเข้มถึงสีน้ำตาลเหลือง เทาถึงดำ  รูปแบบของขนขึ้นอยู่กับความแตกต่างของสีด้วย ขนอาจเป็นจุดหรือลาย  สีเส้นขาวดำที่แก้มและพาดขึ้นไปส่วนบนของหัว หูมีสีดำออกเทาบริเวณตรงกลาง พบเสือไฟลายคล้ายเสือดาวในประเทศจีน ซึ่งเป็นลักษณะด้อยของเสือไฟและบางตัวอาจพบเป็นสีดำทั้งตัว',"
				+ 16.294117
				+ ","
				+ 99.080010
				+ ",'asian_golden_cat_bg','asian_golden_cat_icon','night','อุทยานแห่งชาติขุนแจ','1101011','khun_ja');");// 16.294117,
		// 99.080010

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Blanford flying lizard','กิ้งก่าบินคอแดง','Draco blanfordii','มีเหนียงสีเหลืองอ่อน มีประสีดำบนพื้นสีแดงสด ปีกมีลายบั้งสีเข้มสลับกับสีส้มเหลือง  อันเป็นที่มาของชื่อ  ลำตัวสีเขียวปนเทา กินปลวกต้นไม้, หนอนขนาดเล็ก และมดไม้ยักษ์ เป็นอาหาร  ตัวเมียวางไข่ในพื้นทราย หรือจอมปลวกบนต้นไม้ หรือโพรงไม้ ครั้งละ 5-6 ฟอง พบมากที่สุด คือ  10 ฟอง แพร่กระจายพันธุ์ได้กว้างไกลตั้งแต่อนุทวีปอินเดียจนถึงภูมิภาคอินโดจีน และประเทศจีนตอนล่าง  เช่น มณฑลยูนนาน สำหรับในประเทศไทย พบได้ทางภาคเหนือลงมาจนถึงภาคใต้ตอนล่าง  และมาเลเซีย จัดเป็นกิ้งก่าบินที่มีขนาดใหญ่ที่สุด คือ มีความยาวตั้งแต่ปลายหัวจรดโคนหาง 4.75 นิ้ว  และหางมีความยาว 9นิ้ว  มักพบในป่าดิบชื้นที่ราบ หรือ ป่าดิบเขาระดับกลาง และป่าเบญจพรรณ กิ้งก่าบินคอแดง จัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535 ตามกฎหมายในประเทศไทย',"
				+ 16.371213
				+ ","
				+ 99.207040
				+ ",'blanford_flying_lizard_bg','blanford_flying_lizard_icon','night','อุทยานแห่งชาติขุนแจ','1100000','khun_ja');");// 16.371213,
		// 99.207040

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Elongated tortoise','เต่าเหลือง','Indotestudo elongata','เป็นเต่าบกชนิดหนึ่ง จัดเป็นเต่าบกขนาดกลาง เมื่อโตเต็มที่มีน้ำหนักประมาณ 2 กิโลกรัม กระดองโค้งสูงพอสมควร ทั่วตัวมีสีขาวหรือเหลืองเป็นส่วนใหญ่  มีแต้มสีดำบ้างประปราย ขอบกระดองของบางตัวมีสีเหลืองใสดูคล้ายขี้ผึ้งหรือเทียน  จึงเป็นที่มาของชื่อ ในบางตัวเมื่อโตเต็มที่อาจมีสีน้ำตาลแก่ปน ขามีสีเทาดำ  ขาหน้ามีเกล็ดใหญ่ ๆ อยู่ด้านบน ขาหลังสั้นทู่ ขาหน้าและขาหลังไม่มีพังผืดระหว่างนิ้ว  แต่มีนิ้วแข็งแรงมากตัวผู้มีเกล็ดกระดองเว้าและลึก ขณะที่ตัวเมียราบเรียบกว่า พบกระจายพันธุ์อยู่ทั่วไปในภูมิภาคเอเชียตะวันออกเฉียงใต้และบางส่วนในเอเชียใต้  ในประเทศไทยพบได้ทุกภาค กินพืชและผลไม้เป็นอาหารหลัก แต่ก็สามารถกินเนื้อ เช่น ซากสัตว์หรือหอยได้ด้วย เป็นเต่าที่ชอบความชื้น แต่ไม่ชอบที่จะแช่น้ำ พบได้ในป่าแทบทุกสภาพ  แม้กระทั่งในสวนยางพาราหรือสวนปาล์มน้ำมัน วางไข่ครั้งละ 2-4 ฟอง  ฤดูผสมพันธุ์ระหว่างเดือนกันยายน-ตุลาคม จากนั้นในเดือนธันวาคมจึงจะวางไข่  โดยจะขุดหลุมลึกประมาณครึ่งตัว ใช้เวลาฟักประมาณ 146 วัน  ลูกเต่าที่เกิดมาใหม่กระดองจะมีความนิ่ม จะแข็งเมื่ออายุได้ราวหนึ่งปี เต่าชนิดนี้ ในประเทศไทย สามารถพบเห็นได้ง่าย คือ ที่หมู่บ้านบ้านกอก อำเภอมัญจาคีรี  จังหวัดขอนแก่น ห่างจากตัวอำเภอเมืองราว 50 กิโลเมตร  โดยจะพบเต่าเหลืองอาศัยและเดินไปเดินมาทั่วไปในหมู่บ้าน โดยที่ชาวบ้านไม่ทำอันตรายหรือนำไปรับประทาน เต่าจึงอาศัยอยู่ร่วมกับมนุษย์ได้เป็นอย่างดี  สถานะเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 และนิยมเลี้ยงกันเป็นสัตว์เลี้ยง',"
				+ 16.314547
				+ ","
				+ 99.112283
				+ ",'elongated_tortoise_bg','elongated_tortoise_icon','day','อุทยานแห่งชาติขุนแจ','1101000','khun_ja');");// 16.314547,
		// 99.112283

		/* อุทยานแห่งชาติน้ำตกพลิ้ว */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Pileated gibbon','ชะนีมงกุฎ','Hylobates pileatus','พบอาศัยอยู่ในแถบประเทศลาวและกัมพูชา ทางด้านทิศตะวันตกของแม่น้ำโขง สำหรับในประเทศไทยพบทางภาคตะวันออก เช่นจังหวัดสุรินทร์, บุรีรัมย์, ปราจีนบุรี, จันทบุรี, ตราด  และในอุทยานแห่งชาติเขาใหญ่ มักอาศัยอยู่ในป่าดิบที่มียอดไม้สูงและรกชัฏ อาหารหลัก คือ ผลไม้, ใบไม้, แมลงและสัตว์เลื้อยคลาน ดื่มน้ำโดยใช้วิธีการเลียตามขนตัวเองและหาตามโพรงไม้ ออกลูกครั้งละ 1 ตัว เมื่อลูกชะนีอายุได้ 1 ปี จะเริ่มออกจากอกแม่ห้อยโหนไปมาด้วยตัวเอง  ลูกชะนีโดยเฉพาะตัวผู้จะถูกขับไล่ออกจากฝูงเร็วกว่าตัวเมีย และจะอยู่ตามลำพังจนกระทั่งหาคู่ผสมพันธุ์ได้',"
				+ 12.581705
				+ ","
				+ 102.193528
				+ ",'pileated_gibbon_bg','pileated_gibbon_icon','day','อุทยานแห่งชาติน้ำตกพลิ้ว','1100001','waterfall_prew');");// 12.581705,
		// 102.193528

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Serow','เลียงผา','Capricornis','เลียงผามีลักษณะคล้ายกับกวางผา แต่เลียงผามีขนาดใหญ่กว่า มีลักษณะคล้ายแพะแต่มีรูปหน้ายาวกว่า  มีลำตัวสั้นแต่ขอยาว ตัวเมียมีขนาดเล็กกว่าตัวผู้ มีเขาทั้งตัวผู้และตัวเมีย เขางอกยาวต่อเนื่องทุกปี  ขนตามลำตัวจะแปรเปลี่ยนไปตามอายุ, สภาพแวดล้อมที่อยู่อาศัย และชนิดพันธุ์มีขนหยาบและไม่เป็น 2 ชั้นเหมือนกวางผา  ใต้ตามีต่อมน้ำมันใช้สำหรับถูตามต้นไม้หรือโขดหินเพื่อประกาศอาณาเขต พบกระจายพันธุ์อย่างกว้างขวางตั้งแต่เอเชียใต้, เอเชียตะวันออกเฉียงใต้, อินโดนีเซีย  จนถึงเอเชียตะวันออก เช่นจีน, ไต้หวัน, ญี่ปุ่น  มักอยู่ตามหน้าผาหรือภูเขาสูง หรือตามเกาะต่าง ๆ กลางทะเล เลียงผา ถือเป็นสัตว์ที่มีความเก่าแก่ที่สุดในวงศ์ย่อยนี้ โดยปรากฏมาตั้งแต่ยุคไพลโอซีนราว 2-7 ล้านปีมาแล้ว',"
				+ 12.573328
				+ ","
				+ 102.231980
				+ ",'serow_bg','serow_icon','night','อุทยานแห่งชาติน้ำตกพลิ้ว','1100001','waterfall_prew');");// 12.573328,
		// 102.231980

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Passerine, Perching bird','นกจับคอน','Passeriformes','เป็นนกที่มีวิวัฒนาการเพื่ออาศัยและหากินบนต้นไม้เป็นหลัก นิ้วตีนมีทั้งหมด 4 นิ้ว ทุกนิ้วเจริญดีและอยู่ในระนาบเดียวกัน  จึงเหมาะแก่การจับหรือเกาะเกี่ยวกับกิ่งไม้หรือต้นไม้ในป่าประเภทต่าง ๆ  แต่ไม่เหมาะสำหรับการเดินบนพื้นดิน  เมื่อลงดินจะได้วิธีก้าวกระโดด โดยมากแล้วจะเป็นนกที่มีลำตัวขนาดเล็ก สำหรับในประเทศไทยที่มีการค้นพบนกแล้วราว 1,000 ชนิด',"
				+ 12.502184
				+ ","
				+ 102.211505
				+ ",'passerine_bg','passerine_icon','day','อุทยานแห่งชาติน้ำตกพลิ้ว','0100000','waterfall_prew');");// 12.502184,
		// 102.211505

		/* อุทยานแห่งชาติผาแต้ม */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Green peafowl','นกยูงไทย','Pavo muticus','เป็นไก่ฟ้าขนาดใหญ่ที่พบในป่าเขตร้อนของเอเชียตะวันออกเฉียงใต้ เป็นญาติใกล้ชิดกับนกยูงอินเดียหรือเรียกอีกชื่อหนึ่งว่านกยูงสีฟ้า (ชื่อวิทยาศาสตร์: Pavo cristatus) ที่ส่วนมากพบในอนุทวีปอินเดีย นกยูงไทยเป็นนกจำพวกไก่ฟ้าขนาดใหญ่ นกตัวผู้อาจยาวได้ถึง 3 เมตรเมื่อรวมหาง อาจหนักถึง 5 กก. ตัวเมียยาว 1.1 เมตร หนักประมาณ 1.1 กก. ช่วงปีกกว้าง 1.2 เมตร  นกตัวผู้ยังมีหงอนเป็นพู่สูงและมีแผ่นหนังที่หน้าสีฟ้าสลับสีเหลืองเห็นได้ ชัดเจน  ขนลำตัวมีสีเขียวเป็นประกายแววเหลือบสีน้ำเงินบนปีกและสีทองแดงทางด้านข้าง  ลำตัวดูเป็นลายเกล็ดแพรวพราวไปทั้งตัว ขนปีกบินสีน้ำตาลแดง ขนคลุมโคนหางยื่นยาวออกมาก  มีสีเขียวและมีจุดดวงตากลมที่ขลิบด้วยสีฟ้าและสีน้ำเงิน นกตัวเมียลักษณะโดยทั่วไปคล้ายนกตัวผู้  แต่ขนสีเหลือบเขียวน้อยกว่าและมีประสีน้ำตาลเหลืองอยู่ทั่วไป ขนคลุมโคนหางไม่ยื่นยาวดังเช่นในนกตัวผู้  นกยูงไทยบินได้เก่งกว่านกยูงอินเดีย ออกหากินตามหาดทรายและสันทรายริมลำธารในตอนเช้าตรู่จนกระทั่งถึง ตอนบ่ายกินทั้งเมล็ดพืชและสัตว์เล็กๆ แล้วจึงบินกลับมาเกาะนอนอยู่บนยอดไม้สูง ปกติอยู่เป็นฝูงเล็กๆ 2-6 ตัว ฤดูผสมพันธุ์อยู่ในระหว่างเดือนพฤศจิกายนจนถึงเดือนเมษายน',"
				+ 15.423850
				+ ","
				+ 105.537287
				+ ",'green_peafowl_bg','green_peafowl_icon','day','อุทยานแห่งชาติผาแต้ม','1110001','pha_tam');");// 15.423850,
		// 105.537287

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Mekong giant catfish','ปลาบึก','Pangasianodon gigas','เป็นปลาน้ำจืดขนาดใหญ่ชนิดหนึ่ง ไม่มีเกล็ด อาศัยอยู่ในแม่น้ำโขงบริเวณประเทศลาว เป็นปลาที่เสี่ยงต่อการสูญพันธุ์เนื่องจากการจับปลามากเกินไป  คุณภาพน้ำที่แย่ลงจากการพัฒนาและการสร้างเขื่อนบริเวณต้นน้ำ ปัจจุบัน IUCN จัดปลาบึกอยู่ในกลุ่ม  Critically Endangered ซึ่งเสี่ยงต่อการสูญพันธุ์มาก ปลาบึกไม่มีฟันและเกือบจะไม่มีหนวด โดยที่ปลาวัยอ่อนมีฟันและกินปลาอื่นเป็นอาหาร  แต่เมื่อโตขึ้นฟันจะหลุดไป และตาซึ่งจะอยู่ต่ำกว่ามุมปากเมื่อมองจากด้านหน้าตรง ๆ จะไม่เห็น ซึ่งแสดงให้เห็นถึงการใช้หากินตามพื้นน้ำ อีกทั้งปลาบึกมีซี่กรองเหงือกเล็กกว่า และ ปลายถุงลมจะลงถึงบริเวณช่วงท้องไม่เกินครีบก้น  อีกทั้งความกว้างของปากและส่วนหัวของปลาบึกก็มีมากกว่า อาหารของปลาบึกในธรรมชาติคือพืชชนิดต่าง ๆ เช่น ตะไคร่น้ำ  สามารถโตได้ถึง 3 เมตรและหนัก 150-200 กิโลกรัม ใน 5 ปี  ปลาที่หนักที่สุดเท่าที่เคยจับได้เป็นตัวเมีย (บางรายงานระบุผิดว่าเป็นตัวผู้) ยาว 2.7 เมตร และหนัก 293 กิโลกรัม (646 ปอนด์) เจ้าหน้าที่กรมประมงสามารถรีดไข่ได้สำเร็จแต่ปลาตัวนี้ก็ตายก่อนที่จะปล่อยกลับธรรมชาติ ปลาบึกได้รับฉายาว่า \"ราชินีแห่งแม่น้ำโขง\"',"
				+ 15.460583
				+ ","
				+ 105.594622
				+ ",'mekong_giant_catfish_bg','mekong_giant_catfish_icon','day','อุทยานแห่งชาติผาแต้ม','1110101','pha_tam');");// 15.460583,
		// 105.594622

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Fox, Jackal','สุนัขจิ้งจอก','-','ลักษณะทั่วไปของหมาจิ้งจอกจะมีขนาดลำตัวที่เล็กกว่าสุนัขบ้านทั่วไป และคล้ายกับสุนัขไทยพื้นเมือง จมูกแหลมยาว หูใหญ่ชี้ตั้ง ฟันกรามแข็งแรงและแหลมคม หางยาวเป็นพวง ขนสีน้ำตาลแกมเหลือง ในประเทศไทย หมาจิ้งจอกจัดอยู่ในสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า  หมาจิ้งจอก มักถูกใช้เป็นสัญลักษณ์ของความเจ้าเล่ห์ ในความเชื่อของชาวเอเชียตะวันออก  จิ้งจอกที่มีอายุมาก ๆ จะเป็นปีศาจสามารถแปลงร่างเป็นมนุษย์ได้ แต่อย่างไรก็ตาม  ธรรมชาติของหมาจิ้งจอกนั้นไม่ทำร้ายคนอย่างที่คนส่วนใหญ่เข้าใจ ชอบออกหากินในเวลากลางคืน ส่วนเวลากลางวันมักจะนอนในโพรงดิน  หากมีหลายตัวอาจจะไล่จับกินสัตว์ที่มีขนาดใหญ่ เช่น กวางหรือสัตว์ขนาดเล็กเช่น กิ้งก่า จิ้งเหลน  แย้ หรือซากสัตว์และผลไม้ โดยมากหากินตัวเดียวหรือเป็นคู่ คือประมาณ 2-4 ตัว ไม่ค่อยอยู่เป็นฝูง  ส่วนการผสมพันธุ์ หมาจิ้งจอกเริ่มผสมพันธุ์ได้เมื่อมีอายุ 2 ปี  ระยะตั้งท้องนาน 2 เดือน ออกลูกครั้งละ 4-5 ตัว หมาจิ้งจอกมีอายุประมาณ 12 ปี  สำหรับในประเทศไทยจะพบหมาจิ้งจอกได้เพียงชนิดเดียว คือ หมาจิ้งจอกทอง หรือ  หมาจิ้งจอกเอเชียซึ่งเชื่อว่า เป็นบรรพบุรุษต้นสายพันธุ์ของ สุนัขพันธุ์ไทยบางแก้ว ด้วย',"
				+ 15.523850 + "," + 105.530597
				+ ",'fox_bg','fox_icon','night','อุทยานแห่งชาติผาแต้ม','1100001','pha_tam');");// 15.523850,
		// 105.530597

		/* อุทยานแห่งชาติภูกระดึง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Pig-tailed macaque','ลิงกัง','Macaca nemestrina','มีรูปร่างอ้วนสั้น ขนสั้นสีเทาหรือสีน้ำตาล หน้าค่อนข้างยาว ขนบนหัวสั้นมีสีเทาหรือสีน้ำตาล  และขึ้นวนเป็นก้นหอย ขนตรงส่วนใต้ท้องมีสีจางจนเกือบขาว หางค่อนข้างสั้น ตัวเมียมีขนาดเล็กกว่า  และมีขนปรกหน้าผากน้อยกว่าลิงตัวผู้ พบแพร่กระจายพันธุ์ตั้งแต่รัฐอัสสัมของอินเดีย, พม่า, ไทย, มาเลเซีย, เกาะสุมาตรา และเกาะบอร์เนียว อาศัยอยู่ตามป่าดิบบริเวณเชิงเขา ชอบเปลี่ยนที่อยู่ไปเรื่อย ไม่ค่อยอยู่เป็นที่ บางตัวออกหากินตัวเดียว  ไม่รวมฝูง ชอบลงมาอยู่ตามพื้นดินมากกว่าอยู่บนต้นไม้ แต่เวลานอนขึ้นไปนอนบนต้นไม้  ชอบส่งเสียงร้องและมักร้องรับกันทั้งฝูง เริ่มผสมพันธุ์ได้เมื่อมีอายุ 3-4 ปี ผสมพันธุ์ได้ทุกฤดู  ระยะตั้งท้องประมาณ 5-7 เดือน ออกลูกครั้งละ 1 ตัว และมีอายุยืนราว 25 ปี  ตัวผู้หรือแต่ละตัวอาจผสมพันธุ์กับตัวอื่นได้หลายตัว และไม่อยู่เป็นคู่แน่นอน ลิงกังจัดเป็นลิงที่มีสมาชิกในฝูงน้อยกว่าลิงชนิดอื่น ๆ คือ มีไม่เกิน 40-45 ตัว กินอาหารจำพวกผลไม้, เมล็ดพืช และแมลงขนาดเล็ก เวลากินอาหารมักชอบเก็บไว้ข้างแก้มแล้วค่อย ๆ  เอามือดันอาหารที่เก็บไว้ออกมากินทีละน้อย',"
				+ 16.919992
				+ ","
				+ 101.721132
				+ ",'pig_tailed_macaque_bg','pig_tailed_macaque_icon','day','อุทยานแห่งชาติผาแต้ม','1100000','pha_tam');");// 16.919992,
		// 101.721132

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Finlayson squirrel','กระรอกหลากสี','Callosciurus finlaysonii','สัตว์ฟันแทะชนิดหนึ่ง เป็นกระรอกชนิดหนึ่ง ที่สามารถพบได้ทั่วไปในภูมิภาคอินโดจีนจนถึงสิงคโปร์  สามารถพบได้ทั่วไปทั้งในตัวเมืองและในป่าเขาต่าง ๆ มีความหลากหลายทางสีสันเป็นอย่างยิ่ง  โดยมากจะเป็นสีขาวครีมปนเหลืองอ่อน จนถึงสีแดงหรือสีดำทั้งตัว หรือบางตัวอาจมีหลายสีในตัวเดียวกัน เป็นกระรอกขนาดกลาง มีขนาดความยาวตั้งแต่หัวจรดโคนหาง 21-22 เซนติเมตร ความยาวหาง 22.5-24  เซนติเมตร ออกหากินในเวลาเช้าตรู่และพลบค่ำ นอนหลับพักผ่อนตามพุ่มใบไม้ทำรังคล้ายรังนกด้วยกิ่งไม้เล็ก ๆ รูปทรงยาวอยู่ตามปลายกิ่งไม้  ตัวเมียมีเต้านม 2 คู่ ออกลูกครั้งละ 2 ตัว สถานะการอนุรักษ์ในประเทศไทย เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า  พุทธศักราช 2535 แต่ก็มีการนิยมซื้อขายและเลี้ยงเป็นสัตว์เลี้ยงด้วยเช่นกัน',"
				+ 16.800395
				+ ","
				+ 101.738985
				+ ",'finlayson_squirrel_bg','finlayson_squirrel_icon','day','อุทยานแห่งชาติผาแต้ม','1101000','pha_tam');");// 16.800395,
		// 101.738985

		/* อุทยานแห่งชาติภูพาน */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Phayre langur','ค่างแว่นถิ่นเหนือ','Trachypithecus phayrei','เป็นค่างชนิดหนึ่ง มีรูปร่างคล้ายกับค่างแว่นถิ่นใต้ (T. obscurus) ที่อยู่ในสกุลเดียวกัน มีสีขนที่หลากหลาย ตั้งแต่สีน้ำตาลเข้มไปจนถึงสีเทาเข้ม  ในขณะที่บางตัวอาจจะเข้มมากจนดูคล้ายสีสนิม ขนบริเวณหลังและด้านบนลำตัวจะเข้มกว่าสีขนที่อยู่ด้านล่าง  สีขนด้านล่างของบางตัวอาจเป็นสรเทาอ่อนหรือขาวขุ่น บริเวณใบหน้าจะมีสีดำหรือสีเทาอมฟ้า  มีลักษณะเด่น คือ บริเวณรอบดวงตาและริมฝีปากมีสีน้ำเงินปนขาว  แต่สีขาวรอบวงตานั้นบางตัวอาจไม่เป็นรูปวงกลม ในขณะที่บางตัวอาจจะมีริมฝีปากเป็นสีขาวขุ่น  มือและเท้าโดยทั่วไปจะเข้มกว่าบริเวณหลัง มีความยาวลำตัวตั้งแต่หัวจรดโคนหาง 52-62 เซนติเมตร ความยาวหาง 58.5-88 เซนติเมตร  น้ำหนักตัวประมาณ 6-9 กิโลกรัม พบกระจายพันธุ์ในประเทศบังกลาเทศ, ประเทศอินเดีย, ประเทศพม่า, ประเทศจีน, ประเทศไทย, ประเทศลาว และประเทศเวียดนาม ในประเทศไทยพบมากทางภาคเหนือ ค่างแว่นถิ่นเหนือมีพฤติกรรมชอบอยู่รวมฝูงกันในป่าที่มีต้นไม้สูง  ในบางครั้งอาจลงมาหากินป่าไผ่หรือป่าเสื่อมโทรมที่ผ่านการใช้ประโยชน์จากมนุษย์มาแล้ว  มีนิสัยขี้อาย กลัวมนุษย์ บางกลุ่มอาจอาศัยในถ้ำที่เกิดจากชะง่อนผาหินปูน  มักพบเห็นบนต้นไม้สูง แต่ในบางครั้งอาจลงมาหากินบนยอดไม้ที่มีความสูงประมาณ  15 เมตร หรืออาจลงมาพื้นดินเพื่อดื่มน้ำตามโป่งหรือตามลำธาร ในช่วงเวบานี้  จะมีสมาชิกอยู่บางตัวที่ทำหน้าที่เสมือนยาม จะร้องเตือนตัวอื่น ๆ ให้รับรู้  จากนั้นจะกระโดดหนีไปในทิศทางเดียวกันทั้งหมด เมื่อกระโดดจากต้นไม้ต้นหนึ่งไปยังต้นหนึ่ง  จะกางแขนกางขาให้กว้าง เพื่อเป็นการผ่อนน้ำหนัก',"
				+ 16.973086
				+ ","
				+ 103.824657
				+ ",'phayre_langur_bg','phayre_langur_icon','day','อุทยานแห่งชาติภูพาน','1100001','pha_tam');");// 16.973086,
		// 103.824657

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Malayan sun bear, Honey bear','หมีหมา','Ursus malayanus','หมีหมาเป็นหมีที่มีขนาดเล็กที่สุดในโลก ลำตัวยาวประมาณ 1 เมตร  ขนตามตัวสั้นสีดำปนสีน้ำตาล ขนบริเวณอกโค้งเป็นรูปตัว U สีขาวนวล  บริเวณหน้าตั้งแต่ตาไปถึงปลายจมูกสีค่อนข้างขาว หรือน้ำตาลอ่อน ปกติหมีหมาหากินกลางคืน  บางครั้งก็ออกหากินกลางวัน มักหากินเป็นคู่ อยู่ในป่าทึบ ไม่ชอบอยู่ตามเขา ดุร้ายและขึ้นต้นไม้เก่งกว่าหมีควาย (U. thibetanus) มีอุปนิสัยโมโหง่าย ชอบนอนบนต้นไม้หรือตามโพรงไม้สูง ๆ ไม่ชอบนอนพื้นดิน  บางครั้งร้องคล้ายเสียงสุนัขเห่ากระโชก จึงเรียกว่า หมีหมา เมื่อยืน 2 ขา จะยืนตัวตรง  จึงเรียกอีกชื่อว่า หมีคน',"
				+ 17.156226
				+ ","
				+ 103.974345
				+ ",'honey_bear_bg','honey_bear_icon','night','อุทยานแห่งชาติภูพาน','1100001','pha_tam');");// 17.156226,
		// 103.974345

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Lesser bamboo rat','อ้นเล็ก','Cannomys badius','เป็นสัตว์ฟันแทะในอยู่ในวงศ์ย่อย Rhizomyinae ในวงศ์Spalacidae จัดเป็นอ้นชนิดที่มีขนาดเล็กที่สุด และจัดเป็นสิ่งมีชีวิตเพียงชนิดเดียวเท่านั้น ที่อยู่ในสกุล Cannomys มีความแตกต่างไปจากอ้นที่อยู่ในสกุล Rhizomys คือ ฝ่าเท้าจะเรียบ  และมีลายสีขาวบริเวณหน้าผากและหัวคล้ายหนูตะเภา ในขณะที่มีขนอ่อนนุ่มสีน้ำตาล  โดยขนที่ท้องจะมีสีเข้มกว่าขนที่หลัง มีความยาวตั้งแต่ปลายจมูกจรดหางประมาณ 15-30 เซนติเมตร หางมีขนาดสั้นยาวประมาณ 6-7 เซนติเมตร น้ำหนักตัวโดยเฉลี่ยประมาณ 0.5 กิโลกรัม มีจุดเด่นคือ ฟันแทะคู่หน้าที่ยาวอย่างเห็นได้ชัดเจน ใช้สำหรับขุดโพรงใต้ดินเพื่ออยู่อาศัยและใช้กัดแทะอาหาร ซึ่งได้แก่ ไม้ไผ่และหน่อไม้ รวมถึงผลไม้ประเภทต่าง ๆ ด้วยที่หล่นบนพื้นดิน บริเวณปากโพรงที่อ้นอยู่อาศัยจะมีกองดินปิดไว้ มักจะขุดโพรงในป่าบริเวณใกล้แหล่งน้ำหรือบริเวณที่เป็นป่าไผ่ ออกหากินในเวลากลางคืนและพลบค่ำ ออกลูกครั้งละ 3-5 ตัว',"
				+ 17.167379
				+ ","
				+ 103.931087
				+ ",'lesser_bamboo_rat_bg','lesser_bamboo_rat_icon','night','อุทยานแห่งชาติภูพาน','1101000','pha_tam');");// 17.167379,
		// 103.931087

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Indochinese ground squirrel','กระจ้อน','Menetes berdmorei','จัดอยู่ในไฟลัมสัตว์มีแกนสันหลัง ชั้นสัตว์เลี้ยงลูกด้วยนม อันดับสัตว์ฟันแทะ เป็นกระรอกขนาดเล็กชนิดหนึ่ง พบเห็นได้ทั่วไปในทุกภาคของประเทศไทย  และทุกสภาพภูมิประเทศ แม้แต่ในสวนใจกลางเมือง ไม่ชอบอยู่อาศัยในป่าดิบทึบ  ชอบหากินอยู่ตามพื้นดิน มีลำตัวสีน้ำตาลมีแถบสีดำสลับสีอ่อนอยู่ด้านข้างลำตัว  จัดเป็นกระรอกดินชนิดหนึ่ง เป็นสิ่งมีชีวิตเพียงชนิดเดียวที่อยู่ในสกุล Menetes พบได้ทั่วไปในภูมิภาคเอเชียตะวันออกเฉียงใต้ มีความยาวเต็มที่รวมหาง ประมาณ 15-20 เซนติเมตร',"
				+ 17.238875
				+ ","
				+ 103.807491
				+ ",'indochinese_ground_squirrel_bg','indochinese_ground_squirrel_icon','day','อุทยานแห่งชาติภูพาน','0001000','pha_tam');");// 17.238875,
		// 103.807491

		/* อุทยานแห่งชาติหมู่เกาะช้าง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Silvered langur','ค่างหงอก','Trachypithecus cristatus','จัดเป็นลิงโลกเก่าชนิดหนึ่ง ค่างเทามีรูปร่างหน้าตาคล้ายกับค่างดำมลายู (Presbytis femoralis) ขนตามลำตัวเป็นสีเทาเข้ม  ปลายขนเป็นสีขาวหรือสีเงิน ทำให้แลดูคล้ายผมหงอกของมนุษย์ อันเป็นที่มาของชื่อ  บนหัวจะมีขนยาวเป็นหงอนแหลม ใบหน้ามีสีดำไม่มีวงแหวนสีขาวรอบดวงตา มือและเท้าเป็นสีดำ  มีความยาวลำตัวถึงหัว 49-57 เซนติเมตร  ความยาวหางประมาณ 72-84 เซนติเมตร  น้ำหนัก 6-8 กิโลกรัม มีชนิดย่อยด้วยกัน 2 ชนิด มีพฤติกรรมอาศัยอยู่บนต้นไม้สูง ในบางครั้งอาจพบในป่าพรุด้วย  อาหารของค่างชนิดนี้ได้แก่ ใบอ่อนของต้นไม้, ผลไม้ และแมลงตัวเล็ก ๆ จะออกหากินในเวลากลางวัน  มักอยู่รวมเป็นฝูงประมาณ 10-15 ตัว การกระจายพันธุ์ในแถบภาคตะวันตก, ภาคเหนือของไทย, ภาคใต้ของลาว, พม่า, เวียดนาม, ตอนใต้ของจีน, กัมพูชา, มาเลเซีย, เกาะสุมาตรา, เกาะชวาและเกาะบอร์เนียว',"
				+ 12.097953
				+ ","
				+ 102.297897
				+ ",'silvered_langurl_bg','silvered_langurl_icon','day','อุทยานแห่งชาติหมู่เกาะช้าง','1100001','moo_koa_chang');");// 12.097953,
		// 102.297897

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Indian small civet','ชะมดเช็ด','Viverricula indica','สัตว์เลี้ยงลูกด้วยน้ำนมชนิดหนึ่ง  จัดเป็นชะมดขนาดเล็ก ขาสั้น หูทั้งสองข้างอยู่ใกล้กัน เมื่อมองไกล ๆ อาจคล้ายแมว  จนตามลำตัวมีสีน้ำตาลเหลือง และมีจุดสีดำขนาดเล็กแทรกอยู่ทั่วไปตามลำตัว  มีแถบสีดำและขาวบริเวณลำคอ หางมีวงสีดำ 6-9 ปล้องพาดขวางอยู่ ทำให้มีดูมีลักษณะเป็นปล้องสีดำ  ไม่มีขนแผงสันหลัง ปลายหางมีสีขาว  ขาหลังมีต่อมกลิ่นที่ใช้สื่อสารระหว่างพวกเดียวกัน  ขนาดความยาวลำตัวและหัว 54-63 เซนติเมตร ความยาวหาง 30-43 เซนติเมตร น้ำหนัก 2-4 กิโลกรัม มีการกระจายพันธุ์ที่กว้างขวางตั้งแต่ตะวันออกของปากีสถาน, อินเดีย, จีนตอนใต้, ไต้หวัน, เนปาล, บังกลาเทศ, พม่า, ไทย, ลาว,กัมพูชา, เวียดนาม, มาเลเซีย, เกาะสุมาตราและเกาะบาหลี ชะมดเช็ดมักอาศัยในป่าที่ไม่รกชัฏ  หากินบริเวณชายป่าที่ติดต่อกับพื้นที่ที่มนุษย์อยู่อาศัยและทำการเกษตรกรรม กินอาหารได้หลากหลาย  ทั้งพืชและสัตว์ และอาจล่าสัตว์เลี้ยงจำพวก เป็ด, ไก่ กินเป็นอาหารได้ด้วย  ออกมากินในเวลากลางคืน  นอนหลับพักผ่อนในเวลากลางวัน  โดยปกติแล้วจะอาศัยอยู่ตามลำพัง แต่ในฤดูผสมพันธุ์จะอาศัยอยู่เป็นคู่ แม่ชะมดเช็ดจะออกลูกครั้งละ  3-5 ตัว โดยขุดโพรงดินตื้น ๆ หรือหาโพรงตามโขดหินสำหรับเป็นที่ออกลูกและเลี้ยงดูลูกอ่อน  เมื่อผ่านช่วงผสมพันธุ์ไปแล้ว แม่ชะมดเช็ดจะเลี้ยงลูกตามลำพัง ชะมดเช็ดในประเทศไทยสามารถพบได้ทุกพื้นที่และทุกภาค',"
				+ 12.083854
				+ ","
				+ 102.339096
				+ ",'indian_small_civet_bg','indian_small_civet_icon','night','อุทยานแห่งชาติหมู่เกาะช้าง','0011000','moo_koa_chang');");// 12.083854,
		// 102.339096

		/* อุทยานแห่งชาติหมู่เกาะอ่างทอง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Dusky leaf monkey','ค่างแว่นถิ่นใต้','Trachypithecus obscurus','สัตว์เลี้ยงลูกด้วยนมจำพวกค่าง ลักษณะทั่วไปคล้ายค่างแว่นถิ่นเหนือ (T. phayrei) คือ  มีวงกลมสีขาวรอบตาเหมือนกับใส่แว่นอันเป็นที่มาของชื่อ มีขนาดของลำตัวยาว 45-57 เซนติเมตร หางยาว 66-78 เซนติเมตร มีน้ำหนัก 6-9 กิโลกรัม ค่างโตเต็มวัยมีขนบริเวณด้านหลังสีเทาเข้มเกือบดำ ขนบริเวณด้านข้างใบหน้าบริเวณปลายมือและปลายเท้ามีสีเทาเข้ม  โคนขาและโคนแขนด้านนอกเป็นสีเทาจาง ลักษณะสำคัญที่ใช้จำแนกค่างชนิดนี้ คือสีขนหางสีดำ  ลูกที่เกิดใหม่สีขนจะเป็นสีทอง อาศัยอยู่ตามป่าเขาหินปูนที่มีโขดหินสูงชัน นอกจากนี้ยังอาศัยอยู่ตามป่าดงดิบหรือสวนยางพารา  พบในแถบเอเชียตะวันออกเฉียงใต้ได้แก่ พม่า, ไทย, มาเลเซีย  ในประเทศพม่าพบบริเวณเทือกเขาตะนาวศรีลงไปทางใต้ นอกจากนี้ยังพบตามเกาะต่าง ๆ  ในประเทศมาเลเซีย เช่น เกาะลังกาวี เกาะปีนัง ส่วนในประเทศไทยพบได้ที่อุทยานแห่งชาติเขาสามร้อยยอด  จังหวัดประจวบคีรีขันธ์ อุทยานแห่งชาติตะรุเตาและอุทยานแห่งชาติ หมู่เกาะเภตรา จังหวัดสตูล  เขตรักษาพันธุ์สัตว์ป่าคลองแสง จังหวัดสุราษฎร์ธานี อาหารหลักได้แก่ ใบไม้, ผลไม้และเมล็ดพืช โดยมี แมลง เป็นอาหารเสริม',"
				+ 9.636016
				+ ","
				+ 99.668791
				+ ",'dusky_leaf_monkey_bg','dusky_leaf_monkey_icon','day','อุทยานแห่งชาติหมู่เกาะอ่างทอง','1100001','ang_thong_island');");// 9.636016,
		// 99.668791

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Oriental pied hornbill','นกแก๊ก','Anthracoceros albirostris','เป็นนกเงือกที่เล็กที่สุดในประเทศไทย พบในประเทศบังกลาเทศ, ประเทศภูฏาน, ประเทศบรูไน, ประเทศกัมพูชา, ประเทศจีน, ประเทศอินเดีย, ประเทศอินโดนีเซีย, ประเทศลาว, ประเทศมาเลเซีย, ประเทศพม่า, ประเทศเนปาล, ประเทศสิงคโปร์, ประเทศไทย, และประเทศเวียดนาม  มีถิ่นอาศัยในป่าดิบเขตร้อนหรือกึ่งเขตร้อน ปกติกินผลไม้จำพวกเงาะเป็นอาหาร ลูกไม้ สัตว์เลื้อยคลาน และนกขนาดเล็ก  มีลีลาการกินอาหารอันเป็นที่จดจำสำหรับผู้พบเห็น โดยมันจะโยนอาหารขึ้นไปกลางอากาศแล้วอ้าปากรับ นกแก๊ก ตัวผู้และตัวเมีย อาจใช้วิธีสังเกตย่อๆ ดังนี้คือ ตัวผู้ มีจงอยปาก และโหนกสีขาว งาช้างและ  มีสีดำแต้มด้านหน้าของโหนก,ตัวเมีย มีโหนกเล็กกว่า และ มีสีดำแต้มเปรอะทั้งโหนก และ  ปากจนดูมอมแมม ตัวที่ยังโตไม่เต็มวัย คล้ายตัวเต็มวัย แต่มีโหนกเล็กกว่า สีบริเวณปาก จะค่อยๆ ปรากฏชัด  เมื่อนกมีอายุมากขึ้น ปกติ นกแก๊ก ชอบอาศัยอยู่รวมกันเป็นฝูงเล็กๆ มันจะพากันบินออกไปหากินในตอนเช้า และกลับมานอนบนต้นไม้เดียวกันในตอนพลบค่ำเป็นประจำทุกวัน มันเคยเกาะนอนอยู่บนต้นไม้ไหน ก็บินกลับมานอนต้นไม้ต้นเดิมเสมอนกแก๊กเป็นนกเงือกที่พบได้บ่อยตามป่าดิบในระดับความสูงไม่เกิน 1,400 เมตรจากน้ำทะเล และป่าบนเกาะนกแก๊ก เป็นนกประจำถิ่นที่พบค่อนข้างบ่อย ทุกภาคของประเทศไทย (ยกเว้นภาคกลาง และ ส่วนใหญ่ของภาคตะวันออกเฉียงเหนือ) รวมทั้งเกาะชายฝั่งต่างๆด้วย เช่น เกาะสมุย เกาะเสม็ด เกาะตะรุเตา ในประเทศไทย',"
				+ 9.651755
				+ ","
				+ 99.666130
				+ ",'oriental_pied_hornbill_bg','oriental_pied_hornbill_icon','day','อุทยานแห่งชาติหมู่เกาะอ่างทอง','1101001','ang_thong_island');");// 9.651755,
		// 99.666130

		/* อุทยานแห่งชาติออบหลวง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Indian muntjac','เก้ง','Muntiacus muntjak','มีส่วนหลังโก่งเล็กน้อย ลำตัวสีน้ำตาลแดง ด้านใต้ซีดและอมเทาเล็กน้อย หางด้านบนสีน้ำตาลเข้ม  ด้านล่างสีขาว เก้งตัวผู้มีเขาสั้น ฐานเขาซึ่งเป็นส่วนหนึ่งของกะโหลกยื่นยาวขึ้นไปเป็นแท่ง มีขนปกคลุม  และมีขนสีดำขึ้นตามแนวเขาจนดูเป็นรูปตัววีเมื่อมองด้านหน้าตรง ส่วนปลายเขาสั้น แต่เป็นง่ามเล็ก  ๆ แค่สองง่าม ไม่แตกเป็นกิ่งก้านแบบกวาง ผลัดเขาปีละครั้ง ส่วนตัวเมียไม่มีเขาและฐานเขา  แต่บนหน้าก็มีขนรูปตัววีเหมือนกัน เก้งตัวที่อายุมากผู้มีเขี้ยวยาวแหลมโค้งโผล่พ้นขากรรไกรออกมา  เวลาเดินจะยกขาสูงทุกย่างก้าว หากินได้ทั้งกลางวันและกลางคืน แต่ส่วนใหญ่จะพบตอนเย็นหรือหัวค่ำ และตอนเช้ามืดจนถึงช่วงสาย อดน้ำไม่เก่ง จึงมักอยู่ไม่ไกลจากแหล่งน้ำ อาหารหลักได้แก่ยอดไม้, หน่ออ่อน, ใบไม้, ผลไม้ และรวมถึงเปลือกไม้ด้วย ไม่ค่อยกินหญ้า พบแพร่กระจายพันธุ์ในเอเชียใต้และเอเชียตะวันออกเฉียงใต้ ตั้งแต่ ศรีลังกา, อินเดีย, จีนตอนใต้, พม่า, ไทย, ลาว, เวียดนาม, กัมพูชา, มาเลเซีย, เกาะสุมาตรา, เกาะชวา, เกาะบอร์เนียว, เกาะไหหลำ  และหมู่เกาะซุนดา มีฤดูผสมพันธุ์อยู่ในช่วงฤดูหนาว ตั้งแต่เดือนพฤศจิกายนถึงมกราคม ตกลูกต้นฤดูฝนพอดี  ปกติตกลูกครั้งละหนึ่งตัว ตั้งท้องนานราว 6 เดือน ออกลูกตามใต้พุ่มไม้ ลูกเก้งมีจุดสีขาวตามตัว  เมื่ออายุได้ราว 6 เดือน จุดสีขาวนั้นจึงค่อยจางหายไป เข้าสู่วัยเจริญพันธุ์ได้เมื่ออายุได้ 18 เดือน  อายุขัยประมาณ 15 ปี ในประเทศไทย ถือเป็นสัตว์ป่าคุ้มครอง',"
				+ 18.198026
				+ ","
				+ 98.485141
				+ ",'indian_muntjac_bg','indian_muntjac_icon','night','อุทยานแห่งชาติออบหลวง','1100001','klong_lan');");// 18.198026,
		// 98.485141

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Burmese hare','กระต่ายป่า','Lepus peguensis','ลักษณะเด่นคือ มีหูยาว สามารถมองเห็นได้แต่ไกล  มีขนขึ้นบริเวณกระพุ้งแก้มและมีฟันหน้าของขากรรไกรบน 4 ซี่ เรียงซ้อนกัน 2 คู่  ฟันคู่หลังเล็กกว่าคู่หน้า ขาคู่หลังยาวกว่าขาคู่หน้า เท้าหน้ามี 5 นิ้ว เท้าหลังมี 4 นิ้ว  ใต้ผ่าเท้ามีขนปกคลุมหนาแน่นช่วยให้เคลื่อนไหวได้โดยไม่มีเสียง หางสั้นเป็นกระจุก  ขนบริเวณหลังเป็นสีน้ำตาลปนเทา ปลายขนมีสีน้ำตาลเข้ม  ความยาวลำตัวและหัว 44-50 เซนติเมตร ความยาวหาง 6.5-8.5 เซนติเมตร น้ำหนัก 1.35-7  กิโลกรัม การกระจายพันธุ์ในพม่า, ไทย, เวียดนาม, ลาว, กัมพูชา ชอบอาศัยในป่าโปร่ง, ป่าเต็งรัง, ป่าเบญจพรรณ ออกหากินในเวลากลางคืนตามพงหญ้าที่รกชัฏ  ออกหากินตามลำพังในอาณาบริเวณของตัวเอง มี หญ้า  เป็นอาหารหลัก ยอดไม้ หรือผลไม้ที่ร่วงจากต้นเป็นอาหารเสริม  ในบางครั้งอาจแทะเขากวางที่ผลัดทิ้งเพื่อเพิ่มแคลเซียมด้วย กระต่ายป่าตัวผู้มักต่อสู้เพื่อแย่งชิงตัวเมียในฤดูผสมพันธุ์ด้วยการกระโดดถีบหรือกัดด้วยความรุนแรง กระต่ายป่าตัวเมียใช้เวลาตั้งท้อง 35-40 วัน ออกลูกครั้งละ 1-7 ตัว โดยการขุดโพรงใต้ดินอยู่ ลูกกระต่ายป่าที่เกิดใหม่จะขนปกคลุมตัว และลืมตาได้เลย',"
				+ 18.500430
				+ ","
				+ 98.624530
				+ ",'burmese_hare_bg','burmese_hare_icon','night','อุทยานแห่งชาติออบหลวง','1100001','klong_lan');");// 18.500430,
		// 98.624530

		/* อุทยานแห่งชาติเขาคิชฌกูฏ */

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Fishing cat','เสือปลา','Prionailurus viverrinus','เป็นสัตว์เลี้ยงลูกด้วยนมจำพวกเสือขนาดเล็ก จัดเป็นแมวป่าขนาดกลาง รูปร่างอ้วนป้อม ขนตามลำตัวค่อนข้างสั้นและหยาบมีสีเทา มีจุดสีน้ำตาลเข้มแกมดำเรียงเป็นแนวขยานไปกับความยาวลำตัว ดางตามีสีเขียว หางสั้นมากยาวเพียงครึ่งหนึ่งของลำตัว มีพังผืดบาง ๆ ยึดระหว่างนิ้วเท้าหน้า ไม่สามารถเก็บเล็บได้เหมือนเสือชนิดอื่น ๆ มีความยาวลำตัวและหัว 70-78 เซนติเมตร ความยาวหาง 25-29 เซนติเมตร น้ำหนัก 7-11 กิโลกรัม ลูกเสือปลาขนาดเล็กมีลักษณะคล้ายแมวดาว (P. bengalensis) ซึ่งอยู่ในสกุลเดียวกันมาก มีการกระจายพันธุ์กว้างขวางพบได้ตั้งแต่ตะวันตกเฉียงใต้ และตะวันออกเฉียงเหรือของอินเดีย, เนปาล, บังกลาเทศ, พม่า, ไทย, ลาว,เวียดนาม, กัมพูชา, เกาะสุมาตราและเกาะชวา มักอาศัยหากินอยู่ตามป่าพรุหรือป่าละเมาะหรือป่าชายเลน เพราะอาหารหลัก  คือ ปลา จึงเป็นทีมาของชื่อ สามารถจับปลาหรือสัตว์น้ำ สัตว์ขนาดเล็กกินได้เก่งมาก  โดยจะตะครุบปลาในแหล่งน้ำตื้น สามารถว่ายน้ำและดำน้ำได้อีกด้วย  สามารถปีนต้นไม้ได้แต่จะไม่ค่อยอยู่บนต้นไม้เท่าไหร่นัก บางครั้งจะอาศัยอยู่ใกล้กับชุมนุมมนุษย์  เช่น ในเขตประเวศ กรุงเทพมหานคร มีวัดแห่งหนึ่ง ชื่อ \"วัดกระทุ่มเสือปลา\" ก็แสดงหมายถึง  ในอดีตเคยมีเสือปลาชุกชุม เสือปลาใช้เวลาตั้งท้องประมาณ 63 วัน ตกลูกครั้งละ 1-4 ตัว เมื่ออายุได้ 10 เดือน  ก็จะแยกจากแม่ไปหากินตามลำพัง',"
				+ 12.827444
				+ ","
				+ 102.134397
				+ ",'fishing_cat_bg','fishing_cat_icon','night','อุทยานแห่งชาติเขาคิชฌกูฏ','1100001','kao_kid_cha_kud');");// 12.827444,
		// 102.134397

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Burmese python','งูหลาม','Python bivittatus','เป็นงูขนาดใหญ่ ไม่มีพิษ มีลักษณะคล้ายกับงูเหลือม (P. reticulatus) ซึ่งเป็นงูในสกุลเดียวกัน แต่มีขนาดเล็กกว่างูเหลือม  โดยความยาวโดยเฉลี่ยประมาณ 1-3เมตร (พบใหญ่ที่สุด 5.18 เมตร น้ำหนัก 74 กิโลกรัม  ที่อุทยานแห่งชาติเอเวอร์เกลดส์ สหรัฐอเมริกา ทำลายสถิติตัวที่มีความยาว 5 เมตร ในประเทศพม่า) มีลำตัวที่อ้วนป้อมกว่า อีกทั้งหางก็สั้นกว่า และมีขีดที่บนหัวเป็นสีขาว เรียกว่า \"ศรขาว\" อีกทั้งมีสีสันและลวดลายที่แตกต่างจากงูเหลือม รวมทั้งอุปนิสัยที่ไม่ดุต่างจากงูเหลือม  จึงเป็นที่นิยมเลี้ยงเป็นสัตว์เลี้ยงของผู้ที่นิยมเลี้ยงสัตว์เลื้อยคลานมากกว่า  นิยมกันมากในตัวที่สีกลายเป็นสีเผือกและลวดลายแตกต่างไปจากปกติ พบกระจายพันธุ์ตั้งแต่ตอนเหนือของพม่า สำหรับในประเทศไทยพบได้ทุกภาคของประเทศ  ยกเว้น ภาคใต้ ออกไข่ครั้งละประมาณ 40 ฟอง ระยะฟักเป็นตัวประมาณ 2 เดือน  มีอายุยืนประมาณ 15 ปี มีพฤติกรรมการหากินคล้ายคลึงกับงูเหลือม แต่มักจะหากินบนพื้นดิน  ไม่ชอบขึ้นต้นไม้หรือลงน้ำเหมือนงูเหลือม สำหรับในประเทศไทย  งูหลามจัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่าพุทธศักราช 2535',"
				+ 12.855395
				+ ","
				+ 102.154481
				+ ",'burmese_python_bg','burmese_python_icon','night','อุทยานแห่งชาติเขาคิชฌกูฏ','1101001','kao_kid_cha_kud');");// 12.855395,
		// 102.154481

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Lyle  flying fox','ค้างคาวแม่ไก่ภาคกลาง','Pteropus lylei','เป็นค้างคาวขนาดใหญ่ชนิดหนึ่ง ในวงศ์ค้างคาวผลไม้ (Pteropodidae) มีลักษณะเหมือนค้างคาวแม่ไก่ชนิดอื่น ๆ  มีขนาดใหญ่กว่าค้างคาวแม่ไก่เกาะแต่เล็กกว่าค้างคาวแม่ไก่ป่าฝน ขนส่วนท้องและหลังสีน้ำตาลทอง  ปลายหูแหลม มีความยาวแขนถึงศอกประมาณ 14.5-16 เซนติเมตร มีน้ำหนักตัว 390-480 กรัม  พบกระจายพันธุ์ในพื้นที่ภาคกลางตอนล่าง, ภาคตะวันออก และภาคใต้ตอนบน  ของประเทศไทย โดยพบตั้งแต่พื้นที่อ่าวไทยตอนในจรดจังหวัดอยุธยา และพบได้ที่กัมพูชาและเวียดนาม โดยอาศัยรวมกันเป็นฝูงใหญ่ เกาะบนต้นไม้  จากการศึกษาพบว่า ค้างคาวแม่ไก่ภาคกลางในประเทศไทย มีพื้นที่อาศัยเกาะนอน 16 แห่ง  โดยมักอาศัยอยู่ในป่าดิบชื้นหรือพื้นที่ใกล้สวนผลไม้ ในแต่ละคืน กินพืชเป็นอาหารประมาณ 3.38-8.45 ตัน  ซึ่งถือว่ามีปริมาณที่ค่อนข้างมากและยากที่เกษตรกรจะยอมรับได้ โดยเป็นพืชเศรษฐกิจเสียส่วนใหญ่ ปัจจุบัน  เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 12.840332
				+ ","
				+ 102.193620
				+ ",'lyle_flying_fox_bg','lyle_flying_fox_icon','night','อุทยานแห่งชาติเขาคิชฌกูฏ','1100000','kao_kid_cha_kud');");// 12.840332,
		// 102.193620

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Small asian mongoose','พังพอนเล็ก','Herpestes javanicus','เป็นสัตว์กินเนื้อชนิดหนึ่ง ในวงศ์ Herpestidae มีขนาดเล็ก  ขนบนหัวมีสีน้ำตาลแดงจนถึงน้ำตาลเข้ม ขามีสีเดียวกับลำตัวหรือเข้มกว่าเล็กน้อย  หางยาวประมาณ 2 ใน 3 ของลำตัว เมื่อตกใจจะพองขนทำให้ดูตัวใหญ่กว่าปกติ  เพศเมียจะมีเต้านมทั้งหมด 3 คู่ มีความยาวลำตัวและหัว 35-41 เซนติเมตร ความยาวหางประมาณ 25-29 เซนติเมตร พังพอนเล็กมีการกระจายพันธุ์ที่กว้างขวางมากตั้งแต่อิหร่าน, ปากีสถาน, อินเดีย, พม่า,เนปาล, รัฐสิกขิม, บังกลาเทศ, ไทย, ลาว,กัมพูชา, เวียดนาม, มาเลเซียและเกาะชวา  มีพฤติกรรมชอบอาศัยตามป่าโปร่งหรือทุ่งหญ้ามากกว่าป่าดิบทึบ ดังนั้นจึงมักเห็นพังพอนเล็กอาศัยอยู่แม้แต่ในเขตเมือง มักอาศัยอยู่ตามลำพังในโพรงดินที่ขุดไว้  หรือโพรงไม้ ยกเว้นในฤดูผสมพันธุ์หรือมีลูกอ่อนที่อาจอยู่เป็นคู่หรือเป็นกลุ่มเล็ก ๆ อาหารได้แก่  สัตว์ทั่วไปขนาดเล็ก หรือบางครั้งอาจล่าเหยื่อที่มีขนาดใหญ่กว่าลำตัว เช่น ไก่ป่า กินได้  ออกหากินทั้งกลางวันและกลางคืน พังพอนเล็กจัดเป็นสัตว์ที่มีความปราดเปรียวว่องไวมาก อีกทั้งมีนิสัยที่ไม่กลัวใคร จึงเป็นที่ทราบกันดีว่าชอบที่จะสู้กับงูพิษ  โดยเฉพาะงูเห่าเมื่อเผลอจะโดดกัดคองูจนตาย มีฤดูผสมพันธุ์ที่ไม่แน่นอน  มักจะผสมกันในโพงดิน ออกลูกครั้งละ 2-4 ตัว ใช้เวลาตั้งท้องนาน 6 สัปดาห์  สมัยก่อนในบางบ้านจะเลี้ยงพังพอนไว้สำหรับจับหนูหรือสัตว์ที่ทำรังควานในบ้านชนิดอื่น ๆ แทนแมว ซึ่งได้ผลดีกว่าแมวเสียอีก พังพอนเล็กแม้เป็นสัตว์ดุ  แต่หากเลี้ยงตั้งแต่เล็กก็จะเชื่องกับเจ้าของ ในสถานที่เลี้ยงพบว่ามีอายุยืนประมาณ 6 ปี ปัจจุบันเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช  2535',"
				+ 12.863637
				+ ","
				+ 102.133882
				+ ",'small_asian_mongoose_bg','small_asian_mongoose_icon','day','อุทยานแห่งชาติเขาคิชฌกูฏ','1100000','kao_kid_cha_kud');");// 12.863637,
		// 102.133882

		/* อุทยานแห่งชาติเขาพนมเบญจา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Tapir','สมเสร็จ','-','เป็นสัตว์เลี้ยงลูกด้วยน้ำนมกินพืชขนาดใหญ่ เป็นสัตว์มีหน้าตาประหลาด มีลักษณะของสัตว์หลายชนิดผสมอยู่ในตัวเดียวกัน  มีจมูกที่ยื่นยาวออกมาคล้ายงวงของช้าง ลำตัวคล้ายหมูที่มีขายาว หางสั้นคล้ายหมีและมีกีบเท้าคล้ายแรด อาศัยในป่าทึบในแถบอเมริกาใต้, อเมริกากลาง, และ เอเชียตะวันออกเฉียงใต้  มีทั้งหมดสี่ชนิด คือ สมเสร็จอเมริกาใต้, สมเสร็จมลายู, สมเสร็จอเมริกากลาง และสมเสร็จภูเขา  ทั้งสี่ชนิดถูกจัดสถานะเป็นใกล้สูญพันธุ์หรือเสี่ยงต่อการสูญพันธุ์ สมเสร็จเป็นญาติใกล้ชิดกับสัตว์กีบคี่อื่น ได้แก่ ม้า และแรด นิสัยทั่วไปของสมเสร็จคล้ายกับแรด ชอบใช้ชีวิตสันโดษตามลำพัง อาศัยอยู่ตามป่าดิบ รกทึบ และเย็นชื้นไม่ชอบอากาศร้อน  จึงมักอาศัยอยู่ใกล้ ๆ แหล่งน้ำ ว่ายน้ำและดำน้ำเก่ง การ ดำรงชีวิตใช้จมูกดมกลิ่นและใช้หูฟังเสียง มากกว่าจะใช้ตามองดู เนื่องจากตามีขนาดเล็ก และอยู่ด้านข้างของหัว สายตาของสมเสร็จจึงไม่ดี มองเห็นภาพได้ไม่ไกลนัก ปกติออกหากินตอนกลางคืน',"
				+ 8.291111
				+ ","
				+ 98.915505
				+ ",'tapir_bg','tapir_icon','night','อุทยานแห่งชาติเขาพนมเบญจา','1100000','pha_non_ban_ja');");// 8.291111,
		// 98.915505

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Black panther','เสือดำ','Panthera pardus','เป็นชื่อสามัญเรียกโดยรวมของสัตว์กินเนื้อประเภทเสือและแมว (Felidae) ที่มีลักษณะลำตัวรวมถึงลวดลายเป็นสีดำตลอดทั้งลำตัว ซึ่งเกิดขึ้นได้ในเสือหลายชนิด จากการเป็นเสือดำ เกิดจากความผิดปกติในเม็ดสีที่เรียกว่าเมลานิซึม  ส่งผลให้เสือที่เกิดมานั้นเป็นสีดำตลอดทั้งลำตัว โดยที่ยังมีลายหรือลายจุดคงอยู่ แต่จะสังเกตเห็นได้ยาก  จะเห็นได้ชัดเจนเมื่ออยู่ในแสงแดด  มักพบได้มากในป่าดิบชื้นในทวีปเอเชีย เช่น อินเดีย, เนปาล, เอเชียตะวันออกเฉียงใต้  โดยเฉพาะในเบงกอลหรือชวา ใต้ท้องของเสือดำมีสีจางเล็กน้อย ผิวสีดำของเสือดำไม่ได้มีสีดำสนิท  และยังคงมีลายแบบเสือดาวอยู่ด้วยซึ่งจะเห็นชัดเวลาต้องแสงแดง เสือดำในประเทศไทยพบได้ในป่าภาคใต้ และจากประสบการณ์ของผู้ที่เลี้ยงดูแลเสือในสวนสัตว์มีความเห็นว่า เสือดำนั้นมีความดุร้ายกว่าเสือดาว',"
				+ 8.297311
				+ ","
				+ 98.920269
				+ ",'black_panther_bg','black_panther_icon','night','อุทยานแห่งชาติเขาพนมเบญจา','1100001','pha_non_ban_ja');");// 8.297311,
		// 98.920269

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Clouded leopard','เสือลายเมฆ','Neofelis nebulosa','อยู่ในวงศ์เสือและแมว(Felidae) มีขนาดเล็กกว่าเสือดาว (Panthera pardus) แต่มีขนาดใหญ่กว่าแมวป่าขนาดเล็กชนิดอื่น ๆ  มีลักษณะเด่นคือ มีลวดลายตามลำตัวคล้ายก้อนเมฆ จึงเป็นที่มาของชื่อ  ลายที่อยู่บนหลังจะมีขนาดใหญ่กว่าบริเวณอื่น ๆ โดยลายดังกล่าวจะมีขอบสีดำล้อมรอบ  ขนตามลำตัวสีเหลืองอ่อน บางตัวอาจมีสีเทาเข้ม หรือ น้ำตาลเทา ใต้ท้องมีสีอ่อนกว่าลำตัว  หางยาวฟูและมีขนาดใหญ่เมื่อเทียบกับความยาวลำตัว มีลายจุดสีเข้มตลอดถึงปลายหาง ขาทั้ง 4 ข้างค่อนข้างสั้น แต่อุ้งเท้ามีขนาดใหญ่ ซึ่งช่วยเพิ่มความคล่องตัวในการปีนต้นไม้  ความยาวลำตัวและหัว 65 - 95 เซนติเมตร ความยาวหาง 55 - 80 เซนติเมตร น้ำหนัก 16 - 23 กิโลกรัม การกระจายพันธุ์ตั้งแต่เนปาล, สิกขิม, ภาคเหนือของอินเดีย, ภาคใต้ของจีน, ไต้หวัน, ตะวันตกของพม่า, ไทย, ลาว, กัมพูชา,เวียดนาม, มาเลเซีย, เกาะบอร์เนียวและเกาะสุมาตรา  พฤติกรรมมักอาศัยและหากินตามลำพัง หากินบนต้นไม้มากกว่าตามพื้น แต่ก็ลงมาบนพื้นดินบ้างเป็นบางครั้ง มักหากินในเวลากลางคืน เหยื่อได้แก่ นก, ลิง และงูบางชนิด โดยก่อนกินเหยื่อจะเลียขนของเหยื่ออกเสียก่อนเพื่อทำความสะอาด  บางครั้งจะกลับมากินเหยื่อที่เหลือทิ้งไว้จนหมด  เสือลายเมฆ นับเป็นเสือชนิดที่มีลวดลายสวยงาม จึงตกเป็นที่ต้องการของมนุษย์เสมอ ๆ ทั้งล่าเพื่อเอาหนัง และนำไปเป็นสัตว์เลี้ยง ซึ่งพฤติกรรมเมื่อเป็นสัตว์เลี้ยงโดยมนุษย์แล้ว  ปรากฏว่าเสือลายเมฆมีพฤติกรรมที่ไม่ดุและค่อนข้างเชื่องมากกว่าเสือหรือแมวป่าชนิดอื่น ๆ  สถานะปัจจุบันตามกฎหมายไทย เสือลายเมฆจัดเป็นสัตว์ป่าคุ้มครองประเภทที่ 1 ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช  2535 และสถานะในไซเตสจัดอยู่ในบัญชีหมายเลข 1',"
				+ 8.316080
				+ ","
				+ 98.925719
				+ ",'clouded_leopard_bg','clouded_leopard_icon','night','อุทยานแห่งชาติเขาพนมเบญจา','1101011','pha_non_ban_ja');");// 8.316080,
		// 98.925719

		/* อุทยานแห่งชาติเขาหลวง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Black egle','อินทรีดำ','Ictinaetus malayensis','เป็นนกล่าเหยื่อขนาดใหญ่จำพวกอินทรี มีขนปกคลุมลำตัวสีดำสนิท ขนคลุมทั้งจมูก และตีนมีสีเหลือง  หางมีลายแถบสีอ่อนคาด ขณะบินปีกกว้าง ปลายปกแตกเป็นรูปนิ้วมือชัดเจน หางยาวมาก  ขณะที่ยังเป็นนกที่โตไม่เต็มวัยจะมีสีน้ำตาลหม่น ปากสั้นปลายแหลม มีเล็บนิ้วเท้าแหลมคมและแข็งแรงมาก ขนาดเมื่อโตเต็มที่ประมาณ 69-81 เซนติเมตร ตัวผู้และตัวเมียมีลักษณะเหมือนกัน พบกระจายพันธุ์ตั้งแต่อนุทวีปอินเดียและภูมิภาคอินโดจีน  ในประเทศไทยจะพบได้ตามป่าในแนวเขาตั้งแต่เหนือจรดใต้ได้ไม่ยากนัก โดยเฉพาะทางป่าตะวันตก แต่ปัจจุบันก็มีจำนวนลดน้อยลงจากเดิมเนื่องจากถิ่นที่อยู่ถูกทำลาย อินทรีดำ มีพฤติกรรมล่าเหยื่อที่แตกต่างไปจากอินทรีหรือเหยี่ยวชนิดอื่น คือ การบินมาเกาะใกล้รังนกเล็กหรือกระรอก แล้วไต่กิ่งไปล่าเหยื่อในรัง รวมทั้งไข่นก  นอกเหนือจากจากโฉบเหยื่อที่เป็นพฤติกรรมโดยปกติ จัดเป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 8.343119
				+ ","
				+ 99.725968
				+ ",'black_egle_bg','black_egle_icon','night','อุทยานแห่งชาติเขาหลวง','1101001','kao_loang');");// 8.343119,
		// 99.725968

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Binturong, Bearcat','หมีขอ','Arctictis binturong','เป็นสัตว์เลี้ยงลูกด้วยน้ำนม แม้จะมีหน้าตาคล้ายหมีจนได้ชื่อว่าหมี แต่เป็นสัตว์จำพวกชะมดและอีเห็น (Viverridae) ที่ใหญ่ที่สุด  หูกลม บริเวณขอบหูมีสีขาว หางที่ยาวสามารถใช้เกาะเกี่ยวต้นไม้ได้เป็นอย่างดี ภาคตะวันตกของพม่า, ไทย, ลาว, กัมพูชา, พรมแดนระหว่างเวียดนามติดกับลาวและกัมพูชา, มาเลเซีย, เกาะสุมาตรา, เกาะบอร์เนียวในอินโดนีเซีย และเกาะปาลาวันในฟิลิปปินส์ แต่ในบางครั้งอาจอยู่รวมกันเป็นกลุ่มเล็ก ๆ ประกอบไปด้วย แม่และลูก  ในเวลากลางวันจะอาศัยโพรงไม้เป็นที่หลับนอน อาหารได้แก่  ผลไม้และสัตว์ที่มีขนาดเล็กชนิดต่าง ๆ บนต้นไม้ทั้งแมลงและสัตว์เลื้อยคลานปีนต้นไม้ได้เก่งมาก  โดยใช้หางที่ยาวเกาะเกี่ยวกิ่งไม้จากต้นหนึ่งไปยังอีกต้นหนึ่ง นอกจากนี้ยังสามารถว่ายน้ำได้อีกด้วย มีการผสมพันธุ์กันได้ตลอดทั้งปี  ใช้เวลาตั้งท้องนาน 92 วัน ออกลูกครั้งละ 1-3 ตัว หมีขอตัวเมียจะมีเต้านมทั้งหมด 2 คู่  ลูกที่เกิดใหม่ยังไม่สามารถขาและหางเกี่ยวกิ่งไม้ได้ชำนาญเหมือนตัวพ่อแม่ สถานะปัจจุบันเป็นสัตว์ป่าคุ้มครองประเภทที่ 2 ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 8.326336
				+ ","
				+ 99.708185
				+ ",'bearcat_bg','bearcat_icon','night','อุทยานแห่งชาติเขาหลวง','1100000','kao_loang');");// 8.326336,
		// 99.708185

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Banded surili','ค่างดำมลายู','Presbytis femoralis','เป็นค่างชนิดหนึ่งที่พบได้ในประเทศไทย มีรูปร่างทั่วไปคล้ายค่างชนิดอื่น  ๆ ขนตามลำตัวสีน้ำตาลเข้มจนถึงดำ ขนบริเวณท้องอ่อนกว่าสีตามลำตัว  หน้าอกมีสีขาว มีวงแหวนสีขาวรอบดวงตามากกว่าค่างชนิดอื่น ๆ เหมือนสวมแว่นตา  ปลายหางมีรูปทรงเนียวเล็กและมีสีอ่อนกว่าโคนหาง ลูกเมื่อยังแรกเกิดจะมีขนสีทอง ส่วนหัวมีสีเทาเข้ม มีความยาวลำตัวและหัวประมาณ 48-58 เซนติเมตร ความยาวหาง 72-84 เซนติเมตร  มีน้ำหนักประมาณ 5-7 กิโลกรัม ค่างดำมลายูพบกระจายพันธุ์ตั้งแต่แหลมมลายูลงไปจนถึง เกาะบอร์เนียวและเกาะสุมาตรา  ในอินโดนีเซีย มีนิเวศวิทยามักอาศัยในป่าที่ใกล้กับแหล่งน้ำ อาทิ บึงหรือชายทะเล  บางครั้งอาจพบในป่าที่มีความสูงจากระดับน้ำทะเลประมาณ 600-2,200 เมตร อยู่รวมกันเป็นฝูง  ในจำนวนสมาชิกไม่มากนักเมื่อเทียบกับค่างชนิดอื่น คือ ประมาณ 5-10 ตัวเท่านั้น สถานะของค่างดำมลายูในประเทศไทย  เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 8.340773
				+ ","
				+ 99.708872
				+ ",'banded_surili_bg','banded_surili_icon','day','อุทยานแห่งชาติเขาหลวง','1100001','kao_loang');");// 8.340773,
		// 99.708872

		/* อุทยานแห่งชาติเขื่อนศรีนครินทร์ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'White-handed gibbon','ชะนีมือขาว','Hylobates lar','เป็นสัตว์เลี้ยงลูกด้วยน้ำนมอันดับวานร (Primates) ชนิดหนึ่ง จัดเป็นลิงไม่มีหางชนิดหนึ่ง จำพวกชะนี (Hylobatidae) มีแขนยาว ขาหลังสั้น นิ้วหัวแม่มือแยกออกจากนิ้วชี้เป็นล่ามลึกลงในฝ่ามือ  ทำให้มือมีรูปร่างยาวและแคบใช้ในการกำหรือจับต้นไม้ได้แน่นเหมือนตะขอ ฝ่ามือ ใบหน้าและใบหูมีสีดำ  มีขน 2 สี คือ สีน้ำตาลอ่อน และสีดำ โดยสีของขนไม่เกี่ยวกับอายุหรือเพศ ขนบริเวณหลังมือ เท้าและรอบใบหน้ามีสีขาวอันเป็นที่มาของชื่อ มีความยาวลำตัวและหัว 45-60 เซนติเมตร น้ำหนัก 3.9-7 กิโลกรัม มีการกระจายพันธุ์อยู่ทางภาคใต้ของจีน, พม่า, ภาคตะวันตกของไทย, ภาคเหนือของลาว, มาเลเซียและเกาะสุมาตรา ชะนีมือขาวสามารถอาศัยได้ในป่าหลายประเภท เช่น ป่าเบญจพรรณ, ป่าดิบทั้งชื้นและแล้ง  มักเลือกอาศัยบนต้นไม้ที่มีใบรกชัฏ ออกหากินในเวลาเช้าถึงเย็น อาศัยหลับนอนบนต้นไม้  โดยจะใช้ต้นไม้ที่เป็นรังนอนหลายตัวภายในอาณาเขตครอบครองของแต่ละครอบครัว  ต้นไม้ที่ใช้หลับนอนมักอยู่ใกล้แหล่งอาหาร อาหารหลักได้แก่ ยอดไม้อ่อน, ใบไม้, ผลไม้ รวมทั้งแมลงบางชนิด แต่จะกินผลไม้มากกว่าอาหรชนิดอื่น  ๆ ดื่มน้ำด้วยการเลียตามใบไม้หรือล้วงเข้าไปวักในโพรงไม้  ครอบครัวของชะนีมือขาวครอบครัวหนึ่งจะประกอบไปด้วย พ่อ แม่ และลูก ปกติออกลูกครั้งละ 1 ตัว  มีเวลาตั้งท้องนาน 210 วัน และให้ลูกกินนมเป็นเวลา 18 เดือน ลูกชะนีจะเกาะอยู่ที่หน้าอกแม่นานถึง 2 ปี  เมื่ออายุได้ 8-9 ปี ก็จะแยกออกไปตั้งครอบครัวใหม่ ชะนีมือขาวในอุทยานแห่งชาติเขาใหญ่ มีการผสมข้ามพันธุ์กับชะนีมงกุฎ (H.pileatus) จนเกิดเป็นชะนีลูกผสมซึ่งมีลักษณะรูปร่างที่แตกต่างออกไป รวมถึงเสียงร้องด้วย  อันเนื่องจากอุทยานแห่งชาติเขาใหญ่นับเป็นสถานที่แห่งเดียวในโลก ที่มีชะนีทั้ง 2 ชนิดนี้อาศัยอยู่ในพื้นที่เดียวกัน',"
				+ 14.451991
				+ ","
				+ 99.005763
				+ ",'white_handed_gibbon_bg','white_handed_gibbon_icon','day','อุทยานแห่งชาติเขื่อนศรีนครินทร์','1100001','dam_sri_na_ka_ring');");// 14.451991,
		// 99.005763

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Red giant flying squirrel','พญากระรอกบินหูแดง','Petaurista petaurista','เป็นกระรอกบินขนาดใหญ่  มีรูปร่างและลักษณะคล้ายพญากระรอกบินหูดำ (P. elegans) ซึ่งอยู่ในสกุลเดียวกัน  แตกต่างจากตรงที่มีปลายหางสีดำ ขนสีน้ำตาลแดงไม่มีลาย หัวและหางมีลายจาง  ๆ มีขนสีน้ำตาลแดงจางและมีลายจุดสีขาวหนาแน่น โดยเฉพาะบริเวณหัว  ขอบหูด้านหน้าเป็นสีขาวและมีรอยแต้มสีขาวบริเวณไหล่ หางสีน้ำตาลอ่อนหรือสีเทา ปลายหางสีดำ  มีคอหอยสีขาว มีความยาวลำตัวและหัวประมาณ 52 เซนติเมตร ความยาวหาง 63 เซนติเมตร หากินในเวลากลางคืนเช่นเดียวกับกระรอกบินชนิดอื่น ๆ พบกระจายพันธุ์ในป่าดิบชื้นที่มีความอุดมสมบูรณ์ ตั้งแต่อัฟกานิสถาน, ตอนเหนือของอินเดีย  เช่น รัฐชัมมูและกัศมีร์ ไปตลอดจนแนวเทือกเขาหิมาลัยจนถึงเอเชียตะวันออก เช่น เกาะไต้หวัน  ในประเทศไทยจะพบได้ในภาคใต้ตั้งแต่คอคอดกระลงไปจนถึงแหลมมลายู, สิงคโปร์  จนถึงเกาะบอร์เนียวและชวา นอกจากนี้แล้วยังพบได้ที่ศรีลังกาอีกด้วย กินอาหารจำพวกพืชและผลไม้ตลอดจนแมลง พญากระรอกบินหูแดงสามารถร่อนได้ไกลถึง 75 เมตร (250 ฟุต)',"
				+ 14.384159
				+ ","
				+ 99.045588
				+ ",'red_giant_flying_squirrel_bg','red_giant_flying_squirrel_icon','night','อุทยานแห่งชาติเขื่อนศรีนครินทร์','1101001','dam_sri_na_ka_ring');");// 14.384159,
		// 99.045588

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Himalayan marten','หมาไม้','Martes flavigula','สัตว์เลี้ยงลูกด้วยน้ำนมชนิดหนึ่งในอันดับสัตว์กินเนื้อ มีรูปร่างคล้ายพญากระรอกดำ (Ratufa bicolor) มีลักษณะเด่นคือ ตั้งแต่ใต้คอลงไปถึงหน้าอกมีสีเหลือง ส่วนหัวด้านบนมีสีดำ ขาสั้นเมื่อเทียบกับขนาดตัว ตัวผู้มีฟันเขี้ยวขนาดใหญ่กว่าตัวเมีย หางยาวพอ ๆ กับความยาวลำตัว หมาไม้ชนิดย่อยที่อาศัยอยู่ทางภาคเหนือของทวีปเอเชียจะมีขนาดใหญ่กว่าชนิดที่อาศัยอยู่ใกล้เส้นศูนย์สูตรกิโลกรัมสามารถหากินได้ทั้งบนต้นไม้และพื้นดิน กินอาหารได้หลากหลายประเภททั้งพืชและสัตว์ ทั้งสัตว์ฟันแทะ, แมลง, สัตว์เลื้อยคลาน, นก หรือ ไข่นก บางครั้งอาจเข้ามาหาอาหารที่นักท่องเที่ยวป่าทิ้งไว้ตามเต๊นท์  นอกจากนี้ยังสามารถกินผึ้งและน้ำผึ้งเหมือนหมีได้อีกด้วย มักหากินในเวลากลางวัน  แต่บางครั้งอาจหากินในเวลากลางคืน มักจะหากินแต่เพียงลำพังหรือเป็นคู่ไม่มากกว่านั้น หมาไม้ตัวเมียจะตั้งท้องนาน 220-290 วัน ออกลูกครั้งละ 3-5 ตัว อายุขัยในสถานที่เลี้ยงประมาณ 14 ปี',"
				+ 14.329613
				+ ","
				+ 99.174678
				+ ",'himalayan_marten_bg','himalayan_marten_icon','night','อุทยานแห่งชาติเขื่อนศรีนครินทร์','1100000','dam_sri_na_ka_ring');");// 14.329613,
		// 99.174678

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Kalij pheasant','ไก่ฟ้าหลังเทา','Lophura leucomelanos','เป็นไก่ฟ้าที่พบในป่าทึบโดยเฉพาะในตีนเขาของเทือกเขาหิมาลัย จากแม่น้ำสินธุไปทางตะวันตกจนถึงไทย มันถูกนำเข้าสู่รัฐฮาวาย (แต่ค่อน ข้างหายาก) ที่นั่นมันจัดเป็นชนิดพันธุ์ต่างถิ่นที่กินและแพร่กระจายพืชชนิดพันธุ์ต่างถิ่น  ตัวผู้มีขนหลากหลายขึ้นกับชนิดย่อย แต่อย่างน้อยก็มีสีขนดำออกฟ้า  ขณะที่เพศเมียเป็นสีน้ำตาลทั้งตัว ทั้งสองเพศมีหนังสีแดงที่หน้า ขาออกเทา ตัวผู้ยาว 63-74 ซม. ตัวเมียยาว 50-60 ซม. ตัวเมียสีออกน้ำตาล  อาหารได้แก่ แมลง ตัวหนอน ไส้เดือน สัตว์ขนาดเล็ก และเมล็ดพืชบางชนิด เช่นขุยไผ่  เมล็ดหญ้า ผลไม้สุก',"
				+ 14.366866
				+ ","
				+ 99.041468
				+ ",'kalij_pheasant_bg','kalij_pheasant_icon','day','อุทยานแห่งชาติเขื่อนศรีนครินทร์','1100001','dam_sri_na_ka_ring');");// 14.366866,
		// 99.041468

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Forest Crested Lizard','กิ้งก่าแก้ว','Calotes emma Gray','ลำตัวปกคลุมด้วยเกล็ดสันชี้มาด้านหลังในลักษณะเฉียงขึ้น มีหนามหลังตา  1 อัน หนามบริเวณเหนือเยื่อหู 2 อัน เยื่อหูปรากฏชัด  ด้านหน้าของไหล่มีรอยพับของผิวหนังซึ่งภายในปกคลุมด้วยเกล็ดสีดำ ขนาดของเกล็ดลำตัวเท่ากัน  ลำตัวสีเขียวถึงน้ำตาลเทา หัวด้านบนสีน้ำตาล  มีแถบดำพาดตั้งแต่บริเวณจมูกมาถึงท้ายทอยเหนือเยื่อหู ริมฝีปากบนสีขาว คางและเหนียงสีเทาดำ  หลังมีแถบสีน้ำตาล 6 แถบพาดขวางลำตัว หางมีแถบสีเทาสลับกับดำพาดขวาง หากินในเวลากลางวัน ตามพื้นป่า กินแมลงและสัตว์เล็กๆ เป็นอาหาร  กลางคืนจะเกาะกิ่งไม้ขนาดเล็ก หรือลำต้นลูกไม้ขนาดเล็กนอน  พบในพื้นที่ป่าดิบแล้งและทุ่งหญ้าในป่าดิบแล้ง',"
				+ 14.232461
				+ ","
				+ 99.122493
				+ ",'forest_crested_lizard_bg','forest_crested_lizard_icon','day','อุทยานแห่งชาติเขื่อนศรีนครินทร์','1100000','dam_sri_na_ka_ring');");// 14.232461,
		// 99.122493

		/* อุทยานแห่งชาติไทรโยค */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Schomburgk deer','สมัน','Rucervus schomburgki','เป็นสัตว์เลี้ยงลูกด้วยนมจำพวกสัตว์กีบคู่ชนิดหนึ่ง เป็นกวางขนาดกลาง ขนตามลำตัวสีน้ำตาลเข้ม  ท้องมีสีอ่อนกว่า ริมฝีปากล่างและด้านล่างของหางเป็นสีขาว  มีลักษณะเด่นคือตัวผู้จะมีเขาแตกแขนงออกไปมากมายเหมือนกิ่งไม้ แลดูสวยงาม จึงได้ชื่อว่าเป็นกวางที่มีเขาสวยที่สุดในโลก มีกิ่งรับหมาหรือกิ่งเขาที่ยื่นออกไปข้างหน้ายาวกว่ากิ่งรับหมาของกวางชนิดอื่น ๆ สมันมีความยาวลำตัว  180 เซนติเมตร ความยาวหาง 10 เซนติเมตร มีความสูงจากพื้นดินถึงหัวไหล่ 100-110 เซนติเมตร  น้ำหนักประมาณ 100-120 กิโลกรัมสมันนั้นวิ่งเร็วประมาณ 100 กิโลเมตร ต่อชั่วโมง',"
				+ 14.342701
				+ ","
				+ 98.624101
				+ ",'schomburgk_deer_bg','schomburgk_deer_icon','day','อุทยานแห่งชาติไทรโยค','1100001','sai_yok');");// 14.342701,
		// 98.624101

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Kitti hog-nosed bat','ค้างคาวกิตติ','Craseonycteris thonglongyai Hill 1974','เป็นค้างคาวที่จัดอยู่ในสภาวะที่เสี่ยงต่อการสูญพันธุ์ พบได้ทางตะวันตกของประเทศไทย และทางตะวันออกเฉียงใต้ของประเทศพม่า อาศัยอยู่ตามถ้ำหินปูนริมแม่น้ำ ค้างคาวคุณกิตติเป็นค้างคาวและสัตว์เลี้ยงลูกด้วยนมที่มีขนาดเล็กที่สุดในโลก มีสีน้ำตาลปนแดงเรื่อๆ  หรือสีเทา มีจมูกคล้ายจมูกหมู มีอุปนิสัยชอบอยู่รวมกันเป็นกลุ่ม เฉลี่ยแล้วกลุ่มละ 100 ตัวต่อถ้ำ  ออกหากินเป็นช่วงสั้นๆในตอนเย็นและเช้ามืด หากินไม่ไกลจากถ้ำที่พักอาศัย กินแมลงเป็นอาหาร  ตกลูกปีละหนึ่งตัว ลำตัวยาวประมาณ 29-33 มม. หนักประมาณ 2 กรัม ค้างคาวคุณกิตติพบในถ้ำหินปูนริมแม่น้ำในป่าดิบแล้งและป่าเบญจพรรณในประเทศไทยพบค้างคาวคุณกิตติจำกัดอยู่ในพื้นที่ของจังหวัดกาญจนบุรี ในแถบลุ่มน้ำของแม่น้ำแควน้อยในอุทยานแห่งชาติไทรโยคพบการกระจายตัวของค้างคาวมากที่สุด จากการสำรวจถ้ำในเขตจังหวัดกาญจนบุรี พบค้างคาวกิตติจำนวน 35 ถ้ำ  ซึ่งส่วนใหญ่กระจายอยู่ในเขตอำเภอไทรโยคมากถึง 23 ถ้ำ ที่เหลือพบในเขตอำเภอทองผาภูมิ ท่าม่วง  และอำเภอเมืองขณะที่ประชากรค้างค้าวนอกเหนือจากในอุทยานแล้วอยู่ในสภาวะที่เสี่ยงต่อการถูกคุกคาม',"
				+ 14.448450
				+ ","
				+ 98.833528
				+ ",'kitti_bat_bg','kitti_bat_icon','night','อุทยานแห่งชาติไทรโยค','1100000','sai_yok');");// 14.448450,
		// 98.833528

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Fea  muntjac','เก้งหม้อ','Muntiacus feae','เป็นสัตว์เลี้ยงลูกด้วยนมในอันดับสัตว์กีบคู่จำพวกกวาง มีลักษณะคล้ายเก้งธรรมดา  (M. muntjac) แต่ต่างกันเก้งหม้อจะมีขนบริเวณลำตัวที่เข้มกว่า ใบหน้ามีสีน้ำตาลเข้ม  บริเวณกระหม่อมและโคนขามีสีเหลืองสด ด้านล่างของลำตัวมีสีน้ำตาลอ่อน ขาทั้ง 4 ข้างมีสีดำ จึงเป็นที่มาของอีกชื่อสามัญที่เรียก ด้านหน้าด้านหลังมีสีขาวเห็นได้ชัดเจน หางสั้น  หางด้านบนมีสีเข้ม แต่ด้านล่างมีสีขาว มีเขาเฉพาะตัวผู้ เขาของเก้งหม้อสั้นกว่าเก้งธรรมดา  ผลัดเขาปีละ 1 ครั้ง มีความยาวลำตัวและหัว 88 เซนติเมตร ความยาวหาง 10 เซนติเมตร น้ำหนัก  22 กิโลกรัม มีการกระจายพันธุ์ในภาคใต้ของพม่า มาเลเซีย ภาคตะวันตกและภาคใต้ของไทย เป็นเก้งที่หายากที่สุดชนิดหนึ่งของโลก ครั้งหนึ่งเคยเชื่อว่าเหลือเพียงตัวเดียวในโลก  ที่สวนสัตว์ดุสิต แต่ปัจจุบัน ยังพอหาได้ตามป่าธรรมชาติและวัดในพรมแดนไทยพม่า ที่พระสงฆ์เลี้ยงอยู่  เก้งหม้ออาศัยอยู่ในป่าที่มีความชื้นสูง เช่น บริเวณหุบเขาหรือป่าดิบชื้นใกล้แหล่งน้ำ  อดน้ำได้ไม่เก่งเท่าเก้งธรรมดา ออกหาอาหารตามลำพังในช่วงเย็นหรือพลบค่ำ  แต่ในบางครั้งอาจพบอยู่เป็นคู่หรือเป็นฝูงเล็ก ๆ ในฤดูผสมพันธุ์ จะผสมพันธุ์ในช่วงฤดูหนาว  ตั้งท้องนาน 6 เดือน ออกลูกครั้งละ 1 ตัว  ปัจจุบันเป็นสัตว์ป่าสงวนตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่าแห่งชาติ พ.ศ. 2535',"
				+ 14.419524
				+ ","
				+ 98.642640
				+ ",'fea_muntjac_bg','fea_muntjac_icon','night','อุทยานแห่งชาติไทรโยค','1100001','sai_yok');");// 14.419524,
		// 98.642640

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Nutaphand narrow headed softshell turtle','ตะพาบม่านลาย','Chitra chitra','เป็นตะพาบที่มีลวดลายสวยและมีขนาดใหญ่ที่สุดในโลก มีรูปร่างคล้ายตะพาบทั่วไป แต่มีขนาดใหญ่กว่ามาก หัวเล็กและลำคอยาว จมูกค่อนข้างสั้นยาว เมื่อขนาดเล็กมากจะมีแถบสีเหลืองปนน้ำตาลบนส่วนหัวและกระดองอย่างชัดเจน โดยสีสันนั้นอาจปรับเปลี่ยนได้ตามสภาพแวดล้อม อาจจะเปลี่ยนเป็นสีน้ำตาลอมม่วงก็ได้  บนกระดองลายแถบจะพาดผ่านส่วนหัวยาวอย่างต่อเนื่องมาบนกระดอง ส่วนท้องจะมีสีขาวหรือขาวอมชมพู โดยโตเต็มที่อาจยาวได้ถึง 1.5 เมตร ความกว้างของกระดอง 1 เมตร และหนักถึง 100-120 กิโลกรัม ตัวผู้มีขนาดเล็กกว่าตัวเมียครึ่งต่อครึ่ง  เชื่อว่ามีอายุยืนยาวได้กว่า 100 ปี ถิ่นกำเนิดที่แม่น้ำแคว จังหวัดกาญจนบุรี, แม่น้ำแม่กลอง  จังหวัดราชบุรี และแม่น้ำปิงในเขตภาคเหนือของประเทศไทยเท่านั้น  และมีรายงานว่าพบที่ลุ่มแม่น้ำเจ้าพระยาในภาคกลาง และพบที่มาเลเซียและอินโดนีเซียด้วย ตะพาบตัวเมียจะขึ้นมาวางไข่บนหาดทรายริมแหล่งน้ำ โดยขุดหลุมลึก 40-50 เซนติเมตร ออกไข่เสร็จแล้วจะปิดทรายไว้ปากหลุมทิ้งไว้ประมาณ 2 เดือน ไข่จะฟักออกเป็นตัว  ลูกตะพาบจะวิ่งหาลงน้ำ และหาอาหาร ซึ่งได้แก่ ลูกปลา, ลูกกุ้งและสัตว์น้ำขนาดเล็กเป็นอาหาร  เลี้ยงตัวจนถึงวัยเจริญพันธุ์ โดยพฤติกรรมในธรรมชาติจะฝังตัวอยู่ใต้ทรายในพื้นน้ำ โผล่มาแต่เฉพาะตาและจมูกเท่านั้น และจะหาเหยื่อด้วยวิธีการซุ่มนี้',"
				+ 14.305777
				+ ","
				+ 98.882280
				+ ",'chitra_chitra_bg','chitra_chitra_icon','day','อุทยานแห่งชาติไทรโยค','1101001','sai_yok');");// 14.305777,
		// 98.882280

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian giant toad','จงโคร่ง','Phrynoidis aspera','เป็นสัตว์ครึ่งบกครึ่งน้ำจำพวกคางคกขนาดใหญ่ที่พบในประเทศไทยชนิดหนึ่ง จงโคร่งนับเป็นคางคกชนิดที่ใหญ่ที่สุดที่พบได้ในประเทศไทย บริเวณหลังมีน้ำพิษเห็นเป็นปุ่มชักเจน ตาใหญ่ ตัวมีสีน้ำตาลดำ ตัวผู้มักปรากฏลายสีเข้มเป็นแถบทั้งขาหน้า และขาหลัง บริเวณใต้ท้องมีสีขาวหม่น  ขนาดโตเต็มที่ประมาณ 22 เซนติเมตร ขายาว 6-8 นิ้ว ขาหน้าสั้นกว่าขาหลัง นิ้วเท้ามี 4 นิ้ว สามารถเปลี่ยนสีลำตัวได้ตามสภาพแวดล้อม โดยตัวเมียมีขนาดใหญ่กว่าตัวผู้ จงโคร่งเป็นสัตว์ที่พบได้เฉพาะในป่าดิบชื้น โดยจะอาศัยอยู่ตามแหล่งน้ำในป่า  เช่น ลำธารน้ำตกหรือลำห้วย โดยมักใช้ชีวิตอยู่ในน้ำมากกว่าอยู่บนบก  มักหลบอยู่ตามขอนไม้หรือก้อนหินขนาดใหญ่ หากินในเวลากลางคืน อาหารหลักได้แก่  แมลงและสัตว์น้ำขนาดเล็ก มีเสียงร้องคล้ายสุนัขเห่า จึงได้อีกชื่อหนึ่งว่า \"หมาน้ำ\" โดยมีพฤติกรรมร้องเป็นจังหวะ  ๆ ละ 6-10 วินาที ลักษณะไข่เป็นฟองกลม ๆ อาจติดอยู่ตามขอบแหล่งน้ำที่อาศัย โดยฤดูกาลผสมพันธุ์อยู่ในช่วงฤดูฝนจนถึงต้นฤดูหนาว พบกระจายพันธุ์ทั่วไปในป่าดิบชื้นในภูมิภาคเอเชียตะวันออกเฉียงใต้ ในประเทศไทย พบได้ในภาคเหนือ, ภาคตะวันตกและภาคใต้ ปัจจุบัน มีสถานะเป็นสัตว์ป่าคุ้มครอง',"
				+ 14.299789
				+ ","
				+ 98.885713
				+ ",'giant_jungle_toad_bg','giant_jungle_toad_icon','night','อุทยานแห่งชาติไทรโยค','1100000','sai_yok');");// 14.299789,
		// 98.885713

		/* อุทยานแห่งชาติธารโบกขรณี */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Large indian civet','ชะมดแผงหางปล้อง ','Viverra zibetha','มีลำตัวสีเทาค่อนข้างดำ มีลายสีดำข้างลำตัว ข้างลำคอมีเส้นสีดำสามแถบพาดผ่านในแนวขวาง มีจุดเด่น คือ ส่วนหางมีลายสีดำสลับกับขาวเป็นปล้อง ๆ 5-6 ปล้อง มีขนสีดำสนิทพาดตั้งแต่กึ่งกลางหลังจนถึงโคนหาง เท้ามีสีดำ ตัวผู้มีขนาดใหญ่กว่าตัวเมียเล็กน้อย จัดเป็นชะมดที่มีขนาดใหญ่ชนิดหนึ่ง มีความยาวลำตัวและหัว 75-85 เซนติเมตร ความยาวหาง 38-46 เซนติเมตร น้ำหนักตัว 8-10 กิโลกรัม พบกระจายพันธุ์อย่างกว้างขวางตั้งแต่อนุทวีปอินเดีย, อินโดจีน, ประเทศจีน, ฮ่องกง, มาเลเซีย และสิงคโปร์ สามารถใช้ชีวิตอยู่ได้ในป่าหลากหลายประเภท แม้กระทั่งใกล้ชุมชนของมนุษย์ หากินในเวลากลางคืน กินอาหารได้หลากหลาย โดยจับเหยื่อจะใช้ฟันกัดและสะบัดอย่างแรงจนเหยื่อตายมากกว่าจะใช้เล็บตะปบ ตอนกลางวันจะนอนหลับตามโพรงไม้หรือโพรงหินหรือในถ้ำ เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 8.377730
				+ ","
				+ 98.685635
				+ ",'large_indian_civet_bg','large_indian_civet_icon','night','อุทยานแห่งชาติธารโบกขรณี','1110001','tan_bok_ka_ra_nee');");// 8.377730,
		// 98.685635

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Pangolin, Pholidotes, Scaly anteater','นิ่ม','Viverra zibetha','ลิ่นทุกชนิดจะมีส่วนหน้าที่ยาว มีปากขนาดเล็ก มีลักษณะเป็นรูเล็ก ๆ ไม่มีฟัน กินอาหารโดยการใช้ลิ้นที่ยื่นยาวและน้ำลายที่เหนียวตวัดกินแมลงตามพื้นดิน จำพวก มดและปลวกหรือหนอนขนาดเล็ก และมีลำตัวที่ปกคลุมด้วยเกล็ดเป็นชิ้น ๆ เหมือนกับสัตว์เลื้อยคลาน ทำหน้าที่เหมือนชุดเกราะเพื่อใช้ในการป้องกันตัว เมื่อถูกรุกรานลิ่นจะลดลำตัวเป็นวงกลม ขณะที่ส่วนท้องจะไม่มีเกล็ด ซึ่งจะถูกโจมตีได้ง่าย ลิ่นมีเล็บที่แหลมคมและยื่นยาว ใช้สำหรับขุดพื้นดินหาอาหารและขุดโพรงเป็นที่อยู่อาศัยและพักผ่อน และปีนต้นไม้ เป็นสัตว์ที่หากินในเวลากลางคืน ลิ่นออกลูกเป็นตัว ครั้งละ 1-2 ตัว ตั้งท้องนานราว 130 วัน เมื่อแรกเกิด ลูกลิ่นจะมีเกล็ดติดตัวมาตั้งแต่เกิด และจะเกาะกับแม่ตรงบริเวณโคนหาง ซึ่งลูกลิ่นวัยอ่อนจะยังไม่มีเกล็ดแข็งเหมือนกับลิ่นวัยโต แต่จะค่อย ๆ แข็งขึ้นเรื่อย ๆ ตามการเจริญเติบโต โดยผู้ที่เข้าป่าหาตัวลิ่นจะใช้สุนัขดมกลิ่นตามล่า หากลิ่นปีนขึ้นต้นไม้ ก็จะใช้การตัดต้นไม้ต้นนั้นทิ้งเสีย โดยการค้าตัวลิ่นถือว่าเป็นการกระทำที่ผิดกฎหมาย เพราะลิ่นไม่ว่าชนิดไหน ในประเทศไทย ถือว่าเป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 และมีกฎหมายคุ้มครองระหว่างประเทศอีกด้วย ผู้กระทำผิดจะได้รับโทษปรับไม่เกิน 40,000 บาท จำคุก 4 ปี หรือทั้งจำทั้งปรับ',"
				+ 8.380448
				+ ","
				+ 98.686064
				+ ",'pangolin_bg','pangolin_icon','night','อุทยานแห่งชาติธารโบกขรณี','1100001','tan_bok_ka_ra_nee');");// 8.380448,
		// 98.686064

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian small-clawed otter','นากเล็กเล็บสั้น','Aonyx cinereus','เป็นนากขนาดเล็กที่สุดในโลก ตัวผู้มีขนาดใหญ่กว่าตัวเมียเล็กน้อย ขนตามลำตัวมีสีเทาเข้มหรือสีน้ำตาล แต่สีขนบริเวณท้องจะอ่อนกว่า แต่สามารถเปลี่ยนสีขนได้ตามฤดูกาล ลักษณะเด่นคือ พังผืดบริเวณนิ้วตีนจะมีขนาดเล็กลง ช่วยให้นิ้วเคลื่อนไหวได้คล่องตัวมากขึ้น ใต้คอมีสีขาว มีจมูกที่สั้นมากกว่านากชนิดอื่น ๆ ตัวที่ยังไม่โตเต็มวัยจะมีจมูกยาว และโค้งกว่า เมื่ออายุได้ 5 สัปดาห์จมูกก็จะหดสั้นลง มีความยาวลำตัวและหางประมาณ 45-55 เซนติเมตร ความยาวหาง 25-35 เซนติเมตร น้ำหนัก 1-3 กิโลกรัม พบกระจายพันธุ์อย่างกว้างขวางทั้งในทวีปแอฟริกาและในทวีปเอเชีย ในทวีปเอเชียพบตั้งแต่ภาคเหนือและตะวันออกเฉียงเหนือของอินเดีย, เนปาล, บังกลาเทศ, ภาคใต้ของจีน, พม่า, ไทย, ลาว, กัมพูชา, เวียดนาม, เกาะสุมาตรา, เกาะบอร์เนียวและเกาะชวา  นากเล็กเล็บสั้นมีความสามารถปรับตัวให้อยู่ในสภาพแวดล้อมต่าง ๆ ได้เป็นอย่างดี ในธรรมชาติจะอาศัยอยู่ใกล้แหล่งน้ำ เช่น ลำธารขนาดเล็ก, ป่าชายเลน, ริมทะเลสาบ, ห้วย, หนอง, คลอง, บึง หรือแม้แต่ในพื้นที่ชุ่มน้ำที่เป็นเขตเกษตรกรรมของมนุษย์ เช่น ตามท้องร่องสวนต่าง ๆ อาหารหลักได้แก่ สัตว์น้ำชนิดต่าง ๆ แต่ชอบกินปูมากที่สุด มักอาศัยอยู่เป็นฝูงเล็ก ๆ นากเล็กเล็บสั้นไม่ได้ใช้หนวดเป็นประสาทสัมผัสในการรับรู้เหมือนนากชนิดอื่น ๆ เพราะมีประสาทสัมผัสอยู่ที่ขาหน้า ออกลูกตามโพรงไม้หรือโพรงหินที่มีอยู่แล้ว เพราะขาหน้าไม่แข็งแรงพอจะขุดโพรงริมตลิ่งได้เหมือนนากชนิดอื่น ๆ ออกหากินในเวลากลางคืน บางครั้งอาจพบได้ตั้งแต่ช่วงพลบค่ำจนถึงรุ่งเช้า นากเล็กเล็บสั้นหากนำมาเลี้ยงตั้งแต่ยังเล็ก จะเชื่องและสามารถทำตามคำสั่งของมนุษย์ได้ จึงมีการนำมาแสดงโชว์ตามสวนสัตว์ต่าง ๆ เช่น ซาฟารีเวิลด์ เป็นต้น สำหรับในประเทศไทยพบได้ทั่วทุกภาค',"
				+ 8.365333
				+ ","
				+ 98.669756
				+ ",'oriental_small_clawed_otter_bg','oriental_small_clawed_otter_icon','night','อุทยานแห่งชาติธารโบกขรณี','1100001','tan_bok_ka_ra_nee');");// 8.365333, 98.669756
		
		/* อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Bottlenose dolphin','โลมาปากขวด','Tursiops aduncus','มีลำตัวสีน้ำเงินเข้มอมเทา สีจางหรือบางครั้งอมชมพูด้านท้อง จงอยปากค่อนข้างสั้นใหญ่ครีบหลังขนาดค่อนข้างใหญ่ เป็นรูปโค้งอยู่กึ่งกลางหลัง รูปร่างค่อนข้างอ้วน ไม่มีลายหรือจุดประแต่ประการใด ขนาดเมื่อโตเต็มที่ยาวประมาณ 2.3-3.1 เมตร  มีพฤติกรรมอาศัยอยู่รวมกันเป็นฝูง ในบางฝูงอาจพบได้ถึงหลายร้อยตัวจนถึงหลักพัน และชอบว่ายน้ำแข่งกับเรือขณะที่เรือเดินอยู่ในทะเลได้หลายไมล์และมีความเร็วในการว่ายน้ำประมาณ  40.5 กิโลเมตร/ชั่วโมง โลมาปากขวด เป็นโลมาที่ฉลาด มีความแสนรู้ ขี้เล่น เป็นมิตรกับมนุษย์ จึงนิยมเลี้ยงไว้แสดงตามสวนสัตว์และสถานแสดงพันธุ์สัตว์น้ำทั่วไป พบกระจายพันธุ์ตามทะเลเปิดและมหาสมุทรเขตร้อนและเขตอบอุ่นรวมถึงเขตหนาวทั่วโลก',"
				+ 7.743825
				+ ","
				+ 98.769290
				+ ",'bottlenose_dolphin_bg','bottlenose_dolphin_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1100001','pp_island');");// 7.743825,
		// 98.769290

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Great Frigatebird','นกโจรสลัดใหญ่','Fregata minor','มีรูปร่างโดยรวม คือ มีปากยาวกวางหัวและเป็นรูปทรงกระบอก ปลายจะงอยปากทั้งสองเป็นขอบแนวสบเรียบ รูจมูกเล็กลักษณะเป็นรองยาว ถุงใต้คางเล็กแต่พองออกได้ ปากยาวมาก ปลายปากแหลม ขนปลายปากเส้นสุดท้ายหรือเส้นนอกสุดยาวที่สุด หางเป็นหางแบบเว้าลึก มีขนหาง 12 เส้น แข็งเล็กและสั้น ประมาณ 1 ใน 5 ของความยาวปาก นิ้วยาว โดยมีนิ้วที่ 3 ยาวที่สุด ปลายนิ้วเป็นเล็บยาว เล็บหยัก มีพังผืดนิ้วเป็นแบบตีนพัดเต็ม แต่มักมีขนาดเล็กและเชื่อมเฉพาะโคนนิ้ว ตัวผู้และตัวเมียมีลักษณะและสีสันแตกต่างกัน ทำรังเป็นกลุ่มตามพุ่มไม้เตี้ย หรือตามโขดหิน หรือพื้นทราย วางไข่เพียงครอกละ 1 ฟอง เปลือกไข่สีขาว จะช่วยกันกกไข่ทั้งตัวผู้และตัวเมีย ลูกนกแรกเกิดมีสภาพเป็นลูกอ่อนเดินไม่ได้ ใช้เวลาประมาณ 5 เดือน ลูกนกที่จะเริ่มออกมาจากรังเกาะกิ่งไม้ แต่ก็ยังต้องอยู่ในความดูแลของพ่อแม่อีกนานนับปี พบกระจายพันธุ์อยู่ในทะเลเขตร้อนและเขตอบอุ่นทั่วโลก นกโจรสลัดจัดเป็นนกที่บินได้ ที่เมื่อกางปีกออกแล้วถือว่าเป็นนกจำพวกหนึ่งที่มีขนาดใหญ่ที่สุด เพราะกางปีกออกแล้วจะมีความยาวจากปีกข้างหนึ่งไปจรดอีกข้างหนึ่งประมาณ 70-100 เซนติเมตร และสามารถบินอยู่บนอากาศได้เป็นเวลาหลายวัน โดยไม่ต้องลงพื้นดิน เป็นนกที่ทรงตัวได้ดี เนื่อวงจากปีกมีขนาดใหญ่และหางในการรับน้ำหนัก และทรงตัว นกโจรสลัดเป็นนกที่กินเนื้อเป็นอาหาร มีพฤติกรรมชอบโฉบขโมยปลาจากนกอื่น เช่น นกนางนวลเป็นประจำ อันเป็นที่มาของชื่อเรียก แต่บางครั้งก็จะโฉบจับเหยื่อจากน้ำด้วยตัวเอง แต่ไม่สามารถที่จะดำน้ำได้ เป็นนกที่หากินในเวลากลางวัน และนอนหลับพักผ่อนในเวลากลางคืน นอกจากนี้ยังกินอาหารอย่างอื่นได้ด้วย เช่น ลูกเต่าทะเลแรกฟัก เป็นต้น เป็นนกที่มีความแตกต่างระหว่างเพศผู้และเพศเมียอย่างชัดเจน เพศผู้เมื่อถึงวัยเจริญพันธุ์จะมีถุงใต้คางสีแดงสดเห็นชัดเจน จนเป็นเอกลักษณ์ ซึ่งถุงนี้มีไว้เพื่ออวดเพศเมียในฤดูผสมพันธุ์ เพื่อดึงดูดความสนใจจากเพศเมีย โดยจะป่องหรือเป่าถุงนี้ให้พองขึ้น พบได้ในประเทศไทย 3 ชนิด คือ นกโจรสลัดเกาะคริสต์มาส, นกโจรสลัดใหญ่ และนกโจรสลัดเล็ก โดยจะพบแถบหมู่เกาะและจังหวัดในภาคใต้ฝั่งทะเลอันดามัน เช่น อ่าวมาหยา หรือเกาะพีพี เป็นต้น นานครั้งจึงจะพบในแถบอ่าวไทย',"
				+ 7.738042
				+ ","
				+ 98.768475
				+ ",'great_frigatebird_bg','great_frigatebird_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1100001','pp_island');");// 7.738042,
		// 98.768475

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Brahminy kite, Red-backed sea-eagle','เหยี่ยวแดง ','-','เหยี่ยวแดงมีสีที่ตัดกันเป็นเอกลักษณ์เฉพาะ ทั้งตัวจะมีสีน้ำตาลแดงยกเว้นที่หัวและอกมีสีขาว ปลายปีกมีสีดำ ขามีสีเหลือง ตัวเมียมีขนาดใหญ่กว่าตัวผู้มีความยาวจากปลายปีกจดปลายหาง 51 ซม. ตัวผู้ยาว 43 ซม.นกวัยอ่อนมีสีน้ำตาลแกมดำคล้ายกับเหยี่ยวดำ แต่มีสีจางกว่า ปีกสั้น และ หางมน เหยี่ยวแดงสามารถพบได้ในประเทศศรีลังกา, ประเทศอินเดีย, ประเทศปากีสถาน, ประเทศบังกลาเทศ, และเอเชียตะวันออกเฉียงใต้ และทางใต้ไปได้ไกลถึงรัฐนิวเซาท์เวลส์, ประเทศออสเตรเลีย เป็นนกประจำถิ่น แต่อาจมีการย้ายถิ่นตามฤดูกาลตามปริมาณน้ำฝนในบางบริเวณของพิสัย ส่วนใหญ่จะพบในที่ราบแต่บางครั้งพบที่ระดับความสูง 5000 ฟุตในเทือกเขาหิมาลัย เหยี่ยวแดงถูกประเมินเป็นความเสี่ยงต่ำในบัญชีแดงของสหภาพเพื่อการอนุรักษ์ธรรมชาติของชนิดพันธุ์ที่ถูกคุกคาม อย่างไรก็ตามในบางพื้นที่ นกชนิดนี้มีแนวโน้มที่จะลดจำนวนลง อย่างเช่นใน ชวา เหยี่ยวแดงชอบบินอยู่ตัวเดียวหรือ เป็นคู่หรือเป็นกลุ่มเล็ก ๆ เมื่อพบอาหารมันจะบินเป็นวงกลม พร้อมกับบินดิ่งควงลงมา โฉบอาหารนั้นขึ้นไปกินบนต้นไม้สูงซึ่งอยู่ใกล้ ๆ อาหารได้แก่ กบ เขียด งู นก แมลง หนู ลูกเป็ด ลูกไก่ สัตว์เลื้อยคลานเล็ก ๆ เหยี่ยวแดง ผสมพันธุ์ในช่วงฤดูหนาวต่อฤดูร้อน ทำรังตามกิ่งไม้ใกล้แหล่งน้ำ วางไข่ครั้งละ 2 - 4 ฟอง ไข่สีขาวไม่มีลวดลายใดๆ ทั้งสองเพศช่วยกันฟักไข่นาน 29 - 31 วัน',"
				+ 7.739955
				+ ","
				+ 98.761866
				+ ",'brahminy_kite_bg','brahminy_kite_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1100001','pp_island');");// 7.739955,
		// 98.761866

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'White-bellied Sea-eagle','นกออก','Haliaeetus leucogaster','เป็นนกขนาดใหญ่ชนิดหนึ่งจำพวกเหยี่ยวและอินทรี ตัวผู้และตัวเมียมีลักษณะคล้ายคลึงกัน ตัวที่โตเต็มวัยแล้ว บริเวณหัว อก และลำตัวด้านล่างมีสีขาว ด้านบนมีสีน้ำตาลเทา หางและปีกเป็นสีเทาเข้ม ปลายหางมีสีขาว นกขนาดเล็กมีสีน้ำตาลทั้งตัว เมื่อมีอายุได้ราว 3 ปีจึงมีลักษณะดังกล่าว ขณะบินเห็นปีกค่อนข้างหักเป็นมุมเหนือลำตัว หางสีน้ำตาล ปลายหางสีขาวเป็นหางพลั่วชัดเจน จัดเป็นนกขนาดใหญ่ เพราะมีขนาดความยาวลำตัวสูงสุดถึง 66 - 69 เซนติเมตร นกออกมักอยู่โดดเดี่ยวหรือเป็นคู่ ชอบอยู่ตามชายฝั่งทะเล, ทะเลสาบหรือแม่น้ำขนาดใหญ่ ชอบหากินบริเวณใกล้เคียงกับที่ทำรังอยู่ และมักใช้รังเป็นที่สะสมอาหารด้วย ชอบทำรังใกล้ที่อยู่ของมนุษย์ ชอบส่งเสียงร้องในเวลาเช้าและเย็น หาอาหารหลักในน้ำ ได้แก่ ปลาและงูทะเลด้วยการเกาะกิ่งไม้หรือร่อนกลางอากาศ คอยจ้องหาเหยื่อในน้ำ เมื่อพบจะบินลงโฉบด้วยกรงเล็บ จากนั้นจึงนำไปฉีกกินบนกิ่งไม้หรือรังที่พัก เริ่มผสมพันธุ์ในช่วงฤดูหนาว ถึงฤดูร้อน ทำรังอยู่บนต้นไม้บนหน้าผาริมชายทะเลหรือใกล้แหล่งน้ำที่ใช้หากิน รังของนกออกเป็นแบบง่ายๆ โดยนำกิ่งไม้มาซ้อนกัน มีขนาดใหญ่ มีเส้นผ่าศูนย์กลาง 1.25 - 1.50 เมตร ลึก 50 - 70 เซนติเมตร ไข่มีสีขาว วางไข่ ครั้งละ 2 ฟอง ทั้งตัวผู้และตัวเมียต่างก็ช่วยกันฟักไข่ และเลี้ยงลูกอ่อน พบในทวีปยุโรป, ออสเตรเลีย และทวีปเอเชีย สำหรับประเทศไทยพบอยู่ในจังหวัดที่อยู่บนชายฝั่งทะเลภาคตะวันออกและภาคใต้ นกออกถือเป็นนกประจำถิ่นในประเทศไทย แต่ปริมาณในธรรมชาติพบไม่มากนัก จึงเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 7.735278
				+ ","
				+ 98.765599
				+ ",'white_eagle_bg','white_eagle_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1100001','pp_island');");// 7.735278,
		// 98.765599

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Olive ridley sea turtle','เต่าหญ้า','Lepidochelys olivacea','เป็นเต่าทะเลขนาดเล็ก มีความยาวเต็มที่ประมาณ 60-70 เซนติเมตร น้ำหนักเมื่อโตเต็มที่ประมาณ 30-40 กิโลกรัม กระดองมีสีเขียวมะกอกหรือสีน้ำตาล เกล็ดบนกระดองมีลักษณะซ้อนกันเหมือนสังกะสีมุงหลังคา อันเป็นที่มาของอีกชื่อเรียกหนึ่ง ส่วนท้องมีสีเหลืองออกขาว หัวค่อนข้างโต ดวงตาปูนโปนออกมา กระดองมีความแข็งมาก ริมฝีปากสั้นทู่และคมแข็งแรงมากเพื่อใช้สำหรับขบกัดกินสัตว์มีกระดองซึ่งเป็นอาหารหลัก ส่วนของกระดองและท้องเชื่อมต่อกัน เป็นเต่าทะเลที่ว่ายน้ำได้เร็วมาก โดยอาจว่ายได้ถึง 35 กิโลเมตรต่อหนึ่งชั่วโมง พบกระจายพันธุ์ในมหาสมุทรแปซิฟิกและมหาสมุทรอินเดีย ในมหาสมุทรแอตแลนติกพบน้อยมาก กินอาหารได้ทั้งพืชและสัตว์ เช่น กุ้ง, ปลา, แมงกะพรุน, ปู, หอย, สาหร่ายทะเลและหญ้าทะเล ในน่านน้ำไทยจะพบได้ในฝั่งทะเลอันดามัน ในอ่าวไทยจะพบได้น้อยกว่า จัดเป็นเต่าทะเลอีกชนิดหนึ่งที่พบได้น้อบมากในน่านน้ำไทย โดยการวางไข่มีรายงานว่าพบที่ฝั่งทะเลอันดามันเท่านั้น โดยไม่พบในฝั่งอ่าวไทยและจัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 7.739275
				+ ","
				+ 98.755900
				+ ",'olive_turtle_bg','olive_turtle_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1100001','pp_island');");// 7.739275,
		// 98.755900

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Cantor is giant soft-shelled turtle','ตะพาบหัวกบ','Pelochelys cantorii','เป็นตะพาบชนิดหนึ่ง มีรูปร่างคล้ายตะพาบทั่วไป จัดเป็นตะพาบขนาดใหญ่ ขนาดใหญ่สุดพบขนาดกระดองยาว 120 เซนติเมตร นับว่าใหญ่ที่สุดในสกุลตะพาบหัวกบนี้ ลำตัวด้านบนสีน้ำตาลเขียว ด้านล่างสีอ่อน หัวมีลักษณะเล็กสั้นคล้ายกบหรืออึ่งอ่าง จึงเป็นที่มาของชื่อ ตามีขนาดเล็ก เมื่อยังเล็กสีของกระดอง จะมีสีน้ำตาลปนเขียวอ่อน ๆ มีจุดเล็ก ๆ สีเหลืองกระจายทั่วไป และค่อย ๆ จางเมื่อโตขึ้น รวมทั้งสีก็จะเข้มขึ้นด้วย พบได้ทั่วไปในทุกภาคของประเทศไทย ในแม่น้ำสายใหญ่ โดยเฉพาะแม่น้ำโขงในภาคอีสาน ปัจจุบันเป็นตะพาบที่พบได้น้อยมาก จนถูกจัดให้เป็นสัตว์น้ำคุ้มครองของกรมประมง และจัดอยู่ในบัญชีประเภทที่ 2 (Appendix II) ของอนุสัญญาว่าด้วยการค้าระหว่างประเทศซึ่งชนิดสัตว์ป่าและพืชป่าใกล้สูญพันธุ์ หรือ ไซเตส มีอุปนิสัย ดุร้าย มักฝังตัวอยู่นิ่ง ๆ ในพื้นทรายใต้น้ำเพื่อกบดานรอดักเหยื่อ ในภาษาอีสานเรียกว่า \"ปลาปู่หลู่\"',"
				+ 7.744761
				+ ","
				+ 98.765900
				+ ",'cantor_turtle_bg','cantor_turtle_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1100001','pp_island');");// 7.744761,
		// 98.765900

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Green turtle','เต่าตนุ','Chelonia mydas','เป็นเต่าทะเลที่มีขนาดค่อนข้างใหญ่และมีน้ำหนักมากเมื่อโตเต็มที่ โดยมีความยาวตั้งแต่หัวจรดหางประมาณ 1 เมตร น้ำหนักราว 130 กิโลกรัม หัวป้อมสั้น ปากสั้น เกล็ดเรียงต่อกันโดยไม่ซ้อนกัน กระดองหลังโค้งนูนเล็กน้อย บริเวณกลางหลังเป็นแนวนูนเกือบเป็นสัน ท้องแบนราบขาทั้ง 4 แบน เป็นใบพาย ขาคู่หลังมีขนาดเล็กกว่าขาคู่หน้ามาก ขาคู่หน้ามีเล็บแหลมเพียงข้างละชิ้น สีของกระดองดูเผิน ๆ มีเพียงสีน้ำตาลแดงเท่านั้น แต่ถ้าหากพิจารณาให้ละเอียด จะพบว่าเกล็ดแต่ละเกล็ดของกระดองหลังมีสีน้ำตาลแดงหรือน้ำตาลอมเขียว ขอบเกล็ดมีสีอ่อน ๆ เป็นรอยด่างและมีลายเป็นเส้นกระจายออกจากจุดสีแดงปนน้ำตาล คล้ายกับแสงของพระอาทิตย์ที่ลอดออกจากเมฆจึงมีชื่อเรียกเต่าชนิดนี้ว่าอีกชื่อหนึ่งว่า \"เต่าแสงอาทิตย์\" ขณะที่ชาวตะวันตกเรียกว่า \"เต่าเขียว\" อันเนื่องจากมีกระดองเหลือบสีเขียวนั่นเอง',"
				+ 7.744261
				+ ","
				+ 98.766308
				+ ",'green_turtle_bg','green_turtle_icon','day','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','1110001','pp_island');");// 7.744261,
		// 98.766308

		/* อุทยานแห่งชาติหมู่เกาะชุมพร */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Whale shark','ปลาฉลามวาฬ','-','ลักษณะของปลาฉลามวาฬที่แตกต่างจากปลาฉลามส่วนใหญ่ คือ หัวที่ใหญ่โตมากเมื่อเทียบกับขนาดลำตัว และปากที่อยู่ด้านหน้าแทนที่จะอยู่ด้านล่าง ฉลามวาฬ เกือบทั้งหมดที่พบมีขนาดใหญ่กว่า 3.5 เมตร ใช้เหงือกในการหายใจ มีช่องเหงือก 5 ช่อง มีครีบอก 2 อัน ครีบหาง 2 อัน และ ครีบก้น(หาง) 1 อัน หางของปลาฉลามวาฬอยู่ในแนวตั้งฉาก และโบกไปมาในแนวซ้าย-ขวา แตกต่างจากสัตว์เลือดอุ่นในทะเลที่หางอยู่ในแนวขนานและหายใจด้วยปอด  ปลาฉลามวาฬอาศัยอยู่ในทะเลเขตร้อนและเขตอบอุ่น ตามผิวทะเล นอกจากนี้ในฤดูที่มีปรากฏการณ์การรวมตัวกันของแหล่งอาหารใกล้แนวชายฝั่งสามารถพบฉลามวาฬได้เช่นกัน ถึงแม้ว่าโดยปกติแล้วจะพบอยู่ห่างจากชายฝั่ง แต่ก็มีการพบปลาฉลามวาฬใกล้แผ่นดินเช่นกัน อย่างในทะเลสาบหรือเกาะรูปวงแหวนที่เกิดจากหินปะการัง และใกล้กับปากแม่น้ำ ความลึกไม่เกิน 700 ม. และท่องเที่ยวเร่ร่อนไปทั่ว กินแพลงก์ตอนเป็นอาหาร โดยใช้วิธีกรองกิน แต่ลักษณะการกินอาหารไม่ใช่ปัจจัยที่นักวิทยาศาสตร์ใช้แบ่งปลาฉลามวาฬออกจากปลาฉลามชนิดอื่น ๆ เนื่องจากยังมีปลาฉลามอีก 2 ชนิดที่กินแพลงก์ตอนเป็นอาหารแต่อยู่คนละอันดับกับปลาฉลามวาฬ ปลาฉลามวาฬปกติเป็นปลาที่อาศัยอยู่ในน้ำลึก และจะขึ้นมากินแพลงก์ตอนในเวลากลางคืนบริเวณผิวน้ำ โดยใช้การดูดน้ำเข้าปากแล้วผ่านช่องกรอง ',"
				+ 10.256621
				+ ","
				+ 99.217217
				+ ",'whale_shark_bg','whale_shark_icon','night','อุทยานแห่งชาติหาดนพรัตนธารา-หมู่เกาะพีพี','0100001','pp_island');");// 10.256621,
		// 99.217217

		/* อุทยานแห่งชาติหมู่เกาะลันตา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Dugong, Sea cow','พะยูน ','Dugong dugon','พะยูนมีรูปร่างคล้ายแมวน้ำขนาดใหญ่ที่อ้วนกลมเทอะทะ ครีบมีลักษะคล้ายใบพาย ซึ่งวิวัฒนาการมาจากขาหน้าใช้สำหรับพยุงตัวและขุดหาอาหาร ไม่มีครีบหลัง ไม่มีใบหู ตามีขนาดเล็ก ริมฝีปากมีเส้นขนอยู่โดยรอบ ตัวผู้บางตัวเมื่อเข้าสู่วัยรุ่นจะมีฟันคู่หนึ่งงอกออกจากปากคล้ายงาช้าง ใช้สำหรับต่อสู้เพื่อแย่งคู่กับใช้ขุดหาอาหาร ในตัวเมียมีนมอยู่ 2 เต้า ขนาดเท่านิ้วก้อย ยาวประมาณ 2 เซนติเมตร อยู่ถัดลงมาจากขา คู่หน้า สำหรับเลี้ยงลูกอ่อน มีลำตัวและหางคล้ายโลมา สีสันของลำตัวด้านหลังเป็นสีเทาดำ หายใจทางปอด จึงต้องหายใจบริเวณผิวน้ำ 1-2 นาที อายุ 9-10 ปี สามารถสืบพันธุ์ได้ เวลาท้อง 9-14 เดือน ปกติมีลูกได้ 1 ตัว ไม่เกิน 2 ตัว แรกเกิดยาว 1 เมตร หนัก 15-20 กิโลเมตร ใช้เวลาตั้งท้องประมาณ 1 ปี กินนมและหญ้าทะเลประมาณ 2-3 สัปดาห์ หย่านมประมาณ 8 เดือน อายุประมาณ 70 ปี โดยแม่พะยูนจะดูแลลูกไปจนโต ขนาดเมื่อโตเต็มที่ประมาณ 2 เมตร ถึง 3 เมตร น้ำหนักเต็มที่ได้ถึง 300 กิโลกรัม พะยูนสามารถกลั้นหายใจใต้น้ำได้นานราว 20 นาที เมื่อจะนอนหลับพักผ่อน พะยูนจะทิ้งตัวลงในแนวดิ่ง และนอนอยู่นิ่ง ๆ กับพื้นทะเลราว 20 นาที ก่อนจะขึ้นมาหายใจอีกครั้งหนึ่ง อาหารของพะยูน ได้แก่ หญ้าทะเล ที่ขึ้นตามแถบชายฝั่งและน้ำตื้น โดยพะยูนมักจะหากินในเวลากลางวัน พฤติกรรมการหากินจะคล้ายกับหมู โดยจะใช้ครีบอกและปากดุนพื้นทรายไถไปเรื่อย ๆ จนบางครั้ง จะเห็นทางยาวตามชายหาด จากพฤติกรรมเช่นนี้ พะยูนจึงได้ชื่อเรียกอีกชื่อหนึ่งว่า \"หมูน้ำ\" หรือ \"หมูดุด\" ในบางตัวที่เชื่องมนุษย์ อาจเกาะกินตะไคร่บริเวณใต้ท้องเรือได้',"
				+ 7.483113
				+ ","
				+ 99.080628
				+ ",'dugong_bg','dugong_icon','day','อุทยานแห่งชาติหมู่เกาะลันตา','1100001','lan_ta_island');");// 7.483113,
		// 99.080628

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Rhinolophus marshalli','ค้างคาวมงกุฎหูโตมาร์แชล','Rhinolophus marshalli Thonglongya,1973','ลักษณะทั่วไป เป็นค้างคาวกินแมลงที่พิเศษต่างจากค้างคาวมงกุฎชนิดอื่น ๆ ตรงที่ส่วนของแผ่นกั้นรูจมูกขยายตัวออกเป็นแผ่นกว้างคล้ายถ้วย ปิดกั้นรูจมูกจนมิดและใหญ่เกือบเท่าใบหน้า มีหูใหญ่รูปกรวย ซึ่งเมื่อพับมาข้างหน้า ปลายหูจะยาวเลยปาก ขนด้านหลังสีน้ำตาลแก่ ด้านท้องสีเทาอ่อน อาศัยเกาะพักนอนตอนกลางวันตามเพิงหินที่มีน้ำไหลผ่าน ออกหากินตามบริเวณใกล้แหล่งเกาะพักเช่นเดียวกับค้างคาวมงกฎชนิดอื่น ๆ อาศัยในป่าดิบ',"
				+ 7.501665
				+ ","
				+ 99.099510
				+ ",'rhinolophus_marshalli_bg','rhinolophus_marshalli_icon','night','อุทยานแห่งชาติหมู่เกาะลันตา','1100000','lan_ta_island');");// 7.501665,
		// 99.099510

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Indochinese rat snake','งูสิง','Ptyas korros',' เป็นสัตว์เลื้อยคลานจำพวกงูสิงชนิดหนึ่ง จัดอยู่ในวงศ์งูพิษเขี้ยวหลัง (Colubridae)มีความยาวเมื่อโตเต็มที่ประมาณ 1,400 มิลลิเมตร และหางยาว 445 มิลลิเมตร หัวยาวและส่วนของหัวกว้างกว่าลำคอเล็กน้อย ส่วนปลายของหัวมน ตาใหญ่มาก ลำตัวกลมและยาว หางยาวและส่วนปลายหางเรียว ผิวหนังลำตัวมีเกล็ดปกคลุม เกล็ดบนหัวเป็นแผ่นกว้าง เกล็ดบนหลังทางส่วนต้นของลำตัวมีขนาดใหญ่และพื้นผิวเรียบ เกล็ดท้องขยายกว้าง เกล็ดใต้หางเป็นแถวคู่ เกล็ดรอบลำตัวในตำแหน่งกึ่งกลางตัวจำนวน 15 เกล็ด เกล็ดท้องจำนวน 170 เกล็ด และเกล็ดใต้หางจำนวน 125 เกล็ด ลำตัวมีด้านบนของหัวและบนหลังครึ่งทางด้านหน้าของลำตัวสีน้ำตาลหรือสีน้ำตาลอมเขียว ส่วนครึ่งทางด้านท้ายของลำตัวสีน้ำตาล เกล็ดปกคลุมลำตัวและหางมีขอบแผ่นเกล็ดสีจางหรือสีขาว ซึ่งสีขาวของขอบแผ่นเกล็ดได้ขยายกว้างขึ้นตามลำดับไปทางด้านท้ายลำตัวและหาง ทำให้ด้านท้ายของลำตัว โดยเฉพาะหาง เป็นสีขาวที่มีโครงข่ายร่างแหสีดำ คาง ใต้คอ และด้านท้องสีขาวอมน้ำตาล ด้านใต้หางสีขาว งูวัยอ่อนมีจุดเล็กสีขาวเรียงตัวเป็นแถวพาดขวาง (ไม่เป็นระเบียบ) เป็นระยะอยู่ทางส่วนต้นของลำตัว พบกระจายพันธุ์ในทุกประเทศในภูมิภาคเอเชียอาคเนย์ และอนุทวีปอินเดีย  เป็นงูที่กินหนูเป็นอาหารหลัก ออกหากินในเวลากลางวันบนพื้นดิน แต่ขึ้นต้นไม้ได้ดีและรวดเร็ว ว่ายน้ำได้ ประกอบกับมีพฤติกรรมการขู่และชูหัวพร้อมส่งเสียงขู่ฟ่อคล้ายงูเห่า ซึ่งเป็นงูที่มีพิษร้ายแรงกว่า จึงได้อีกชื่อหนึ่งว่า งูเห่าตะลาน เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 7.531787
				+ ","
				+ 99.074619
				+ ",'indochinese_rat_snake_bg','indochinese_rat_snake_icon','day','อุทยานแห่งชาติหมู่เกาะลันตา','1000000','lan_ta_island');");// 7.531787,
		// 99.074619

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Spiny balloonfish','ปลาปักเป้าหนามทุเรียนหนามยาว','Diodon holocanthus','เป็นปลาปักเป้าชนิดหนึ่ง จัดอยู่ในวงศ์ปลาปักเป้าฟัน 2 ซี่ (Diodontidae) มีตัวค่อนข้างกลมและแบนทางด้านบนเล็กน้อย หัวขนาดใหญ่เรียวเล็กลงไปทางหาง ตากลมโตกลอกไปมาได้และมีหนังตายื่นลงมาเป็นติ่ง ปากหนามีฟันเชื่อมต่อกัน ครีบหูมีขนาดใหญ่คลี่ออกคล้ายพัด ครีบหลังมีอันเดียวอยู่เยื้องไปทางหาง ไม่มีครีบท้อง ครีบทวารอยู่ตรงกับครีบหลัง ครีบหางโค้งกลม ขนาดโตเต็มที่ได้ถึง 50 เซนติเมตร ผิวลำตัวเป็นหนังย่นและมีหนามแข็งพับลู่ไปทางหาง ซึ่งเมื่ออยู่ในยามปกติก็เห็นได้ชัดเจน แต่จะตั้งขึ้นเมื่อตกใจหรือถูกรบกวนและพองตัวได้ พื้นลำตัวมีสีน้ำตาลเขียว มีลายจุดสีดำเป็นปื้นตามลำตัวและบนหลัง ซึ่งเมื่อปลาโตขึ้นจุดเหล่านี้จะค่อย ๆ จางไป จัดเป็นปลาปักเป้าที่มีขนาดใหญ่ชนิดหนึ่ง พบกระจายพันธุ์อย่างกว้างขวางในแนวปะการังเขตร้อนและเขตอบอุ่น ตั้งแต่ฟลอริดา,บาฮามาส, บราซิล, หมู่เกาะกาลาปากอส, เกาะอีสเตอร์ รอบ ๆ แอฟริกาใต้, เรอูนียง, ทะเลแดง, มาดากัสการ์, มอริเชียส, หมู่เกาะฮาวาย, อ่าวเบงกอล, อินโด-แปซิฟิก, ทะเลอันดามัน, อ่าวไทย, อ่าวตังเกี๋ย, ทะเลเหลือง, ทะเลจีนใต้, ทะเลจีนตะวันออก พบไปจนถึงทะเลญี่ปุ่น, ทะเลฟิลิปปิน และเกรต แบร์ริเออร์ รีฟเป็นปลาที่ไม่ใช้เนื้อในการบริโภค แต่นิยมทำมาเป็นเครื่องประดับ โดยนำมาสตัฟฟ์เมื่อเวลาที่พองตัวออก และเลี้ยงเป็นปลาสวยงาม',"
				+ 7.515620
				+ ","
				+ 99.110926
				+ ",'spiny_balloonfish_bg','spiny_balloonfish_icon','day','อุทยานแห่งชาติหมู่เกาะลันตา','0011000','lan_ta_island');");// 7.515620,
		// 99.110926

		/* อุทยานแห่งชาติหาดเจ้าไหม */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Yellow rajah rat','หนูฟานเหลือง','Maxomys surifer','หนูฟานเหลือง เป็นหนูขนาดกลาง มีจมูกยาว ขนมีความอ่อนนุ่ม ด้านหลังมีขนแข็งแซมสีดำ ทำให้ขนบริเวณหลังมีสีน้ำตาลเหลืองปนดำด้านท้องสีขาว หางมีสีค่อนข้างดำ ปลายหางสีขาว ตัวเมียมีเต้านม 4 คู่ มีขนาดความยาวตั้งแต่หัวจรดโคนหาง 18.8 เซนติเมตร และความยาวหาง 18.5 เซนติเมตร มีน้ำหนักราว 155 กรัม  หนูฟานเหลือง จัดได้ว่าเป็นหนูที่มีความเชื่องช้า หากินตามพื้นดินในเวลากลางคืน โดยไม่ขึ้นต้นไม้ กินอาหารแทบทุกอย่างที่พบได้ตามพื้นดิน ผสมพันธุ์และออกลูกในช่วงฤดูฝนครั้งละ 4-6 ตัว ตั้งท้องนาน 28 วัน พบกระจายพันธุ์อยู่ทั่วไปในภูมิภาคเอเชียอาคเนย์ในป่าดิบ, ป่าละเมาะ และแม้แต่สวนผลไม้ แต่จะหาได้ยากตามบ้านเรือน ในประเทศไทยพบได้ทั่วทุกภูมิภาค',"
				+ 7.421223
				+ ","
				+ 99.435624
				+ ",'yellow_rajah_rat_bg','yellow_rajah_rat_icon','night','อุทยานแห่งชาติหาดเจ้าไหม','1100000','had_jao_mai');");// 7.421223,
		// 99.435624

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Garnot is House Gecko','จิ้งจกหางเรียบ','Hemidactylus garnotii Dumeril','เป็นจิ้งจกที่มีหางแบน ด้านข้างของหางมีลักษณะเป็นหยักคล้ายฟันเลื่อย หลังสีน้ำตาลเทามีลายจุดสีจางๆ หรือสีขาวเหลือง ท้องแบนสีเหลืองสด มักพบเฉพาะตัวเมีย สามารถสืบพันธุ์ได้โดยไม่ต้องอาศัยเพศผู้ (Parthenogenesis) สามารถเปลี่ยนสีลำตัวไปตามสภาพพื้นที่เกาะอยู่ ใต้นิ้วเป็นแผ่นหนังเรียงเป็นแถวนิ้วละ ๒แถว มีเล็บทั้ง ๕ นิ้ว เมื่อหางขาดแล้วสามารถงอกใหม่ได้ แต่สีและลายจะไม่เหมือนเดิม อาศัยตามต้นไม้และบ้านเรือน เฉพาะตัวที่อาศัยอยู่ตามอาคารและสิ่งก่อสร้าง เมื่อถูกรบกวนจะวิ่งหนีอย่างรวดเร็วและมีนิสัยวิ่งหนีกับหยุดพักเป็นช่วง ปรับตัวอาศัยอยู่ในอาคารและบ้านพักหลบซ่อนตัวในเวลากลางวันอยู่ในโพรงหรือในซอกของต้นไม้หรือตามซอกและรอยแยกของสิ่งก่อสร้างและออกหากินเวลากลางคืน',"
				+ 7.479435
				+ ","
				+ 99.426183
				+ ",'garnot_house_gecko_bg','garnot_house_gecko_icon','night','อุทยานแห่งชาติหาดเจ้าไหม','0000000','had_jao_mai');");// 7.479435,
		// 99.426183

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Shore pit viper','งูเขียวหางไหม้ลายเสือ','-','เป็นงูพิษชนิดหนึ่ง มีพิษอ่อน เมื่อเข้าใกล้จะสั่นหางขู่และฉกกัดอย่างรวดเร็ว อาศัยบนต้นไม้เป็นพุ่มเตี้ยๆ ตามป่าชายเลน หรือตามริมฝั่งคลองที่ติดกับทะเล พบในประเทศอินเดีย (รัฐอัสสัม, หมู่เกาะอันดามัน), ประเทศบังกลาเทศ, ประเทศพม่า, ประเทศไทย, มาเลเซียตะวันตก, ประเทศสิงคโปร์ และ ประเทศอินโดนีเซีย (เกาะสุมาตรา) เป็นงูขนาดค่อนข้างใหญ่ หัวโตรูปสามเหลี่ยม คอเล็กกว่าหัวและลำตัว ลำตัวอ้วน หัวและลำตัวมีสีเหลืองค่อนข้างซีด บนหัวมีจุดสีดำกระจายทั่วไป ลำตัวมีลายสีดำเป็นแนวกว้างพาดขวาง ระยะไม่แน่นอนจากคอถึงหาง ข้างลำตัวมีลายสีดำเล็กๆ กระจายทั่วไป ท้องสีขาวขอบเกล็ดสีดำ จากลักษณะของลวดลายและสีบนลำตัว  ตัวเมียมีขนาดใหญ่และยาวกว่าตัวผู้ ตัวผู้ยาวประมาณ 66.5 ซม. หางยาว 12.5 ซม. ตัวเมียยาวประมาณ 90 ซม. หางยาว 14 ซม.[6] ออกลูกเป็นตัวครั้งละประมาณ 7 -14 ตัว',"
				+ 7.464372
				+ ","
				+ 99.380778
				+ ",'shore_pit_viper_bg','shore_pit_viper_icon','night','อุทยานแห่งชาติหาดเจ้าไหม','0000000','had_jao_mai');");// 7.464372,
		// 99.380778

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Dog Conch, Wing Shell','หอยชักตีน','Laevistrombus canarium','เป็นหอยฝาเดียวที่จัดอยู่ในวงศ์หอยชักตีน (Strombidae) พบแพร่กระจายทั่วไปในทะเลเขตอินโด-แปซิฟิก ตั้งแต่ประเทศอินเดีย ศรีลังกา ไปทางตะวันตกสุดถึงเมลานีเซีย เหนือสุดถึงประเทศญี่ปุ่น และใต้สุดถึงควีนสแลนด์และนิวคาลีโดเนีย พบอาศัยอยู่ในบริเวณพื้นทรายปนโคลน และบริเวณหญ้าทะเลและสาหร่าย ตั้งแต่เขตน้ำขึ้น-ลง ไปจนถึงในระดับความลึกถึงประมาณ 55 เมตร มีการเก็บมาใช้บริโภคเป็นอาหารในหลายประเทศในเอเซียตะวันออกเฉียงใต้ รวมทั้งมีการนำเปลือกมาใช้ประโยชน์โดยเฉพาะอย่างยิ่งในงานหัตถกรรมเครื่องใช้และของประดับตกแต่งต่างๆ ขนาดใหญ่สุดมีความยาวเปลือก 10 เซนติเมตร แต่โดยทั่วไปมักพบขนาดประมาณ 6-7 เซนติเมตร ในประเทศไทยพบหอยชักตีนได้ทั่วไปทั้งในฝั่งอ่าวไทยและฝั่งทะเลอันดามัน ถือเป็นหอยฝาเดียวชนิดที่พบมาก สามารถพบเปลือกตามชายฝั่งทะเลทั่วไป แต่มีเพียงบางแหล่งที่มีการเก็บหอยชักตีนขึ้นมาใช้ประโยชน์เพื่อการบริโภคอย่างแพร่หลาย ส่วนใหญ่เป็นแหล่งท่องเที่ยว เช่นแถบจังหวัดกระบี่ พังงา ภูเก็ต ระยอง ชุมพร เป็นต้น ซึ่งโดยทั่วไปการเก็บหอยชักตีนจะใช้วิธีงม หรือเดินเก็บในเวลาน้ำลงในเขตจังหวัดประจวบคีรีขันธ์ สามารถพบหอยชักตีนในพื้นที่ชายฝั่งทะเลของทุกอำเภอ และปัจจุบันยังคงมีอยู่ สังเกตได้จากที่สามารถพบเปลือกหอยใหม่ๆ ตามชายหาดทั่วไป แต่ไม่มีแหล่งที่ทำการประมงเก็บหอยชักตีนจากธรรมชาติมาบริโภคแพร่หลายเช่นในพื้นที่ฝั่งทะเลอันดามัน',"
				+ 7.423691
				+ ","
				+ 99.341811
				+ ",'wing_shell_bg','wing_shell_icon','night','อุทยานแห่งชาติหาดเจ้าไหม','0110100','had_jao_mai');");// 7.423691,
		// 99.341811

		/* อุทยานแห่งชาติคลองวังเจ้า */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Great hornbill','นกกก','-','นกกกจัดเป็นนกเงือกชนิดที่ใหญ่ที่สุด มีความยาวลำตัวประมาณ 130-150 เซนติเมตร มีปีกสีดำพาดเหลือง ปลายปีกขาว หางสีขาวพาดดำ ตัวผู้มีนัยน์ตาสีแดง ด้านหน้าโหนกที่อยู่บนปากมีสีดำ ส่วนตัวเมียมีนัยน์ตาสีขาว ด้านหน้าโหนกไม่มีสีดำ มีพฤติกรรมอยู่รวมกันเป็นฝูงขนาดเล็ก จนกว่าจะโตเต็มที่และหาคู่ได้ มีฤดูผสมพันธุ์ระหว่างเดือนมกราคม-พฤษภาคม โดยตัวผู้จะเป็นฝ่ายเกี้ยวพาราสีตัวเมีย และเสาะหาโพรงไม้ตามต้นไม้ใหญ่ที่นกหรือสัตว์อื่นทิ้งไว้ ทั้งนี้เนื่องจากนกกกไม่สามารถที่จะเจาะโพรงเองได้ เนื่องจากจะงอยปากไม่แข็งแรงพอ ตัวเมียจะใช้เวลาตัดสินใจเข้าโพรงนานอาจนานเป็นสัปดาห์ ทั้งนี้เพราะระยะเวลาที่ตัวเมียจะเข้าไปอยู่ในโพรงเพื่อวางไข่และเลี้ยงดูลูกอ่อนกินเวลานานถึง 3 เดือน ในระยะนี้นกกกตัวผู้จะเอาใจตัวเมียเป็นพิเศษด้วยการบินออกอาหารมาป้อนตัวเมียอยู่สม่ำเสมอ ขณะที่ตัวเมียเมื่อเข้าไปในโพรงแล้วจะปิดปากโพรงเหลือเพียงช่องพอให้ปากของตัวผู้ส่งอาหารมาได้เท่านั้น ด้วยมูล, เศษอาหาร และเศษไม้ในโพรง นกกกตัวเมียใช้เวลากกไข่นาน 1 เดือน อาจวางไข่ได้ 2 ฟอง แต่ลูกนกตัวที่อ่อนแอกว่าอาจตายไปซึ่งเป็นวิถีตามธรรมชาติ เพื่อไม่ให้เป็นภาระของพ่อแม่ เมื่อลูกนกฟักเป็นตัว นกตัวผู้ต้องออกหาอาหารมากยิ่งขึ้นอาจมากถึงวันละ 10 เที่ยว ในระยะทางอาจไกลได้ถึง 10 กิโลเมตร ขณะที่นกตัวเมียจะเป็นฝ่ายสอนลูกนกปิดปากโพรงเพื่อป้องกันอันตรายจากสัตว์นักล่าต่าง ๆ ซึ่งเป็นการสอนที่จะตกทอดต่อไปเรื่อย ๆ จากรุ่นต่อรุ่น เมื่อลูกนกโตพอที่จะบินเองได้แล้ว เนื้อที่ในโพรงเริ่มคับแคบ นกกกตัวเมียจะเป็นฝ่ายพังโพรงรังบินออกมาก่อน ขณะที่ลูกนกจะฝึกซ้อมบินด้วยการกระพือปีกในโพรงและปิดปากโพรงตามที่แม่นกสอน เมื่อลูกนกพร้อมที่จะบินเองแล้ว พ่อแม่นกจะรอให้ลูกนกพังโพรงและบินออกมาเองด้วยการล่อด้วยอาหาร และส่งเสียงร้อง เมื่อลูกนกหิวจะกล้าบินออกมาเอง ในระยะแรกพ่อแม่นกจะยังคอยดูแลลูก จนกว่าจะโตพอที่จะช่วยเหลือตัวเองได้',"
				+ 16.423941
				+ ","
				+ 99.138237
				+ ",'great_hornbill_bg','great_hornbill_icon','day','อุทยานแห่งชาติคลองวังเจ้า','1100001','klong_wang_jao');");// 16.423941,
		// 99.138237

		/* อุทยานแห่งชาติศรีลานนา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Masked palm civet','อีเห็นเครือ','Paguma larvata','จัดเป็นสัตว์ขนาดใหญ่ในสัตว์จำพวกนี้ ขนตามลำตัวสีน้ำตาลเข้ม ไม่มีจุดหรือลวดลายใด ๆ บริเวณท้องมีสีอ่อนกว่าส่วนหลัง หลังหูและหลังคอมีสีเข้มม่านตามีสีน้ำตาลแดง มีหนวดเป็นเส้นยาวบริเวณจมูกและแก้ม ตัวผู้มีขนาดใหญ่กว่าตัวเมียเล็กน้อย ตัวเมียมีเต้านม 2 คู่ ขนาดลำตัวและหัวยาว 50.8-76.2 เซนติเมตร ความยาวหาง 50.8-63.6 เซนติเมตร น้ำหนัก 3-5 กิโลกรัม มีการกระจายพันธุ์ที่กว้างขวาง พบตั้งแต่ภาคเหนือของอินเดีย, ปากีสถาน, ตะวันออกของอัฟกานิสถาน, ไต้หวัน, ตะวันออกของจีน,ไทย, ลาว, กัมพูชา, เวียดนาม, มาเลเซีย, เกาะสุมาตรา, เกาะบอร์เนียว, ตะวันตกของพม่า, สิกขิม, ภูฐาน, เนปาล สามารถปรับตัวให้อยู่ในสภาพแวดล้อมที่หลากหลายได้ ตั้งแต่ป่าเบญจพรรณ, ป่าดิบแล้ง ไปจนถึงชายป่าที่ติดกับพื้นที่ทำการเกษตรกรรม สามารถปีนต้นไม้ได้คล่องแคล่ว และจะใช้เวลาส่วนใหญ่บนต้นไม้ โดยจะกินทั้งพืชและสัตว์ แต่ในบางครั้งอาจมาหากินบนพื้นดินด้วย จากการศึกษาในเนปาลพบว่า มีการผสมพันธุ์กันในฤดูร้อน โดยในช่วงปลายฤดูฝนอีเห็นเครือตัวเมียจะสร้างรังในโพรงไม้ เพื่อใช้เลี้ยงดูลูกอ่อน ใช้เวลาตั้งท้องนาน 2 เดือน ออกลูกครั้งละ 2-4 ตัว อีเห็นเครือถูกสันนิษฐานว่าเป็นสัตว์ที่เป็นต้นตอแพร่เชื้อของโรคซาร์สที่ระบาดในฮ่องกงและจีนแผ่นดินใหญ่ ในช่วงปี พ.ศ. 2546 เพราะชาวจีนนิยมกินเนื้ออีเห็นเครือและสัตว์ในตระกูลนี้มาก ถูกจัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 19.199681
				+ ","
				+ 99.047549
				+ ",'masked_palm_civet_bg','masked_palm_civet_icon','day','อุทยานแห่งชาติศรีลานนา','1000000','kao_yai');");// 16.423941,
		// 99.138237

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Siamese leaf-toed gecko','จิ้งจกดินลายจุด','dixonius_siamensis','สัตว์เลื้อยคลานขนาดเล็กชนิดหนึ่ง จำพวกจิ้งจกดิน ในวงศ์จิ้งจกและตุ๊กแก (Gekkonidae) เป็นจิ้งจกขนาดเล็ก ลำตัวค่อนข้างยาว ผิวหนังปกคลุมด้วยเกล็ดละเอียด มีแถวของตุ่มเกล็ดเรียงตัวตลอดแนวของลำตัว นิ้วตีนเรียวไม่มีพังผืดระหว่างนิ้ว สีลำตัวมีความหลากหลาย เช่น สีเทา, สีน้ำตาลเหลือง, สีน้ำตาลเข้ม หรือสีดำ มีลวดลายเป็นแต้มสีน้ำตาลจนถึงดำกระจายอย่างไม่เป็นระเบียบทั่วตัว ซึ่งช่วยให้สามารถพรางตัวกับต้นไม้ หรือพื้นดินได้เป็นอย่างดี อีกทั้งปรับความเข้มอ่อนของสีตัวให้กลมกลืนตามลักษณะพื้นผิวที่เกาะได้ในระดับหนึ่ง แพร่พันธุ์โดยการวางไข่ครั้งละ 2 ฟอง ใต้กองวัสดุเหนือพื้นดิน เปลือกไข่จะบอบบางกว่าไข่ของจิ้งจกที่พบได้ตามบ้าน พบได้ทั่วทุกภาคในประเทศไทย แต่พบได้น้อยในภาคใต้ รวมถึงประเทศอื่น ๆ ใกล้เคียง เช่น พม่า, เวียดนาม, ลาว, กัมพูชา พบได้ทั้งในป่าและตามที่รกร้างต่าง ๆ ในเขตเมือง เช่น สวนสาธารณะ, สวนหย่อมภายในบ้านเรือน โดยจะมีพฤติกรรมหากินในเวลากลางคืน ตามโคนต้นไม้, พื้นดิน หรือพื้นที่เหนือพื้นดินระดับต่ำ ๆ ในเวลากลางวันจะหลบซ่อนตัว',"
				+ 19.540736
				+ ","
				+ 99.242899
				+ ",'siamese_leaf_toed_gecko_bg','siamese_leaf_toed_gecko_icon','day','อุทยานแห่งชาติศรีลานนา','0000000','kao_yai');");

		/* อุทยานแห่งชาติดอยสุเทพ-ปุย */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Himalayan striped squirrel, Burmese striped squirrel','กระเล็นขนปลายหูสั้น','Tamiops mcclellandii','กระรอกขนาดเล็ก ความยาวหัวและลำตัวประมาณ 11-12 เซนติเมตร หางยาวประมาณ 11-13 เซนติเมตร ขนหางสั้นและเรียบติดหนังไม่ฟูเป็นพวงอย่างกระรอกทั่วไป ปลายหูสีขาว ลำตัวสีน้ำตาลอมเทา หลังมีลายแถบขนานกันไปตามแนวสันหลังสีเหลืองหรือสีครีมสลับดำ แถบสีครีมด้านนอกสุดพาดยาวตั้งแต่จมูกไปจนจรดโคนหาง แถบนอกสุดนี้จะกว้างและสีสดกว่าแถบใน และกว้างกว่าของกระเล็นขนปลายหูยาว (T. rodolphii) ส่วนท้องสีเหลืองอ่อน ตัวเมียมีเต้านม 6 เต้า กระเล็นขนปลายหูสั้นอาศัยได้ทั้งในป่าดิบทึบและป่าโปร่ง รวมถึงตามสวนสาธารณะหรือสวนหลังบ้านในบ้านเรือนของมนุษย์หรือชุมชนเมือง พบได้ทั่วแนวเทือกเขาหิมาลัยมาจนถึงพม่า, จีนตอนใต้ ทางใต้สุดแพร่ไปถึงคาบสมุทรมลายู ในประเทศไทยพบได้ในทางภาคตะวันตกตั้งแต่ใต้สุดจนถึงเหนือสุดของประเทศ รวมถึงภาคกลางตอนบน มีพฤติกรรมมักหากินตัวเดียว หรืออาจเป็นกลุ่มที่เป็นครอบครัวเดียวกัน หากินในเวลากลางวัน กินผลไม้, เมล็ดพืช, ใบไม้ และแมลงเป็นอาหาร กระโดดและวิ่งไปมาบนกิ่งไม้อย่างคล่องแคล่ว เสียงร้องมีสองแบบ แบบหนึ่งคือ จี้ด ๆ สั้น ๆ คล้ายนก แต่แหลมดังบาดหู และอีกแบบหนึ่งคือเสียงแหลมยาวสั่นระรัวที่ค่อย ๆ ผ่อนเสียงลง ไม่ได้เป็นสัตว์ป่าคุ้มครองหรือสัตว์ป่าสงวนตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 แต่อย่างใด และนิยมเลี้ยงกันเป็นสัตว์เลี้ยง',"
				+ 18.823560
				+ ","
				+ 98.893399
				+ ",'himalayan_striped_squirrel_bg','himalayan_striped_squirrel_icon','day','อุทยานแห่งชาติดอยสุเทพ-ปุย','0001000','su_thap');");

		/* อุทยานแห่งชาติภูสวนทราย */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Grey Peacock-Pheasant','นกแว่นสีเทา ','-','เป็นนกขนาดใหญ่ในวงศ์ไก่ฟ้าและนกกระทาพบในเอเชียตะวันออกเฉียงใต้ เป็นนกประจำชาติของประเทศพม่า นกแว่นสีเทาเป็นนกขนาดกลางถึงใหญ่ มีขนาดความยาวลำตัวประมาณ 55 -75 เซนติเมตร มีขนทั่วตัวสีเทาน้ำตาล คือสีพื้นเป็นสีน้ำตาลไหม้ มีจุดขาวเล็ก ๆ กระจายอยู่ทั่วไป ทำให้ดูเป็นสีออกเทา มีแว่นรูปไข่ที่ปีกและหาง ซึ่งแว่นนี้เป็นสีม่วงแดงเหลือบเขียว ตัวผู้มีขนหงอนสีเทาน้ำตาลเล็กน้อยและมีเดือยข้างละ 2 อัน ส่วนตัวเมียไม่มีขนหงอนและเดือย และแว่นมีขนาดเล็กกว่าเล็กน้อย ทั้งตัวผู้และตัวเมียมีหางยาวเหมือนกัน และขามีสีเทา นกแว่นสีเทามีถิ่นกำเนิดบริเวณเทือกเขาหิมาลัย แคว้นสิกขิม อัสสัม ประเทศพม่า ไทย เวียดนาม ลาว ตังเกี๋ย สำหรับประเทศไทยมีทางภาคเหนือของประเทศเป็นส่วนใหญ่ นอกจากนั้นอาจพบทางภาคตะวันตกและภาคตะวันออกเฉียงเหนือบางส่วน',"
				+ 17.513216
				+ ","
				+ 100.922018
				+ ",'grey_peacock_pheasant_bg','grey_peacock_pheasant_icon','day','อุทยานแห่งชาติภูสวนทราย','1100001','su_thap');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Black giant squirrel, Malayan giant squirrel','พญากระรอกดำ','Ratufa bicolor','เป็นกระรอกชนิดหนึ่ง ที่อยู่ในวงศ์ย่อยพญากระรอก (Ratufinae) เป็นกระรอกชนิดหนึ่งที่ใหญ่ที่สุดในโลก และเป็นกระรอกชนิดที่ใหญ่ที่สุดที่พบในประเทศไทย หางยาวเป็นพวง ขนตามลำตัวและหางสีดำสนิท บางตัวอาจมีสะโพก หรือโคนหางออกสีน้ำตาล ขนบริเวณแก้มและท้องสีเหลือง เท้าหน้ามี 4 นิ้ว เท้าหลังมี 5 นิ้ว เล็บยาวและโค้งช่วยในการยึดเกาะต้นไม้ และสะดวกในการเคลื่อนไหวไปมา ขนาดโตเต็มที่มีความยาวลำตัวและหัว 33-37.5เซนติเมตร ความยาวหาง 42.5-46 เซนติเมตร น้ำหนัก 1-1.6 กิโลกรัม มีการกระจายพันธุ์ในแคว้นอัสสัม ของอินเดีย, ภาคตะวันออกของเนปาล, ภาคใต้ของจีน, พม่า, ไทย, ลาว, กัมพูชา, เวียดนาม,มาเลเซีย, เกาะสุมาตรา, เกาะชวา, เกาะบาหลี มีทั้งหมด 10 ชนิดย่อย มีพฤติกรรมมักอาศัยอยู่ในป่าที่มีเรือนยอดไม้สูง เช่น ป่าเบญจพรรณและป่าดิบแล้ง มักพบเห็นอยู่ตามเรือนยอดไม้ที่รกทึบและใกล้ลำห้วย หากินในเวลากลางวันและหลับพักผ่อนในเวลากลางคืน มีความปราดเปรียวว่องไว สามารถกระโดดไปมาบนยอดไม้ได้ไกลถึง 22 ฟุต ปกติจะอาศัยอยู่ตามลำพัง ยกเว้นในฤดูผสมพันธุ์หรือมีลูกอ่อนที่อาจเห็นเป็นคู่หรือเป็นกลุ่มเล็ก ๆ ผสมพันธุ์ได้เมื่ออายุได้ 2 ปี ตั้งท้องนาน 28 วัน ออกลูกครั้งละ 1-2 ตัว โดยที่ตัวเมียมีเต้านมทั้งหมด 3 คู่ รังสร้างขึ้นโดยการนำกิ่งไม้สดมาขัดสานกันคล้ายรังนกขนาดใหญ่ และอาจจะมีรังได้มากกว่าหนึ่งรัง ปัจจุบันมีผู้สามารถเพาะขยายพันธุ์ได้ที่เลี้ยงได้แล้ว และนิยมเลี้ยงเป็นสัตว์เลี้ยง พญากระรอกดำ ยังมีชื่อเรียกอื่นอีกว่า \"กระด่าง\" ในภาษาใต้เรียก \"พะแมว\"',"
				+ 17.561338
				+ ","
				+ 100.928541
				+ ",'black_giant_squirrel_bg','black_giant_squirrel_icon','day','อุทยานแห่งชาติภูสวนทราย','1001000','su_thap');");

		/* อุทยานแห่งชาติภูเรือ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Siamese fireback, Diard fireback','ไก่ฟ้าพญาลอ','Lophura diardi','ไก่ขนาดกลางในวงศ์ไก่ฟ้าและนกกระทา (Phasianidae) มีขนสวยงาม ไก่ฟ้าพญาลอเป็นไก่ฟ้าที่มีความสวยงามที่สุดชนิดหนึ่งของประเทศไทย เป็นไก่ขนาดกลาง ยาวประมาณ 80 ซม. ตัวผู้มีหน้ากากสีแดงสด บนหัวมีเส้นขนแตกพุ่มตรงปลายสีดำเหลือบน้ำเงินยาวโค้งไปด้านหลัง ปากสีเหลืองขุ่น รอบคางใต้หน้ากากลงมามีขนสีดำ ลำตัวด้านบน อก คอ และปีกมีสีเทา ลักษณะเด่นคือ ขนตอนท้ายของลำตัวใกล้โคนหางจะมีสีเหลืองแกมสีทองเห็นได้ชัดเจนขณะกระพือปีกขนคลุมโคนหางมีสีดำเหลือบน้ำเงินขอบสีแดงอิฐซ้อนกันหลายชั้น หางมีสีดำเหลือบเขียวยาวและโค้งลง ขนคลุมปีกมีลายสีดำขอบขาว ท้องสีดำ แข้งสีแดงมีเดือย ตัวเมียหน้าสีแดง บริเวณหน้าอก คอ หลังมีสีน้ำตาลแกมแดง ท้องมีลายเกล็ดน้ำตาลแดงขอบสีขาว ปีกมีสีดำสลับด้วยลายสีขาวตามแนวขวาง หางคู่บนสีดำสลับขาวส่วนคู่ล่างถัดลงมา สีน้ำตาลแกมแดง แข้งสีแดงไม่มีเดือย ไก่ฟ้าพญาลอพบในประเทศไทย, กัมพูชา, ลาว และเวียดนาม ในประเทศไทยพบทางภาคเหนือ ภาคตะวันออกเฉียงเหนือ และภาพตะวันออกเฉียงใต้ อาศัยตามป่าทึบเช่นป่าดงดิบแล้ง ป่าดงดิบชื้น และป่าดงดิบเขา แต่บางครั้งพบอยู่ตามป่าโปร่ง เช่นป่าเต็งรังป่าเบญจพรรณ ในระดับความสูงไม่เกิน 800 เมตรจากระดับน้ำทะเล ในธรรมชาติไก่ฟ้าพญาลอมีนิสัยป้องกันอาณาเขต ตัวผู้ชอบอาศัยอยู่โดดเดี่ยวหรือจับคู่หากินกับตัวเมียในฤดูผสมพันธุ์ ออกหากินตอนกลางวันและขึ้นคอนนอนตามต้นไม้สูงในเวลากลางคืน เป็นไก่ฟ้าที่เลี้ยงง่ายที่สุด ไม่ขี้อาย มักพบเห็นได้ง่ายตามถนนที่ผ่านป่า ไก่ฟ้าพญาลอกิน ตัวหนอน แมลงต่าง ๆ ไส้เดือน สัตว์ขนาดเล็ก เมล็ดหญ้า เมล็ดพืช ผลไม้สุกที่หล่นตามพื้น เช่นลูกไทร และพวกขุยไผ่ เป็นอาหาร และชอบกินพวกสัตว์มากกว่าพืช ถ้าเลี้ยงในกรงสามารถเลี้ยงด้วยอาหารสำเร็จรูบสำหรับไก่เนื้อหรือไก่ไข่ตามช่วงอายุต่างๆที่มีขายตามท้องตลาดแล้วเสริมด้วยอาหารจำพวก หนอนนก ปลวก รวมทั้งผลไม้และวิตามินสำหรับละลายในน้ำ ไก่ฟ้าพยาลอโตเต็มวัยกินอาหารสำเร็จรูปเฉลี่ย 35.00กรัม/ตัว/วัน ปัจจุบันในธรรมชาตหายากมากกฎหมายจัดให้ไก่ฟ้าพญาลอเป็นสัตว์ป่าคุ้มครองและเป็นสัตว์ป่าที่มีแนวโน้มจะสูญพันธุ์ จึงมีผู้สนใจนำเข้าพ่อแม่พันธุ์จากต่างประเทศซึ่งมีราคาค่อนข้างแพงมาก ปัจจุบันราชการได้มีการส่งเสริมให้มีการเพาะเลี้ยง โดยมีผู้ได้รับอนุญาตอย่างถูกต้องตามกฎหมาย',"
				+ 17.497084
				+ ","
				+ 101.323882
				+ ",'siamese_fireback_bg','siamese_fireback_icon','day','อุทยานแห่งชาติภูสระดอกบัว','1100001','tan_bok_ka_ra_nee');");

		
		/* อุทยานแห่งชาติภูสระดอกบัว */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Jewel beetle, Metallic wood-boring beetle and Buprestid','แมลงทับกลมขาเขียว','Sternocera aequisignata','แมลงปีกแข็งชนิดหนึ่ง จัดอยู่ในวงศ์แมลงทับ (Buprestidae) มีมีลำตัวยาวโค้งนูน ส่วนที่เป็นปีกแข็งมีความแข็งมาก หัวมีขนาดเล็กซ่อนอยู่ใต้อกปล้องแรกซึ่งโค้งมนเรียวไปทางหัวเชื่อมกับอกปล้องกลางซึ่งกว้างกว่าส่วนอื่น ๆ ท้องมนเรียวไปทางปลายหาง ปีกแข็งหุ้มส่วนท้องจนหมด ปีกแข็งเป็นสีเขียวเลื่อมเหลือบทองมีความแวววาวสวยงาม มีหนวดเป็นเส้นแบบใบไม้ หัวมีขนาดใหญ่ แมลงทับกลมขาเขียว มีวงจรชีวิตยาวประมาณ 1-2 ปี โดยเป็นตัวหนอน 8-20 เดือน ในดินที่มีธาตุอาหารอุดมสมบูรณ์ ในความลึกประมาณ 10-20 เซนติเมตร ในระยะที่ยังเป็นไข่ประมาณ 2-3 เดือน ฟองไข่มีลักษณะกลมรี สีเหลือง ระยะเป็นดักแด้จะอยู่ในปลอกดินหุ้มลำตัวประมาณ 2-3 เดือน แต่เมื่อเป็นตัวเต็มวัยแล้วจะมีอายุประมาณ 2-3 เดือนเท่านั้น โดยจะผุดขึ้นมาจากดินในช่วงฤดูฝน ที่พื้นดินมีความชุ่มชื้น โดยจะออกหากินทันทีและผสมพันธุ์ตามเรือนยอดไม้ วางไข่ครั้งละ 12 ฟอง ซึ่งจัดว่าน้อยสำหรับแมลงปีกแข็ง จะกินอาหารจำพวก ยอดไม้ โดยเฉพาะยอดอ่อน ๆ ของพืชหลายชนิด เช่น มะขามเทศ เป็นต้น ในประเทศไทยพบได้ทั่วไปในหลายพื้นที่ ทั้งใน ป่าละเมาะหรือแม้แต่สวนสาธารณะหรือสวนผลไม้ต่างๆ โดยเฉพาะในพื้นที่ภาคกลาง มักพบเป็นกลุ่มเล็กๆ นับเป็นแมลงทับ 1 ใน 2 ชนิดที่พบได้บ่อยและรู้จักกันดีที่สุดในประเทศไทย (อีกหนึ่งชนิดนั้น คือ แมลงทับกลมขาแดง (S. ruficornis)) เป็นแมลงที่มีความสวยงาม จึงถูกใช้ประโยชน์ต่าง ๆ จากปีกแข็งที่มีสีเขียวเลื่อม ด้วยการทำเป็นเครื่องประดับต่าง ๆ ซึ่งสีของปีกนั้นสามารถคงทนอยู่ได้นานถึง 50 ปี',"
				+ 16.126393
				+ ","
				+ 104.698110
				+ ",'jewel_beetle_bg','jewel_beetle_icon','day','อุทยานแห่งชาติภูเรือ','0010000','tan_bok_ka_ra_nee');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Atlas moth','ผีเสื้อหนอนใบกระท้อน','Attacus atlas','ผีเสื้อที่อยู่ในวงศ์ Saturniidaeจัดเป็นผีเสื้อกลางคืนชนิดหนึ่งที่มีขนาดใหญ่ ระยะที่เป็นตัวหนอนกินใบกระท้อน, ฝรั่ง, ขนุน และใบดาหลา ตัวเมียวางไข่บนใบพืชอาหาร ลักษณะไข่กลมสีน้ำตาล ขนาดประมาณเท่าเมล็ดถั่วเขียว ระยะฟักไข่ประมาณ 7 วัน เมื่อเป็นตัวหนอนมีปุ่มหนามทั่วตัว ลอกคราบ 5 ครั้ง หนอนวัยที่ 1 ขณะฟักออกจากไข่ ตัวยาวประมาณ 1 เซนติเมตร หนอนวัยที่ 5 ขนาดตัวยาวประมาณ 6 เซนติเมตร ระยะเวลาที่เป็นตัวหนอนประมาณ 1 เดือน ก่อนเตรียมตัวเข้าดักแด้ โดยการถักรังไหมสีน้ำตาลขนาด 3x6 เซนติเมตร หนอนลอกคราบเป็นดักแด้อยู่ในรังไหม ระยะดักแด้ 1-6 เดือน และลอกออกเป็นตัวเต็มวัยประมาณช่วงเดือนกรกฎาคมไปจนถึงปลายปีและถึงต้นปีถัดไป เมื่อโตเต็มวัย มีความยาวจากปลายปีกข้างหนึ่งไปถึงข้างหนึ่งได้ประมาณ 1 ฟุต ลำตัวยาว 4-5 เซนติเมตร กว้าง 1.5-2 เซนติเมตร ลำตัวและอกคลุมด้วยขนสีน้ำตาลแดง ปีกสีน้ำตาลแดงหรือสีน้ำตาลส้มมีลวดลายโดยเฉพาะบริเวณเกือบกึ่งกลางปีก มีลักษณะบางใสรูปคล้ายใบโพ ซึ่งสามารถมองเห็นทะลุได้ซึ่งไม่ทราบถึงสาเหตุถึงการมี แต่มีการสันนิษฐานว่ามีไว้สำหรับหลอกล่อสัตว์นักล่า ซึ่งอายุในการเป็นตัวเต็มวัยจะมีมีเพียงสั้น ๆ ราว 1-2 สัปดาห์เท่านั้น เนื่องจากมีปากที่กินอาหารไม่ได้ จึงใช้พลังงานจากที่สะสมไว้เมื่อครั้งเป็นหนอน ซึ่งตัวเต็มวัยของผีเสื้อหนอนใบกระท้อนจึงทำเพียงปล่อยฟีโรโมนเพื่อการผสมพันธุ์ วางไข่ และตายลงเท่านั้น พบกระจายได้ทั่วไปในอินเดีย จนถึงภูมิภาคเอเชียตะวันออกเฉียงใต้, อินโดนีเซีย และตอนใต้ของจีน โดยจะพบมากในป่ากระท้อน',"
				+ 16.154755
				+ ","
				+ 104.762998
				+ ",'atlas_moth_bg','atlas_moth_icon','night','อุทยานแห่งชาติภูเรือ','0100000','tan_bok_ka_ra_nee');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Cattle egret','นกยางควาย','Bubulcus ibis','นกยางสีขาว ในวงศ์ Ardeidae พบในเขตร้อนและอบอุ่น นกกระยางควายมีจุดกำเนิดในทวีปเอเชีย แอฟริกาและยุโรป แต่นกยางมีการขยายพันธุ์และกระจายตัวไปทั่วโลก และเป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 จัดเป็นนกเพียงชนิดเดียวเท่านั้นในสกุล Bubulcus เป็นนกยางสีขาว ตัวผู้และตัวเมียมีลักษณะเหมือนกัน ขนทั่วตัวสีขาว ขากรรไกรค่อนข้างใหญ่และขาสั้น มีความยาวจากปลายปากจรดปลายหางเพียง 51 เซนติเมตรเท่านั้น แต่ในฤดูผสมพันธุ์จะมีขนประดับเป็นเส้นยาว ๆ ที่หัว คอ และหลังเป็นสีเหลืองส้ม พ้นฤดูผสมพันธุ์ขนประดับดังกล่าวจะผลัดออกหมด นัยน์ตาและปากเป็นสีเหลือง แต่รอบตาสีออกเขียวอ่อน เท้าสีดำ ในช่วงนี้เมื่อจับคู่แล้วนกทั้งสองเพศจะช่วยกันทำรังโดยตัวผู้หาวัสดุซึ่งก็คือกิ่งไม้แห้งที่อาจจะหามาเองหรือขโมยเอาจากรังใกล้ๆ ตัวเมียสร้างรัง เมื่อวางไข่แล้วจะช่วยกันกกไข่ และหาอาหารมาป้อนลูก ในฤดูผสมพันธุ์นกชนิดนี้จะดูสวยและจำแนกได้ง่าย เพราะหัว คอ หน้าอก และหลังจะมีขนสีเหลืองทองสดใสปกคลุมไปทั่ว ขาที่เคยเป็นสีดำสนิทก็จะมีสีเหลืองหรือสีแดงมาแทนที่ ในช่วงนี้เมื่อจับคู่แล้วนกทั้งสองเพศจะช่วยกันทำรังโดยตัวผู้หาวัสดุซึ่งก็คือกิ่งไม้แห้งที่อาจจะหามาเองหรือขโมยเอาจากรังใกล้ๆ ตัวเมียสร้างรัง เมื่อวางไข่ ไข่เป็นสีฟ้า-ขาวซีด เป็นรูปวงรีขนาด 45 มิลลิเมตร x 53 มิลลิเมตร แล้วจะช่วยกันกกไข่และหาอาหารมาป้อนลูก นกยางควาย อาศัยตามแหล่งน้ำเหมือนอย่างนกยางอื่นๆ แต่นกยางควายไม่ได้กินปลาเป็นอาหารหลัก แต่มักกินพวกตั๊กแตน และแมลงต่างๆในทุ่งหญ้า ที่อยู่บริเวณแหล่งน้ำ หรือแม้กระทั่งพวก กบ เขียด นอกจากนี้ นกยางควายอาจจับกินแมลงที่อยู่บน ควาย หรือ วัว ด้วย',"
				+ 16.133319
				+ ","
				+ 104.755531
				+ ",'cattle_egret_bg','cattle_egret_icon','day','อุทยานแห่งชาติภูเรือ','1100001','tan_bok_ka_ra_nee');");

		/* อุทยานแห่งชาติตาพระยา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Ornate Narrow-mouthed Frog','อึ่งน้ำเต้า','-','อึ่งชนิดหนึ่ง ในสกุล Microhyla พบในเอเชียใต้ เป็นอึ่งขนาดเล็ก ยาว 23 - 28 มิลลิเมตร หัวเล็ก หน้าสั้น ลำตัวด้านบนสีน้ำตาลเทา น้ำตาลเข้ม น้ำตาลเหลือง หรือสีน้ำตาลแดง มีลายรูปน้ำเต้าสีน้ำตาลเข้ม มีเส้นสีดำข้างจมูกผ่านตาต่อเนื่องไปตามสีข้าง ขามีลายพาดขวางสีน้ำตาลเข้มหรือเหลือง ตัวผู้คางสีดำ ท้องสีขาวออกเหลือง ปลายนิ้วเรียว เท้าหลังมีพังผืดเต็มความยาวนิ้ว มีการกระจายพันธุ์ตั้งแต่ตอนเหนือของประเทศอินเดีย ถึงศรีลังกา ตอนใต้ของจีน ไต้หวัน ฮ่องกง อินโดจีนจนถึงคาบสมุทรมาลายู พบตามพื้นใต้ใบไม้ และตามกอพืช ในป่าทุกประเภท และในสวนตามบ้าน',"
				+ 14.217548
				+ ","
				+ 102.852758
				+ ",'ornate_narrow_mouthed_frog_bg','ornate_narrow_mouthed_frog_icon','day','อุทยานแห่งชาติตาพระยา','1100000','tapraya');");

		/* อุทยานแห่งชาติตาดโตน */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Malayan pit viper','งูกะปะ','Calloselasma rhodostoma','งูพิษที่มีพิษรุนแรงมาก จัดเป็นงูเพียงชนิดเดียวเท่านั้นที่อยู่ในสกุล Calloselasma โดยไม่มีชนิดย่อย ลักษณะหัวเป็นรูปสามเหลี่ยม คอเล็ก ลำตัวอ้วน หางเรียวสั้น มีลายเป็นรูปเหมือนหลังคาบ้านอยู่ด้านข้างตลอดลำตัว มีสีเทาอมชมพูลายสีน้ำตาลเข้ม เกล็ดมีขนาดใหญ่ จะงอยปากงอนขึ้นข้างบน หากินเวลาพลบค่ำและกลางคืน โดยเฉพาะในเวลาที่มีความชื้นในอากาศสูง เช่น หลังฝนตก ชอบอาศัยในดินปนทรายที่มีใบไม้หรือเศษซากไม้ทับถมกันเพื่อซ่อนตัว เป็นงูที่ไม่ปราดเปรียว เวลาตกใจจะงอตัวหรือขดนิ่ง แต่ฉกกัดรวดเร็วมาก กินอาหารได้แก่ สัตว์ขนาดเล็ก เช่น หนู, นก หรือสัตว์เลื้อยคลานขนาดเล็ก มีความยาวเต็มที่ประมาณ 1 เมตร ออกไข่ครั้งละ 10-20 ฟองในตัวที่มีสีคล้ำเรียกว่า \"งูปะบุก\" พบกระจายพันธุ์ทั่วไปในภูมิภาคอินโดจีนไปจนถึงแหลมมลายู สำหรับในประเทศไทยพบได้ทั่วทุกภาค แต่จะพบมากที่สุดในภาคใต้เป็นงูที่ปรับตัวให้อาศัยอยู่ในพื้น ๆ ที่มีการทำเกษตรกรรมได้ เช่น สวนยางพาราหรือสวนปาล์มน้ำมัน จึงมักจะมีผู้ถูกกัดอยู่บ่อย ๆ นับเป็นงูพิษที่มีอันตรายต่อมนุษย์มากที่สุดที่พบในประเทศไทย ซึ่งพิษของงูกะปะนั้นมีผลต่อระบบประสาท เมื่อถูกกัดภายใน 10 นาทีหลังบริเวณรอบแผลที่ถูกกัดจะบวมขึ้นย่างรวดเร็วจนกระทั่งแขนหรือขาข้างนั้นบวมไปหมดภายใน 1 ชั่วโมง โดยในรอยเขี้ยวจะมีเลือดไหลตลอดเวลา บริเวณแขนขาที่บวมจะมีสีเขียวคล้ำ ผิวหนังเกิดพองตอนแรกมีน้ำใสต่อมาภายหลังมีเลือด ภายหลังถูกกัดไม่กี่วันรอยเขี้ยวจะเกิดการเน่า ทำให้ผิวหนังมีเลือดออกเป็นรอยคล้ำ เลือดออกทางเดินอาหาร ผู้ที่โดนกัดจะเสียชีวิตได้จากความดันโลหิตต่ำ',"
				+ 15.984825
				+ ","
				+ 102.052491
				+ ",'malayan_pit_viper_bg','malayan_pit_viper_icon','night','อุทยานแห่งชาติตาดโตน','1000000','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Spotted flying dragon, Orange-winged flying lizard','กิ้งก่าบินปีกจุด หรือ กิ้งก่าบินปีกส้ม','Draco maculatus','เป็นกิ้งก่าบินขนาดเล็ก ใต้คางมีเหนียงคู่หนึ่งรูปร่างกลมมน ซึ่งกึ่งกลางเหนียงตรงนี้สามารถยกขึ้นลงได้ ในตัวผู้จะมีขนาดโตเห็นชัดเจน ข้างลำตัวระหว่างขาคู่หน้าและขู่หลัง มีแผ่นหนังขนาดใหญ่ที่ใช้ในการร่อน ลำตัวมีสีน้ำตาลแดง มีลายประสีเหมือนลายไม้ จึงสามารถพรางได้เป็นอย่างดีบนต้นไม้ แผ่นหนังด้านข้างนี้ออกสีส้ม มีลายพาดตามยาวสีจาง ใต้ท้องมีสีน้ำตาลอ่อนกว่า ใต้แผ่นหนังข้างลำตัวจะมีจุดสีดำ 2-3 จุด อันเป็นที่มาของชื่อเรียก มีความยาวจากหัวจรดโคนหาง 60-65 มิลลิเมตร ส่วนหางมีความยาวกว่าคือ 93-110 มิลลิเมตร พบแพร่กระจายพันธุ์ตั้งแต่รัฐอัสสัมของอินเดีย จนถึงเกาะไหหลำในจีน และเอเชียตะวันออกเฉียงใต้จนถึงตอนเหนือของมาเลเซีย พบได้ในป่าหลากหลายประเภท รวมถึงบ้านเรือนของมนุษย์ที่ปลูกใกล้ชายป่าด้วย หากินในเวลากลางวันจนถึงพลบค่ำ โดยมากจะหากินและอยู่ตามลำพังตัวเดียว ขยายพันธุ์ด้วยการวางไข่โดยตัวเมียวางไข่ไว้ในหลุมดินที่ขุดไว้ ในที่ ๆ มีแสงแดดส่องถึง ครั้งละ 3-5 ฟอง วางไข่ในฤดูฝน จัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535',"
				+ 15.948187
				+ ","
				+ 101.922715
				+ ",'spotted_flying_dragon_bg','spotted_flying_dragon_icon','day','อุทยานแห่งชาติตาดโตน','1100000','klong_wang_jao');");

		/* อุทยานแห่งชาติภูเวียง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Rhesus macaque','ลิงวอก','Macaca mulatta','เป็นสัตว์เลี้ยงลูกด้วยนมในอันดับวานร (Primates) เป็นลิงที่มีร่างกายอ้วนสั้น บริเวณหลัง หัวไหล่ และตะโพกมีสีน้ำตาลปนเทา ส่วนบริเวณใต้ท้องและสีข้างมีสีอ่อนกว่า หางยาวประมาณครึ่งหนึ่งของความยาวลำตัว ขนหางค่อนข้างยาวและฟู มีการผลัดขนประมาณช่วงเดือนมิถุนายนถึงกรกฎาคมของทุกปี โดยจะเริ่มที่บริเวณปากก่อน หลังจากนั้นจึงจะเริ่มผลัดขนที่หลัง ตัวเมียอาจมีขนสีแดงในฤดูผสมพันธุ์ ขนที่หัวของลิงวอกจะชี้ตรงไปด้านหลัง ลิงตัวผู้มีขนาดใหญ่กว่าตัวเมีย มีความยาวลำตัวและหัว 47-58.5 เซนติเมตร ความยาวหาง 20.5-28 เซนติเมตร น้ำหนัก 3-6 กิโลกรัม มีการกระจายพันธุ์ตั้งแต่ อัฟกานิสถาน, ภาคเหนือของอินเดีย, เนปาล, พม่า, ภาคใต้ของจีน, ลาว, เวียดนาม และภาคตะวันตกของไทยโดยในประเทศ ปัจจุบันเชื่อว่า เหลืออยู่เพียงฝูงสุดท้ายแล้วที่ วัดถ้ำผาหมากฮ่อ ในพื้นที่อำเภอวังสะพุง จังหวัดเลย มีพฤติกรรมชอบอยู่รวมกันเป็นฝูงใหญ่ ตั้งแต่ 50 ตัวขึ้นไป สมาชิกส่วนใหญ่ในฝูงประกอบไปด้วยลิงตัวเมียและลูก ๆ ตัวเมียในฝูงจะมีบาทบาทสำคัญมากกว่าตัวผู้ แต่ลิงตัวผู้จะมีบทบาทในการปกป้องฝูง ลิงวอกเริ่มผสมพันธุ์ได้เมื่อมีอายุ 3-4 ปี ระยะตั้งท้องนาน 5-7 เดือน ออกลูกครั้งละ 1 ตัว ลิงตัวเมียจะอยู่กับฝูงไปจนตาย แต่ตัวผู้เมื่อโตขึ้น มักจะถูกขับไล่ให้ออกจากฝูง ปัจจุบัน เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535',"
				+ 16.684263
				+ ","
				+ 102.353419
				+ ",'rhesus_macaque_bg','rhesus_macaque_icon','day','อุทยานแห่งชาติภูเวียง','1000001','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Phayre''s flying squirrel','กระรอกบินเล็กแก้มขาว','-','เป็นสัตว์เลี้ยงลูกด้วยนมในกลุ่มฟันแทะชนิดหนึ่ง ที่อยู่ในวงศ์ Sciuridaeหรือ กระรอก มีลักษณะพิเศษที่แตกต่างจากกระรอกจำพวกอื่น คือ มีแผ่นหนังลักษณะคล้ายพังผืดที่บริเวณข้างลำตัวตั้งแต่ขาหน้าถึงขาหลัง นั่นคือ เป็นกระรอกบิน กระรอกบินเล็กแก้มขาว มีขนาดความยาวลำตัวและหัว 17 - 19 เซนติเมตร หางยาว 13 - 17 เซนติเมตร นับเป็นกระรอกบินขนาดกลาง ขนาดใหญ่กว่ากระรอกบินเล็กแก้มแดง (H. spadiceus) ที่อยู่ในสกุลเดียวกัน ตาค่อนข้างกลมและโต ลักษณะเด่นคือ ขนบริเวณแก้มมีสีขาว ขนหลังสีเทาหรือสีน้ำตาลเข้ม ด้านท้องมีสีขาวครีม ขนหางแบนเรียบสีเทาหรือสีน้ำตาลเข้ม บริเวณแก้มจนถึงหลังใบหูมีสีขาว ส่วนกระรอกบินเล็กเขาสูงจะมีแก้มและกระหม่อมเป็นสีเทา และลำตัวด้านบนกับส่วนหางจะมีสีเทาแกมน้ำตาล แผ่นหนังสำหรับใช้ร่อนมีสีน้ำตาลไหม้ ส่วนลำตัวด้านล่างมีสีขาวแต้มด้วยสีเหลือง และตรงคอหอยจะมีสีออกเหลือง ถิ่นที่อยู่อาศัยส่วนมากอยู่ในป่าดงดิบเขาระดับต่ำ และป่าเบญจพรรณในระดับความสูงไม่เกิน 1,000 เมตรจากระดับน้ำทะเล สามารถพบได้ทั้งในภาคเหนือและภาคตะวันตกของไทย นอกจากนี้แล้วยังพบได้ในประเทศใกล้เคียง เช่น ลาว, กัมพูชา, เวียดนาม เป็นสัตว์ป่าคุ้มครองตามกฎหมายของไทย',"
				+ 16.686997
				+ ","
				+ 102.358268
				+ ",'phayre_flying_squirrel_bg','phayre_flying_squirrel_icon','day','อุทยานแห่งชาติภูเวียง','1100001','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Northern treeshrew','กระแตเหนือ','Tupaia belangeri','เป็นสัตว์เลี้ยงลูกด้วยนมขนาดเล็กชนิดหนึ่ง จัดเป็นกระแต 1 ใน 2 ชนิดที่พบได้ในประเทศไทย นอกเหนือจากกระแตใต้ หรือกระแตธรรมดา (T. glis) มีลักษณะคล้ายคลึงกัน แต่กระแตเหนือมีขนสีน้ำตาลเทา ในขณะที่กระแตใต้จะมีขนสีออกน้ำตาลแดง กระแตใต้ตัวเมียมีเต้านม 6 เต้า ขณะที่กระแตเหนือมีเต้านม 4 เต้า มีความยาวตั้งแต่ปลายจมูกจนถึงรูทวาร 13.5-20.5 เซนติเมตร มีอายุยืนเต็มที่ประมาณ 11 ปี พบกระจายพันธุ์ตั้งแต่ประเทศอินเดีย, พม่า, จีนตอนใต้ และกลุ่มประเทศอินโดจีน ในประเทศไทยพบทั่วทุกภาค ยกเว้นภาคใต้จะพบได้เฉพาะบริเวณเหนือคอคอดกระขึ้นไปเท่านั้น',"
				+ 16.687
				+ ","
				+ 102.3585
				+ ",'northern_treeshrew_bg','northern_treeshrew_icon','day','อุทยานแห่งชาติภูเวียง','1100001','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Roof rat, Black rat','หนูท้องขาว','Rattus rattus','จัดเป็นหนูที่พบได้ในบ้านเรือนของมนุษย์หนึ่งในสามชนิด ร่วมกับ หนูบ้าน (R. norvegicus) และหนูจี๊ด (R. exulans) เป็นหนูขนาดกลาง ใบหูใหญ่ ขนตามลำตัวด้านสีน้ำตาลอ่อนหรือสีน้ำตาลแดงหรือสีดำ ขนท้องสีขาว มีลายสีดำเล็ก ๆ ที่หน้าอก หางสีดำมีความยาวพอ ๆ หรือยาวกว่าความยาวลำตัวและหัว มีเกล็ดตลอดทั้งหาง จมูกแหลมกว่าหนูบ้าน มีความยาวลำตัวและหัวประมาณ 18 เซนติเมตร ส่วนหางก็มีความยาวพอ ๆ กัน ตัวเมียมีเต้านมที่หน้าอก 2 คู่ ออกลูกปีละ 4-6 ครอก ลูกหนึ่งครอกมีจำนวน 6-8 ตัว มีระยะทางหากิน 100-150 ฟุต เป็นหนูที่มีถิ่นกำเนิดในทวีปเอเชีย และพบกระจายพันธุ์ไปไกลจนถึงทิศตะวันออกของโรมาเนีย เป็นหนูที่ปรับตัวให้อยู่ในสภาพแวดล้อมต่าง ๆ ได้เป็นอย่างดี ชอบขึ้นและหากินบนต้นไม้ เพราะชอบกินเมล็ดพืชมากที่สุด จึงมักพบในพื้นที่เกษตรกรรมในประเทศไทยพบได้ทุกภาค โดยเฉพาะในสวนมะพร้าวหรือปาล์มน้ำมันในภาคใต้ จัดเป็นศัตรูพืชของพืชจำพวกนี้ เกษตรกรจึงใช้วิธีตามธรรมชาติกำจัดหนูเหล่านี้ โดยสร้างรังนกแสก (Tyto alba) ให้อยู่ท้ายสวน เพราะนกแสกจะกินหนูโดยเฉพาะหนูท้องขาวเป็นอาหารหลักถ้าอาศัยอยู่ในบ้านก็มักจะสร้างรังบนเพดานบ้าน',"
				+ 16.707057
				+ ","
				+ 102.360607
				+ ",'roof_rat_bg','roof_rat_icon','day','อุทยานแห่งชาติภูเวียง','0000000','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Lesser whistling duck','เป็ดแดง','Dendrocygna javanica','เป็ดขนาดเล็ก มีแหล่งขยายพันธุ์ในเอเชียใต้และเอเชียตะวันออกเฉียงใต เป็ดแดงมีการกระจายพันธุ์กว้างจากประเทศปากีสถานในหุบแม่น้ำทางตะวันออกลงไปยังประเทศอินเดีย, เนปาล, ศรีลังกา, บังคลาเทศ, พม่า, ไทย, มาเลเซีย, สิงคโปร์, อินโดนีเซีย, ภาคใต้ของจีน และเวียดนาม ส่วนใหญ่เป็นนกประจำถิ่น มีการอพยพในพื้นที่บ้างตามภัยแล้งหรือน้ำท่วม แต่ในประเทศจีนนกจะอพยพหนีหนาวลงใต้ อาศัยในทะเลสาบน้ำจืดที่ยังคงมีความอุดมสมบูรณ์พืชพรรณ รวมทั้งทุ่งนาน้ำท่วมขัง หนองน้ำกลางป่า และบางครั้งอาจเข้าไปอาศัยอยู่ในแหล่งน้ำกร่อย อ่าวริมทะเล ป่าชายเลน รวมทั้งนากุ้งใกล้ ๆ ชายฝั่งทะเล เป็ดแดงมีปากยาวสีเทา คอยาว และขายาว หน้าผากและกลางกระหม่อมสีน้ำตาลปนเทาคล้ำ หัว ลำคอ และอกสีเนื้อแกมเทาหม่น ใต้คอสีจางจนขาว และด้านข้างและหลังคอตอนบนมีสีเข้มกว่า สีข้างและท้องสีแดงอมน้ำตาลปนเหลือง มีลายขีดสีครีมตามแนวสีข้างตอนบน ขนคลุมใต้โคนหางและบริเวณก้นสีค่อนข้างขาว หลัง ไหล่ ขนคลุมหัวปีกใหญ่และขนคลุมหัวปีกกลางสีน้ำตาลคล้ำ มีลายเกล็ดสีแดงแกมน้ำตาล ขนคลุมหัวปีกน้อยสีน้ำตาลแกมแดง ขนคลุมใต้หัวปีกสีออกดำ ขนกลางปีกและขนปลายปีกสีน้ำตาลไหม้ ตะโพกสีค่อนข้างดำ ขนคลุมบนโคนหางสีน้ำตาลแกมแดงสด ขนหางสีน้ำตาลไหม้ ขาและนิ้วเท้าสีเทาปนฟ้าคล้ำ ในขณะบิน จะส่งเสียงร้องค่อนข้างแหลมเป็นจังหวะยาว ๆ สั้น ๆ คล้ายเสียงผิวปาก ดัง \"ซี-ซิก\" เป็ดแดง ถือเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 ตามมาตรา 19 และมาตรา 20 หากผู้ใดล่าหรือมีครอบครองซึ่งซากและตัวที่ยังมีชีวิตโดยไม่ได้รับอนุญาต มีโทษปรับไม่เกิน 40,000 บาท จำคุกไม่เกิน 4 ปี หรือทั้งจำทั้งปรับ แต่กระนั้นก็ยังมีผู้ลักลอบทำผิดอยู่เรื่อย ๆ ',"
				+ 16.703645
				+ ","
				+ 102.364727
				+ ",'lesser_whistling_duck_bg','lesser_whistling_duck_icon','day','อุทยานแห่งชาติภูเวียง','1100000','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Shikra','เหยี่ยวนกเขาชิครา','Accipiter badius','เป็นเหยี่ยวขนาดเล็กชนิดหนึ่ง จำพวกเหยี่ยวนกเขา มีลักษณะปากแหลมปลายปากงุ้มลง ปีกกว้างสั้น ปลายปีกแหลม หางยาว ตัวผู้และตัวเมียมีลักษณะคล้ายกัน แต่ตัวเมียจะมีขนาดใหญ่กว่าเล็กน้อยและลำตัวออกสีน้ำตาลมากกว่า ลำตัวด้านบนมีสีเทาอมฟ้า แก้มสีเทามีสีขาวเป็นลายเล็ก ๆ สีน้ำตาลจาง ๆ อยู่ติดกัน ที่คอมีสีเส้นสีดำลากผ่านกึ่งกลางสันคอ ตามีสีแดงหรือเหลือง หางสีเทามีลายแถบสีคล้ำ 5 แถบ แข้งเป็นสีเหลือง เมื่อเวลาบินจะเห็นปีกด้านล่างเป็นสีขาว ปลายปีกเป็นสีดำและมีลายยาวสีน้ำตาลคล้ำ ลูกนกที่ยังไม่โตเต็มที่จะมีขนสีน้ำตาลเทาเข้ม มีแถบสีขาวและน้ำตาลแดงที่ท้ายทอย คิ้วสีขาว หน้าอกมีแถบใหญ่สีน้ำตาลแดง ที่สีข้างและต้นขามีสีน้ำตาลแดงเป็นขีดสั้น ๆ ขนาดเมื่อโตเต็มที่ประมาณ 30-36 เซนติเมตร จึงจัดเป็นเหยี่ยวขนาดเล็กที่สุดในสกุล Accipiter ชนิดหนึ่ง มีพฤติกรรมกระพือปีกได้เร็ว และร่อนอยู่กลางอากาศเพื่อหาเหยื่อ ล่าเหยื่อจำพวกสัตว์ชนิดอื่นและนกขนาดเล็ก รวมถึงแมลงขนาดใหญ่เป็นอาหาร มักอยู่ตามลำพังหรืออยู่เป็นคู่ ปกติชอบเกาะนิ่งอยู่ตามยอดไม้สูงชายป่าหรือป่าละเมาะ คอยออกบินโฉบจับเหยื่อไม่ให้รู้ตัว สร้างรังอย่างง่าย ๆ โดยการเอากิ่งไม้มาขัดกันบนคาคบ เหยี่ยวนกเขาชิครา เป็นนกที่มีการกระจายพันธุ์ค่อนข้างกว้าง โดยพบได้ตั้งแต่ทวีปแอฟริกา, เอเชียใต้, เอเชียอาคเนย์, เอเชียตะวันออกจนถึงเกาะสุมาตรา สำหรับในประเทศไทยสามารถพบได้ทุกภูมิภาคยกเว้นภาคใต้ เป็นสัตว์ป่าคุ้มครองประเภทที่ 1 ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่าแห่งประเทศไทย พุทธศักราช 2535',"
				+ 16.635831 + "," + 102.165428
				+ ",'shikra_bg','shikra_icon','day','อุทยานแห่งชาติภูเวียง','1100001','klong_wang_jao');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Little Grebe, Dabchick','นกเป็ดผีเล็ก','-','เป็นนกน้ำในวงศ์นกเป็ดผี มีการกระจายพันธุ์เป็นวงกว้าง นกเป็ดผีเล็กเป็นนกน้ำขนาดเล็ก ปากแหลมสีเหลืองอ่อน นกโตเต็มวัยหน้าผาก ท้ายทอยถึงหลังสีน้ำตาลเข้ม คอสีแดง แก้ม อก และท้องสีน้ำตาลแกมเหลือง ชุดขนฤดูผสมพันธุ์หน้าและแก้มจะเปลี่ยนเป็นน้ำตาลแดงเข้ม สีข้างน้ำตาล ปากดำ โคนปากเหลือง ตาเหลือง นกวัยอ่อนมีปากสีเหลืองปลายสีดำเล็กๆ มีลายทางดำสลับขาวที่แก้มและข้างคอ สีปากจะเข้มขึ้นตามวัย ร้องเสียง \"กรี๊รก-กรี๊รกกก...\" รัว',"
				+ 16.761450
				+ ","
				+ 102.291771
				+ ",'little_grebe_bg','little_grebe_icon','day','อุทยานแห่งชาติภูเวียง','1100000','pu_9_pu_kam');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Polynesian rat, Pacific rat','หนูจี๊ด','Rattus exulans','เป็นหนูที่มีขนาดเล็กที่สุดที่อยู่ในสกุล Rattus มีขนสีน้ำตาลเข้มจนถึงดำ ขนชั้นนอกแข็ง หางมีสีดำเรียบสนิทมีความยาวกว่าความยาวลำตัวและหัวรวมกันเสียอีก และไม่มีขน ส่วนท้องสีขาว มีความยาวลำตัวและหัว 10.5 เซนติเมตร หางยาว 12.8 เซนติเมตร น้ำหนัก 36 กรัม ตัวเมียมีเต้านมทั้งหมด 4 คู่ 2 คู่แรกอยู่ที่หน้าอก อีก 2 คู่อยู่ที่หน้าท้อง สามารถผสมพันธุ์ได้ตลอดทั้งปี โดยตั้งท้องนานประมาณ 21-22 วัน ตกลูกครั้งละ 7-12 ตัว ปีหนึ่งสามารถออกลูกได้ราว 5-6 ครอก อายุขัยมากที่สุดที่พบประมาณ 6 ปี หนูจี๊ด เป็นหนูที่สามารถพบได้ทั่วไปตามบ้านเรือน พื้นที่เกษตรกรรมเช่น โรงนา, ยุ้งฉาง แต่กลับไม่พบในที่นา และสามารถพบได้ในป่าและถ้ำ เป็นหนูที่มีพฤติกรรมว่องไวมาก ทำรังโดยไม่ขุดรู สามารถปีนป่ายและกระโดดได้เก่ง สามารถไต่ไปตามเส้นลวดที่มีเส้นผ่าศูนย์กลางแคบ ๆ ได้เป็นระยะทางหลายเมตร โดยใช้หางที่ยาวนั้นช่วยทรงตัวและเกาะเกี่ยว ว่ายน้ำเก่ง กินอาหารได้แทบทุกชนิด และกินอาหารตามที่มนุษย์กินได้ด้วย โดยกินมากเป็นน้ำหนักประมาณ 10 เท่าของน้ำหนักตัวต่อวัน พบกระจายพันธุ์ทั่วไปในภูมิภาคเอเชียอาคเนย์จนถึงภูมิภาคออสตราเลเชีย, โอเชียเนีย จนถึงฮาวายและโพลินีเซีย โดยมีชื่อเรียกในภาษาเมารีว่า kiore จัดเป็นหนูชนิดหนึ่งที่สามารถพบได้ตามบ้านเรือนเช่นเดียวกับ หนูท้องขาว (R. rattus) และหนูบ้าน (R. norvegicus) ซึ่งอยู่ในสกุลเดียวกัน',"
				+ 16.835073
				+ ","
				+ 102.236839
				+ ",'polynesian_rat_bg','polynesian_rat_icon','day','อุทยานแห่งชาติภูเวียง','0000000','pu_9_pu_kam');");

		/* อุทยานแห่งชาติภูเก้า – ภูพานคำ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Common myna, Indian myna, Myna','นกเอี้ยงสาริกาหรือ','Acridotheres tristis','เป็นนกในวงศ์นกเอี้ยงและนกกิ้งโครง (Sturnidae) เป็นนกที่พบเห็นได้ง่ายในเขตเมืองหรือชุมชนของมนุษย์ มีความยาวประมาณ 25-26 เซนติเมตร ขาเรียวเล็ก นิ้วตีนแข็งแรง หัวและคอสีดำ ปากและหนังรอบตาสีเหลือง ลำตัวสีน้ำตาล ขอบปีกและปลายหางสีขาว หน้าอก, ท้อง และก้นสีน้ำตาลอ่อน ตัวผู้และตัวเมียคล้ายคลึงกัน หากินอยู่ตามพื้นดินปะปนกับนกชนิดอื่น ๆ มักเดินสลับวิ่งกระโดด มีความปราดเปรียว ชอบจิกตีต่อสู้กันเองหรือทะเลาะวิวาทกับนกชนิดอื่น ๆ กินแมลงและเมล็ดพืชต่าง ๆ รวมทั้งผลไม้เป็นอาหาร อาศัยอยู่ตามชายทุ่ง พื้นที่ทำการเกษตรใกล้หมู่บ้าน อาจอยู่เป็นคู่หรือรวมฝูง ชอบลงมาหากินอยู่ตามพื้นดิน ขณะหาอาหารมักส่งเสียงร้องไปด้วย มีฤดูผสมพันธุ์ในช่วงเดือนมีนาคม-เมษายน ทำรังตามชายคาบ้านเรือนหรือตามต้นไม้ด้วยกิ่งไม้ หรือใบหญ้าแห้ง วางไข่ครั้งละ 2-4 ฟอง ผลัดกันกกไข่ทั้งตัวผู้และตัวเมีย ประมาณ 14 วัน ไข่จึงฟักเป็นตัว พบกระจายพันธุ์ทั่วไปในทวีปเอเชีย ตั้งแต่ อินเดีย, อัฟกานิสถาน, พม่า และภูมิภาคอินโดจีน ในประเทศไทยพบได้ทั่วทุกภาค และปัจจุบันได้ถูกนำเข้าไปในบางพื้นที่ที่ไม่ใช่ถิ่นกำเนิดดั้งเดิมด้วย เป็นนกอีกชนิดหนึ่ง ที่นิยมเลี้ยงเป็นสัตว์เลี้ยง ในประเทศไทยจัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 16.834501
				+ ","
				+ 102.625915
				+ ",'common_myna_bg','common_myna_icon','day','อุทยานแห่งชาติภูเก้า – ภูพานคำ','1101000','pu_9_pu_kam');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Cotton pygmy goose','เป็ดคับแค', 'Cotton teal','นกชนิดหนึ่ง ในวงศ์นกเป็ดน้ำ (Anatidae) จัดเป็นนกเป็ดน้ำขนาดเล็กชนิดหนึ่ง มีน้ำหนักเต็มที่ประมาณ 160 กรัม และความยาวลำตัวประมาณ 26 เซนติเมตร มีลักษณะเด่น คือ มีสีขาวต่างจากนกเป็ดน้ำชนิดอื่น ปากและขาสีเทา ตัวผู้ บริเวณใบหน้า, คอและลำตัวสีขาว, กระหม่อม และวงรอบคอและหลังสีดำ, ปีกสีเขียวและมีแถบสีขาวเห็นชัดขณะบิน ขณะที่ ตัวเมีย มีสีทึมกว่า และไม่มีวงรอบคอ ลำตัวด้านบนสีน้ำตาลจาง ๆ มีแถบสีดำลากผ่านตา มีพฤติกรรมหากินรวมฝูงกันกับนกเป็ดน้ำชนิดอื่น ๆ ส่งเสียงร้อง \"คว้าก – คว้าก – คว้าก - แอ๊ก\" มีจะงอยปากสั้นคล้ายกับห่าน จึงเหมาะสำหรับใช้สำหรับจิกหากินตามผิวน้ำหรือพื้นดิน แต่ก็ดำน้ำได้และดำน้ำเก่ง ในฤดูผสมพันธุ์อาจจะอาศัยอยู่ตัวเดียวหรือเป็นคู่ นอกฤดูผสมพันธุ์อาจจะพบรวมฝูงนับเป็นร้อยถึงพันตัว กระจายพันธุ์อยู่ในอนุทวีปอินเดีย, เอเชียอาคเนย์ และออสเตรเลียทางตอนเหนือ ในประเทศไทยถือเป็นนกประจำถิ่น เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 16.906617
				+ ","
				+ 102.645999
				+ ",'cotton_pygmy_goose_bg','cotton_pygmy_goose_icon','day','อุทยานแห่งชาติภูเก้า – ภูพานคำ','1100001','pu_9_pu_kam');");

		/* อุทยานแห่งชาติเขาสก */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Marbled cat', 'แมวลายหินอ่อน ','Pardofelis marmorata','เป็นสัตว์เลี้ยงลูกด้วยนมในวงศ์เสือ (Felidae) ที่มีขนาดเท่ากับแมวบ้าน (Felis catus) แต่มีหางยาวกว่าและมีขนที่หางมากกว่า หัวมีขนาดเล็ก กลมมน สีขนมีลวดลายเป็นแถบหรือเป็นดวงคล้ายลวดลายของเสือลายเมฆ (Neofelis nebulosa) หรือลวดลายบนหินอ่อน ปัจจุบันนักวิชาการแบ่งแมวลายหินอ่อนออกเป็น 2 ชนิดย่อย ได้แก่ P. m. marmorata และ P. m. charltoni ถิ่นอาศัยของแมวลายหินอ่อนอยู่ในรัฐอัสสัมทางตะวันออกเฉียงเหนือของอินเดีย เนปาล (P. m. chartoni) เอเชียตะวันออกเฉียงใต้ เกาะบอร์เนียว และเกาะสุมาตรา เมื่ออยู่ในป่าทึบตามธรรมชาติจะพบเห็นได้น้อย ปัจจุบันยังมีการศึกษาค้นคว้าเกี่ยวกับแมวชนิดนี้อยู่น้อย และยังไม่ทราบจำนวนประชากรที่แน่นอน ขณะเดียวกันป่าที่เป็นถิ่นอาศัยก็มีพื้นที่ลดลง ทำให้ปัจจุบันแมวชนิดนี้อยู่ในสถานะที่เสี่ยงต่อการสูญพันธุ์ พฤติกรรมของแมวลายหินอ่อน เมื่ออยู่ในที่เลี้ยงค่อนข้างดุร้ายกว่าเสือหรือแมวป่าชนิดอื่น ๆ มีอายุในสถานที่เลี้ยงยืนสุด 12 ปี',"
				+ 8.949977
				+ ","
				+ 98.63283
				+ ",'marbled_cat_bg','marbled_cat_icon','day','อุทยานแห่งชาติเขาสก','1100001','pha_dang');");

		/* อุทยานแห่งชาติสิรินาถ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Mole crab, Sand crab', 'จักจั่นทะเล','Hippoidea','เป็นสัตว์ไม่มีกระดูกสันหลัง จำพวกอาร์โธพอด ในไฟลัมย่อยครัสตาเชียน อันดับฐานปูไม่แท้ โดยใช้ จักจั่นทะเล เป็นสัตว์ที่มีรูปร่างคล้ายกับจักจั่นที่เป็นแมลง ตัวขนาดเท่าแมลงทับ แต่อาศัยอยู่ในทะเลอันเป็นที่มาของชื่อสามัญ จักจั่นทะเล มีกระดองแข็งคล้ายปู มีขาทั้งหมด 5 คู่ แต่ส่วนของขาว่ายน้ำไม่ได้ใช้ว่ายน้ำ แต่ใช้ในการพยุงรักษาไข่เหมือนปูมากกว่า ส่วนหัวมีกรี แต่ไม่แข็งเหมือนกุ้ง เป็นสัตว์ที่กินแพลงก์ตอน, สัตว์น้ำขนาดเล็ก และพืชน้ำจำพวกสาหร่ายเป็นอาหาร โดยปกติแล้วจะอาศัยอยู่ในพื้นทรายที่ใกล้ชายฝั่งทะเลทั่วโลก เมื่อพบกับศัตรูผู้รุกรานจะมุดตัวลงใต้ทรายอย่างรวดเร็ว มีพฤติกรรมการขยายพันธุ์ ด้วยการที่ตัวผู้จะฉีดน้ำเชื้อเข้าไปผสมกับไข่ของตัวเมีย ที่เกาะอยู่ใต้ท้องเหมือนกับสัตว์จำพวกอื่นในไฟลัมย่อยครัสตาเชียนเหมือนกัน โดยวางไข่ใต้พื้นทรายลึกลงไปริมชายหาด เมื่อฟักเป็นตัวอ่อนก็ถูกกระแสคลื่นน้ำพัดพาออกไปใช้ชีวิตเบื้องต้นเหมือนแพลงก์ตอน จากนั้นเมื่อเจริญเติบโตขึ้นก็ถูกกระแสน้ำพัดกลับเข้าฝั่งเป็นวงจรชีวิต สำหรับชนิดที่พบได้ในน่านน้ำไทย คือ จักจั่นนางแอ่น (Albunea symmysta), จักจั่นทะเลธรรมดา (Emerita emeritus) และจักจั่นควาย(Hippa adactyla)',"
				+ 8.095952
				+ ","
				+ 98.297973
				+ ",'mole_crab_bg','mole_crab_icon','day','อุทยานแห่งชาติสิรินาถ','0000000','pha_dang');");

		/* อุทยานแห่งชาติเขาปู่-เขาย่า */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Wall lizard, True lizard, Old world runner, Lacertid lizard','วงศ์สางห่า','Lacertidae','เป็นวงศ์ของสัตว์เลื้อยคลานในอันดับ Squamata หรืองูและกิ้งก่า มีลักษณะโดยรวม คือ ทุกชนิดของวงศ์นี้มีขา เกล็ดปกคลุมลำตัวมีขนาดแตกต่างกัน เกล็ดปกคลุมลำตัวด้านหลังและทางด้านข้างแปรผันตั้งแต่มีขนาดใหญ่และเรียบและเรียงซ้อนตัวเหลื่อมกันหรือมีขนาดเล็กเป็นตุ่มและมีสัน เกล็ดด้านท้องเป็นรูปสี่เหลี่ยมขนาดใหญ่ และเรียงตัวต่อเนื่องกันหรือเรียงตัวซ้อนเหลื่อมกัน ไม่มีกระดูกในชั้นหนัง กระดูกหัวไหล่มีกระดูกอินเตอร์ควาวิเคิลเป็นรูปโค้งและกระดูกไหปลาร้าเป็นรูปหักมุม หางยาว สามารถปล่อยหางหลุดจากลำตัวได้เพื่อหลบหนีศัตรู พื้นผิวด้านบนของลิ้นเป็นตุ่มยาว ฟันที่ขากรรไกรเกาะติดกับร่องที่ขอบด้านในของกระดูกขากรรไกร กระดูกเทอรีกอยด์มีฟันหรือไม่มีฟัน เป็นสัตว์เลื้อยคลานที่มีขนาดเล็ก ตั้งแต่ 4 เซนติเมตรจนถึงมีขนาดใหญ่สุดไม่เกิน 12 เซนติเมตร ส่วนมากอาศัยและหากินบนพื้นดินในเวลากลางวัน หรือไม่ก็อาศัยในไม้พุ่มหรือต้นไม้ในระดับเตี้ย ๆ ส่วนมากกินแมลงเป็นอาหาร บางชนิดกินเมล็ดพืชเป็นอาหาร',"
				+ 7.799079
				+ ","
				+ 99.816820
				+ ",'wall_lizard_bg','wall_lizard_icon','day','อุทยานแห่งชาติเขาปู่-เขาย่า','0000000','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Equatorial spitting cobra','งูเห่าพ่นพิษสีทอง','Naja sumatrana','เป็นงูเห่าชนิดหนึ่ง รูปร่างคล้ายงูเห่าพ่นพิษสยาม (N. siamensis) และงูเห่าพ่นพิษชนิดอื่น ๆ คือมี ขนาดที่เล็กกว่างูเห่าธรรมดา (N. kaouthia) ไม่มีดอกจันที่แม่เบี้ย ไม่มีลวดลายตามลำตัว สีพื้นลำตัวเป็นสีเหลืองหรือสีทองสวยงาม ท้องมีสีขาว พบมากทางภาคใต้ของประเทศไทย และพบไปจนถึงมาเลเซียและสิงคโปร์ ซึ่งงูที่พบในมาเลเซียและสิงคโปร์นั้นจะมีลำตัวสีดำ ความยาวเต็มที่ 1.6 เมตร มีชื่อเรียกอื่นอีกว่า \"งูเห่าปลวก\" นิยมเลี้ยงเป็นสัตว์เลี้ยงของผู้ที่ชื่นชอบการเลี้ยงสัตว์เลื้อยคลาน',"
				+ 7.927635
				+ ","
				+ 99.807893
				+ ",'equatorial_spitting_cobra_bg','equatorial_spitting_cobra_icon','day','อุทยานแห่งชาติเขาปู่-เขาย่า','0001000','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Banded palm civet','อีเห็นลายเสือโคร่ง','Hemigalus derbyanus','เสัตว์เลี้ยงลูกด้วยนมชนิดหนึ่งในอันดับสัตว์กินเนื้อ มีรูปร่างหน้าตาเหมือนสัตว์จำพวกอีเห็นหรือชะมดทั่วไป แต่มีหน้ายาวและมีรูปร่างเพรียวบางกว่า ขนตามลำตัวสีน้ำตาลอ่อน มีลักษณะเด่น คือ มีแถบสีดำ 7-8 แถบพาดขวางลำตัว โดยแถบดังกล่าวมีรูปทรงเป็นสามเหลี่ยมยาว ๆ และมีแถบสีดำพาดยาวผ่านใบหน้าและหน้าผาก 2 เส้น ด้านล่างของลำตัวและขามีสีอ่อนกว่าบริเวณหลัง มีหูยาวและมีประสิทธิภาพในการฟังเสียงที่สูง ตามีขนาดใหญ่ ส่วนโคนหางจะมีแถบสีดำเป็นปล้อง ๆ มีต้อมกลิ่นขนาดเล็ก สามารถหดเล็บเก็บได้เหมือนพวกแมว มีความยาวลำตัวและหัว 45-50 เซนติเมตร ความยาวหาง 25-32.5 เซนติเมตร น้ำหนัก 1-3 กิโลกรัม มีการกระจายพันธุ์ตั้งแต่ภาคใต้ของพม่า ภาคตะวันตกและภาคใต้ของไทย, มาเลเซีย, เกาะสุมาตราและเกาะบอร์เนียว มักอาศัยอยู่ในป่าดิบชื้นใกล้แหล่งน้ำ มักอาศัยและออกหากินตามลำพัง นอกจากในฤดูผสมพันธุ์ หรือ มีลูกอ่อนที่อาจพบว่ามีอยู่ด้วยกัน 2 หรือ 3 ตัว ออกหากินในเวลากลางคืน มีลิ้นที่สากเหมือนพวกแมว กินสัตว์ขนาดเล็กจำพวกแมลง, ไส้เดือน, มด, แมงมุม, สัตว์น้ำขนาดเล็กหอยทาก รวมทั้งพืช อย่าง ผลไม้เป็นต้น ปัจจุบัน การศึกษานิเวศวิทยาของอีเห็นลายเสือโคร่งนั้นยังมีอยู่น้อยมาก เนื่องจากเป็นสัตว์ที่พบเห็นตัวได้ยาก เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535',"
				+ 7.887508
				+ ","
				+ 99.711076
				+ ",'banded_palm_civet_bg','banded_palm_civet_icon','night','อุทยานแห่งชาติเขาปู่-เขาย่า','1100001','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Cream-coloured giant squirrel','พญากระรอกเหลือง','Ratufa affinis',' สัตว์เลี้ยงลูกด้วยนมชนิดหนึ่ง เป็นกระรอกที่มีขนาดใหญ่ที่สุดรองมาจากพญากระรอกดำ (R. bicolor) ที่พบในประเทศไทย มีรูปร่างหน้าตาคล้ายพญากระรอกดำ แต่มีขนสีเหลืองครีมอ่อน ๆ ท้องสีขาว ขนหางสีเข้มกว่าลำตัว แก้มทั้งสองข้างมีสีเทาอ่อน หูและเท้าทั้ง 4 ข้าง มีสีดำ และมีขนาดเล็กกว่า โดยโตเต็มที่มีความยาวประมาณ 31-36 เซนติเมตร หางยาว 37.5-41.5 เซนติเมตร น้ำหนักเมื่อโตเต็มที่ประมาณ 0.5-1.4 กิโลกรัม มีทั้งหมด 9 ชนิดย่อย พบได้ในป่าดิบในภาคใต้ของไทยตั้งแต่จังหวัดประจวบคีรีขันธ์ลงไป จนถึงมาเลเซีย, เกาะสุมาตรา, เกาะบอร์เนียว อาศัยและหากินบนยอดไม้สูง ไม่ค่อยลงพื้นดิน มีพฤติกรรมความเป็นอยู่และนิเวศวิทยาคล้ายพญากระรอกดำ',"
				+ 7.815406
				+ ","
				+ 99.715196
				+ ",'cream_coloured_giant_squirrel_bg','cream_coloured_giant_squirrel_icon','day','อุทยานแห่งชาติเขาปู่-เขาย่า','1100001','pha_dang');");

		
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Roughneck monitor lizard','เห่าช้าง','Varanus rudicollis','เป็นสัตว์เลื้อยคลานในวงศ์เหี้ย (Varanidae) และ เป็นสัตว์ป่าคุ้มครอง ตาม พระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535 โดยชื่อ \"เห่าช้าง\" มาจากเสียงขู่ศัตรู ฟังดูคล้ายเสียงขู่ของงูเห่า เชื่อกันว่าน้ำลายมีพิษ หากถูกกัดจะเป็นอันตรายถึงตายได้ ที่จริงแล้วเป็นความเชื่อที่ผิด ตัวจะเล็กกว่าเหี้ย (V. salvator) มีความยาวประมาณ 1.3 เมตร มีสีดำเข้ม มีลายเลือน ๆ ขวางลำตัว ปากแหลมและเกล็ดบนสั้น เกล็ดบนคอใหญ่เป็นแหลม ๆ คล้ายหนามทุเรียน เฉพาะช่วงคอเกล็ดจะย้อนไปหาศีรษะ ชอบอยู่ในป่าทึบและเดินหากินบนพื้นดิน แต่ก็ปีนต้นไม้เก่ง พบในป่าในภาคใต้ของประเทศไทยและพม่า, หมู่เกาะสุมาตรา, บอร์เนียว, มาเลเซีย, ฟิลิปปินส์ แต่ก็มีรายงานพบที่อุทยานแห่งชาติเขาใหญ่ จ.นครราชสีมาด้วย อาหารคือ ไก่, นก, ปลา, กบ, เขียด กินได้ทั้งของสด และของเน่า ผสมพันธุ์ในช่วงเดือนมกราคม-มีนาคม โดยวางไข่ตามหลุมที่ขุดเป็นโพรง เมื่อออกไข่แล้วจะไม่ฟักไข่ ลูกฟักออกจากไข่เองตามธรรมชาติ และเมื่อลูกออกจากไข่แล้วก็จะหากินเอง',"
				+ 7.669803
				+ ","
				+ 99.723436
				+ ",'roughneck_monitor_lizard_bg','roughneck_monitor_lizard_icon','day','อุทยานแห่งชาติเขาปู่-เขาย่า','1000000','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Dumeril''s monitor','ตุ๊ดตู่','Varanus dumerilii','เป็นสัตว์เลื้อยคลานชนิดหนึ่งในวงศ์เหี้ย (Varanidae) รูปร่างทั่วไปคล้ายเหี้ย (V. salvator) เมื่อเล็กตั้งแต่ปลายปากถึงคอจะมีสีส้มหรือสีแดงเข้ม เมื่อโตสีจะจางลง มีขีดสีดำตั้งแต่ขอบตาถึงคอ ลำตัวมีขวั้นสีเหลืองตั้งแต่คอถึงปลายหาง เป็นสัตว์ที่มีความเชื่องช้า ไม่ค่อยออกไปหากินไกลจากที่อาศัย เมื่อหิวจึงจะออกหากิน แล้วก็กลับเข้าหลับนอนตามเดิม การวางไข่ วางไข่ครั้งละ 23 ฟอง ระยะฟักไข่ 203 - 230 วัน ถือได้ว่าเป็นสัตว์ที่เล็กที่สุดในวงศ์นี้ เป็นสัตว์ไม่มีพิษ โดยเต็มที่จะมีขนาด 50 ถึง 125 เซนติเมตร เท่านั้น ในประเทศไทยจะพบเฉพาะภาคใต้ ไปจรดถึงมาเลเซียและอินโดนีเซีย เป็นสัตว์คุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่าพ.ศ. 2535',"
				+ 7.750095
				+ ","
				+ 99.677431
				+ ",'dumeril_monitor_bg','dumeril_monitor_icon','day','อุทยานแห่งชาติเขาปู่-เขาย่า','1000000','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Greater mouse-deer, Napu','กระจงควาย','Tragulus napu','เป็นสัตว์เลี้ยงลูกด้วยนมในอันดับสัตว์กีบคู่ชนิดหนึ่ง อยู่ในวงศ์ Tragulidae มีขาเล็กเรียว ซึ่งมีนิ้วเท้าข้างละ 4 นิ้ว ทั้งตัวผู้และตัวเมียไม่มีเขา แต่ตัวผู้จะมีเขี้ยวบนยาวเลยริมฝีปากบนลงมา เมื่อโตเต็มวัยมีน้ำหนักตัวประมาณ 5 กิโลกรัม ขนบนตัวสีน้ำตาลออกเทา มีจุดสีเข้มกว่ากระจายอยู่ทั่วไป ที่ใต้คอและบนหน้าอกมีลายพาดตามยาวสีขาว 5 ลาย ด้านใต้ท้องสีขาว หางค่อนข้างสั้นสีน้ำตาลอ่อนด้านบนและสีขาวด้านล่าง ปกติชอบอยู่โดดเดี่ยว นอกจากในฤดูผสมพันธุ์จึงจะอยู่เป็นคู่ ออกหากินในเวลากลางคืน กินอาหารได้แก่ หญ้าอ่อน ๆ, ผลไม้, ยอดไม้ และใบไม้อ่อน ในเวลากลางวันจะหลบพักนอนตามหลืบหินและโพรงไม้ ออกลูกครั้งละ 1 ตัว แต่บางครั้งก็พบออกลูกแฝด ระยะตั้งท้องนานประมาณ 5-6 เดือน พบกระจายพันธุ์ตั้งแต่ตอนใต้ของประเทศพม่า, เทือกเขาตะนาวศรี ไปจนถึงแหลมมลายู, เกาะสุมาตรา และเกาะบอร์เนียว นอกจากนี้แล้วยังพบได้ที่ภาคตะวันออกของไทยไปจนถึงตอนใต้ของกัมพูชาและเวียดนาม จัดเป็นกระจงอีกชนิดหนึ่ง ที่สามารถพบได้ในประเทศไทยนอกจาก กระจงเล็ก (T. javanicus) ที่มีขนาดตัวเล็กกว่า โดยมักอาศัยอยู่ในป่าดิบชื้นที่มีความอุดมสมบูรณ์ บางครั้งยังอาจพบได้ที่พื้นที่ชุ่มน้ำเช่น ป่าพรุหรือป่าชายเลนได้อีกด้วย จัดเป็นสัตว์ป่าคุ้มครองประเภทที่ 2 ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 7.615360
				+ ","
				+ 99.875185
				+ ",'greater_mouse_deer_bg','greater_mouse_deer_icon','night','อุทยานแห่งชาติเขาปู่-เขาย่า','1000001','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Banded linsang','ชะมดแปลงลายแถบ','Prionodon linsang','เป็นชะมดแปลงชนิดหนึ่งที่มีการกระจายพันธุ์ในแถบคาบสมุทรมาเลย์, เกาะสุมาตรา, เกาะบอร์เนียว และชวาตะวันตก รวมทั้งในประเทศไทยตั้งแต่บริเวณคอคอดกระลงไป ชะมดแปลงลายแถบ จัดเป็นชะมดที่ไม่มีต่อมกลิ่น มีลายเป็นแถบคดเคี้ยวขวางบริเวณหลังทั้งหมด 5 แถบ และตามด้านข้างของคอและลำตัว จุดจะติดกัน กลายเป็นแถบคดเคี้ยวมีอยู่ด้านละ 2 แถบ สีพื้นของตัวเป็นสีน้ำตาลแกมเหลืองซีด ๆ หางมีปล้องสีขาวสลับดำอยู่ 7 ปล้อง ไม่มีขนแผงคอหรือแผงหลัง มีขนาดตัวยาวจากหัวถึงหาง 74 เซนติเมตร อาศัยและหากินบนต้นไม้มากกว่าจะลงมาพื้นดิน กินอาหาร ได้แก่กระรอก, หนู, นก และจิ้งจก มีฤดูผสมพันธุ์อยู่ในช่วงเดือนกุมภาพันธ์-สิงหาคม สร้างรังออกด้วยเรียวไม้และใบไม้อยู่ในโพรงดินโคนต้นไม้ใหญ่ ออกลูกครั้งละ 2–3 ตัว มีอายุยืนเกือบ 10 ปี เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 7.601748
				+ ","
				+ 99.893724
				+ ",'banded_linsang_bg','banded_linsang_icon','night','อุทยานแห่งชาติเขาปู่-เขาย่า','1100000','pha_dang');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Dwarf shrew, Etruscan pygmy shrew','หนูผีจิ๋ว','Suncus etruscus','หนูผีจิ๋ว มีเท้าหลังสั้นมากและมีสีคล้ำในตัวเต็มวัย กะโหลกลาดแบน จมูกแหลมยาวมาก ตามีขนาดเล็กมาก ใบหูมีขนาดใหญ่เมื่อเทียบกับขนาดลำตัว มีความจากหลายจมูกถึงรูทวารเพียง 4–5.6 เซนติเมตร และมีน้ำหนักเพียง 1.8 กรัม เท่านั้น ซึ่งครั้งหนึ่งเคยถูกจัดให้เป็นสัตว์เลี้ยงลูกด้วยนมที่มีขนาดเล็กที่สุดในโลกมาแล้ว ก่อนจะถูกแทนที่ตำแหน่งนี้ด้วยการค้นพบค้างคาวคุณกิตติ (Craseonycteris thonglongyai) ในเวลาต่อมา หนูผีจิ๋ว มีพฤติกรรมชอบอาศัยในที่เปียกชื้นและมีหญ้าขึ้นรก หากินแมลงขนาดเล็กชนิดต่าง ๆ ตามพื้นดินเป็นอาหาร',"
				+ 7.816086
				+ ","
				+ 99.830553
				+ ",'dwarf_shrew_bg','dwarf_shrew_icon','day','อุทยานแห่งชาติเขาปู่-เขาย่า','0100000','pha_dang');");

		/* อุทยานแห่งชาติเขานัน  */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Malayan solf-shell turtle','ตะพาบแก้มแดง','Dogania subplana','เป็นตะพาบชนิดหนึ่งที่พบได้ในประเทศไทย จัดเป็นตะพาบขนาดเล็กที่สุดเป็นอันดับสองที่พบในประเทศไทย (เล็กที่สุด คือ ตะพาบหับพม่า (Lissemys scutata)) กระดองสีเทาเข้มมีจุดสีดำทั่วไป หัวสีเทานวลมีรอยเส้นสีดำตลอดตามแนวกระดูกสันหลังจนถึงส่วนท้ายกระดอง มีสีแดงที่แก้มและข้างคอ เมื่อยังเล็กมีจุดสีดำคล้ายดวงตากระจายไปทั่วกระดองเห็นชัดเจน ตะพาบที่พบที่จังหวัดตากและกาญจนบุรีมีสีเข้มกว่าและไม่มีสีแดงที่แก้ม ตะพาบชนิดนี้มีจมูกยาว หางสั้น และมีขาเล็ก จัดเป็นตะพาบเพียงชนิดเดียวที่อยู่ในสกุล Dogania ขนาดโตเต็มที่กระดองยาวประมาณ 1 ฟุต หนักประมาณ 15 กิโลกรัม ถิ่นที่อยู่อาศัย พบในพม่า, มาเลเซีย, บรูไน, สุมาตรา, อินโดนีเซีย และฟิลิปปินส์ สำหรับประเทศไทยพบบ้างที่จังหวัดตาก, กาญจนบุรีและพบมากทางภาคใต้ แถบจังหวัดชุมพร และจังหวัดนครศรีธรรมราช ชอบอยู่ในห้วยหนอง คลองบึงทั่วไป และมีชุกชุมตามลำธารบนภูเขา การสืบพันธุ์ออกไข่ครั้งละ 3-7 ฟอง ปัจจุบันเป็นสัตว์น้ำคุ้มครองตามประกาศของกรมประมง และสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 โดยมีชื่อเรียกในภาษาอีสานว่า \"ปลาฝาดำ\"',"
				+ 8.759426
				+ ","
				+ 99.786012
				+ ",'malayan_solf_shell_turtle_bg','malayan_solf_shell_turtle_icon','day','อุทยานแห่งชาติเขานัน','1100001','su_thap');");

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Blood python','งูหลามปากเป็ด','Python curtus','เป็นงูไม่มีพิษ มีลำตัวที่อ้วน หนา กว่างูหลามและงูเหลือม แต่มีหางที่สั้นแลดูไม่สมส่วน และมีลวดลายที่แปลกออกไป มีหลายหลากสี ทั้งน้ำตาล แดง เหลือง ส้ม หรือ เขียว โดยงูแต่ละตัวจะมีสีสันและลวดลายต่างกันออกไป ขนาดโตเต็มที่ได้ประมาณ 1.50 เมตร จัดเป็นงูที่มีขนาดที่สุดในสกุลนี้ พบในประเทศไทยตั้งแต่ จังหวัดประจวบคีรีขันธ์ลงไป จนถึงมาเลเซียและสิงคโปร์ เป็นงูที่ไม่ค่อยขึ้นต้นไม้ มักจะซุ่มรออาหารตามพื้นดินที่เฉอะแฉะใกล้แหล่งน้ำที่โดยมากเป็นสัตว์เลือดอุ่นขนาดเล็ก งูหลามปากเป็ดวางไข่ครั้งละประมาณ 30-50 ฟอง  แบ่งออกได้เป็น 3 ชนิดย่อย คือ P. c. curtus เป็นชนิดทั่วไป, P. c. breitensteini พบในบอร์เนียว และ P. c. brongersmai พบในเพนนิซูล่าของมาเลเซียและสิงคโปร์ เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535 นิยมเลี้ยงเป็นสัตว์เลี้ยงของผู้ที่นิยมสัตว์เลื้อยคลานเพราะมีความสวยงาม',"
				+ 8.800482
				+ ","
				+ 99.772622
				+ ",'blood_python_bg','blood_python_icon','day','อุทยานแห่งชาติเขานัน','1100001','su_thap');");

		/* อุทยานแห่งชาติอ่าวพังงา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian leaf turtle, Brown stream terrapin', 'เต่าใบไม้','Cyclemys dentata', 'สัตว์เลื้อยคลานจำพวกเต่า ในวงศ์เต่านา (Geoemydidae)มีลักษณะเด่น คือ กระดองส่วนล่างมีลักษณะคล้ายบานพับคล้ายกับเต่าหับ แต่ปิดได้เฉพาะตอนล่าง หัวมีสีน้ำตาล, น้ำตาลแดง หรือเขียวมะกอกด้านบนสุดของหัวอาจมีจุดสีดำ และด้านข้างของหน้าอาจจะมีแถบสีเหลืองหรือชมพู กระดองส่วนล่างสีจาง มีเส้นเป็นแนวรัศมี บางครั้งพบว่ากระดองส่วนล่างอาจเป็นสีดำ หรือน้ำตาลเข้มทั้งหมดลักษณะรอยต่อระหว่างแผ่นเกล็ดต้นขาและแผ่นเกล็ดทวารโค้งและกระดองส่วนล่างที่มีลักษณะเป็นบานพับเป็นลักษณะที่ทำให้แยกออกจากเต่าหวาย ที่มีลักษณะกระดองคล้ายคลึงกัน มีกระดองส่วนบนยาวเต็มที่ 22 เซนติเมตร พบกระจายพันธุ์อยู่ทั่วไปในพื้นที่ชุ่มน้ำหรือลำธารในป่า หรือเนินเขา ในทุกประเทศของภูมิภาคเอเชียอาคเนย์ เป็นเต่าที่กินอาหารได้ทั้งพืชและสัตว์ เช่น สัตว์น้ำที่ไม่มีกระดูกสันหลังต่าง ๆ ในน้ำ, ผัก และผลไม้ เป็นต้น จัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535',"
				+ 8.255922
				+ ","
				+ 98.460984
				+ ",'asian_leaf_turtle_bg','asian_leaf_turtle_icon','day','อุทยานแห่งชาติอ่าวพังงา ','1100001','pp_island');");// 8.255922,
																											// 98.460984

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Moonrat', 'หนูเหม็น','Echinosorex gymnurus', 'เป็นสัตว์เลี้ยงลูกด้วยนมขนาดเล็ก ชนิดหนึ่ง จัดอยู่ในวงศ์ Erinaceidae ซึ่งจัดเป็นสิ่งมีชีวิตเพียงชนิดเดียวเท่านั้นที่อยู่ในสกุล Echinosorex หนูเหม็น มีรูปร่างลักษณะคล้ายหนูที่อยู่ในอันดับสัตว์ฟันแทะ แต่หนูเหม็นเป็นสัตว์ที่อยู่ในอันดับเฮดจ์ฮอกเช่นเดียวกับเฮดจ์ฮอก มีขนยาวปุกปุยรุงรังสีดำแซมขาว หัวมีขนสีขาวและมีแถบดำพาดผ่านตาเห็นได้ชัดเจน ปลายปากด้านบนและดั้งจมูกยาวเรียวยื่นออกไปมากกว่าปลายริมฝีปากล่าง หางมีเกล็ดเล็ก ๆ ปกคลุมคล้ายหางหนู มีสีดำและปลายหางสีขาว พบกระจายพันธุ์อยู่ในแถบเทือกเขาตะนาวศรีในเขตพม่าและภาคใต้ของไทยตั้งแต่คอคอดกระลงไปตลอดแหลมมลายู, เกาะสุมาตรา และเกาะบอร์เนียว มีขนาดลำตัวยาว 26-45 เซนติเมตร หางยาว 20-21 เซนติเมตร มีน้ำหนัก 0.5-1.1 กิโลกรัม ถือว่าเป็นสัตว์ที่มีขนาดใหญ่ที่สุดในวงศ์และอันดับนี้ สามารถแบ่งออกได้เป็น 2 ชนิดย่อย คือ E.g.albus พบในตอนตะวันออกและตอนใต้ของเกาะบอร์เนียว และ E.g.cadidus พบในตอนตะวันตกของเกาะบอร์เนียว เป็นสัตว์ที่มีกลิ่นตัวเหม็นรุนแรงจึงเป็นที่มาของชื่อ ซึ่งกลิ่นตัวนี้คล้ายกับกลิ่นระเหยของแอมโมเนีย สามารถส่งกิ่นออกไปได้ไกลเป็นระยะหลายเมตร ใช้สำหรับติดต่อกับหนูเหม็นตัวอื่น มักอาศัยอยู่ตามลำพัง ชอบอาศัยอยู่ในที่ชื้นแฉะตามป่าดิบชื้น เช่น ป่าโกงกาง, ป่าตามพื้นที่ราบเชิงเขา โดยเฉพาะตามหุบเขาที่มีป่ารกทึบ ติดกับลำธารที่มีน้ำไหลผ่าน ซึ่งเหมาะเป็นแหล่งในการหาอาหารได้สะดวก เป็นสัตว์ที่ออกหากินในเวลากลางคืน อาหาร ได้แก่ หนอน, ด้วง และแมลงต่าง ๆ, ไส้เดือนดิน สามารถที่จะล่าสัตว์เล็ก ๆ กิน เช่น ลูกกบ, เขียด, กุ้ง, ปู, ปลาและหอย ได้ด้วย กลางวันจะพักอาศัยหลบซ่อนอยู่ในรูดิน โพรงไม้และตามซอกใตัรากไม้ในป่าทั่วไป มีฤดูผสมพันธุ์ตลอดทั้งปี ๆ ละ 2 ครอก มีลูกครอกละ 2 ตัว มีนิสัยค่อนข้างดุร้าย ปัจจุบันเป็นสัตว์ที่หายาก มีแนวโน้มใกล้สูญพันธุ์ เนื่องจากสภาพพื้นที่ ๆ อยู่อาศัยถูกทำลาย และเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 หนูเหม็น มีความเชื่อมาแต่โบราณว่า หากเก็บกระดูกไว้จะสามารถแก้เสน่ห์ยาแฝดหรือมนต์ดำได้',"
				+ 8.267772
				+ ","
				+ 98.450598
				+ ",'moonrat_bg','moonrat_icon','night','อุทยานแห่งชาติอ่าวพังงา ','1100000','pp_island');");// 8.267772,
																						// 98.450598

		/* อุทยานแห่งชาติหาดวนกร */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Golden tree snake', 'งูเขียวพระอินทร์','Chrysopelea ornata', ' เป็นงู ลักษณะลำตัวเรียวยาว ปราดเปรียว เกล็ดสีเขียวแกมเหลืองลายดำ สามารถเลื้อยไต่ไปบนกิ่งไม้ได้อย่างคล่องแคล่ว มีพิษอ่อนแต่ไม่ร้ายแรงมาก ผู้ถูกกัดจะมีอาการอักเสบ และบวมที่บริเวณบาดแผล งูเขียวพระอินทร์เป็นงูบก หัวกลม ว่องไวปราดเปรียว เลื้อยเร็ว ลำตัวสีเขียวอ่อน มีลายดำตลอดตัว หัวมีลายมากจนดูคล้ายกับมีหัวสีดำ ใต้คางสีขาว ใต้ท้องสีเขียวอ่อนหรือเหลืองอ่อน ๆ ใต้หางมีลายดำเป็นจุด ๆ พบในบริเวณพื้นที่ที่มีความสูงมากกว่า 550 เมตร ในประเทศไทย จีน อินเดีย ศรีลังกา พม่า อินโดจีน มาเลเซีย ฟิลิปปินส์ งูเขียวพระอินทร์ชอบอาศัยอยู่ตามซอกมุมบ้าน ซุ้มไม้ โพรงไม้ ออกหากินในเวลากลางวัน กิน กิ้งก่า จิ้งจก ลูกนก หนู งูที่เล็กกว่าบางชนิด และแมลงต่าง ๆ บางครั้งหาอาหารกินไม่ได้ก็ใช้วิธีบังคับแย่งอาหารกินจากตุ๊กแก จนเข้าใจกันผิด ๆ ว่างูเขียวพระอินทร์กินตับตุ๊กแก แต่ที่จริงแล้วงูเขียวพระอินทร์ใช้วิธีรัดตัวตุ๊กแกบังคับให้อ้าปาก แล้วแย่งกินเศษเนื้อเศษแมลงที่ติดอยู่ตามซอกในปากและฟัน ไม่ใช่ล้วงเข้าไปกินตับตุ๊กแก ถ้าตุ๊กแกตัวไม่โตนักก็จะกลืนกินตุ๊กแกทั้งตัว ออกลูกเป็นไข่ ครั้งละ 6-12 ฟอง',"
				+ 11.652335
				+ ","
				+ 99.704143
				+ ",'golden_tree_snake_bg','golden_tree_snake_icon','day','อุทยานแห่งชาติหาดวนกร','1100000','pha_non_ban_ja');");// 11.652335,
																										// 99.704143

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Ghost crab', 'ปูลม','-','เป็นปูทะเลขนาดเล็กในสกุล Ocypode อยู่ในวงศ์ Ocypodidae อันเป็นวงศ์เดียวกันกับปูก้ามดาบด้วย ปูลมจะมีลำตัวที่ใหญ่กว่ามาก และมีกระดองเป็นรูปสี่เหลี่ยม ไม่เหมือนปูทหารที่เป็นวงกลม และมีก้านตายาว ซ้ำยังมีพฤติกรรมการหากินที่ต่างกันออกไป กล่าวคือ ปูลมจะไม่ปั้นทรายเป็นก้อนเหมือนปูทหาร แต่จะใช้ก้ามคีบอาหารจำพวกซากพืช ซากสัตว์ และอินทรีย์สารต่าง ๆ เข้าปาก และมักจะทำรูอยู่ในป่าชายเลนที่เป็นเลนมากกว่า แต่ก็มีพบบ้างที่บริเวณหาดทราย ปูลมได้ชื่อว่าในภาษาไทยเนื่องจากเป็นปูที่วิ่งได้เร็วมาก และส่วนชื่อปูผีในภาษาอังกฤษ มาจากพฤติกรรมการหากินที่มักหากินในเวลากลางคืนมากกว่ากลางวัน ขณะที่ชื่อวิทยาศาสตร์มาจากภาษากรีกคำว่า ocy หมายถึง \"เร็ว\" และคำว่า ποδός หมายถึง \"เท้า\" รวมความแล้วหมายถึงสัตว์ที่วิ่งเร็ว ปูลมพบทั้งหมด 28 ชนิดโดยชนิดที่พบได้ในประเทศไทยได้แก่ ปูลมใหญ่ (Ocypode ceratophthalmus) และปูลมเล็ก (O. macrocera) ซึ่งมีพฤติกรรมหากินในเวลากลางวันด้วย',"
				+ 11.631991
				+ ","
				+ 99.700195
				+ ",'ghost_crab_bg','ghost_crab_icon','night','อุทยานแห่งชาติหาดวนกร','0000000','pha_non_ban_ja');");// 11.631991,
																							// 99.700195

		/* อุทยานแห่งชาติหมู่เกาะสุรินทร์ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Hawksbill sea turtle', 'เต่ากระ','Eretmochelys imbricata','จัดอยู่ในไฟลัมสัตว์มีแกนสันหลังชั้นสัตว์เลื้อยคลาน และเป็นสิ่งมีชีวิตเพียงชนิดเดียวเท่านั้นที่อยู่ในสกุล Eretmochelys มีลักษณะคล้ายเต่าตนุ (Chelonia mydas) โดยที่เป็นเต่าทะเลขนาดกลาง มีลำตัวไม่ใหญ่มากนัก จะงอยปากแหลมงองุ้มคล้ายกับจะงอยปากของนกเหยี่ยว มีเกล็ดบริเวณหัวด้านหน้า 2 คู่ และเกล็ดบริเวณด้านข้างข้างละ 4 เกล็ด ลักษณะของกระดองมีลวดลายและสีสันสวยงาม ขอบกระดองเป็นหยักโดยรอบ ซึ่งในอดีตมักจะถูกนำไปทำเป็นเครื่องประดับและข้าวของต่าง ๆ เช่น หวี เมื่อโตเต็มที่ จะมีขนาดความยาวประมาณ 100 เซนติเมตร และมีน้ำหนักประมาณ 120 กิโลกรัม เต่ากระพบกระจายพันธุ์ในเขตอบอุ่นในมหาสมุทรทั่วทั้งโลก โดยมักอาศัยอยู่ใกล้ชายฝั่งที่สงบเงียบไม่มีการรบกวน จากการศึกษาพบว่า เต่ากระกินทั้งได้พืชและสัตว์ โดยใช้ปากที่งองุ้มนี้กินทั้งสาหร่ายทะเล, หญ้าทะเล รวมทั้งสัตว์น้ำประเภทต่าง ๆ รวมถึงปะการังด้วย วางไข่บนชายหาดครั้งละ 150-250 ฟอง จัดเป็นสัตว์ป่าคุ้มครองประเภทที่ 1 ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 และจัดเป็น 1 ใน 4 ชนิดของเต่าทะเลที่พบได้ในน่านน้ำไทย',"
				+ 9.435145
				+ ","
				+ 97.871604
				+ ",'hawksbill_sea_turtle_bg','hawksbill_sea_turtle_icon','night','อุทยานแห่งชาติหมู่เกาะสุรินทร์','1100000','had_jao_mai');");// 9.435145,
																														// 97.871604

		/* อุทยานแห่งชาติหมู่เกาะสิมิลัน */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Leatherback turtle', 'เต่ามะเฟือง','Dermochelys coriacea','เป็นเต่าทะเล จัดเป็นเต่าชนิดที่มีขนาดใหญ่ที่สุดในโลก และใหญ่เป็นอันดับที่ 4 ในบรรดาสัตว์เลื้อยคลานทั้งหมดที่ยังดำรงเผ่าพันธุ์อยู่จนถึงปัจจุบัน จึงเป็นเต่าเพียงชนิดเดียวในวงศ์ Dermochelyidae และสกุล Dermochelys เต่ามะเฟืองสามารถแยกออกจากเต่าประเภทอื่นได้โดยการสังเกตที่กระดองจะมีขนาดคล้ายผลมะเฟือง และครีบคู่หน้าไม่มีเล็บ ตั้งแต่ออกจากไข่ ความลึกที่เต่ามะเฟืองสามารถดำน้ำได้ถึง 1,280 เมตร เต่ามะเฟืองเพศเมียจะขึ้นมาวางบนชายหาด ประมาณ 50-150 ฟอง/รัง ทั้งนี้ขึ้นอยู่ปัจจัยในการวางไข่ เช่น อายุ สภาพอากาศสภาพแวดล้อมของสถานที่วางไข่ เต่ามะเฟืองจะใช้เวลาในการฟักตัวประมาณ 60-70 วัน ขึ้นอยู่กับอุณหภูมิ ของสภาพแวดล้อม หลังจากฟักตัวแล้ว โดยมีประมาณ 85% ที่ฟักตัวได้ ลูกเต่าจะคลานออกจากรัง ลงสู่ทะเลโดยทันที เนื่องจากเป็นเต่ามะเฟืองเป็นเต่าน้ำลึก จึงไม่สามารถเก็บมาอนุบาลได้เป็นเวลานานซึ่งต่างกับเต่าทะเลสายพันธุ์อื่น ในวัยเจริญพันธุ์จะเติบโตและใช้เวลาอยู่ในทะเลเกือบชั่วชีวิต เต่ามะเฟือง เนื่องจากเต่ามะเฟืองมีจะงอยปากที่สบกันเหมือนกรรไกร จึงมักกินอาหารที่อ่อนนุ่ม เช่น แมงกะพรุน แพลงก์ตอนสาหร่ายน้ำลึก เนื่องจากเต่าทะเล ส่วนใหญ่จะมีการเดินทางตามกระแสน้ำอุ่น จึงสามารถพบเต่ามะเฟืองได้ตามทวีป หรือ ประเทศที่มีกระแสน้ำอุ่นพัดผ่าน รวมถึงประเทศในเขตร้อน เช่น ประเทศไทย มาเลเซีย หมู่เกาะอินดีส ปาปัวนิวกินี และ ในฝั่งทะเลแคริบเบียน เนื่องจากลูกเต่ามะเฟือง โดยธรรมชาติเมื่อฟักออกมาจะคลานลงทะเลทันที ไม่สามารถมาอนุบาลได้นานเพราะเป็นเต่าทะเลน้ำลึก จึงควรอนุรักษ์เต่ามะเฟืองโดยการไม่รบกวนสถานที่วางไข่ ไม่รับประทานไข่เต่า ไม่ทิ้งถุงพลาสติกลงทะเลเพราะเต่ามะเฟืองอาจะคิดว่าเป็นแมงกะพรุนและกินเข้าไป เมื่อพบว่าเต่าบาดเจ็บควรแจ้งเจ้าหน้าที่ทันที',"
				+ 8.651366
				+ ","
				+ 97.648694
				+ ",'leatherback_turtle_bg','leatherback_turtle_icon','day','อุทยานแห่งชาติหมู่เกาะสิมิลัน','1100001','had_jao_mai');");// 8.651366,
																												// 97.648694

		/* อุทยานแห่งชาติศรีสัชนาลัย */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Badger, Ferret-badger', 'หมาหริ่ง','-','เป็นสัตว์เลี้ยงลูกด้วยนมขนาดเล็ก ในสกุล Melogale ในวงศ์เพียงพอน (Mustelidae) เป็นสัตว์กินเนื้อขนาดเล็ก จัดเป็นแบดเจอร์สกุลหนึ่ง มีลำตัวยาวประมาณ 33-39 เซนติเมตร ส่วนหางยาว 15-21 เซนติเมตร น้ำหนักประมาณ 2 กิโลกรัม มีช่วงขาที่สั้น เล็บนิ้วกางแยกออกจากกันและมีกรงเล็บที่แหลมคม สีขนเป็นสีน้ำตาลแกมเทาจนถึงสีดำ ส่วนหัวมีสีเข้มกว่าลำตัว มีลายแถบสีขาวระหว่างตาแถบหนึ่ง ซึ่งเห็นได้ชัดเจน และมีแถบสีขาวข้างแก้มและเหนือตาจากผ่านตามแนวสันคอจรดถึงหัวไหล่ เป็นสัตว์ที่มีกลิ่นตัวรุนแรง เนื่องจากมีต่อมผลิตกลิ่นอยู่ที่อยู่ที่บริเวณใกล้ก้น ซึ่งจะผลิตกลิ่นเหม็นออกจากเมื่อถูกคุกคามหรือตกใจ จัดเป็นสัตว์ที่ปรับตัวให้เข้ากับสภาพแวดล้อมได้หลากหลายประเภท ตั้งแต่ป่าดิบ, ทุ่งหญ้า, นาข้าว จนถึงพื้นที่เกษตรกรรมต่าง ๆ ได้เป็นอย่างดี ในตอนกลางวันจะนอนหลับพักผ่อนในโพรงดินหรือโพรงไม้ ออกหากินในเวลากลางคืน ซึ่งกินได้ทั้งพืชและสัตว์ต่าง ๆ อาทิ ผลไม้, ลูกไม้,สัตว์เลื้อยคลานและสัตว์ครึ่งบกครึ่งน้ำขนาดเล็ก, แมลง, หนู, หอยทาก เป็นต้น ซึ่งบางครั้งอาจปีนต้นไม้ขึ้นไปหากินได้ ฤดูผสมพันธุ์จะอยู่ในช่วงฤดูร้อน โดยจะอยู่ด้วยกันเป็นคู่ ตั้งท้องนานประมาณ 3 เดือน ออกลูกครั้งละ 1-3 ตัว ในราวเดือนพฤษภาคม-มิถุนายน ซึ่งในบางครั้งอาจพบอยู่ด้วยกันในโพรงเดียวประมาณ 4-5 ตัว',"
				+ 17.626961
				+ ","
				+ 99.474992
				+ ",'badger_bg','badger_icon','night','อุทยานแห่งชาติศรีสัชนาลัย','1100000','kao_kid_cha_kud');");// 17.626961,
																						// 99.474992

		/* อุทยานแห่งชาติศรีพังงา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Buffy fish owl, Malay fish owl', 'นกทึดทือมลายู','Ketupa ketupu','นกล่าเหยื่อชนิดหนึ่ง จำพวกนกเค้าแมว เป็นนกเค้าแมวขนาดกลาง มีความสูงประมาณ 49-50 เซนติเมตร ปีกสั้นกว่า 40 เซนติเมตร ดวงตาสีเหลืองจนถึงเหลืองแกมทอง มีขนเหนือคิ้วเป็นแผงยาวออกไปด้านข้างทั้งสองด้าน ส่วนขนบริเวณเหนือโคนปากเป็นสีขาว ลำตัวด้านบนสีน้ำตาลมีลายสีจางกระจาย ด้านล่างสีเนื้อแกมน้ำตาลเหลือง มีลายขีดสีดำ เมื่อหุบปีกจะเห็นลายแถบสีน้ำตาลจางสลับสีเข้มบริเวณปลายปีก ขาสีเขียว มีเล็บโค้งแหลม และมีปากงุ้มแหลม มีฤดูผสมพันธุ์ในช่วงฤดูหนาวต่อฤดูร้อน ตั้งแต่เดือนมกราคมถึงเมษายน ทำรังอยู่ในโพรงไม้ หรือใช้รังเก่าของนกอื่น ๆ เป็นรัง ออกไข่ครั้งละ 1-3 ฟอง ลักษณะไข่มีเปลือกสีขาวและทรงกลม ตัวผู้จะเป็นฝ่ายส่งเสียงร้องเรียกตัวเมีย มักอาศัยอยู่ตามป่าดิบแล้ง, ป่าดิบชื้น ตั้งแต่ระดับพื้นราบจนกระทั่งความสูง 800 เมตรจากระดับน้ำทะเล ใกล้แหล่งน้ำหรือลำธารในป่า และบริเวณใกล้ชายฝั่ง ส่วนใหญ่หากินในเวลากลางคืน จับสัตว์ขนาดเล็กกินเป็นอาหาร ซึ่งได้แก่ ปลา, กบ, ปู, ค้างคาว, นกชนิดอื่น และสัตว์เลื้อยคลานเกือบทุกชนิด เมื่อเวลาบินล่าเหยื่อจะบินได้เงียบกริบมาก พบกระจายพันธุ์ตั้งแต่ภาคใต้ตอนล่างของไทยเช่น จังหวัดนราธิวาส พบไปตลอดแหลมมลายูจนถึงประเทศอินโดนีเซีย, เกาะชวา และหมู่เกาะซุนดา ซึ่งนกทึดทือมลายู เป็นนกที่ถูกอ้างอิงถึงในนวนิยายสำหรับเด็กเรื่อง แฮร์รี่ พ็อตเตอร์ ด้วยเป็นนกของแฮร์รี่ พ็อตเตอร์ ตัวละครเอก เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2546',"
				+ 9.106845
				+ ","
				+ 98.476555
				+ ",'buffy_fish_owl_bg','buffy_fish_owl_icon','night','อุทยานแห่งชาติศรีพังงา','1100000','had_jao_mai');");// 9.106845,
																									// 98.476555

		/* อุทยานแห่งชาติลำคลองงู */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Centipede', 'ตะขาบ ','-','ตะขาบ จัดอยู่ใน  Class Chilopoda เป็นสัตว์ขาข้อที่พบได้ในเขตร้อนชื้น อาศัยอยู่บนบก ตะขาบมีขนาดความยาวของลำตัวตั้งแต่ 3 - 8 ซม. ขนาดใหญ่ที่สุดคือชนิด Scolopendra heros มีความยาว 8 - 10   ลำตัวแบนราบ มีปล้อง 15 - 100 ปล้อง แต่ละปล้องมีขา 1 คู่ ส่วนหัวแยกจากลำตัวชัดเจน มีหนวด 1 คู่ โดยมีเขี้ยวพิษ 1 คู่ ซึ่งดัดแปลงมาจากปล้องแรกของลำตัว เขี้ยวพิษเชื่อมต่อกับต่อมพิษ เมื่อกัดเหยื่อจะปล่อยพิษออกมา ทำให้เหยื่อเจ็บปวด และเป็นอัมพาต ตะขาบวางไข่ในที่ชื้นหรือต้นพืชหญ้า ใช้เวลาในการเจริญเติบโตนาน ลอกคราบ 10 ครั้ง ตัวเต็มวัยมีอายุ 3 - 5 ปี ในเวลากลางวันจะซ่อนอยู่ในที่เย็นๆ ใต้ก้อนหิน ออกหาเหยื่อในเวลากลางคืน กินแมลงเป็นอาหาร เมื่อถูกตะขาบกัดจะพบรอยเขี้ยวสองรอย ลักษณะเป็นจุดเลือดออกตรงบริเวณ ที่ถูกกัด พิษของตะขาบทำให้มีการอักเสบ ปวดบวมแดงร้อน ชา เกิดอัมพาต ตรงบริเวณที่ถูกกัด ในบางรายอาจมีอาการแพ้ หรือกระวนกระวาย อาเจียน หัวใจเต้นไม่เป็นจังหวะ มึนงง ปวดศีรษะ อาจมีการติดเชื้อแบคทีเรียแทรกซ้อนตรงบริเวณที่ถูกกัด อาจเป็นแผลไหม้อยู่ 2-3 วัน',"
				+ 14.744266
				+ ","
				+ 98.625365
				+ ",'centipede_bg','centipede_icon','night','อุทยานแห่งชาติลำคลองงู','0000000','klong_wang_jao');");// 14.744266,
																							// 98.625365

		/* อุทยานแห่งชาติลานสาง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Palm civet', 'อีเห็น','-','เป็นสกุลของสัตว์กินเนื้อสกุลหนึ่ง ใช้ชื่อสกุลว่า Paradoxurus ในวงศ์ชะมดและอีเห็น(Viverridae) อีเห็น มีความแตกต่างจากชะมด (Viverra spp.) ซึ่งเป็นสัตว์อีกสกุลในวงศ์นี้ คือ อุ้งตีนมีลักษณะเหมาะสมสำหรับการปีนป่าย โดยเฉพาะนิ้วที่ 3 และ 4 ของตีนหลังบางส่วนมีพังผืดเชื่อมติดกัน อุ้งตีนแยกออกเป็น 4 ส่วน อีเห็นจะมีนิ้วตีนทั้งหมดที่อุ้งตีนข้างละ 5 นิ้ว มีเล็บคมยาวไว้ปีนป่าย ขนาดอุ้งตีนของอีเห็นจะเล็กกว่าชะมด เพราะอีเห็นจะปีนป่ายต้นไม้หากินมากกว่าชะมด ที่หากินตามพื้นดิน แต่ทั้ง 2 สกุลนี้ เมื่อลงพื้นดิน โดยเฉพาะดินที่อ่อนนุ่ม จะฝากรอยเท้าทิ้งเอาไว้ให้สังเกตเห็นได้ง่าย อีกทั้ง อีเห็นจะเป็นสัตว์กินพืชและผลไม้มากกว่าชะมด ขณะที่ชะมดจะกินสัตว์ต่าง ๆ เช่น กบ หรือเขียด หรือปลา เป็นอาหารมากกว่าพืช อีเห็น เป็นสัตว์ที่กระจายพันธุ์ทั้งแต่เอเชียใต้ จนถึงเอเชียตะวันออกเฉียงใต้ทั้งที่เป็นแผ่นดินใหญ่ และหมู่เกาะต่าง ๆ นอกจากนี้แล้วในบางประเทศ เช่น อินโดนีเซีย หรือ เวียดนาม มีการเลี้ยงอีเห็นในสกุลนี้ให้กินเมล็ดกาแฟ เมื่อถ่ายมูลออกมาแล้ว เมล็ดกาแฟจะไม่ถูกย่อยสลาย จะออกมาเป็นเมล็ดเหมือนเดิม จากนั้นจะนำไปล้างและคั่วเป็นกาแฟสำหรับจำหน่าย ซึ่งกาแฟลักษณะนี้เรียกว่า \"กาแฟขี้ชะมด\" เป็นกาแฟที่มีรสชาติกลมกล่อม หอมหวาน อร่อยกว่ากาแฟทั่วไป จึงมีราคาขายที่แพงกว่ากาแฟปกติทั่วไป ทั้งนี้เนื่องจากในระบบย่อยอาหารของอีเห็นมีเอนไซม์ที่ทำให้เมล็ดกาแฟมีรสชาติที่หอมหวาน',"
				+ 16.770382
				+ ","
				+ 99.011749
				+ ",'palm_civet_bg','palm_civet_icon','night','อุทยานแห่งชาติลานสาง','1100001','klong_wang_jao');");// 16.770382,
																							// 99.011749

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Colugo, Flying lemur', 'บ่าง','Galeopterus variegatus','สัตว์เลี้ยงลูกด้วยนมจำพวกหนึ่งในอันดับบ่าง (Dermoptera) มีรูปร่างคล้ายกระรอกบินขนาดใหญ่ พบได้แต่ในภูมิภาคเอเชียตะวันออกเฉียงใต้ นับเป็นสิ่งมีชีวิตเพียงชนิดเดียวเท่านั้นที่อยู่ในสกุลGaleopterus มีรูปร่างคล้ายกระรอกบินขนาดใหญ่ ผิวหนังย่น ตามีขนาดใหญ่สีแดง ใบหูเล็ก มีนิ้วทั้งหมด 5 นิ้ว สีขนมีหลากหลายมาก โดยสามารถเปลี่ยนไปตามสภาพแวดล้อม ทั้งน้ำตาลแดง หรือเทา รวมทั้งอาจมีลายเลอะกระจายไปทั่วตัวด้วย โดยตัวเมียมีสีอ่อนกว่าตัวผู้ หางมีลักษณะแหลมยาว มีพังผืดเชื่อมติดต่อกันทั่วตัว โดยเชื่อมระหว่างขาหน้าและขาหลัง ขาหลังกับหาง ระหว่างขาหน้ากับคอ และระหว่างนิ้วทุกนิ้ว มีนิ้วทั้งหมด 5 นิ้ว โดยที่ไม่มีหัวแม่มือ เล็บแหลมคมมากใช้สำหรับไต่และเกาะเกี่ยวต้นไม้[4] มีความยาวหัวและลำตัวโตเต็มที่ราว 34-42 เซนติเมตร หาง 22-27 เซนติเมตร น้ำหนัก 1-1.8 กิโลกรัม  บ่างอาศัยและหากินอยู่บนต้นไม้สูง และสามารถอาศัยได้ในป่าทุกสภาพ ไม่เว้นแม้กระทั่งป่าเสื่อมโทรม หรือตามเรือกสวนไร่นาที่มีการทำเกษตรกรรม บ่างเป็นสัตว์ที่ไม่สามารถเดินบนพื้นดินได้ เมื่อตกลงพื้นจะรีบกระเสือกกระสนตัวเองปีนขึ้นสู่ต้นไม้ทันที เนื่องจากบ่างก็สามารถตกเป็นอาหารของสัตว์กินเนื้อชนิดต่าง ๆ ได้ ออกหากินในเวลากลางคืน โดยตอนกลางวันจะนอนหลับพักผ่อนตามยอดไม้หรือโพรงไม้ กินอาหารจำพวกพืช ได้แก่ ยอดไม้, ดอกไม้ เป็นหลัก แต่จากการศึกษาด้วยเครื่องติดตามตัวของบ่างที่เกาะชวา โดยนักวิทยาศาสตร์ชาวญี่ปุ่นพบว่า บ่างเป็นสัตว์ที่ช่างเลือกกิน โดยจะกินยอดไม้จากต้นไม้เพียง 2-3 ชนิดเท่านั้น และบ่างตัวเมียจะมีอาณาเขตการหากินที่ชัดเจน แน่นอน ส่วนตัวผู้จะไต่ต้นไม้และร่อนไปทั่ว บ่างสามารถร่อนจากต้นไม้ต้นหนึ่งไปยังต้นหนึ่งได้ไกลกว่ากระรอกบินมาก โดยใช้นิ้วและผังผืดเป็นตัวควบคุมความเร็วและระยะทางระหว่างร่อน ใช้เวลาตั้งท้องนานประมาณ 60 วัน ออกลูกครั้งละตัว เนื่องจากแม่บ่างสามารถรับน้ำหนักลูกได้เพียงคราวละตัว ลูกบ่างแรกเกิดมักมีการพัฒนาไม่มากนักคล้ายสัตว์ที่มีกระเป๋าหน้าท้อง แม่บ่างจะเลี้ยงลูกไว้โดยให้เกาะที่ท้อง เวลาเกาะอยู่กับต้นไม้ ผังผืดระหว่างขาจึงทำหน้าที่เหมือนเปลเลี้ยงลูกเป็นอย่างดีคล้ายสัตว์ที่มีกระเป๋าหน้าท้อง แม้ยามมีลูกอ่อน แม่บ่างก็ร่อนหาอาหารได้เหมือนเดิม โดยลูกบ่างจะยึดเกาะขนที่หน้าท้องแม่ไว้แน่น ลูกบ่างจะกินมูลของแม่ เนื่องจากภายในมีแบคทีเรียที่ช่วยในการย่อยอาหาร ขณะที่แม่บ่างเมื่อเลียตัวทำความสะอาดลูกอาจเลียฉี่ของลูกบ่างไปด้วย ลูกบ่างจะเกาะอาศัยอยู่กับแม่จนกว่าอายุได้ 2-3 ปี จึงแยกตัวออกไปหากินเองเป็นอิสระ จากนั้นแม่บ่างจึงจะมีลูกใหม่ แต่พฤติกรรมการผสมพันธุ์ของบ่างยังไม่เป็นที่รู้แน่ชัด [4] บ่าง เป็นสัตว์ที่มีเสียงร้องคล้ายเสียงคนร้องไห้ และความเป็นสัตว์ที่มีหน้าตาน่าเกลียดและหากินในเวลากลางคืน จึงเป็นที่รับรู้กันดีของผู้ที่อาศัยอยู่ชายป่าหรือผู้ที่นิยมการผจญภัย ว่าเสียงร้องของบ่างน่ากลัวเหมือนผี เมื่อพระอาทิตย์จะลับขอบฟ้า หรือ ยามโพล้เพล้ บ่างจะแสดงพฤติกรรมแปลกอยู่อย่างหนึ่ง คือ จะออกมาจากที่หลบนอน แล้วห้อยตัวลงมาคล้ายค้างคาว โดยใช้เท้าหลังทั้งสองเกาะกิ่งไม้ แล้วทิ้งลำตัวห้อยลงมาในแนวดิ่ง ส่วนหัวและเท้าหน้าจะม้วนงอเข้าหาลำตัว (หากมองผิวเผินจะเหมือนค้างคาวแม่ไก่กำลังห้อยหัวมาก) พฤติกรรมนี้ยังหาข้อสรุปไม่ได้ชัดเจน บ่างจะห้อยตัวเช่นนี้ไปจนกว่าแสงสุดท้ายจะลับขอบฟ้าไป แล้วจะปีนป่ายไปหาต้นไม้ต้นประจำในการร่อน มักจะเป็นต้นไม้ที่มีทรงพุ่มสูง ๆ ที่ยืนอยู่เดี่ยว ๆ เพราะจะทำให้มีพื้นที่ในการร่อนมาก บ่างในบางครั้งอาจจะสับสนกับ กระรอกบิน ซึ่งที่จริงแล้วบ่างกับกระรอกบินเป็นสัตว์คนละอันดับกัน โดยภาษาใต้จะเรียกบ่างว่า \"พะจง\" หรือ \"พุงจง\" แต่ในภาษาเหนือและภาษาอีสานจะเรียกกระรอกบินว่า \"บ่าง\" จึงทำให้อาจเกิดความสับสนกัน',"
				+ 16.738329 + "," + 99.035267
				+ ",'colugo_bg','colugo_icon','night','อุทยานแห่งชาติลานสาง','0100000','klong_wang_jao');");// 16.738329,
																					// 99.035267

		/* อุทยานแห่งชาติแม่ยม */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Spiny-tailed house gecko, Common house gecko', 'จิ้งจกบ้านหางหนาม','Hemidactylus frenatus','สัตว์เลื้อยคลานชนิดหนึ่ง จำพวกจิ้งจกบ้าน อยู่ในวงศ์จิ้งจกและตุ๊กแก (Gekkonidae) จิ้งจกบ้านหางหนาม นับเป็นจิ้งจกอีกชนิดหนึ่งที่พบได้หลากหลายและกว้างขวางที่สุด เป็นจิ้งจกที่มีถิ่นกำเนิดในเอเชียตะวันออกเฉียงใต้และเริ่มแพร่พันธุ์ในหลายประเทศทั่วโลก ทั้งแอฟริกาตะวันออก, นิวกินี, เม็กซิโก, มาดากัสการ์ และออสเตรเลีย พบเห็นได้ทั่วไปตามที่พักอาศัย เช่น บ้านเรือน โดยเฉลี่ยลำตัวจะมีความยาว 3 นิ้ว ตัวเต็มวัยอาจจะถึง 5 นิ้ว มีสีน้ำตาลอ่อนจนถึงเข้ม หางค่อนข้างกลม มีหนามอยู่บริเวณด้านข้าง ตัวเมียวางไข่คราวละ 2 ฟอง ไข่จะใช้เวลาฟักประมาณ 50-65 วัน ตัวอ่อนที่ออกจากไข่จะมีขนาดประมาณ 2 นิ้ว วงจรชีวิตมีอายุประมาณ 5-10 ปี การงอกใหม่ของหางจิ้งจกใช้เวลาประมาณ 2-6 สัปดาห์ ระยะเวลาขึ้นอยู่กับขนาดของหางที่ขาดหายไป',"
				+ 18.774419
				+ ","
				+ 100.209332
				+ ",'spiny_tailed_house_gecko_bg','spiny_tailed_house_gecko_icon','day','อุทยานแห่งชาติแม่ยม','0000000','klong_wang_jao');");// 18.774419,
																										// 100.209332

		/* อุทยานแห่งชาติแม่เมย */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Butterfly lizard, Small-scaled lizard, Ground lizard', 'แย้','Hemidactylus frenatus','เป็นสัตว์เลื้อยคลานจำพวกกิ้งก่าประเภทหนึ่ง จัดเป็นสัตว์ที่อยู่ในสกุล Leiolepis ในวงศ์ Agamidae วงศ์ย่อย Leiolepidinae พบกระจายทั่วไปในภูมิภาคเอเชียตะวันออกเฉียงใต้ โดยเฉพาะภูมิภาคอินโดจีน พบทั้งหมด 8 ชนิด สำหรับในประเทศไทยพบทั้งหมด 4 ชนิด มีลักษณะเด่นคือ มีสีสวยสด และลำตัวไม่มีปุ่มหนามมีความแตกต่างจากกิ้งก่าในวงศ์ย่อย Agaminae ซึ่งเป็นวงศ์ย่อยที่มีจำนวนสมาชิกหลากหลายที่สุดของวงศ์ Agamidae คือ มีช่องเปิดบริเวณแอ่งเบ้าตาเล็ก และไม่มีช่องเปิดบริเวณกล่องหู] มีขนาดลำตัววัดจากปลายปากโดยตลอดยาวประมาณ 11.5 เซนติเมตร หางยาวประมาณ 23.8 เซนติเมตร ตัวแบนหางราบ โคนหางแบนและแผ่บานออก สีข้างแผ่ขยาย ไม่มีแผงหนามที่สันหลัง ช่องหูใหญ่ เยื่อหูจมใต้ผิวหนัง หนังข้างคอมีรอยพับตามขวาง รอบลำตัวมีเกล็ดประมาณ 40 แถว หัวและหลังสีเขียวมะกอก โดยมีจุดสีเหลืองขอบดำเรียงเป็นแนวข้างตัว มีแถบดำสลับเหลืองคอมีลวดลายร่างแหดำ ประกอบสีครีม ท้องและอกสีส้มสด ตัวผู้จะมีพังผืดด้านข้าง และสวยกว่าตัวเมีย โดยที่แย้ไม่สามารถปรับเปลี่ยนสีได้ตามสภาพแวดล้อมเหมือนสัตว์เลื้อยคลานชนิดอื่น ๆ แย้ทุกชนิดเป็นสัตว์ที่หากินและอาศัยอยู่ในพื้นดิน ไม่ขึ้นต้นไม้อย่างสัตว์เลื้อยคลานชนิดอื่น โดยเฉพาะพื้นดินที่เป็นที่แห้งแล้งลักษณะดินปนทราย ที่อยู่ของแย้เป็นรู ลึกประมาณ 1 ฟุต เป็นโพรงข้างใน สามารถกลับตัวได้ ที่ปากรูจะมีรอยของหางแย้ เป็นรอยยาว ๆ และจะมีรูพิเศษอีกรูหนึ่ง ที่ใช้ป้องกันตัว เมื่อถูกศัตรูรุกรานเข้ารูด้านหนึ่ง แย้สามารถหลบรอดออกไปอีกรูหนึ่งได้อย่างแยบยล โดยรูนี้เรียกในภาษาไทยว่า \"แปว\" แย้สามารถสืบพันธุ์ได้ทุกฤดูกาล กินแมลงต่าง ๆ เป็นอาหาร แย้ไม่สามารถที่จะว่ายน้ำได้ แย้จัดเป็นอาหารดั้งเดิมของมนุษย์มาช้านานแล้ว โดยเฉพาะอย่างยิ่งในถิ่นอีสานของไทย ชาวอีสานจะนิยมจับแย้กินเป็นอาหาร โดยมีรสชาติคล้ายเนื้อไก่ นิยมนำไปทำเป็นเมนูได้หลากหลาย เช่น ปิ้ง หรือ ลาบ ปัจจุบัน สถานะของแย้เมื่อเทียบกับสัตว์เลื้อยคลานชนิดอื่น ๆ แล้ว นับว่าใกล้สูญพันธุ์จากถิ่นที่อยู่ตามธรรมชาติ ในบางพื้นที่จึงมีการส่งเสริมการเลี้ยงแย้ให้เป็นสัตว์เศรษฐกิจและอนุรักษ์ไว้ด้วย เช่นที่ สวนสัตว์เปิดเขาเขียว เป็นต้น',"
				+ 17.431155
				+ ","
				+ 98.092408
				+ ",'butterfly_lizard_bg','butterfly_lizard_icon','day','อุทยานแห่งชาติแม่เมย','1010110','klong_wang_jao');");// 17.431155,
																									// 98.092408

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Common hill myna, Hill myna', 'นกขุนทอง','Gracula religiosa','เป็นนกในวงศ์นกเอี้ยงและนกกิ้งโครง (Sturnidae) มีถิ่นอาศัยอยู่ทั่วไปในเอเชียใต้และเอเชียอาคเนย์ มีความสามารถเลียนเสียงมนุษย์ได้เหมือนนกแก้ว จึงนิยมเลี้ยงเป็นสัตว์เลี้ยงกันสูง นกขุนทองมีความยาวเฉลี่ยประมาณ 29 เซนติเมตร ลำตัวป้อมสีดำ หางสั้น ปีกแหลมยาว เท้าแข็งแรง มีเหนียง คือ แผ่นหนังสีเหลืองอมส้มคลุมทั่วท้ายทอยและเหนียงสีเหลืองแดงสดใต้ตา ขนสีดำเหลือบเขียว มีเงาสีม่วงบริเวนหัวและคอ มีสีขาวแซมใต้ปีก ปากสีแดงส้ม ขาสีเหลืองสด ทั้งตัวผู้และตัวเมียมีลักษณะคล้ายกัน ถิ่นแพร่พันธุ์หลักของนกขุนทองพบได้ในบริเวณโคนเทือกเขาหิมาลัย ใกล้เขตแดนอินเดีย, เนปาล และภูฏาน แต่พบได้ในศรีลังกา, พม่า, ไทย, ลาว, กัมพูชา, เวียดนาม, สุมาตรา, อินโดนีเซีย และบอร์เนียว และถูกนำเข้าไปสหรัฐอเมริกาด้วย นกขุนทองชอบอาศัยอยู่ในป่าที่มีความชื้น ที่ระดับความสูง 0-2,000 เมตรจากระดับน้ำทะเล ในประเทศไทยจะพบทุกภาคยกเว้นที่ราบลุ่มภาคกลาง ในประเทศไทยพบ 2 ชนิดย่อย คือ G. r. intermedia ที่พบในพื้นที่ภาคเหนือ และ G. r. religiosa ที่ตัวใหญ่กว่าชนิดแรก พบในพื้นที่ภาคใต้ จึงมีชื่อเรียกอีกชื่อหนึ่งว่า \"นกขุนทองควาย\" ชอบร้องเวลาเช้าตรู่และพลบค่ำ ร้องเป็นเสียหวีดสูงตามด้วยเสียงอื่น ๆ เคลื่อนไหวบนกิ่งโดยเน้นการกระโดดข้างแทนการเดินต่างจากนกเอี้ยงทั่วไป นกขุนทองเป็นนกที่รักความสะอาดเพราะ มักชอบอาบน้ำ ไซร้ขนหรือตกแต่งขนอยู่ตลอดเวลา ชอบทำรังอยู่บริเวณโพรงไม้เก่า ๆ สูงระหว่าง 3-5 เมตร อาศัยอยู่เป็นกลุ่มประมาณ 6 ตัวขึ้นไป วางไข่ครั้งละ 2-3 ฟอง นกขุนทองกินทุกอย่างทั้งพืชและสัตว์ เช่นผลไม้, ลูกไม้, น้ำดอกไม้ และแมลงต่าง ๆ  นกขุนทองนั้นมีชื่อเสียงเรื่องเสียงร้องหลากหลายชนิด ทั้งหวีด กรีดร้อง กลั้ว ร้องเป็นทำนอง รวมถึงเลียนแบบเสียงมนุษย์ ซึ่งทำได้ทั้งตัวผู้และตัวเมีย นกหนึ่งตัวจะมีเสียงร้องตั้งแต่ 3 ถึง 13 แบบ มีการเลียนแบบเสียงร้องกันโดยเฉพาะในเพศเดียวกัน แต่รัศมีในการเรียนรู้นี้ส่วนใหญ่น้อยกว่า 15 กิโลเมตรลงไป มีความเข้าใจผิดทั่วไปว่านกขุนทองนั้นชอบเลียนแบบเสียงร้องนกพันธุ์อื่น ๆ แต่ที่จริงแล้วพฤติกรรมนี้ไม่มีโดยธรรมชาติ แต่เฉพาะในสัตว์เลี้ยงเท่านั้น ในประเทศไทย นกขุนทองจัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 17.332206
				+ ","
				+ 98.134980
				+ ",'common_hill_myna_bg','common_hill_myna_icon','day','อุทยานแห่งชาติแม่เมย','1001000','klong_wang_jao');");// 17.332206,
																									// 98.134980

		/* อุทยานแห่งชาติปางสีดา */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Snail-eating turtle', 'เต่านา','-','เป็นสกุลของสัตว์เลื้อยคลาน 2 ชนิดจำพวกเต่าที่อยู่ในสกุล  Malayemys ในวงศ์Bataguridae เป็นเต่าน้ำจืดขนาดเล็ก มีลักษณะเด่น คือ กระดองส่วนบนมีสันนูน 3 เส้น เห็นได้ชัดเจน อันเป็นที่มาของชื่อสามัญ และมีขอบเรียบ ส่วนหัวมีขนาดใหญ่และมีลายเส้นสีเหลืองหรือสีขาว กระดองส่วนบนมีสีน้ำตาลและขอบสีตรีมหรือสีเหลือง กระดองส่วนล่างมีสีเหลือง และแต้มสีดำบนแผ่นเกล็ด ขณะที่สีผิวทั่วไปเป็นสีน้ำตาลเทาหรือดำ บริเวณส่วนหน้าและจมูกมีลายเส้นขีดสีขาว เป็นเต่าที่พบกระจายพันธุ์ทั่วไปในแหล่งน้ำของภูมิภาคอินโดจีนและแหลมมลายู พบเห็นได้ทั่วไปทั้งนาข้าว, สวนสาธารณะ หรือท้องร่องสวนผลไม้ พื้นที่การเกษตรทั่วไป เป็นเต่าที่กินหอยเป็นอาหารหลักทั้งหอยฝาเดียวและหอยสองฝา โดยใช้ริมฝีปากขบกัดเปลือกหอยให้แตก แล้วใช้เล็บจิกเนื้อหอยออกมากิน และยังกินสัตว์น้ำอย่างอื่นได้ด้วย',"
				+ 13.977069
				+ ","
				+ 102.299598
				+ ",'snail_eating_turtle_bg','snail_eating_turtle_icon','day','อุทยานแห่งชาติปางสีดา','1100001','klong_wang_jao');");// 13.977069,
																											// 102.299598

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Purple heron', 'นกกระสาแดง','Ardea purpurea','เป็นนกน้ำในตระกูล Ardeidae มีถิ่นผสมพันธุ์อยู่ในแอฟริกา ยุโรปตอนกลางและตอนใต้ เอเชียใต้ และเอเชียตะวันออก กลุ่มที่อาศัยอยู่ในยุโรปจะอพยพลงสู่เขตร้อนในแอฟริกาในฤดูหนาว ส่วนกลุ่มที่อาศัยอยู่ในเอเชียก็จะมีการอพยพลงใต้ภายในทวีปเช่นกัน จัดว่าเป็นนกที่หายาก แต่เวลาที่อพยพจะพบเห็นได้บ่อยในภูมิภาคทางตอนเหนือของถิ่นผสมพันธุ์ นกชนิดนี้จัดเป็นนกขนาดใหญ่ โดยมีความสูง 80-90 เซนติเมตร ความกว้างของปีกสองข้าง 120-150 เซนติเมตร แต่มีลำตัวผอมบาง มีน้ำหนักเพียง 500-1,300 กรัมเท่านั้น มีลักษณะใกล้เคียงกับนกกระสานวล แต่ขนาดค่อนข้างเล็กกว่า และมีสีขนที่แตกต่างกัน โดยนกกระสาแดงจะมีขนสีน้ำตาลแดงเข้ม และเมื่อโตเต็มวัย ขนที่หลังจะเป็นสีเทาเข้มขึ้น จงอยปากมีสีเหลืองและแคบบาง ซึ่งในตัวเต็มวัยจะมีสีสว่างขึ้น เวลาผสมพันธุ์จะอยู่รวมกันเป็นฝูงตามพงต้นกกหรือต้นไม้ใกล้กับทะเลสาบขนาดใหญ่หรือพื้นที่ชุ่มน้ำ โดยจะสร้างรังขนาดใหญ่จากกิ่งไม้สำหรับวางไข่ นกชนิดนี้จะออกหาอาหารตามบริเวณน้ำตื้น โดยล่าเหยื่อจำพวกปลา กบ และแมลงโดยใช้จงอยปากที่ยาวและแหลมคม พฤติกรรมการล่าเหยื่อของนกชนิดนี้นั้น มักจะยืนรอเหยื่อนิ่งๆ หรือค่อยๆเดินไล่ตามเหยื่อ นกกระสาแดงบินได้ช้า เวลาบินหดคอเข้าลำตัวเป็นรูปตัว S คอที่ยาวนี้บางครั้งอาจมองดูคล้ายงู',"
				+ 13.969073
				+ ","
				+ 102.278655
				+ ",'purple_heron_bg','purple_heron_icon','day','อุทยานแห่งชาติปางสีดา','100101','klong_wang_jao');");// 13.969073,
																							// 102.278655

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Grey heron', 'นกกระสานวล','Ardea cinerea','เป็นนกน้ำในตระกูล Ardeidae มีถิ่นกำเนิดในเขตอบอุ่นในยุโรป เอเชีย และบางพื้นที่ในแอฟริกา ในฤดูหนาวมักอพยพจากพื้นที่ที่หนาวเย็นไปยังพื้นที่ที่มีอากาศอบอุ่นกว่า นกกระสานวลเป็นนกที่มีขนาดใหญ่ มีความสูง 90-100 เซนติเมตร ช่วงปีกสองข้างกว้าง 175-195 เซนติเมตร และหนัก 1-2 กิโลกรัม ขนด้านบนเป็นสีเทา แต่ด้านล่างเป็นสีขาว ในตัวเต็มวัยจะมีขนที่ส่วนหัวเป็นสีขาวจะมีแถบขนสีดำรอบหัว จงอยปากสีชมพูอมเหลือง ซึ่งจะมีสีสว่างขึ้นเวลาผสมพันธุ์',"
				+ 13.959744
				+ ","
				+ 102.288268
				+ ",'grey_heron_bg','grey_heron_icon','day','อุทยานแห่งชาติปางสีดา','1100000','klong_wang_jao');");// 13.959744,
																						// 102.288268

		/* อุทยานแห่งชาติน้ำหนาว */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Impressed tortoise', 'เต่าเดือย','Manouria impressa','เต่าเดือย นับเป็นเต่าบกที่พบได้ในป่าทวีปเอเชียที่มีกระดองสวยงามมากชนิดหนึ่ง โดยมีแผ่นเกล็ดที่กระดองหลังบางแผ่นที่โปร่งแสง แผ่นเกล็ดสันหลังและแผ่นเกล็ดชายโครงยุบลงมาเล็กน้อย แผ่นเกล็ดเหนือต้นคอมีขนาดใหญ่ ตอนปลายแยกออกเป็น 2 ส่วน โคนขาหน้าหุ้มด้วยเกล็ดที่มีลักษณะแหลมคล้ายหนาม ขาหลังคล้ายเท้าช้าง มีเดือยรูปวงกลมและเดือยคล้ายไก่ 1 เดือย ระหว่างโคนขาหลังและโคนหาง แผ่นเกล็ดใต้คอมีขนาดเล็ก แผ่นเกล็ดท้องมีขนาดใหญ่ มีขนาดใหญ่โตเต็มที่ประมาณ 28 เซนติเมตร ความยาวของกระดองท้อง 27 เซนติเมตร น้ำหนักประมาณ 2.5 กิโลกรัมหรือมากกว่า กระดองหลังเป็นสีเหลืองส้ม ขอบกระดองเป็นสีเหลือง มีจุดสีน้ำตาลกระจายอยู่ประปราย ตัวผู้และตัวเมียมีสีที่แตกต่างกัน และมีน้ำหนักที่ต่างกันอีกด้วย เต่าเดือย เป็นเต่าที่อาศัยอยู่ในป่าดิบชื้นทั่วภูมิภาคเอเชียตะวันออกเฉียงใต้ จนถึงจีนตอนใต้ อาจพบได้บนที่สูงถึง 2,000 เมตร จากระดับน้ำทะเล เป็นเต่าที่กินอาหารจำพวกพืช เช่น หน่อไม้, เห็ดรา เป็นอาหารหลัก โดยมักหากินตามพื้นที่มีความชื้นสูงและมีหญ้าขึ้นรกชัฎ เป็นเต่าที่ใกล้สูญพันธุ์ในธรรมชาติมากแล้วชนิดหนึ่ง ปัจจุบันเป็นสัตว์ป่าสงวนตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่าแห่งชาติ พุทธศักราช 2535',"
				+ 16.593291
				+ ","
				+ 101.600735
				+ ",'impressed_tortoise_bg','impressed_tortoise_icon','day','อุทยานแห่งชาติน้ำหนาว','1101001','pha_non_ban_ja');");// 16.593291,
																										// 101.600735

		/* อุทยานแห่งชาติน้ำตกห้วยยาง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Panda crab', 'ปูเจ้าฟ้า','Phricotelphusa sirindhorn','เป็นปูน้ำตกพบที่วนอุทยานน้ำตกหงาว อำเภอเมือง จังหวัดระนอง เมื่อวันที่ 6 ธันวาคม พ.ศ. 2529 เป็นปูที่มีสีสันสวยงาม กระดองและก้ามทั้งสองข้างเป็นสีขาว ขาเดินทั้งสี่คู่และเบ้าตาและบริเวณปากเป็นสีม่วงดำ มีลักษณะปล้องท้องและอวัยะเพศผู้คู่ที่ 1 ต่างจากปูชนิดอื่น เมื่อโตเต็มที่ความกว้างของกระดอกประมาณ 9-25 มิลลิเมตร พบอยู่จำกัดบริเวณน้ำตกแถบภาคตะวันตกของไทย เช่น น้ำตกห้วยยางอำเภอทับสะแก จังหวัดประจวบคีรีขันธ์ น้ำตกที่เขาพะเนินทุ่ง อำเภอแก่งกระจาน จังหวัดเพชรบุรี เป็นต้น ได้รับพระราชทานพระราชานุญาตอัญเชิญพระนามาภิไธยของ สมเด็จพระเทพรัตนราชสุดา สยามบรมราชกุมารี เป็นชื่อวิทยาศาสตร์ของปูชนิดนี้ เพื่อเฉลิมพระเกียรติในวโรกาสเสด็จพระราชดำเนินมาทรงเปิดพิพิธภัณฑสถานธรรมชาติวิทยาแห่งจุฬาลงกรณ์มหาวิทยาลัย เมื่อวันที่24 กุมภาพันธ์ พ.ศ. 2531 ปัจจุบัน เป็นสัตว์ป่าคุ้มครองในพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่าแห่งประเทศไทย พุทธศักราช 2535',"
				+ 11.502126
				+ ","
				+ 99.466870
				+ ",'panda_crabe_bg','panda_crabee_icon','day','อุทยานแห่งชาติน้ำตกห้วยยาง','1100000','pha_non_ban_ja');");// 11.502126,
																								// 99.466870

		/* อุทยานแห่งชาติเขาสามร้อยยอด */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Bandicoot rat', 'หนูพุก','Bandicota','หนูพุก มีรูปร่างลักษณะทั่วไปคล้ายกับหนูทั่วไปในวงศ์ Murinae แต่ทว่ามีรูปร่างที่ใหญ่กว่าหนูในสกุล Rattus มาก และมีจุดเด่นที่มีขนสีน้ำตาลแดงหรือน้ำตาลดำที่รุงรังไม่เป็นระเบียบ โดยเฉพาะอย่างยิ่งขนบริเวณหลังที่เป็นแผงแข็ง หลังตีนเป็นสีดำ หางยาวมีเกล็ดสีเดียวเป็นหนูที่มีอุปนิสัยดุร้าย เมื่อถูกคุกคามจะขู่และพร้อมที่จะกัด  หนุพุก แบ่งออกได้เป็น 3 ชนิด พบได้ในประเทศไทย 2 ชนิด หนุพุกอินเดีย (B. bengalensis) หนูพุกใหญ่ (B. indica) หนูพุกเล็ก (B. savilei) ถือเป็นหนูที่มีขนาดใหญ่ที่สุดในประเทศไทย โดยอาจจะมีความยาวจากปลายจมูกจรดปลายหางได้ถึง 23-28 เซนติเมตร น้ำหนัก 400-700 กรัม ตัวเมียสามารถผสมพันธุ์ได้ตั้งแต่ 4 เดือนขึ้นไป ในขณะที่ตัวผู้อายุ 6 เดือนขึ้นไป แต่เป็นหนูที่จะพบได้เฉพาะในพื้นที่เกษตรกรรมเช่น นาข้าว เท่านั้น กระจายพันธุ์ตั้งแต่อนุทวีปอินเดียจนถึงเอเชียอาคเนย์ อาศัยอยู่ในรูตามคันนาที่ขุดไว้ โดยมีขุยหรือก้อนดินที่ขุดขึ้นมากระจายเป็นเม็ดอยู่รอบ ๆ จัดเป็นศัตรูพืชที่สำคัญที่กินข้าว โดยเฉพาะข้าวที่ออกรวงเป็นอาหาร และยังกินสัตว์อย่างอื่นในนา เช่น ปูนา หรือหอยเชอรี่ เป็นอาหารอีกด้วย แต่เกษตรกรเมื่อจับได้จะนิยมนำมาบริโภค เนื้อมีรสชาติอร่อย มีการล่าและขายกันในหลายพื้นที่',"
				+ 12.193183
				+ ","
				+ 99.950517
				+ ",'bandicoot_rat_bg','bandicoot_rat_icon','day','อุทยานแห่งชาติเขาสามร้อยยอด','0000000','khun_ja');");// 12.193183,
																									// 99.950517

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Finless porpoise', 'โลมาหัวบาตรหลังเรียบ','Neophocaena phocaenoides','เป็นสัตว์เลี้ยงลูกด้วยนมในอันดับวาฬและโลมา (Cetacea) ขนาดเล็กชนิดหนึ่ง ในวงศ์พอร์พอยส์ (Phocoenidae) มีลักษณะทั่วไปคล้ายกับโลมาอิรวดี หรือ โลมาหัวบาตรมีครีบหลัง (Orcaella brevirostris) คือ มีส่วนหัวกลมหลิมเหมือนบาตรพระไม่มีจะงอยปาก แต่ส่วนหลังเรียบไม่มีครีบหลัง ครีบข้างค่อนข้างใหญ่ปลายแหลม และลักษณะฟันในปากจะเป็นตุ่ม ไม่แหลมคม อันเป็นลักษณะเฉพาะของโลมาในวงศ์พอร์พอย์ ซึ่งทั่วโลกพบอยู่ 6 ชนิด ในประเทศไทยพบเพียงชนิดนี้ชนิดเดียว  มีขนาดโตเต็มที่ยาว 1.9 เมตร ลูกแรกเกิดยาว 70-80 เซนติเมตร ในน่านน้ำไทยสามารถได้ทุกจังหวัดที่ติดกับทะเล และจัดเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 เหมือนกับวาฬและโลมาชนิดอื่น ๆ',"
				+ 12.178752
				+ ","
				+ 100.017808
				+ ",'finless_porpoise_bg','finless_porpoise_icon','day','อุทยานแห่งชาติเขาสามร้อยยอด','1100000','pp_island');");// 12.178752,
																											// 100.017808

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Black marsh turtle','เต่าดำ','Siebenrockiella crassicollis','เป็นเต่าชนิดหนึ่งที่มีขนาดเล็ก มีลักษณะ ลำตัวยาวประมาณครึ่งฟุต น้ำหนักไม่ถึงครึ่งกิโลกรัม ลำตัวแบน มีกระดองสีดำ หัว หาง และขามีสีดำ มีลักษณะเด่น คือ มีแต้มสีขาวเหนือตา แก้ม และตามใบหน้าอีกหลายแห่ง อันเป็นที่มาของชื่อ กระดองส่วนบนยาวเต็มที่ประมาณ 20 เซนติเมตร พบกระจายพันธุ์อยู่ทั่วไปตามแหล่งน้ำประเภทหนองหรือบึง ในภูมิภาคเอเชียใต้จนถึงเอเชียอาคเนย์ สำหรับในประเทศไทยพบได้ทุกทั่วภาค แต่จะพบได้มากในภาคกลางและภาคใต้ กินอาหารได้ทั้งพืชและสัตว์น้ำ มีอุปนิสัยชอบหมกตัวอยู่ใต้โคลนในน้ำ นาน ๆ ทีจึงค่อยโผล่มาหายใจบนผิวน้ำ ดังนั้นเวลาพบจึงเห็นตัวสกปรกเลอะโคลนอยู่เสมอ จะขึ้นบกเวลากลางคืน เพื่อต้องการหาทำเลวางไข่ หรือผสมพันธุ์ หรือย้ายที่อยู่ ส่วนกลางวันมักหมกตัวอยู่ในที่รก ชื้นแฉะ หรือตามโคลนใต้พื้นน้ำ เป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 และนิยมเลี้ยงเป็นสัตว์เลี้ยงสำหรับผู้ที่นิยมเลี้ยงสัตว์เลื้อยคลานหรือสัตว์แปลก ๆ ในเต่าที่เป็นเต่าเผือกจะมีราคาซื้อขายที่แพงมาก เพราะถือเป็นสัตว์ที่หายาก',"
				+ 12.209290
				+ ","
				+ 100.007851
				+ ",'black_marsh_turtle_bg','black_marsh_turtle_icon','day','อุทยานแห่งชาติเขาสามร้อยยอด','1101001','khun_ja');");// 12.209290,
																												// 100.007851

		/* อุทยานแห่งชาติเขาหลวง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Spiny turtle, Spiny terrapin','เต่าจักร','Heosemys spinosa','เต่าจักร มีสันหนาเป็นเส็นกลางแผ่นเกล็ดสันหลังทุกแผ่น และมีตุ่มหลายตุ่มบนแผ่นเกล็ดชายโครงแต่ละแผ่น เมื่อยังเป็นเต่าวัยอ่อนจะมีแผ่นเกล็ดขอบกระดองแต่ละชิ้นคล้ายหนามแหลม 1 หนามคล้ายจักร อันเป็นที่มาของชื่อ ยกเว้นแผ่นเกล็ดขอบกระดอง ที่ 4 ที่ 5 จะมี 2 หนามซึ่งหนามที่ปรากฎในลูกเต่าจะค่อย ๆ หายไปเมื่อโตเต็มที่ ขาหน้าไม่มีผังพืด กระดองหลังสีน้ำตาลแดง กระดองท้องและด้านข้างแผ่นเกล็ดขอบกระดองออกสีเหลืองหรือสีส้ม และมีเส้นลายสีน้ำตาลดำ ขาสีน้ำตาลดำเกล็ดลำตัวออกสีชมพูอ่อน ผิวสีน้ำตาลเทา ส่วนหัวสีน้ำตาล พบกระจายพันธุ์ในที่ชุ่มชื้นของป่าดิบตั้งแต่แหลมมลายูลงไป ตั้งแต่ภาคใต้ของไทย เช่น ชุมพร, สุราษฎร์ธานี, ระนอง ไปจนถึงพม่า, มาเลเซีย, อินโดนีเซีย, สิงคโปร์, บรูไน จนถึงฟิลิปปินส์ เต่าจักร เป็นเต่าที่อาศัยอยู่บนบกมากกว่าอยู่ในน้ำ โดยมักจะอยู่ในสภาพพื้นที่ ๆ มีความชุ่มชื้นและมีอุณหภูมิที่ค่อนข้างเย็นมากกว่า และพบได้ในที่สูงจากระดับน้ำทะเลถึง 900 เมตร กินผักและผลไม้เป็นอาหาร จัดเป็นเต่าอีกชนิดหนึ่งที่มีขนาดเล็ก มีความยาวเต็มที่ประมาณ 20 เซนติเมตร น้ำหนักไม่เกิน 6.5 กิโลกรัม นิยมเลี้ยงกันเป็นสัตว์เลี้ยง ปัจจุบันสามารถขยายพันธุ์ในที่เลี้ยงได้แล้ว โดยพฤติกรรมการผสมพันธุ์และวางไข่จะเลียนแบบตามพฤติกรรมในธรรมชาติ คือ เต่าตัวผู้จะไล่กัดตัวเมียเพื่อผสมพันธุ์ในช่วงฤดูฝนหรือเวลาที่ฝนตก เต่าตัวเมียวางไข่ในช่วงเวลากลางคืน สามารถวางไข่ได้ 3 ครั้่งต่อปี มีระยะเวลาฟักเป็นตัวนานประมาณ 106, 110, และ 145 วันเต่าจักรเป็นสัตว์ป่าคุ้มครองตามพระราชบัญญัติและคุ้มครองสัตว์ป่า พ.ศ. 2535ตามกฎหมายในประเทศไทย',"
				+ 8.494750
				+ ","
				+ 99.733755
				+ ",'spiny_turtle_bg','spiny_turtle_icon','day','อุทยานแห่งชาติเขาหลวง','1101001','khun_ja');");// 8.494750,
																							// 99.733755

		/* อุทยานแห่งชาติเขาหลัก-ลำรู่ */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Sunbeam snake','งูแสงอาทิตย์','-','งูชนิดนี้ไม่เป็นอันตรายเพราะไม่มีพิษ มักพบเห็นได้ในพื้นที่ที่มีกิ้งก่า กบ หนู และสัตว์มีกระดูกสันหลังอื่นๆ ซึ่งเป็นอาหารของพวกมัน ส่านใหญ่จะออกหากินเวลากลางคืน ลำตัวมีความยาวประมาณ 120 เซนติเมตร มีสีดำถึงสีน้ำตาลเข้ม ส่วนท้องมีสีขาว ส่วนหัวแบนเรียว ตาเล็ก ลักษณะเด่นคือเกล็ดลำตัวเรียบเป็นเงาแวววาบสะดุดตาเมื่อสะท้อนแสงแดด และในลูกงูแรกเกิดมีรอบคอเป็นสีขาวแตกต่างจากงูตัวโตเต็มวัย จะพบเห็นงูชนิดนี้ได้ภาคใต้ของจีน และเอเชียตะวันออกเฉียงใต้',"
				+ 8.637449
				+ ","
				+ 98.279624
				+ ",'sunbeam_snake_bg','sunbeam_snake_icon','night','อุทยานแห่งชาติเขาหลัก-ลำรู่','1100000','khun_ja');");// 8.637449,
																										// 98.279624

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Common treeshrew, Southern treeshrew','กระแตใต้','Tupaia glis','เป็นสัตว์เลี้ยงลูกด้วยนมขนาดเล็กชนิดหนึ่ง ในอันดับกระแต (Scandentia) มีรูปร่างทั่วไปคล้ายกับกระรอก มีขนสีน้ำตาลแกมเขียว ส่วนใบหน้าแหลมยาว มีนิ้วที่เท้าหน้า 5 นิ้ว หางเรียวยาวเป็นพู่ มีเส้นขีดที่ไหล่ ลำตัวยาวประมาณ 17-24 เซนติเมตร หางยาว 17-24 เซนติเมตร ตัวเมียมีเต้านม 4 เต้า กระแตใต้ เป็นหนึ่งในกระแตที่พบได้ในประเทศไทย พบกระจายพันธุ์ตั้งแต่คอคอดกระลงไปตลอดแหลมมลายู จนถึงอินโดนีเซีย เป็นสัตว์ที่กินอาหารได้หลากหลายทั้งพืช, เมล็ดพืช, ผลไม้ และแมลงชนิดต่าง ๆ หากินได้ทั้งบนพื้นดิน, โคนต้นไม้ และบนต้นไม้ พบได้ในภูมิประเทศที่หลากหลายทั้งป่าดิบทึบ และสวนสาธารณะหรือสวนผลไม้ในชุมชนของมนุษย์',"
				+ 8.668166
				+ ","
				+ 98.294902
				+ ",'common_treeshrew_bg','common_treeshrew_icon','day','อุทยานแห่งชาติเขาหลัก-ลำรู่','0000000','khun_ja');");// 8.668166,
																											// 98.294902

		/* อุทยานแห่งชาติแจ้ซ้อน */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Lesser Club-footed Bat','ค้างคาวไผ่หัวแบนเล็ก','Tylonycteris pachypus','เป็นค้างคาวกินแมลง อยู่ห่างกัน หูมีขนาดกลาง ขนลำตัวสีน้ำตาลเหลือง ส่วนหัวแบนและกว้างออกด้านข้าง อุ้งนิ้วโป้งและอุ้งเท้าสีน้ำตาล อาศัยในปล้องไม้ไผ่ที่มีรอยแยก และหากินบริเวณจอมปลวก พบอาศัยและหากิน บริเวณเดียวกันกับค้างคาวไผ่หัวแบนใหญ่ พบทุกภาคของไทย ยกเว้น ส่วนล่างสุดของภาคตะวันออก',"
				+ 19.183589
				+ ","
				+ 99.370443
				+ ",'lesser_club_footed_bat_bg','lesser_club_footed_bat_icon','night','อุทยานแห่งชาติแจ้ซ้อน','1000000','klong_lan');");// 19.183589,
																													// 99.370443

		/* อุทยานแห่งชาติทุ่งแสลงหลวง */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Asian box turtle, Siamese box terrapin','เต่าหับ','Cuora amboinensis','สัตว์เลื้อยคลานจำพวกเต่าชนิดหนึ่ง มีรูปร่างคล้ายเต่านา แต่มีกระดองโค้งนูนสูงกว่า กระดองราบเรียบ ใต้ท้องแบ่งเป็นสองตอน ซึ่งเรียกว่าแผ่น สามารถเก็บขา หัว และหางเข้ากระดองได้มิดชิด อันเป็นที่มาของชื่อ หัวมีขนาดเล็กสีเหลืองมีลวดลายสีดำ กระดองสีน้ำตาลเข้ม ใต้ท้องสีขาวหรือสีเหลือง โตได้เต็มที่ประมาณ 25 เซนติเมตร สามารถพบได้ในแหล่งน้ำทุกภาคของประเทศไทยโดยเฉพาะภาคกลางและภาคใต้ ในต่างประเทศพบที่อินเดีย ภูมิภาคอินโดจีน,พม่า, มาเลเซีย, อินโดนีเซีย, ฟิลิปปินส์, สิงคโปร์ เป็นเต่าที่สามารถว่ายน้ำได้ดี แต่ชอบอยู่บนบกที่มีความชื้นมากกว่าลงน้ำ ผสมพันธุ์ในน้ำ แต่วางไข่บนบก ปีหนึ่งวางไข่หลายครั้ง ทว่าวางไข่เพียงครั้งละ 2-3 ฟองเท่านั้น อาหารสามารถกินได้ทั้งพืชและสัตว์ เป็นสัตว์ป่าคุ้มครอง ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535',"
				+ 16.659184
				+ ","
				+ 100.802787
				+ ",'asian_box_turtle_bg','asian_box_turtle_bat_icon','day','อุทยานแห่งชาติทุ่งแสลงหลวง','1100000','kao_yai');");// 16.659184,
																												// 100.802787

		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Oriental whipsnake','งูเขียวหัวจิ้งจก','Ahaetulla prasina',' เป็นงูที่มีพิษอ่อนมากชนิดหนึ่ง ในวงศ์ Colubridae มีลักษณะลำตัวเรียวยาว หัวหลิม ปลายปากแหลม ขนาดเมื่อโตเต็มที่ได้ถึง 2 เมตร พื้นลำตัวโดยมากเป็นสีเขียว มักจะมีเส้นสีขาวข้างลำตัวบริเวณแนวต่อระหว่างเกล็ดตัวกับเกล็ดท้อง เส้นขาวยาวตั้งแต่บริเวณคอ จนถึงโคนหาง ท้องขาว ส่วนหางตั้งแต่โคนหางถึงปลายหางจะมีสีน้ำตาลหรือสีชมพู ตามีขนาดใหญ่ ม่านตาอยู่ในแนวนอน อาศัยอยู่ตามต้นไม้ พบทั่วไปในภูมิภาคเอเชียใต้จนถึงเอเชียตะวันออกเฉียงใต้ ในประเทศไทยพบได้ทุกภาค ในป่าทุกประเภท แม้กระทั่งสวนสาธารณะหรือสวนในบริเวณบ้านเรือนของผู้คนที่อยู่ในเมือง มีพิษอ่อนมาก โดยพิษจะสามารถทำอันตรายได้เฉพาะสัตว์เล็กที่เป็นอาหาร เช่น จิ้งจก, กิ้งก่า, นก และสัตว์เลี้ยงลูกด้วยนมขนาดเล็ก เป็นต้น ขณะที่ลูกงูจะกินแมลงเป็นอาหาร โดยเป็นงูที่ออกลูกเป็นตัว ระยะเวลาการตั้งท้อง 4 เดือน ออกลูกได้ครั้งละ 6-10 ตัว การผสมพันธุ์จะเริ่มขึ้นในช่วงต้นฤดูฝน งูเขียวหัวจิ้งจก มีลักษณะทางกายภาพคล้ายคลึงกับงูอีก 2 ชนิด ที่อยู่ในสกุลเดียวกัน คือ งูเขียวปากแหนบ (A. nasuta) และงูเขียวหัวจิ้งจกมลายู (A. mycterizans) โดยงูทั้ง 3 ชนิด นี้ จะมีความหลากหลายทางสีสันมาก โดยจะมีสีสันแตกต่างหลากหลายออกไป ทั้งสีเขียว, สีส้ม, สีเหลือง, สีน้ำตาล, สีเทา, สีฟ้า หรือ สีเหล่านี้ผสมกัน เป็นต้น โดยงูที่มีโทนสีส้ม จะถูกเรียกว่า \"กล่อมนางนอน\" ขณะที่งูที่มีโทนสีเทาจะถูกเรียกว่า \"ง่วงกลางดง\" ซึ่งชาวบ้านโดยทั่วไปเชื่อว่าเป็นงูที่มีพิษร้ายแรง แต่หาใช่เป็นความจริงไม่ นิยมเลี้ยงเป็นสัตว์เลี้ยงของผู้นิยมเลี้ยงสัตว์เลื้อยคลาน ซึ่งมีราคาซื้อขายที่ไม่แพง',"
				+ 16.775584
				+ ","
				+ 100.539459
				+ ",'oriental_whipsnake_bg','oriental_whipsnake_icon','day','อุทยานแห่งชาติทุ่งแสลงหลวง','1000000','kao_yai');");// 16.659184,
																												// 100.802787
		/* อุทยานแห่งชาติน้ำตกโยง   */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Shortfin eel, Level-finned eel','ปลาตูหนา','Anguilla bicolor','เป็นปลาน้ำจืดชนิดหนึ่งในวงศ์ปลาตูหนา (Anguilidae) มีรูปร่างอ้วนป้อม ลักษณะโดยทั่วไปเหมือนปลาสะแงะ (A. bengalensis) ซึ่งอยู่ในวงศ์และสกุลเดียวกัน แต่ปลาตูหนามีรูปร่างที่เล็กกว่า ครีบอกของปลาตูหนามีสีคล้ำ ในปลาโตเต็มวัยครีบหลังและครีบก้นมีสีคล้ำด้วยเช่นกัน จึงเป็นที่มาของชื่อว่า \"ปลาไหลหูดำ\" ลำตัวสีน้ำตาลอ่อนไม่มีลวดลาย ใต้ท้องสีขาว ขนาดโตเต็มที่ได้ 1.5 เมตร ในประเทศไทยพบได้ตั้งแต่ภาคใต้ฝั่งตะวันตกแถบริมชายฝั่งอันดามัน เรื่อยไปจนถึงประเทศมาเลเซียและอินโดนีเซีย และในภาคตะวันตกในชายแดนที่ติดกับประเทศพม่า เช่น จังหวัดตาก แม่ฮ่องสอน เป็นต้น โดยชาวกะเหรี่ยงเรียกปลาชนิดนี้ว่า \"หย่าที\" ในภูมิภาคเอเชียตะวันตกพบได้ตั้งแต่พม่า บังกลาเทศ จนถึงอินเดีย โดยปลาที่พบในประเทศแถบนี้จะเป็นสายพันธุ์ย่อยที่เรียกว่า A. b. pacifica ส่วนปลาที่พบในแถบเอเชียตะวันออกมีชื่อเรียกว่า A. b. bicolor ปลาตูหนามีพฤติกรรมจะกลับไปผสมพันธุ์และวางไข่แถบป่าชายเลนหรือปากแม่น้ำ ลูกปลาแรกเกิดมีลำตัวใสเหมือนวุ้นเส้น มีสีแดงเรื่อ จากนั้นเมื่อโตขึ้นจะค่อยอพยพว่ายทวนน้ำมาสู่แหล่งน้ำจืด ซึ่งบางครั้งอาจพบได้ไกลถึงลำธารน้ำตกบนภูเขา ปลาชนิดนี้เป็นที่นิยมอย่างมากโดยเฉพาะชาวไทยเชื้อสายจีนในแถบจังหวัดระนองหรือตรัง ถือเป็นเมนูราคาแพง สามารถนำไปปรุงได้หลากหลาย เช่น ต้มยำ ย่าง หรือทำน้ำแดง ในต่างประเทศที่นิยมบริโภคได้แก่จีนและญี่ปุ่น โดยหน่วยงานประมงของประเทศเหล่านี้ได้มีการส่งเสริมให้เป็นปลาเศรษฐกิจ มีการทำฟาร์มเพาะขยายพันธุ์ แต่ว่าเนื้อมีกลิ่นคาวมาก จึงนิยมปลาตูหนาญี่ปุ่น (A. japonica) มากกว่า สำหรับชาวพื้นเมืองในหมู่เกาะโซโลมอนจะชื่นชอบปลาชนิดนี้มาก โดยจะไม่มีการจับมาบริโภค แต่จะเลี้ยงด้วยเนื้อเมื่อพวกมันว่ายทวนน้ำมาถึงบริเวณต้นน้ำ เพราะปลาชนิดนี้กินเนื้อและซากสัตว์เป็นอาหารซึ่งทำให้แหล่งต้นน้ำนั้นสะอาด',"
				+ 8.288465
				+ ","
				+ 99.769214
				+ ",'shortfin_eel_bg','shortfin_eel_icon','day','อุทยานแห่งชาติน้ำตกโยง','0001100','pha_non_ban_ja');");// 16.659184,
							//8.288465, 99.769214
			
		/* อุทยานแห่งชาติน้ำตกคลองแก้ว    */
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Curve-toed gecko','ตุ๊กกาย','-','สัตว์เลื้อยคลานจำพวกหนึ่ง มีรูปร่างคล้ายตุ๊กแก แต่มีขนาดเล็กกว่า อยู่ในวงศ์ Gekkonidae เช่นเดียวกับตุ๊กแกและจิ้งจก โดยอยู่ในสกุล Cyrtodactylus มีลักษณะสำคัญ คือ มีนิ้วเท้าและเล็บที่แหลมยาว ไม่มีปุ่มดูดจึงไม่สามารถดูดติดเกาะผนังได้เหมือนตุ๊กแกและจิ้งจก ใช้ได้เพียงแค่ปีนป่ายเหมือนกิ้งก่าเท่านั้น อาศัยอยู่ในถ้ำและป่า ของทวีปเอเชียไม่พบในเมือง มีประมาณ 89 ชนิด ในประเทศไทยพบประมาณ 20 ชนิด สถานะปัจจุบันเป็นสัตว์หายากชนิดหนึ่ง เคยเป็นสัตว์ที่ถูกบรรจุชื่อไว้ในพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พ.ศ. 2535 แต่เมื่อมีการปรับปรุงใหม่ในปี พ.ศ. 2546 ถูกถอดชื่อออกไป',"
				+ 12.615246
				+ ","
				+ 102.581506
				+ ",'curve_toed_gecko_bg','curve_toed_gecko_icon','day','อุทยานแห่งชาติน้ำตกคลองแก้ว','0000000','pha_non_ban_ja');");// 16.659184,
							//12.615246, 102.581506
		
		db.execSQL("INSERT INTO "
				+ AnimalTableName
				+ "("
				+ AnimalTableColAnameen
				+ ","
				+ AnimalTableColAnameth
				+ ","
				+ AnimalTableColAnamesci
				+ ","
				+ AnimalTableColAdetail
				+ ","
				+ AnimalTableColAlattitude
				+ ","
				+ AnimalTableColAlongtitude
				+ ","
				+ AnimalTableColimage
				+ ","
				+ AnimalTableColAicon
				+ ","
				+ AnimalTableColAtime + "," + AnimalTableColAbase + ","
				+ AnimalTableColAtype + ","+ AnimalTableColApalceBg+") VALUES ("
				+ "'Chinese water dragon','กิ้งก่ายักษ์','Physignathus cocincinus','เป็นสัตว์เลื้อยคลานประเภทกิ้งก่า ในวงศ์กิ้งก่า (Agamidae) ที่มีขนาดใหญ่ที่สุดที่พบได้ในประเทศไทย มีรูปร่างทั่วไปคล้ายอีกัวน่าที่พบในอเมริกากลางและอเมริกาใต้ ขนาดเมื่อโตเต็มที่ยาวประมาณ 90-120 เซนติเมตร (ปลายจมูกถึงโคนหาง 35-50 เซนติเมตร และหางยาว 55-70 เซนติเมตร) โดยตัวเมียจะมีขนาดเล็กกว่าตัวผู้ราว 10-30 เซนติเมตร และจะมีหัวป้อมกว่า สีของลำตัวเข้มกว่า หางมีแถบสีดำเป็นปล้อง ๆ สีลำตัวปกติของตะกองจะมีสีเขียวเข้มและสามารถที่จะเปลี่ยนสีของให้เข้มขึ้นหรืออ่อนลงตามสภาพแวดล้อมได้ ในขณะที่เป็นวัยอ่อนบางตัวใต้คางและส่วนหัวจะมีสีม่วงหรือสีฟ้าแลดูสวยงาม และเมื่อโตขึ้นมาตัวผู้ส่วนหัวด้านบนจะโหนกนูนขึ้นเห็นชัดเจน ส่วนตัวผู้เมียจะมีความนูนน้อยกว่า ตะกอง มีการกระจายพันธุ์ทั่วไปในป่าดิบในตอนใต้ของประเทศจีน, ประเทศลาว, เวียดนาม, กัมพูชา และภาคตะวันออกและอีสานของประเทศไทย ชอบที่จะอาศัยหากินอยู่ในพื้นที่ซึ่งมีแหล่งน้ำที่อุดมสมบูรณ์และมีสภาพป่าที่ค่อนข้างทึบ เช่น บริเวณริมห้วยที่มีน้ำไหล มีพฤติกรรมชอบนอนผึ่งแดดตามคาคบไม้ริมห้วยลำธาร เมื่อตกใจจะวิ่ง 2 ขาได้โดยหุบขาหน้าไว้แนบชิดลำตัว และโดยปกติเมื่อมีภัยจะกระโจนลงน้ำ และสามารถดำน้ำได้เป็นเวลานาน อาหารได้แก่ แมลงชนิดต่าง ๆ, กบ, เขียด, ปลาขนาดเล็ก, สัตว์เลี้ยงลูกด้วยน้ำนมขนาดเล็ก และผลไม้บางชนิด และยังสามารถดำน้ำจับปลาได้อีกด้วย ในที่สถานที่เลี้ยงพบว่ามีอายุถึง 30 ปี ตะกองจะมีฤดูกาลผสมพันธุ์และวางไข่ในระหว่าง เดือนเมษายนถึงเดือนพฤษภาคม และในหนึ่งครั้งตะกองตัวเมียจะวางไข่ประมาณ 10 ฟอง ตะกองจะวางไข่ บริเวณพื้นดินที่มีลักษณะเป็นดินทรายและจะขุดหลุมลึกลงไปประมาณ 12-17 เซนติเมตร และกว้างประมาณ 12-15 เซนติเมตร ตะกอง ยังเป็นที่นิยมเลี้ยงเป็นสัตว์เลี้ยงของผู้นิยมเลี้ยงสัตว์เลื้อยคลาน แต่ว่าเมื่อเทียบกับอีกัวน่าแล้ว ตะกองเลี้ยงได้ยากกว่าพอสมควรเนื่องจากกินแมลงเป็นอาหารและยังมีนิสัยที่ดุไม่เชื่องเหมือนอีกัวน่า อีกทั้งยังต้องปรับสภาพของที่เลี้ยงให้มีน้ำและมีความชุ่มชื้นพอสมควร สถานภาพของตะกองในปัจจุบัน พบน้อยลงมากเนื่องจากถูกจับเป็นสัตว์เลี้ยง จับเพื่อทำเป็นอาหาร และแหล่งที่อยู่อาศัยถูกทำลาย ตามพระราชบัญญัติสงวนและคุ้มครองสัตว์ป่า พุทธศักราช 2535 ได้จัดให้ตะกองเป็นสัตว์ป่าคุ้มครอง',"
				+ 12.642215
				+ ","
				+ 102.557817
				+ ",'chinese_water_dragon_bg','chinese_water_dragon_icon','day','อุทยานแห่งชาติน้ำตกคลองแก้ว','1101101','pha_non_ban_ja');");// 16.659184,
							//12.642215, 102.557817
		
	}/* end insert Database */

}/* End of class */
