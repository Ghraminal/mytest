package DTO;

public class ResvDTO {
    private String resvNo;
    private String custNo;
    private String resvDate;

    // 기본 생성자
    public ResvDTO() {}

    // 전체 필드를 받는 생성자
    public ResvDTO(String resvNo, String custNo, String resvDate) {
        this.resvNo = resvNo;
        this.custNo = custNo;
        this.resvDate = resvDate;
    }

	public String getResvNo() {
		return resvNo;
	}

	public void setResvNo(String resvNo) {
		this.resvNo = resvNo;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getResvDate() {
		return resvDate;
	}

	public void setResvDate(String resvDate) {
		this.resvDate = resvDate;
	}
}