
public class Iterator {

	int [] arr;
	int index = -1;
	public Iterator(int [] list){
		this.arr = list;
	}
	
	public boolean hasNext(){
		if(index+1== arr.length){
			return false;
		}
		else return true;
	}
	
	public int next(){
		return arr[++index];
	}
	
	public int remove(){
		return index;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArr = {1,2,3,4,5};
		Iterator myIter = new Iterator(myArr);
		while(myIter.hasNext()){
			System.out.print(myIter.next() + " ");
		}
	}

}
