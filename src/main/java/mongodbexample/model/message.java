package mongodbexample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userMsg")
public class message {
	private String msg;
	

//	public message(String msg) {
//		super();
//		this.msg = msg;
//	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "message [msg=" + msg + "]";
	}
	
}
