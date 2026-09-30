package stack;

class stack{
    boolean isEmpty(int top){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    boolean isOverFlow(int top,int size){
        if(top==size-1){
            return true;
        }
        return false;
    }
}

public class task_1
{
	public static void main(String[] args) {
		String str = "ab@cdb-0tx";
		char[] alp = new char[str.length()];
		char[] other = new char[str.length()];
		int alpTop = -1;
		int otherTop = -1;
		stack si = new stack();
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='a' && str.charAt(i)<='z'){
		        if(si.isOverFlow(alpTop,str.length())){
		            System.out.println("Alphabet stack is Overflow");
		        }
		        else{
    		        alpTop++;
    		        alp[alpTop] = str.charAt(i);
		        }
		    }
		    else{
		        if(si.isOverFlow(otherTop,str.length())){
		            System.out.println("Alphabet stack is Overflow");
		        }
		        else{
    		        otherTop++;
    		        other[otherTop] = str.charAt(i);
		        }
		    }
		}
		
	}
}
