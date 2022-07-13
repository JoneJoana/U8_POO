
public class Password {	
	
	private int length;
	private String passwdRandom;
	
	public Password() {
		this.length = 8;
		this.passwdRandom = "";
	}
	
	public Password(int length) {  //TODO ponerlo en metodo
		this.length = length;
		this.passwdRandom = generatePasswd(length); 
	}	

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPasswdRandom() {
		return passwdRandom;
	}

	public void setPasswdRandom(String passwdRandom) {
		this.passwdRandom = passwdRandom;
	}
	
	
	public String generatePasswd(int length) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String pswd = "";		
		
		for (int i=0;i<length;i++) {
			pswd+=(chars.charAt((int)(Math.random() * chars.length())));
		}
		return pswd;
	}
	
}
