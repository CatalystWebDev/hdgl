package hdgl.db.graph;

/**
 * ���нڵ���Ļ���
 * @author elm
 *
 */
public abstract class Node {
	
	protected long id;
	
	public Node(long id){
		this.id = id;
	}
	
	public long getId(){
		return id;
	}
	
}
