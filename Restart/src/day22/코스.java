package day22;

public class �ڽ� <�Ű�Ŭ����>{
	
	private String name;
	private �Ű�Ŭ���� [] ���;
	
	
	public �ڽ�(String name, int �ο���) {
		
		this.name=name;
		���=(�Ű�Ŭ����[])new Object[�ο���];

	
	}
	
	public void add(�Ű�Ŭ���� �Ű���ü) {
		
		for(int i=0; i<���.length; i++) {
			
			if(���[i]==null) {
				
				���[i]=�Ű���ü;
				break;
				
			}
			
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public �Ű�Ŭ����[] get���() {
		return ���;
	}

	public void set���(�Ű�Ŭ����[] ���) {
		this.��� = ���;
	}
	
	
}
