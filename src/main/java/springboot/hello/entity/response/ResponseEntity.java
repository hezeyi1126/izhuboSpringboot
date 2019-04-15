package springboot.hello.entity.response;

/**
 * 返回结果实体类
 * @author Administrator
 *
 */
public class ResponseEntity {

	private int msgCode;
	
	private String msg;
	
	private Object result;

	public int getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	public ResponseEntity msg(String message) {
		this.setMsg(message);
		return this;
	}
	
	public ResponseEntity result(Object result) {
		this.setResult(result);
		return this;
	}
	
	
	public static ResponseEntity code(int msgCode) {
		ResponseEntity res = new ResponseEntity();
		res.setMsgCode(msgCode);
		return res;
	}
	
	
}
