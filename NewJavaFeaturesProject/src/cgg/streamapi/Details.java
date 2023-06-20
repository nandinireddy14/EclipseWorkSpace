package cgg.streamapi;

import java.util.List;

public class Details {

	private int detailId;
	private List<String> parts;
	public Details(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}
	public int getDetailId() {
		return detailId;
	}
	public List<String> getParts() {
		return parts;
	}
	
}
