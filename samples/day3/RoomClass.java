package com.java.samples.day3;

public class RoomClass {
	int roomno;
	String roomtype;
	float roomarea;
	String ACmachine;
	void setData(int rno, String rtype, float rspace, String ac) {
		roomno = rno;
		roomtype = rtype;
		roomarea = rspace;
		ACmachine = ac;
	}
	void getData() {
		System.out.println(roomno);
		System.out.println(roomtype);
		System.out.println(roomarea);
		System.out.println(ACmachine);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomClass obj = new RoomClass();
		obj.setData(100, "5-Star", 100f, "yes");
		obj.getData();
		

	}

}
