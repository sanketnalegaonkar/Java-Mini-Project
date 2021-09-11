package com.tq.model;

public class Result {
	int rid;
	int sub1;
	int sub2;
	int sub3;

	public Result() {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.rid = rid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Result [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}

}
